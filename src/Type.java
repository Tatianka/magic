import java.util.HashMap;

public enum Type {
    VOID("void" ,"void"),
    BOOL("bool", "i1"),
    INT("int", "i64"),
    FLOAT("float", "double"),
    POINTER("POINTER", ""),
    NOTYPE("NOTYPE", "");

    private String code = "";
    private String name = "";

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

        if (t.equals("void")) {
            return VOID;
        }

        return NOTYPE;
    }

    public String toString() {
        return this.name;
    }

    private Type(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
