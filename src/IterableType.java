public abstract class IterableType implements Type {
    public final boolean isIterable() {
        return true;
    }

    private Type subtype;

    public Type getSubtype() {
        return this.subtype;
    }

    public void setSubtype(Type subtype) {
        this.subtype = subtype;
    }

    IterableType(Type subtype) {
        this.setSubtype(subtype);
    }
}
