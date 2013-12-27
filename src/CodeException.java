public class CodeException extends RuntimeException {
    private CodePosition codePosition;
    private String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CodePosition getCodePosition() {
        return this.codePosition;
    }

    public void setCodePosition(CodePosition codePosition) {
        this.codePosition = codePosition;
    }

    CodeException(CodePosition p, String message) {
        this.setCodePosition(p);
        this.setMessage(message);
    }

    public String toString() {
        return this.getCodePosition().toString() + ":" + message + "\n";
    }
}
