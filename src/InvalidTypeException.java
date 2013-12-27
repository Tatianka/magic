public class InvalidTypeException extends CodeException {
    private String id = "";
    private Type type;

    public Type getType() {
        return this.type;
    }

    public String getId() {
        return this.id;
    }

    public InvalidTypeException(CodePosition p, String id, Type type) {
        super(p, String.format("Error: invalid type '%s' of '%s'.", type, id));
        this.id = id;
        this.type = type;
    }

}
