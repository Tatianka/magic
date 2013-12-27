public class TypeMismatchException extends CodeException {
    private Type first;
    private Type second;

    public Type getFirst() {
        return this.first;
    }

    public Type getSecond() {
        return this.second;
    }

    public TypeMismatchException(CodePosition p, Type t1, Type t2) {
        super(p, String.format("Type Error: type '%s' does match expected type '%s'", t1, t2));
        this.first = t1;
        this.second = t2;
    }
}
