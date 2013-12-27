public class UnknownVarException extends CodeException {
    private String id = "";

    public String getId() {
        return this.id;
    }

    public UnknownVarException(CodePosition p, String id) {
        super(p, String.format("Error: cannot redeclare idenifier '%s'.", id));
        this.id = id;
    }
}
