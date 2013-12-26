import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.stringtemplate.v4.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class CompilerVisitor extends SimplangBaseVisitor<CodeFragment> {
    LinkedList<Map<String, Variable>> variables = new LinkedList<Map<String, Variable>>();
    LinkedList<Map<String, Function>> functions = new LinkedList<Map<String, Function>>();
    HashSet<Function> libFunctions = new HashSet<Function>();

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
        addLibFunctions();
    }

    private void addLibFunctions(){
        List<Variable> p = new ArrayList<Variable>();

        p.clear();
        p.add(new Variable("a", "", BasicType.INT));
        Function f;
        f = new Function("printInt", "@printInt", BasicType.INT, p);
        libFunctions.add(f);
        declFunc("printInt", f);

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
        if (t == BasicType.NOTYPE) {
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
        if ((t1 == BasicType.FLOAT || t1 == BasicType.INT || t1 == BasicType.BOOL) && (t2 == BasicType.FLOAT || t2 == BasicType.INT || t2 == BasicType.BOOL)) {
            return true;
        }

        return false;
    }

    private Type getCommonType(Type t1, Type t2) {
        if (!compatibleTypes(t1, t2)) {
            return BasicType.NOTYPE;
        }

        if (t1 == BasicType.FLOAT || t2 == BasicType.FLOAT) {
            return BasicType.FLOAT;
        }

        if (t1 == BasicType.INT || t2 == BasicType.INT) {
            return BasicType.INT;
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

        if (v.getType() == BasicType.BOOL && t == BasicType.INT) {
            instruction = "zext";
        } else {
            instruction = "sitofp";
        }

        ST temp = new ST(
                "<ret> = <instruction> <t1> <r> to <t2>\n"
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

        if (v.getType() == BasicType.BOOL) {
            code.setType(BasicType.BOOL);
            code.setRegister(v.getRegister());
            return code;
        }

        String register = this.generateNewRegister();

        ST temp = new ST(
            "<register> = <instruction> ne <type> <val>, 0\n"
        );

        Type t = v.getType();
        String instruction = "no_istruction";

        if (t == BasicType.INT) {
            instruction = "icmp";
        }

        if (t == BasicType.FLOAT) {
            instruction = "fcmp";
        }

        temp.add("register", register);
        temp.add("type", t.getCode());
        temp.add("val", v.getRegister());
        temp.add("instruction", instruction);

        code.addCode(temp.render());
        code.setType(BasicType.BOOL);
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
                Function f = e.getValue();
                if (libFunctions.contains(f)) continue;

                ST template = new ST(
                    "define <rtype> <name>(<args>) {\n" +
                    "start:\n" +
                    "<body_code>" +
                    "}\n"
                );


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

    private CodeFragment generateLibFunctions() {
        CodeFragment code = new CodeFragment();

        for(Function f : libFunctions) {
            ST template = new ST(
                "declare <rtype> <name>(<args>)\n"
            );

            template.add("rtype", f.getReturnType().getCode());
            template.add("name", f.getName());
            template.add("args", getParamsString(f.getParams()));

            code.addCode(template.render());
            code.setType(f.getCode().getType());
            code.setRegister(f.getCode().getRegister());

        }
        return code;
    }

    @Override public CodeFragment visitInit(SimplangParser.InitContext ctx) {
        String base_functions =
            "declare i64* @create_list (i64)\n" +
            "declare void @setItem (i64*, i64, i64)\n"+
            "declare i64* @getItem (i64*, i64)\n";

        CodeFragment lib_functions = generateLibFunctions();

        CodeFragment body = new CodeFragment();

        for(SimplangParser.StatementContext s: ctx.statement()) {
            CodeFragment statement = visit(s);
            body.appendCodeFragment(statement);
        }

        ST template = new ST(
                "<base_functions>" +
                "<lib_functions>" +
                "<functions>" +
                "define i32 @main() {\n" +
                "start:\n" +
                "<body_code>" +
                "ret i32 0\n" +
                "}\n"
        );

        template.add("body_code", body);
        template.add("functions", this.generateFunctions());
        template.add("lib_functions", lib_functions);
        template.add("base_functions", base_functions);

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
        code.setType(BasicType.INT);
        code.setRegister(register);
        code.addCode(String.format("%s = add %s 0, %s\n", register, code.getType().getCode(), value));
        return code;
    }

    @Override public CodeFragment visitValBool(SimplangParser.ValBoolContext ctx) {
        String value = "1";
        if (ctx.BOOL().getText().equals("false")) {
            value = "0";
        }

        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setType(BasicType.BOOL);
        code.setRegister(register);
        code.addCode(String.format("%s = add %s 0, %s\n", register, code.getType().getCode(), value));
        return code;
    }

    @Override public CodeFragment visitValFloat(SimplangParser.ValFloatContext ctx) {
        String value = ctx.FLOAT().getText();
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setType(BasicType.FLOAT);
        code.setRegister(register);
        code.addCode(String.format("%s = add %s 0, %s\n", register, code.getType().getCode(), value));
        return code;
    }

    @Override public CodeFragment visitValList(SimplangParser.ValListContext ctx) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        ArgListCodeFragment value = (ArgListCodeFragment) visit(ctx.list().param_list());
        Type subtype = value.getType();
        code.addCode(value);
        code.setType(new ListType(subtype));
        code.setRegister(register);
        int size = value.getArgs().size();
        // int item_size = ((ListType) code.getType()).getSubtype().getSize();
        code.addCode(
            String.format(
                "%s = call %s @create_list(%s %s)\n",
                register,
                code.getType().getCode(),
                BasicType.INT.getCode(),
                Integer.toString(size)
            )
        );

        for (int i = 0; i<value.getArgs().size(); i++) {
            code.addCode(
                String.format(
                    "call %s @setItem(%s %s, %s %s, %s %s)\n",
                    "void",
                    code.getType().getCode(),
                    register,
                    BasicType.INT.getCode(),
                    Integer.toString(i),
                    value.getArgs().get(i).getType().getCode(),
                    value.getArgs().get(i).getRegister()
                )
            );
        }
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

        Type type = visit(ctx.type()).getType();
        String id = ctx.ID().getText();

        SimplangParser.ExpressionContext exp = ctx.expression();

        CodeFragment var_code = declVar(id, type);
        code.addCode(var_code);
        code.setRegister(var_code.getRegister());
        code.setType(var_code.getType());

        if (exp != null) {
            CodeFragment val = visit(exp);
            Variable var = getVar(id);
            CodeFragment assign = generateAssignCode(var, val);
            code.appendCodeFragment(assign);
        }

        return code;
    }

    @Override public CodeFragment visitFunc_def(SimplangParser.Func_defContext ctx) {
        CodeFragment code = new CodeFragment();

        Type rtype = visit(ctx.type()).getType();
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
            Type t = visit(ctx.type(i)).getType();
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

        if (!value.getType().equals(type)) {
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

    @Override public CodeFragment visitTypeBasic(SimplangParser.TypeBasicContext ctx) {
        CodeFragment code = new CodeFragment();
        code.setType(BasicType.fromString(ctx.getText()));
        return code;
    }

    @Override public CodeFragment visitTypeList(SimplangParser.TypeListContext ctx) {
        CodeFragment code = new CodeFragment();
        Type subtype = visit(ctx.type()).getType();
        code.setType(new ListType(subtype));
        return code;
    }

    @Override public CodeFragment visitSimple_assignment(SimplangParser.Simple_assignmentContext ctx) {
            CodeFragment code = new CodeFragment();
            CodeFragment lval = visit(ctx.var());
            code.addCode(lval);
            Variable v = new Variable(lval.getInfo(), lval.getRegister(), lval.getType());
            String op = ctx.op.getText();
            CodeFragment expr = visit(ctx.expression());

            if (op.equals("=")) {
                code.appendCodeFragment(generateAssignCode(v, expr));
            }
            return code;
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

    @Override public CodeFragment visitVarList(SimplangParser.VarListContext ctx) {
        CodeFragment var = visit(ctx.var());
        CodeFragment index = visit(ctx.expression());

        ListType t = (ListType) var.getType();
        String register = generateNewRegister();

        CodeFragment code = new CodeFragment();
        code.addCode(var);
        code.addCode(index);
        CodeFragment m = loadFromMemory(var.getRegister(), var.getType());
        code.addCode(m);
        code.addCode(
            String.format(
                "%s = call %s @getItem(%s %s, %s %s)\n",
                register,
                t.getCode(),
                m.getType().getCode(),
                m.getRegister(),
                index.getType().getCode(),
                index.getRegister()
            )
        );

        code.setRegister(register);
        code.setType(t.getSubtype());
        return code;
    }

    public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator) {
        String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
        Type type = left.getType();

        HashMap<Integer, Pair<String, String>> m = new HashMap<Integer, Pair<String, String>>();
        HashSet<Integer> boolOperators = new HashSet<Integer>();
        HashSet<Integer> cmpOperators = new HashSet<Integer>();

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
        cmpOperators.add(SimplangParser.EQ);
        m.put(SimplangParser.NE, new Pair<String, String>("icmp ne" , "fcmp ne" ));
        cmpOperators.add(SimplangParser.NE);
        m.put(SimplangParser.LE, new Pair<String, String>("icmp sle" , "fcmp sle" ));
        cmpOperators.add(SimplangParser.LE);
        m.put(SimplangParser.GE, new Pair<String, String>("icmp sge" , "fcmp sge" ));
        cmpOperators.add(SimplangParser.GE);
        m.put(SimplangParser.GT, new Pair<String, String>("icmp sgt" , "fcmp sgt" ));
        cmpOperators.add(SimplangParser.GT);
        m.put(SimplangParser.LT, new Pair<String, String>("icmp slt" , "fcmp slt" ));
        cmpOperators.add(SimplangParser.LT);


            // case SimplangParser.EXP:
        //         instruction = "@iexp";
        //         code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
        //         break;


        String instruction = "";

        if (left.getType() != right.getType()) {
            Type t = getCommonType(left.getType(), right.getType());
            if (t != BasicType.NOTYPE) {
                Variable v = new Variable(left.getInfo(), left.getRegister(), left.getType());
                left.appendCodeFragment(variableTypeConvert(v, t));

                Variable v2 = new Variable(right.getInfo(), right.getRegister(), right.getType());
                right.appendCodeFragment(variableTypeConvert(v2, t));

                type = t;
            } else {
                System.err.println(String.format("Incompatible types: '%s', '%s'", left.getType(), right.getType()));
                code_stub = "";
            }
        }

        if (boolOperators.contains(operator)) {
            instruction = m.get(operator).getFirst();
            Variable v = new Variable(left.getInfo(), left.getRegister(), left.getType());
            left.appendCodeFragment(variableToBool(v));

            Variable v2 = new Variable(right.getInfo(), right.getRegister(), right.getType());
            right.appendCodeFragment(variableToBool(v));

            type = BasicType.BOOL;

        } else {
            if (type == BasicType.BOOL) {
                Variable v = new Variable(left.getInfo(), left.getRegister(), left.getType());
                left.appendCodeFragment(variableTypeConvert(v, BasicType.INT));

                Variable v2 = new Variable(right.getInfo(), right.getRegister(), right.getType());
                right.appendCodeFragment(variableTypeConvert(v2, BasicType.INT));

                type = BasicType.INT;
            }

            if (type == BasicType.INT) {
                instruction = m.get(operator).getFirst();
            }

            if (type == BasicType.FLOAT) {
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

        Type retType;
        if (cmpOperators.contains(operator)) {
            retType = BasicType.BOOL;
        } else {
            retType = type;
        }

        CodeFragment ret = new CodeFragment();
        ret.setRegister(ret_register);
        ret.setType(retType);
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
        template.add("type", BasicType.INT.getCode());
        String return_register = generateNewRegister();
        template.add("ret", return_register);

        code.addCode(template.render());
        code.setType(BasicType.INT);
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
        template.add("rtype", BasicType.INT.getCode());

        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(end_register);
        ret.setType(BasicType.INT);
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

    @Override public CodeFragment visitIndex(SimplangParser.IndexContext ctx) {
        CodeFragment expr = visit(ctx.expression(0));
        CodeFragment index = visit(ctx.expression(1));

        ListType t = (ListType) expr.getType();
        String register = generateNewRegister();

        CodeFragment code = new CodeFragment();
        code.addCode(expr);
        code.addCode(index);
        code.addCode(
            String.format(
                "%s = call %s @getItem(%s %s, %s %s)\n",
                register,
                t.getCode(),
                expr.getType().getCode(),
                expr.getRegister(),
                index.getType().getCode(),
                index.getRegister()
            )
        );

        code.appendCodeFragment(loadFromMemory(register, t.getSubtype()));
        return code;
    }

    @Override public CodeFragment visitParen(SimplangParser.ParenContext ctx) {
        return visit(ctx.expression());
    }
}
