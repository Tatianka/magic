import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class CodePosition {
    private int line = 0;
    private int ch = 0;

    public int getLine() {
        return this.line;
    }

    public int getCh() {
        return this.ch;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String  toString() {
        return String.format("%d:%d", getLine(), getCh());
    }

    public CodePosition(int line, int ch) {
        setLine(line);
        setCh(ch);
    }

    public CodePosition(ParserRuleContext ctx) {
        Token firstToken =  ctx.getStart();
        this.setLine(firstToken.getLine());
        this.setCh(firstToken.getCharPositionInLine());
    }


}
