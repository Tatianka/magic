public class UnknownVarException extends RuntimeException {
    private String id = "";

    public String getId() {
        return this.id;
    }

    public UnknownVarException(String id) {
        this.id = id;
    }

    public String toString() {
        return String.format("Error: cannot redeclare idenifier '%s'.", id);
    }
}
