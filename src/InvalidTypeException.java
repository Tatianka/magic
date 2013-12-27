public class InvalidTypeException extends RuntimeException {
    private String id = "";
    private Type type;

    public Type getType() {
        return this.type;
    }

    public String getId() {
        return this.id;
    }

    public InvalidTypeException(String id, Type type) {
        this.id = id;
        this.type = type;
    }

    public String toString() {
        return String.format("Error: invalid type '%s' of '%s'.", type, id);
    }
}
