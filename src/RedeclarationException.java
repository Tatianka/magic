public class RedeclarationException extends RuntimeException {
    private String id = "";

    public String getId() {
        return this.id;
    }

    public RedeclarationException(String id) {
        this.id = id;
    }

    public String toString() {
        return String.format("Cannot redeclare '%s'.\n", id);
    }
}
