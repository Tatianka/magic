public class ListType extends IterableType {
    private String code = "i8*";
    private String name = "";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String toString() {
        return this.name;
    }

    ListType(Type subtype) {
        super(subtype);
        this.setName(subtype.toString() + "[]");
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

    public String getDefaultValue() {
        return "[]";
    }
}
