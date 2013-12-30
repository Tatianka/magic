import java.util.HashMap;

public enum BasicType implements Type {
    // VOID("void" ,"void", 0),
    BOOL("bool", "i1", "0", true, true, false),
    CHAR("char", "i8", "0", true, true, false),
    INT("int", "i64", "0", true, true, false),
    FLOAT("float", "double", "0.0", false, true, false),
    NOTYPE("NOTYPE", "", "", false, false, false);

    private String code = "";
    private String name = "";
    private String def = "";

    boolean integer = false;
    boolean numeric = false;
    boolean iterable = false;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Type fromString(String t) {
        if (t.equals("int")) {
            return INT;
        }

        if (t.equals("bool")) {
            return BOOL;
        }

        if (t.equals("float")) {
            return FLOAT;
        }

        if (t.equals("string")) {
            return new ListType(BasicType.CHAR);
        }

        // if (t.equals("void")) {
        //     return VOID;
        // }

        return NOTYPE;
    }

    public String toString() {
        return this.name;
    }

    private BasicType(String name, String code, String def, boolean integer, boolean numeric, boolean iterable) {
        this.name = name;
        this.code = code;
        this.def = def;
        this.integer = integer;
        this.numeric = numeric;
        this.iterable = iterable;
    }

    public boolean isInteger() {
        return integer;
    }

    public boolean isNumeric() {
        return numeric;
    }

    public boolean isIterable() {
        return iterable;
    }

    public String getDefaultValue() {
        return this.def;
    }
}
