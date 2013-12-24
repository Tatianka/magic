import java.util.HashMap;

public enum BasicType implements Type {
    // VOID("void" ,"void", 0),
    // LIST("list", "{i64, i64, i64, i64*}"),
    // POINTER("POINTER", ""),
    BOOL("bool", "i1", 1),
    INT("int", "i64", 4),
    FLOAT("float", "double", 4),
    NOTYPE("NOTYPE", "", 0);

    private String code = "";
    private String name = "";
    private int size = 0;

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

    private BasicType(String name, String code, int size) {
        this.name = name;
        this.code = code;
        this.size = size;
    }
}
