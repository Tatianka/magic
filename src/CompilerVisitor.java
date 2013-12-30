import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.stringtemplate.v4.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class CompilerVisitor extends MagicBaseVisitor<CodeFragment> {
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
        CodePosition cp = new CodePosition(0, 0);
        List<Variable> p;
        Function f;
        p = new ArrayList<Variable>();
        p.add(new Variable("a", "", BasicType.INT));
        f = new Function("printInt", "@printInt", BasicType.INT, p);
        libFunctions.add(f);
        declFunc("printInt", f, cp);

        p = new ArrayList<Variable>();
        f = new Function("readInt", "@readInt", BasicType.INT, p);
        libFunctions.add(f);
        declFunc("readInt", f, cp);

        p = new ArrayList<Variable>();
        p.add(new Variable("a", "", BasicType.FLOAT));
        f = new Function("printFloat", "@printFloat", BasicType.INT, p);
        libFunctions.add(f);
        declFunc("printFloat", f, cp);

        p = new ArrayList<Variable>();
        p.add(new Variable("a", "", BasicType.CHAR));
        f = new Function("printChar", "@printChar", BasicType.INT, p);
        libFunctions.add(f);
        declFunc("printChar", f, cp);
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

    protected Variable getVar(String identifier, CodePosition p) {
        Map<String, Variable> table = findVarTable(identifier);
        if (table == null) {
            throw new UnknownVarException(p, identifier);
        }
        return table.get(identifier);
    }

    protected Function getFunc(String identifier, CodePosition p) {
        Map<String, Function> table = findFuncTable(identifier);
        if (table == null) {
            throw new UnknownVarException(p, identifier);
        }
        return table.get(identifier);
    }

    protected void declFunc(String identifier, Function func, CodePosition p) {
        Map<String, Function> table = functions.getFirst();
        if (!table.containsKey(identifier)) {
            table.put(identifier, func);
        } else {
            throw new RedeclarationException(p, identifier);
        }
    }

    protected CodeFragment declVar(String identifier, Type t, CodePosition p) {
        CodeFragment ret = new CodeFragment();
        if (t == BasicType.NOTYPE) {
            throw new InvalidTypeException(p, identifier, t);
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
            ret.setType(t);
        } else {
            throw new RedeclarationException(p, identifier);
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
        if (t1.equals(t2)) {
            return true;
        }

        if ((t1 == BasicType.FLOAT || t1 == BasicType.INT || t1 == BasicType.BOOL) && (t2 == BasicType.FLOAT || t2 == BasicType.INT || t2 == BasicType.BOOL)) {
            return true;
        }

        if (t1 instanceof ListType && t2.equals(((ListType) t1).getSubtype()) ||
            t2 instanceof ListType && t1.equals(((ListType) t2).getSubtype())) {
            return true;
        }

        return false;
    }

    private Type getCommonType(Type t1, Type t2) {
        if (!compatibleTypes(t1, t2)) {
            return BasicType.NOTYPE;
        }

        if (t1 instanceof ListType) {
            return t1;
        }

        if (t2 instanceof ListType ) {
            return t2;
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
        if (v.getType().equals(t)) {
            code.setType(t);
            code.setRegister(v.getRegister());
            return code;
        }

        String instruction = "";
        String register = this.generateNewRegister();

        if (t instanceof ListType) {
            ListType lt = (ListType) t;
            if (lt.getSubtype().equals(v.getType())) {
                code.addCode(
                    String.format(
                        "%s = call %s @createList%s(%s %s)\n",
                        register,
                        t.getCode(),
                        getFunctionSuffix(lt.getSubtype()),
                        BasicType.INT.getCode(),
                        "1"
                    )
                );

                code.addCode(
                    String.format(
                        "call %s @setListItem%s(%s %s, %s %s, %s %s)\n",
                        "void",
                        getFunctionSuffix(lt.getSubtype()),
                        t.getCode(),
                        register,
                        BasicType.INT.getCode(),
                        "0",
                        v.getType().getCode(),
                        v.getRegister()
                    )
                );
            } else if (v.getType() instanceof RangeType && ((RangeType)v.getType()).getSubtype().equals(lt.getSubtype())) {
                code.addCode(
                    String.format(
                        "%s = call %s @createListFromRange%s(%s %s)\n",
                        register,
                        t.getCode(),
                        getFunctionSuffix(lt.getSubtype()),
                        v.getType().getCode(),
                        v.getRegister()
                    )
                );
            }
        } else {
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
        }

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

    private String getFunctionSuffix(Type t) {
        String listType = "Int";
        if (t.equals(BasicType.FLOAT)) {
            listType = "Float";
        }
        if (t.equals(BasicType.CHAR)) {
            listType = "Char";
        }
        if (t.equals(BasicType.BOOL)) {
            listType = "Bool";
        }
        if (t instanceof IterableType) {
            listType = "Pointer";
        }

        // System.err.println(t.toString() + " ->" + listType);
        return listType;
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

    private String getListFunctions(Type t) {
        String list_type = getFunctionSuffix(t);

        ST list_functions = new ST(
            "declare i8* @createList<list_type> (i64)\n" +
            "declare void @setListItem<list_type> (i8*, i64, <type>)\n" +
            "declare <type> @getListItem<list_type> (i8*, i64)\n" +
            "declare i8* @mergeLists<list_type> (i8*, i8*)\n" +
            "declare i8* @multiplyList<list_type> (i8*, i64)\n" +
            "declare i64 @sizeList<list_type> (i8*)\n"
        );

        list_functions.add("list_type", list_type);
        list_functions.add("type", t.getCode());
        return list_functions.render();
    }

    private String getRangeFunctions(Type t) {
        String range_type = getFunctionSuffix(t);

        ST list_functions = new ST(
            "declare i8* @createListFromRange<range_type> (i8*)\n" +
            "declare i8* @createRange<range_type> (<type>, <type>, <type>)\n" +
            "declare <type> @getRangeItem<range_type> (i8*, i64)\n" +
            "declare i64 @sizeRange<range_type> (i8*)\n"
        );

        list_functions.add("range_type", range_type);
        list_functions.add("type", t.getCode());
        return list_functions.render();
    }


    @Override public CodeFragment visitInit(MagicParser.InitContext ctx) {
        String base_functions =
            getRangeFunctions(BasicType.CHAR) +
            getRangeFunctions(BasicType.INT) +
            getRangeFunctions(BasicType.FLOAT) +
            getListFunctions(BasicType.BOOL) +
            getListFunctions(BasicType.CHAR) +
            getListFunctions(BasicType.INT) +
            getListFunctions(BasicType.FLOAT) +
            getListFunctions(new ListType(BasicType.NOTYPE));

        CodeFragment body = new CodeFragment();

        for(MagicParser.Extern_func_defContext s: ctx.extern_func_def()) {
            CodeFragment fdef = visit(s);
            body.appendCodeFragment(fdef);
        }

        CodeFragment lib_functions = generateLibFunctions();

        for(MagicParser.StatementContext s: ctx.statement()) {
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

    private CodeFragment loadIndexedVar(IndexationCodeFragment var, CodePosition p) {
        IterableType t = (IterableType) var.getType();
        String register = generateNewRegister();

        CodeFragment code = new CodeFragment();
        code.addCode(var);

        String ftype = "Range";
        if (t instanceof ListType) {
            ftype = "List";
        }

        ST template = new ST(
            "<ret> = call <type> @get<ftype>Item<suffix>(<iterable_type> <iterable>, <index_type> <index>)\n"
        );

        template.add("ret", register);
        template.add("type", t.getSubtype().getCode());
        template.add("ftype", ftype);
        template.add("suffix", getFunctionSuffix(t.getSubtype()));
        template.add("iterable_type", var.getType().getCode());
        template.add("iterable", var.getRegister());
        template.add("index_type", var.getIndexType().getCode());
        template.add("index", var.getIndexRegister());
        code.addCode(template.render());

        code.setRegister(register);
        code.setType(t.getSubtype());

        return code;
    }

    @Override public CodeFragment visitValVar(MagicParser.ValVarContext ctx) {
        CodeFragment v = visit(ctx.var());
        CodeFragment code = new CodeFragment();
        if (v instanceof IndexationCodeFragment) {
            code.appendCodeFragment(loadIndexedVar((IndexationCodeFragment) v, new CodePosition(ctx)));
        } else {
            code.addCode(v);
            code.appendCodeFragment(loadFromMemory(v.getRegister(), v.getType()));
        }
        return code;
    }

    private CodeFragment generateConstant(Type t, String value) {
        CodeFragment code = new CodeFragment();
        String register = generateNewRegister();
        code.setType(t);
        code.setRegister(register);
        if (t.isInteger()) {
            code.addCode(String.format("%s = add %s 0, %s\n", register, code.getType().getCode(), value));
        } else if (t.equals(BasicType.FLOAT)) {
            code.addCode(String.format("%s = fadd %s 0.0, %s\n", register, code.getType().getCode(), value));
        }
        return code;
    }

    @Override public CodeFragment visitValInt(MagicParser.ValIntContext ctx) {
        return generateConstant(BasicType.INT, ctx.INT().getText());
    }

    @Override public CodeFragment visitValBool(MagicParser.ValBoolContext ctx) {
        String value = "1";
        if (ctx.BOOL().getText().equals("false")) {
            value = "0";
        }

        return generateConstant(BasicType.BOOL, value);
    }

    @Override public CodeFragment visitValChar(MagicParser.ValCharContext ctx) {
        String value = Integer.toString((int)ctx.CHAR().getText().charAt(1));
        return generateConstant(BasicType.CHAR, value);
    }

    @Override public CodeFragment visitValFloat(MagicParser.ValFloatContext ctx) {
        String value = ctx.FLOAT().getText();
        return generateConstant(BasicType.FLOAT, value);
    }

    private CodeFragment generateListConstant(Type subtype, ArgListCodeFragment value) {
        String register = generateNewRegister();
        CodeFragment code = new CodeFragment();

        code.addCode(value);
        code.setType(new ListType(subtype));
        code.setRegister(register);

        code.addCode(
            String.format(
                "%s = call %s @createList%s(%s %s)\n",
                register,
                code.getType().getCode(),
                getFunctionSuffix(subtype),
                BasicType.INT.getCode(),
                Integer.toString(value.getArgs().size())
            )
        );

        for (int i = 0; i<value.getArgs().size(); i++) {
            code.addCode(
                String.format(
                    "call %s @setListItem%s(%s %s, %s %s, %s %s)\n",
                    "void",
                    getFunctionSuffix(subtype),
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

    @Override public CodeFragment visitValList(MagicParser.ValListContext ctx) {
        ArgListCodeFragment value = (ArgListCodeFragment) visit(ctx.list().param_list());
        Type subtype = value.getType();
        return generateListConstant(subtype, value);
    }

    private CodeFragment generateRangeConstant(Type subtype, CodeFragment start, CodeFragment end, CodeFragment jump) {
        String register = generateNewRegister();
        CodeFragment code = new CodeFragment();

        Type rtype = new RangeType(subtype);

        ST template = new ST (
            "<start_code>" +
            "<end_code>" +
            "<jump_code>" +
            "<reg> = call <rtype> @createRange<range_type>(<type> <start>, <type> <end>, <type> <jump>)\n"
        );

        template.add("reg", register);
        template.add("rtype", rtype.getCode());
        template.add("type", subtype.getCode());
        template.add("start", start.getRegister());
        template.add("end", end.getRegister());
        template.add("jump", jump.getRegister());
        template.add("start_code", start);
        template.add("end_code", end);
        template.add("jump_code", jump);
        template.add("range_type", getFunctionSuffix(subtype));

        code.addCode(template.render());
        code.setType(rtype);
        code.setRegister(register);

        return code;
    }

    @Override public CodeFragment visitValRange(MagicParser.ValRangeContext ctx) {
        CodeFragment start = visit(ctx.range().expression(0));
        CodeFragment end = visit(ctx.range().expression(1));
        CodeFragment jump;
        if (ctx.range().expression().size()>2) {
            jump = visit(ctx.range().expression(2));
        } else {
            jump = generateConstant(start.getType(), "1");
        }

        Type subtype = start.getType();
        return generateRangeConstant(subtype, start, end, jump);
    }

    @Override public CodeFragment visitStatement(MagicParser.StatementContext ctx) {
        MagicParser.Simple_statementContext ss = ctx.simple_statement();
        if (ss != null) {
            return visit(ss);
        }

        MagicParser.Block_statementContext bs = ctx.block_statement();
        if (bs != null) {
            return visit(bs);
        }

        return new CodeFragment();
    }

    @Override public CodeFragment visitVar_def(MagicParser.Var_defContext ctx) {
        CodeFragment code = new CodeFragment();

        Type type = visit(ctx.type()).getType();
        String id = ctx.ID().getText();

        MagicParser.ExpressionContext exp = ctx.expression();

        CodeFragment var_code = declVar(id, type, new CodePosition(ctx));
        code.addCode(var_code);
        code.setRegister(var_code.getRegister());
        code.setType(var_code.getType());

        CodeFragment val;
        Variable var = getVar(id, new CodePosition(ctx));
        if (exp != null) {
            val = visit(exp);
        } else {
            if (var.getType() instanceof ListType) {
                val = generateListConstant(((ListType)var.getType()).getSubtype(), new ArgListCodeFragment() );
            }  else {
                val = generateConstant(var.getType(), var.getType().getDefaultValue());
            }
        }

        CodeFragment assign = generateAssignCode(var, val, new CodePosition(ctx));
        code.appendCodeFragment(assign);
        return code;
    }

    @Override public CodeFragment visitFunc_def(MagicParser.Func_defContext ctx) {
        CodeFragment code = new CodeFragment();
        String name = generateNewFunctionName();

        Type rtype = visit(ctx.type()).getType();
        String id = ctx.ID().getText();

        CodeFragment body = new CodeFragment();
        ArgListCodeFragment arglist;
        Function f = new Function(id, name, rtype, null, body);
        declFunc(id, f, new CodePosition(ctx));
        addTable();
        arglist = (ArgListCodeFragment) visit(ctx.arglist());
        f.setParams(arglist.getArgs());
        body.appendCodeFragment(arglist);
        body.appendCodeFragment(visit(ctx.block()));
        removeTable();

        code.setType(body.getType());
        code.setRegister(body.getRegister());

        return code;
    }

    @Override public CodeFragment visitExtern_func_def(MagicParser.Extern_func_defContext ctx) {
        CodePosition cp = new CodePosition(ctx);
        CodeFragment code = new CodeFragment();

        Type rtype = visit(ctx.type()).getType();
        String id = ctx.ID().getText();
        String name = "@" + id;

        ArgListCodeFragment arglist = (ArgListCodeFragment) visit(ctx.typelist());
        Function f = new Function(id, name, rtype, arglist.getArgs());
        declFunc(id, f, new CodePosition(ctx));
        libFunctions.add(f);

        code.setType(arglist.getType());
        code.setRegister(arglist.getRegister());

        return code;
    }

    @Override public CodeFragment visitRet(MagicParser.RetContext ctx) {
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

    @Override public CodeFragment visitArglist(MagicParser.ArglistContext ctx) {
        ArgListCodeFragment code = new ArgListCodeFragment();
        for (int i = 0; i< ctx.type().size(); i++) {
            Type t = visit(ctx.type(i)).getType();
            String id = ctx.ID(i).getText();
            String argRegister = this.generateNewRegister();

            CodeFragment arg_code = declVar(id, t, new CodePosition(ctx));
            code.appendCodeFragment(arg_code);

            CodeFragment val_code = new CodeFragment();
            val_code.setRegister(argRegister);
            val_code.setType(t);

            Variable var = getVar(id, new CodePosition(ctx));
            CodeFragment assign = generateAssignCode(var, val_code, new CodePosition(ctx));

            code.appendCodeFragment(assign);
            code.addArg(new Variable(id, argRegister, t));
        }

        return (CodeFragment)code;
    }

    @Override public CodeFragment visitTypelist(MagicParser.TypelistContext ctx) {
        ArgListCodeFragment code = new ArgListCodeFragment();
        for (int i = 0; i< ctx.type().size(); i++) {
            Type t = visit(ctx.type(i)).getType();
            code.addArg(new Variable("", "", t));
        }

        return (CodeFragment)code;
    }

    public CodeFragment generateAssignCode(Variable var, CodeFragment value, CodePosition p) {
        CodeFragment ret = new CodeFragment();

        String mem_register = var.getRegister();
        Type type = var.getType();

        if (!value.getType().equals(type)) {
            Variable valvar = new Variable(value.getInfo(), value.getRegister(), value.getType());
            value.appendCodeFragment(variableTypeConvert(valvar, type));
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

    public CodeFragment generateIndexAssignCode(IndexationCodeFragment var, CodeFragment value, CodePosition p) {
        CodeFragment ret = new CodeFragment();
        //ret.addCode(var);
        ret.addCode(value);

        Type type =((ListType) var.getType()).getSubtype();

        if (!value.getType().equals(type)) {
             Variable valvar = new Variable(value.getInfo(), value.getRegister(), value.getType());
             value.appendCodeFragment(variableTypeConvert(valvar, type));
        }

        ST template = new ST(
            "call void @setListItem<suffix>(<list_type> <list>, <index_type> <index>, <item_type> <item>)\n"
        );

        template.add("suffix", getFunctionSuffix(((ListType)var.getType()).getSubtype()));
        template.add("list_type", var.getType().getCode());
        template.add("list", var.getRegister());
        template.add("index_type", var.getIndexType().getCode());
        template.add("index", var.getIndexRegister());
        template.add("item_type", value.getType().getCode());
        template.add("item", value.getRegister());

        ret.addCode(template.render());
        ret.setRegister(value.getRegister());
        ret.setType(value.getType());
        return ret;
    }

    @Override public CodeFragment visitTypeBasic(MagicParser.TypeBasicContext ctx) {
        CodeFragment code = new CodeFragment();
        code.setType(BasicType.fromString(ctx.getText()));
        return code;
    }

    @Override public CodeFragment visitTypeList(MagicParser.TypeListContext ctx) {
        CodeFragment code = new CodeFragment();
        Type subtype = visit(ctx.type()).getType();
        code.setType(new ListType(subtype));
        return code;
    }

    @Override public CodeFragment visitTypeRange(MagicParser.TypeRangeContext ctx) {
        CodeFragment code = new CodeFragment();
        Type subtype = visit(ctx.type()).getType();
        //todo chcek numeric type
        code.setType(new RangeType(subtype));
        return code;
    }

    @Override public CodeFragment visitComplex_assignment(MagicParser.Complex_assignmentContext ctx) {
        CodePosition p = new CodePosition(ctx);
        CodeFragment code = new CodeFragment();
        CodeFragment expr = visit(ctx.expression());
        CodeFragment lval;
        lval = visit(ctx.var());

        Map<Integer, Integer> opm = new HashMap<Integer, Integer>();
        opm.put(MagicParser.ADD_ASSIGN, MagicParser.ADD);
        opm.put(MagicParser.SUB_ASSIGN, MagicParser.SUB);
        opm.put(MagicParser.MUL_ASSIGN, MagicParser.MUL);
        opm.put(MagicParser.DIV_ASSIGN, MagicParser.DIV);
        opm.put(MagicParser.IDIV_ASSIGN, MagicParser.IDIV);
        opm.put(MagicParser.REM_ASSIGN, MagicParser.REM);
        opm.put(MagicParser.EXP_ASSIGN, MagicParser.EXP);
        int op = ctx.op.getType();

        if (lval instanceof IndexationCodeFragment) {
            CodeFragment rval = generateBinaryOperatorCodeFragment(loadIndexedVar((IndexationCodeFragment)lval, p), expr, opm.get(op), p);
            code.appendCodeFragment(generateIndexAssignCode((IndexationCodeFragment) lval, rval, p));
        } else {
            CodeFragment rval = generateBinaryOperatorCodeFragment(loadFromMemory(lval.getRegister(), lval.getType()), expr, opm.get(op), p);
            Variable v = new Variable(lval.getInfo(), lval.getRegister(), lval.getType());
            code.appendCodeFragment(generateAssignCode(v, rval, p));
        }

        return code;
    }

    @Override public CodeFragment visitSimple_assignment(MagicParser.Simple_assignmentContext ctx) {
        CodeFragment code = new CodeFragment();
        CodeFragment expr = visit(ctx.expression());
        CodeFragment lval;
        try {
            lval = visit(ctx.var());
        } catch (UnknownVarException e) {
            lval = declVar(e.getId(), expr.getType(), new CodePosition(ctx));
        }

        code.addCode(lval);
        if (lval instanceof IndexationCodeFragment) {
            code.appendCodeFragment(generateIndexAssignCode((IndexationCodeFragment) lval, expr, new CodePosition(ctx)));
        } else {
            Variable v = new Variable(lval.getInfo(), lval.getRegister(), lval.getType());
            code.appendCodeFragment(generateAssignCode(v, expr, new CodePosition(ctx)));
        }

        return code;
    }

    @Override public CodeFragment visitVarID(MagicParser.VarIDContext ctx) {
        CodeFragment code = new CodeFragment();
        String id = ctx.ID().getText();
        Variable var = getVar(id, new CodePosition(ctx));
        code.setInfo(var.getName());
        code.setRegister(var.getRegister());
        code.setType(var.getType());
        return code;
    }

    @Override public CodeFragment visitVarList(MagicParser.VarListContext ctx) {
        CodePosition p = new CodePosition(ctx);
        CodeFragment var; //todo multipleindex
        try {
            var = visit(ctx.var());
        } catch (UnknownVarException e) {
            throw new InvalidIndexationException(p);
        }

        IndexationCodeFragment code = new IndexationCodeFragment();
        CodeFragment index = visit(ctx.expression());
        code.addCode(index);
        code.setIndexType(index.getType());
        code.setIndexRegister(index.getRegister());

        if (var instanceof IndexationCodeFragment) {
            code.appendCodeFragment(loadIndexedVar((IndexationCodeFragment) var, p));
        } else {
            var.appendCodeFragment(loadFromMemory(var.getRegister(), var.getType()));
            code.appendCodeFragment(var);
        }

        return code;
    }

    public CodeFragment generateBinaryOperatorCodeFragment(CodeFragment left, CodeFragment right, Integer operator, CodePosition p) {
        String code_stub = "<ret> = <instruction> <type> <left_val>, <right_val>\n";
        Type type = left.getType();

        HashMap<Integer, Pair<String, String>> m = new HashMap<Integer, Pair<String, String>>();
        HashSet<Integer> boolOperators = new HashSet<Integer>();
        HashSet<Integer> cmpOperators = new HashSet<Integer>();

        m.put(MagicParser.ADD, new Pair<String, String>("add", "fadd"));
        m.put(MagicParser.SUB, new Pair<String, String>("sub", "fsub"));
        m.put(MagicParser.MUL, new Pair<String, String>("mul", "fmul"));
        m.put(MagicParser.DIV, new Pair<String, String>("sdiv", "fdiv"));
        m.put(MagicParser.REM, new Pair<String, String>("srem" , "frem" ));

        m.put(MagicParser.AND, new Pair<String, String>("and" , "and" ));
        boolOperators.add(MagicParser.AND);
        m.put(MagicParser.OR, new Pair<String, String>("or" , "or" ));
        boolOperators.add(MagicParser.OR);

        m.put(MagicParser.EQ, new Pair<String, String>("icmp eq" , "fcmp eq" ));
        cmpOperators.add(MagicParser.EQ);
        m.put(MagicParser.NE, new Pair<String, String>("icmp ne" , "fcmp ne" ));
        cmpOperators.add(MagicParser.NE);
        m.put(MagicParser.LE, new Pair<String, String>("icmp sle" , "fcmp sle" ));
        cmpOperators.add(MagicParser.LE);
        m.put(MagicParser.GE, new Pair<String, String>("icmp sge" , "fcmp sge" ));
        cmpOperators.add(MagicParser.GE);
        m.put(MagicParser.GT, new Pair<String, String>("icmp sgt" , "fcmp sgt" ));
        cmpOperators.add(MagicParser.GT);
        m.put(MagicParser.LT, new Pair<String, String>("icmp slt" , "fcmp slt" ));
        cmpOperators.add(MagicParser.LT);


            // case MagicParser.EXP:
        //         instruction = "@iexp";
        //         code_stub = "<ret> = call i32 <instruction>(i32 <left_val>, i32 <right_val>)\n";
        //         break;


        String instruction = "";

        if (left.getType() instanceof ListType || right.getType() instanceof ListType) {
            if (operator == MagicParser.ADD) {
                if (!left.getType().equals(right.getType())) {
                    Type t = getCommonType(left.getType(), right.getType());

                    if (t != BasicType.NOTYPE) {
                        Variable v = new Variable(left.getInfo(), left.getRegister(), left.getType());
                        left.appendCodeFragment(variableTypeConvert(v, t));

                        Variable v2 = new Variable(right.getInfo(), right.getRegister(), right.getType());
                        right.appendCodeFragment(variableTypeConvert(v2, t));

                        type = t;
                    } else {
                        throw new TypeMismatchException(p, left.getType(), right.getType());
                    }
                }

                code_stub =  String.format(
                    "<ret> = call <type> @mergeLists%s(<type> <left_val>, <type> <right_val>)\n",
                    getFunctionSuffix(((ListType) type).getSubtype())
                );
            }

            if (operator == MagicParser.MUL) {
                CodeFragment lst;
                CodeFragment val;
                if (left.getType() instanceof ListType) {
                    lst = left;
                    val = right;
                } else {
                    lst = right;
                    val = left;
                }

                if (val.getType().isInteger()) {
                    Variable v = new Variable(val.getInfo(), val.getRegister(), val.getType());
                    val.appendCodeFragment(variableTypeConvert(v, BasicType.INT));

                    ST tmp = new ST(
                        "\\<ret> = call <type> @multiplyList<lst_type>(<type> <lst>, <val_type> <val>)\n"
                    );

                    tmp.add("lst_type", getFunctionSuffix(((ListType) type).getSubtype()));
                    tmp.add("lst", lst.getRegister());
                    tmp.add("val", val.getRegister());
                    tmp.add("type", lst.getType().getCode());
                    tmp.add("val_type", val.getType().getCode());
                    code_stub = tmp.render();
                } else {
                    throw new TypeMismatchException(p, BasicType.INT, val.getType());
                }

            }
        } else {
            if (!left.getType().equals(right.getType())) {
                Type t = getCommonType(left.getType(), right.getType());
                if (t != BasicType.NOTYPE) {
                    Variable v = new Variable(left.getInfo(), left.getRegister(), left.getType());
                    left.appendCodeFragment(variableTypeConvert(v, t));

                    Variable v2 = new Variable(right.getInfo(), right.getRegister(), right.getType());
                    right.appendCodeFragment(variableTypeConvert(v2, t));

                    type = t;
                } else {
                    throw new TypeMismatchException(p, left.getType(), right.getType());
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

    @Override public CodeFragment visitMul(MagicParser.MulContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType(),
            new CodePosition(ctx)
        );
    }

    @Override public CodeFragment visitAdd(MagicParser.AddContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType(),
            new CodePosition(ctx)
        );
    }

    @Override public CodeFragment visitBoolAnd(MagicParser.BoolAndContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType(),
            new CodePosition(ctx)
        );
    }

    @Override public CodeFragment visitBoolOr(MagicParser.BoolOrContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType(),
            new CodePosition(ctx)
        );
    }

    @Override public CodeFragment visitCompare(MagicParser.CompareContext ctx) {
        return generateBinaryOperatorCodeFragment(
            visit(ctx.expression(0)),
            visit(ctx.expression(1)),
            ctx.op.getType(),
            new CodePosition(ctx)
        );
    }

    @Override public CodeFragment visitBlock(MagicParser.BlockContext ctx) {
        CodeFragment body = new CodeFragment();
        addTable();
        for(MagicParser.StatementContext s: ctx.statement()) {
            CodeFragment statement = visit(s);
            body.appendCodeFragment(statement);
        }
        removeTable();
        return body;
    }

    @Override public CodeFragment visitIf_statement(MagicParser.If_statementContext ctx) {
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

    @Override public CodeFragment visitWhile_statement(MagicParser.While_statementContext ctx) {
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

    private ArgListCodeFragment convertParamList(ArgListCodeFragment paramList, Function f) {
        ArgListCodeFragment code = new ArgListCodeFragment();
        code.appendCodeFragment(paramList);
        for (int i = 0; i<paramList.getArgs().size();i++) {
            Variable v = paramList.getArgs().get(i);
            Type t = f.getParams().get(i).getType();
            code.appendCodeFragment(variableTypeConvert(v, t));
            code.addArg(new Variable(code.getInfo(),code.getRegister(), code.getType()));
        }
        return code;
    }

    @Override public CodeFragment visitFunc_call(MagicParser.Func_callContext ctx) {
        CodeFragment code = new CodeFragment();
        String id = ctx.ID().getText();
        Function f = getFunc(id, new CodePosition(ctx));

        ArgListCodeFragment params = convertParamList((ArgListCodeFragment)visit(ctx.param_list()), f);
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

    @Override public CodeFragment visitParam_list(MagicParser.Param_listContext ctx) {
        ArgListCodeFragment code = new ArgListCodeFragment();
        code.setType(BasicType.INT);
        for (MagicParser.ExpressionContext e: ctx.expression()) {
            CodeFragment expr_code = visit(e);
            code.appendCodeFragment(expr_code);
            code.addArg(new Variable(expr_code.getInfo(), expr_code.getRegister(), expr_code.getType()));
        }
        return (CodeFragment)code;
    }

    @Override public CodeFragment visitIndex(MagicParser.IndexContext ctx) {
        CodeFragment expr = visit(ctx.expression(0));
        CodeFragment index = visit(ctx.expression(1));

        IterableType t = (IterableType) expr.getType();
        String register = generateNewRegister();

        CodeFragment code = new CodeFragment();
        code.addCode(expr);
        code.addCode(index);

        String type_str = t.getSubtype().getCode();
        String ftype = "Range";
        if (t instanceof ListType) {
            ftype = "List";
        }

        ST template = new ST(
            "<ret> = call <type> @get<ftype>Item<suffix>(<iterable_type> <iterable>, <index_type> <index>)\n"
        );

        template.add("ret", register);
        template.add("type", type_str);
        template.add("ftype", ftype);
        template.add("suffix", getFunctionSuffix(t.getSubtype()));
        template.add("iterable_type", t.getCode());
        template.add("iterable", expr.getRegister());
        template.add("index_type", index.getType().getCode());
        template.add("index", index.getRegister());
        code.addCode(template.render());
        code.setRegister(register);
        code.setType(t.getSubtype());

        return code;
    }

    @Override public CodeFragment visitParen(MagicParser.ParenContext ctx) {
        return visit(ctx.expression());
    }

    @Override public CodeFragment visitFor_statement(MagicParser.For_statementContext ctx) {
        addTable();
        CodeFragment expr = visit(ctx.expression());
        CodeFragment var = declVar(ctx.ID().getText(), ((IterableType)expr.getType()).getSubtype(), new CodePosition(ctx));

        CodeFragment block = visit(ctx.block());

        String ireg = generateNewRegister();
        String vreg = var.getRegister();


        String iterable_type_str = "List";

        IterableType t = (IterableType) expr.getType();

        if(expr.getType() instanceof RangeType) {
            iterable_type_str = "Range";
        }

        ST template = new ST(
            "<expression_code>" +
            "<var_code>" +
            "<init_size> = call i64 @size<iterable_type><suffix>(i8* <iterable>)\n" +
            "<init_cmp_register> = icmp slt i64 0, <init_size>\n" +
            "br i1 <init_cmp_register>, label %<init_label>, label %<end_label>\n" +
            "<init_label>:\n" +
            "<iptr> = alloca i64\n" +
            "<init_ni> = add i64 0, 0\n" +
            "store i64 <init_ni>, i64* <iptr>\n" +
            "<init_v> = call <type> @get<iterable_type>Item<suffix>(i8* <iterable>, i64 <init_ni>)\n" +
            "store <type> <init_v>, <type>* <varptr>\n" +

            "br label %<cmp_label>\n" +
            "<cmp_label>:\n" +
            "<size> = call i64 @size<iterable_type><suffix>(i8* <iterable>)\n" +
            "<cmp_i> = load i64* <iptr>\n" +
            "<cmp_register> = icmp slt i64 <cmp_i>, <size>\n" +

            "br i1 <cmp_register>, label %<body_label>, label %<end_label>\n" +
            "<body_label>:\n" +
            "<body_code>" +

            "<iter_i> = load i64* <iptr>\n" +
            "<iter_ni> = add i64 <iter_i>, 1\n" +
            "store i64 <iter_ni>, i64* <iptr>\n" +
            "<iter_v> = call <type> @get<iterable_type>Item<suffix>(i8* <iterable>, i64 <iter_ni>)\n" +
            "store <type> <iter_v>, <type>* <varptr>\n" +

            "br label %<cmp_label>\n" +
            "<end_label>:\n" +
            "<ret> = add <rtype> 0, 0\n"
        );

        template.add("expression_code", expr);
        template.add("var_code", var);

        template.add("iterable_type", iterable_type_str);
        template.add("suffix", getFunctionSuffix(t.getSubtype()));

        template.add("init_ni", generateNewRegister());
        template.add("init_size", generateNewRegister());
        template.add("init_cmp_register", generateNewRegister());
        template.add("init_v", generateNewRegister());
        template.add("size", generateNewRegister());
        template.add("cmp_i", generateNewRegister());
        template.add("iter_i", generateNewRegister());
        template.add("iter_ni", generateNewRegister());
        template.add("iter_v", generateNewRegister());

        template.add("iptr", ireg);
        template.add("varptr", vreg);
        template.add("iterable", expr.getRegister());
        template.add("type", t.getSubtype().getCode());

        template.add("cmp_register", generateNewRegister());

        template.add("init_label", generateNewLabel());
        template.add("cmp_label", generateNewLabel());
        template.add("body_label", generateNewLabel());
        template.add("end_label", generateNewLabel());
        template.add("body_code", block);

        String end_register = generateNewRegister();
        template.add("ret", end_register);
        template.add("rtype", BasicType.INT.getCode());

        removeTable();

        CodeFragment ret = new CodeFragment();
        ret.addCode(template.render());
        ret.setRegister(end_register);
        ret.setType(BasicType.INT);
        return ret;
    }
}
