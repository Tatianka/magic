import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.stringtemplate.v4.*;
import java.util.LinkedList;
import java.util.List;


public class CompilerVisitor extends SimplangBaseVisitor<CodeFragment> {
    LinkedList<Map<String, Variable>> variables = new LinkedList<Map<String, Variable>>();
    LinkedList<Map<String, Function>> functions = new LinkedList<Map<String, Function>>();
    // Map<String, Function> functions = new HashMap<String, Function>();

    private int labelIndex = 0;
    private int registerIndex = 0;
    private int functionIndex = 0;

    private String generateNewLabel() {
        return String.format("L%d", this.labelIndex++);
    }

    private String generateNewRegister() {
        return String.format("%%R%d", this.registerIndex++);
    }

    private String generateNewFunctionName() {
        return String.format("@F%d", this.functionIndex++);
    }


    public CompilerVisitor() {
        super();
        addTable();
    }

    private void addTable() {
        variables.addFirst(new HashMap<String, Variable>());
        functions.addFirst(new HashMap<String, Function>());
    }

    private void removeTable() {
        variables.removeFirst();
        functions.removeFirst();
    }

    protected Map<String, Variable> findVarTable(String identifier) {
        for (Map<String, Variable> table : variables) {
            if (table.containsKey(identifier)) {
                return table;
            }
        }
        return null;
    }

    protected Map<String, Function> findFuncTable(String identifier) {
        for (Map<String, Function> table : functions) {
            if (table.containsKey(identifier)) {
                return table;
            }
        }
        return null;
    }

    protected Variable getVar(String identifier) {
        Map<String, Variable> table = findVarTable(identifier);
        if (table == null) return null;
        return table.get(identifier);
    }

    protected Function getFunc(String identifier) {
        Map<String, Function> table = findFuncTable(identifier);
        if (table == null) return null;
        return table.get(identifier);
    }

    protected boolean declFunc(String identifier, Function func) {
        Map<String, Function> table = functions.getFirst();
        if (!table.containsKey(identifier)) {
            table.put(identifier, func);
            return true;
        } else {
            System.err.println(String.format("Error: cannot redeclare function idenifier '%s'.", identifier));
            return false;
        }
    }

    protected CodeFragment declVar(String identifier, Type t) {
        CodeFragment ret = new CodeFragment();
        if (t == Type.NOTYPE) {
            System.err.println(String.format("Error: invalid type '%s' of '%s'.", t, identifier));
            return ret;
        }

        Map<String, Variable> table = variables.getFirst();
        if (!table.containsKey(identifier)) {
            String mem_register = this.generateNewRegister();
            table.put(identifier, new Variable(identifier, mem_register, t));
            ST template = new ST("<mem_register> = alloca <type>\n");
            template.add("mem_register", mem_register);
            template.add("type", t.getCode());
            ret.addCode(template.render());
            ret.setRegister(mem_register);
        } else {
                System.err.println(String.format("Error: cannot redeclare idenifier '%s'.", identifier));
        }
        return ret;
    }


    private CodeFragment loadFromMemory(String mem_register, Type t) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.addCode(String.format("%s = load %s* %s\n", register, t.getCode(), mem_register));
        code.setRegister(register);
        code.setType(t);
        return code;
    }

    private boolean compatibleTypes(Type t1, Type t2) {
        if ((t1 == Type.FLOAT || t1 == Type.INT || t1 == Type.BOOL) && (t2 == Type.FLOAT || t2 == Type.INT || t2 == Type.BOOL)) {
            return true;
        }

        return false;
    }

    private Type getCommonType(Type t1, Type t2) {
        if (!compatibleTypes(t1, t2)) {
            return Type.NOTYPE;
        }

        if (t1 == Type.FLOAT || t2 == Type.FLOAT) {
            return Type.FLOAT;
        }

        if (t1 == Type.INT || t2 == Type.INT) {
            return Type.INT;
        }

        return t1;
    }

    private CodeFragment variableTypeConvert(Variable v, Type t) {
        CodeFragment code = new CodeFragment();
        if (v.getType() == t) {
            code.setType(t);
            code.setRegister(v.getRegister());
            return code;
        }

        String instruction = "";
        String register = this.generateNewRegister();

        if (v.getType() == Type.BOOL && t == Type.INT) {
            instruction = "zext";
        } else {
            instruction = "sitofp";
        }

        ST temp = new ST(
                "\\<ret> = <instruction> <t1> <r> to <t2>\n"
        );

        temp.add("r", v.getRegister());
        temp.add("t1", v.getType().getCode());
        temp.add("t2", t.getCode());
        temp.add("instruction", instruction);
        temp.add("ret", register);

        code.addCode(temp.render());
        code.setType(t);
        code.setRegister(register);

        return code;
    }

    private CodeFragment variableToBool(Variable v) {
        CodeFragment code = new CodeFragment();

        if (v.getType() == Type.BOOL) {
            code.setType(Type.BOOL);
            code.setRegister(v.getRegister());
            return code;
        }

        String register = this.generateNewRegister();

        ST temp = new ST(
            "<register> = <instruction> ne <type> <val>, 0\n"
        );

        Type t = v.getType();
        String instruction = "no_istruction";

        if (t == Type.INT) {
            instruction = "icmp";
        }

        if (t == Type.FLOAT) {
            instruction = "fcmp";
        }

        temp.add("register", register);
        temp.add("type", t.getCode());
        temp.add("val", v.getRegister());
        temp.add("instruction", instruction);

        code.addCode(temp.render());
        code.setType(Type.BOOL);
        code.setRegister(register);

        return code;

    }

    private String getParamsString(List<Variable> params) {
        String s = "";
        boolean begin = true;
        for (Variable p : params) {
            if (!begin) {
                s += ", ";
            } else {
                begin = false;
            }
            s += p.getType().getCode() + " " + p.getRegister();
        }
        return s;
    }

    private CodeFragment generateFunctions() {
        CodeFragment code = new CodeFragment();

        for (Map<String, Function> table :functions) {
            for(Map.Entry<String, Function> e : table.entrySet()) {
                ST template = new ST(
                    "define <rtype> <name>(<args>) {\n" +
                    "start:\n" +
                    "<body_code>" +
                    "}\n"
                );

                Function f = e.getValue();

                template.add("rtype", f.getReturnType().getCode());
                template.add("name", f.getName());
                template.add("body_code", f.getCode());
                template.add("args", getParamsString(f.getParams()));

                code.addCode(template.render());
                code.setType(f.getCode().getType());
                code.setRegister(f.getCode().getRegister());

            }
        }
        return code;
    }


    @Override public CodeFragment visitInit(SimplangParser.InitContext ctx) {
        CodeFragment body = new CodeFragment();

        for(SimplangParser.StatementContext s: ctx.statement()) {
            CodeFragment statement = visit(s);
            body.appendCodeFragment(statement);
        }

        ST template = new ST(
                "<functions>" +
                "define i32 @main() {\n" +
                "start:\n" +
                "<body_code>" +
                "ret i32 0\n" +
                "}\n"
        );
        template.add("body_code", body);
        template.add("functions", this.generateFunctions());

        CodeFragment code = new CodeFragment();
        code.addCode(template.render());
        code.setRegister(body.getRegister());
        return code;
    }

    @Override public CodeFragment visitValVar(SimplangParser.ValVarContext ctx) {
        CodeFragment v = visit(ctx.var());
        CodeFragment code = new CodeFragment();
        code.addCode(v);
        code.appendCodeFragment(loadFromMemory(v.getRegister(), v.getType()));
        return code;
    }

    @Override public CodeFragment visitValInt(SimplangParser.ValIntContext ctx) {
        String value = ctx.INT().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setType(Type.INT);
        code.setRegister(register);
        code.addCode(String.format("%s = add %s 0, %s\n", register, code.getType().getCode(), value));
        return code;
    }

    @Override public CodeFragment visitValFloat(SimplangParser.ValFloatContext ctx) {
        String value = ctx.FLOAT().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setType(Type.FLOAT);
        code.setRegister(register);
        code.addCode(String.format("%s = add %s 0, %s\n", register, code.getType().getCode(), value));
        return code;
    }


    @Override public CodeFragment visitStatement(SimplangParser.StatementContext ctx) {
        SimplangParser.Simple_statementContext ss = ctx.simple_statement();
        if (ss != null) {
            return visit(ss);
        }

        SimplangParser.Block_statementContext bs = ctx.block_statement();
        if (bs != null) {
            return visit(bs);
        }

        return new CodeFragment();
    }

    @Override public CodeFragment visitVar_def(SimplangParser.Var_defContext ctx) {
        CodeFragment code = new CodeFragment();

        String type = visit(ctx.type()).toString();
        String id = ctx.ID().getText();

        SimplangParser.ExpressionContext exp = ctx.expression();

        CodeFragment var_code = declVar(id, Type.fromString(type));
        code.addCode(var_code);
        code.setRegister(var_code.getRegister());
        code.setType(var_code.getType());

        if (exp != null) {
            CodeFragment val = visit(exp);
            Variable var = getVar(id);
            CodeFragment assign = generateAssignCode(var, val);
            code.addCode(assign);
            code.setRegister(assign.getRegister());
            code.setType(assign.getType());
        }

        return code;
    }

    @Override public CodeFragment visitFunc_def(SimplangParser.Func_defContext ctx) {
        CodeFragment code = new CodeFragment();

        Type rtype = Type.fromString(visit(ctx.type()).toString());
        String id = ctx.ID().getText();

        addTable();
        ArgListCodeFragment arglist = (ArgListCodeFragment) visit(ctx.arglist());
        CodeFragment body = new CodeFragment();
        body.appendCodeFragment(arglist);
        body.appendCodeFragment(visit(ctx.block()));
        removeTable();

        code.setType(body.getType());
        code.setRegister(body.getRegister());

        String name = generateNewFunctionName();
        Function f = new Function(id, name, rtype, arglist.getArgs(), body);
        declFunc(id, f);

        return code;
    }

    @Override public CodeFragment visitRet(SimplangParser.RetContext ctx) {
        CodeFragment code;
        try {
            code = visit(ctx.expression());
            code.addCode(String.format("ret %s %s\n", code.getType().getCode(), code.getRegister()));
        } catch(NullPointerException e) {
            code = new CodeFragment();
            code.addCode("ret\n");
        }
        return code;
    }

    @Override public CodeFragment visitArglist(SimplangParser.ArglistContext ctx) {
        ArgListCodeFragment code = new ArgListCodeFragment();
        for (int i = 0; i< ctx.type().size(); i++) {
            Type t = Type.fromString(visit(ctx.type(i)).toString());
            String id = ctx.ID(i).getText();
            String argRegister = this.generateNewRegister();

            CodeFragment arg_code = declVar(id, t);
            code.appendCodeFragment(arg_code);

            CodeFragment val_code = new CodeFragment();
            val_code.setRegister(argRegister);
            val_code.setType(t);

            Variable var = getVar(id);
            CodeFragment assign = generateAssignCode(var, val_code);

            code.appendCodeFragment(assign);
            code.addArg(new Variable(id, argRegister, t));
        }

        return (CodeFragment)code;
    }

    public CodeFragment generateAssignCode(Variable var, CodeFragment value) {
        CodeFragment ret = new CodeFragment();

        String mem_register = var.getRegister();
        Type type = var.getType();

        if (value.getType() != type) {
                System.err.println(String.format("Type Error: type '%s' does match expected type '%s'", value.getType(), type));
        }

        if (mem_register == null) {
                System.err.println(String.format("Error: idenifier '%s' does not exists", var.getName()));
        }
        ST template = new ST(
                "<value_code>" +
                "store <type> <value_register>, <type>* <mem_register>\n"
        );

        template.add("value_code", value);
        template.add("type", value.getType().getCode());
        template.add("value_register", value.getRegister());
        template.add("mem_register", mem_register);

        ret.addCode(template.render());
        ret.setRegister(value.getRegister());
        ret.setType(value.getType());
        return ret;
    }

    @Override public CodeFragment visitType(SimplangParser.TypeContext ctx) {
        CodeFragment code = new CodeFragment();
        code.addCode(ctx.getText());
        return code;
    }

    @Override public CodeFragment visitSimple_assignment(SimplangParser.Simple_assignmentContext ctx) {
            CodeFragment lval = visit(ctx.var());
            Variable v = new Variable(lval.getInfo(), lval.getRegister(), lval.getType());
            String op = ctx.op.getText();
            CodeFragment expr = visit(ctx.expression());

            if (op.equals("=")) {
                CodeFragment code = generateAssignCode(v, expr);
                return code;
            } else {
                return new CodeFragment();
            }
    }

    @Override public CodeFragment visitVarID(SimplangParser.VarIDContext ctx) {
        String id = ctx.ID().getText();
        Variable var = getVar(id);
        CodeFragment code = new CodeFragment();
        code.setInfo(var.getName());
        code.setRegister(var.getRegister());
        code.setType(var.getType());
        return code;
    }

    public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
            String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
            Type type = left.getType();

            HashMap<Integer, Pair<String, String>> m = new HashMap<Integer, Pair<String, String>>();
            HashSet<Integer> boolOperators = new HashSet<Integer>();

            m.put(SimplangParser.ADD, new Pair<String, String>("add", "fadd"));
            m.put(SimplangParser.SUB, new Pair<String, String>("sub", "fsub"));
            m.put(SimplangParser.MUL, new Pair<String, String>("mul", "fmul"));
            m.put(SimplangParser.DIV, new Pair<String, String>("sdiv", "fdiv"));
            m.put(SimplangParser.REM, new Pair<String, String>("srem" , "frem" ));

            m.put(SimplangParser.AND, new Pair<String, String>("and" , "and" ));
            boolOperators.add(SimplangParser.AND);
            m.put(SimplangParser.OR, new Pair<String, String>("or" , "or" ));
            boolOperators.add(SimplangParser.OR);
            m.put(SimplangParser.EQ, new Pair<String, String>("icmp eq" , "fcmp eq" ));
            boolOperators.add(SimplangParser.EQ);
            m.put(SimplangParser.NE, new Pair<String, String>("icmp ne" , "fcmp ne" ));
            boolOperators.add(SimplangParser.NE);
            m.put(SimplangParser.LE, new Pair<String, String>("icmp sle" , "fcmp sle" ));
            boolOperators.add(SimplangParser.LE);
            m.put(SimplangParser.GE, new Pair<String, String>("icmp sge" , "fcmp sge" ));
            boolOperators.add(SimplangParser.GE);
            m.put(SimplangParser.GT, new Pair<String, String>("icmp sgt" , "fcmp sgt" ));
            boolOperators.add(SimplangParser.GT);
            m.put(SimplangParser.LT, new Pair<String, String>("icmp slt" , "fcmp slt" ));
            boolOperators.add(SimplangParser.LT);


                // case SimplangParser.EXP:
            //         instruction = "@iexp";
            //         code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
            //         break;


            String instruction = "";

            if (left.getType() != right.getType()) {
                System.err.println(String.format("Incompatible types: '%s', '%s'", left.getType(), right.getType()));
                code_stub = "";
            }

            if (boolOperators.contains(operator)) {
                instruction = m.get(operator).getFirst();
                Variable v = new Variable(left.getInfo(), left.getRegister(), left.getType());
                left.appendCodeFragment(variableToBool(v));

                Variable v2 = new Variable(right.getInfo(), right.getRegister(), right.getType());
                right.appendCodeFragment(variableToBool(v));

                type = Type.BOOL;

            } else {
                if (type == Type.BOOL) {
                    Variable v = new Variable(left.getInfo(), left.getRegister(), left.getType());
                    left.appendCodeFragment(variableTypeConvert(v, Type.INT));

                    Variable v2 = new Variable(right.getInfo(), right.getRegister(), right.getType());
                    right.appendCodeFragment(variableTypeConvert(v, Type.INT));

                    type = Type.INT;
                }

                if (type == Type.INT) {
                    instruction = m.get(operator).getFirst();
                }

                if (type == Type.FLOAT) {
                    instruction = m.get(operator).getSecond();
                }
            }

            ST template = new ST(
                "<left_code>" +
                "<right_code>" +
                code_stub
            );
            template.add("right_code", right);
            template.add("left_code", left);
            template.add("instruction", instruction);
            template.add("type", type.getCode());
            template.add("left_val", left.getRegister());
            template.add("right_val", right.getRegister());
            String ret_register = this.generateNewRegister();
            template.add("ret", ret_register);

            CodeFragment ret = new CodeFragment();
            ret.setRegister(ret_register);
            ret.setType(type);
            ret.addCode(template.render());
            return ret;

    }

    @Override public CodeFragment visitMul(SimplangParser.MulContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitAdd(SimplangParser.AddContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitBoolAnd(SimplangParser.BoolAndContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitBoolOr(SimplangParser.BoolOrContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitCompare(SimplangParser.CompareContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType()
        );
    }

    @Override public CodeFragment visitBlock(SimplangParser.BlockContext ctx) {
        CodeFragment body = new CodeFragment();
        addTable();
        for(SimplangParser.StatementContext s: ctx.statement()) {
            CodeFragment statement = visit(s);
            body.appendCodeFragment(statement);
        }
        removeTable();
        return body;
    }

    @Override public CodeFragment visitIf_statement(SimplangParser.If_statementContext ctx) {
        CodeFragment code = new CodeFragment();

        String endBlockLabel = this.generateNewLabel();

        for (int i = 0; i< ctx.expression().size(); i++)
        {
            CodeFragment expression = visit(ctx.expression(i));
            Variable v = new Variable(expression.getInfo(), expression.getRegister(), expression.getType());
            expression.appendCodeFragment(variableToBool(v));
            CodeFragment block = visit(ctx.block(i));

            ST template = new ST(
                "<condition_code>" +
                "<cmp_reg> = icmp ne <type> <con_reg>, 0\n" +
                "br i1 <cmp_reg>, label %<block_true>, label %<block_next>\n" +
                "<block_true>:\n" +
                "<statement_true_code>" +
                "br label %<block_end>\n" +
                "<block_next>:\n"
            );
            template.add("condition_code", expression);
            template.add("statement_true_code", block);
            template.add("cmp_reg", this.generateNewRegister());
            template.add("con_reg", expression.getRegister());
            template.add("type", expression.getType().getCode());
            template.add("block_true", this.generateNewLabel());
            template.add("block_next", this.generateNewLabel());
            template.add("block_end", endBlockLabel);

            code.addCode(template.render());
        }

        if (ctx.block().size() > ctx.expression().size()) {
            CodeFragment block = visit(ctx.block(ctx.block().size() - 1));

            ST template = new ST(
                "<statement_true_code>" +
                "br label %<block_next>\n" +
                "<block_next>:\n"
            );
            template.add("statement_true_code", block);
            template.add("block_next", this.generateNewLabel());

            code.addCode(template.render());
        }

        ST template = new ST(
            "br label %<block_end>\n" +
            "<block_end>:\n" +
            "<ret> = add <type> 0, 0\n"
        );

        template.add("block_end", endBlockLabel);
        template.add("type", Type.INT.getCode());
        String return_register = generateNewRegister();
        template.add("ret", return_register);

        code.addCode(template.render());
        code.setType(Type.INT);
        code.setRegister(return_register);

        return code;
    }

    @Override public CodeFragment visitWhile_statement(SimplangParser.While_statementContext ctx) {
        CodeFragment expression = visit(ctx.expression());
        Variable v = new Variable(expression.getInfo(), expression.getRegister(), expression.getType());
        expression.appendCodeFragment(variableToBool(v));
        CodeFragment block = visit(ctx.block());

        ST template = new ST(
                "br label %<cmp_label>\n" +
                "<cmp_label>:\n" +
                "<condition_code>" +
                "<cmp_register> = icmp ne <type> <condition_register>, 0\n" +
                "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
                "<body_label>:\n" +
                "<body_code>" +
                "br label %<cmp_label>\n" +
                "<end_label>:\n" +
                "<ret> = add <rtype> 0, 0\n"
        );
        template.add("cmp_label", generateNewLabel());
        template.add("condition_code", expression);
        template.add("type", expression.getType().getCode());
        template.add("cmp_register", generateNewRegister());
        template.add("condition_register", expression.getRegister());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("body_code", block);
        String end_register = generateNewRegister();
        template.add("ret", end_register);
        template.add("rtype", Type.INT.getCode());

        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(end_register);
        ret.setType(Type.INT);
        return ret;
    }

    @Override public CodeFragment visitFunc_call(SimplangParser.Func_callContext ctx) {
        CodeFragment code = new CodeFragment();
        Function f = getFunc(ctx.ID().getText());
        ArgListCodeFragment params = (ArgListCodeFragment)visit(ctx.param_list());
        String register = generateNewRegister();

        ST template = new ST(
                "<args_code>" +
                "<reg> = call <type> <name>(<args>)\n"
        );
        template.add("args_code", params);
        template.add("type", f.getReturnType().getCode());
        template.add("name", f.getName());
        template.add("args", getParamsString(params.getArgs()));
        template.add("reg", register);

        code.addCode(template.render());
        code.setRegister(register);
        code.setType(f.getReturnType());
        return code;
    }

    @Override public CodeFragment visitParam_list(SimplangParser.Param_listContext ctx) {
        ArgListCodeFragment code = new ArgListCodeFragment();
        for (SimplangParser.ExpressionContext e: ctx.expression()) {
            CodeFragment expr_code = visit(e);
            code.appendCodeFragment(expr_code);
            code.addArg(new Variable(expr_code.getInfo(), expr_code.getRegister(), expr_code.getType()));
        }
        return (CodeFragment)code;
    }

}
