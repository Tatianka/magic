public class TypeMismatchException extends RuntimeException {
    private Type first;
    private Type second;

    public Type getFirst() {
        return this.first;
    }

    public Type getSecond() {
        return this.second;
    }

    public TypeMismatchException(Type t1, Type t2) {
        this.first = t1;
        this.second = t2;
    }

    public String toString() {
        return String.format("Type Error: type '%s' does match expected type '%s'", first, second);
    }
}
