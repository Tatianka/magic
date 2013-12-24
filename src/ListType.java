public class ListType implements Type {
    private String code = "{i64, i64, i64, i64*}";
    private String name = "list";
    private int size = 16;
    private Type subtype;

    public Type getSubtype() {
        return this.subtype;
    }

    public void setSubtype(Type subtype) {
        this.subtype = subtype;
    }

    public int getSize() {
        return this.size;
    }

    public String getCode() {
        return this.code;
    }

    public String toString() {
        return this.name;
    }

    ListType(Type subtype) {
        this.setSubtype(subtype);
    }
}
