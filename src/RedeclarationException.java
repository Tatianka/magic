public class RedeclarationException extends CodeException {
    private String id = "";

    public String getId() {
        return this.id;
    }

    public RedeclarationException(CodePosition p, String id) {
        super(p, String.format("Cannot redeclare '%s'.\n", id));
        this.id = id;
    }

}
