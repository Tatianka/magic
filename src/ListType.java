public class ListType implements Type {
    private String code = "i8*";
    private String name = "";
    private int current_pos = 0;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
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
        this.setName(subtype.toString() + "[]");
        this.setSubtype(subtype);
    }

    @Override public boolean equals(Object t) {
        return this.name.equals(t.toString());
    }

    public boolean isInteger() {
        return false;
    }
    public boolean isNumeric() {
        return false;
    }
    public boolean isIterable() {
        return true;
    }
}
