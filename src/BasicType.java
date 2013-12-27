import java.util.HashMap;

public enum BasicType implements Type {
    // VOID("void" ,"void", 0),
    // POINTER("POINTER", ""),
    BOOL("bool", "i1", 1, true, true, false),
    INT("int", "i64", 4, true, true, false),
    FLOAT("float", "double", 4, false, true, false),
    NOTYPE("NOTYPE", "", 0, false, false, false);

    private String code = "";
    private String name = "";
    private int size = 0;

    boolean integer = false;
    boolean numeric = false;
    boolean iterable = false;

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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

        // if (t.equals("void")) {
        //     return VOID;
        // }

        return NOTYPE;
    }

    public String toString() {
        return this.name;
    }

    private BasicType(String name, String code, int size, boolean integer, boolean numeric, boolean iterable) {
        this.name = name;
        this.code = code;
        this.size = size;
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
}
