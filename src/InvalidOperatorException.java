public class InvalidOperatorException extends CodeException {
    private Type first;
    private Type second;

    public Type getFirst() {
        return this.first;
    }

    public Type getSecond() {
        return this.second;
    }

    public InvalidOperatorException(CodePosition p, Type t1, Type t2) {
        super(p, String.format("Error: This operator cannot be used with type '%s' and '%s'", t1, t2));
        this.first = t1;
        this.second = t2;
    }
}
