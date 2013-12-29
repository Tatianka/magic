import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	CharStream input = new ANTLRFileStream(args[0]);
    	MagicLexer lexer = new MagicLexer(input);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	IndentTokenSource indentedSource = new IndentTokenSource(tokens);
    	tokens = new CommonTokenStream(indentedSource);
    	//System.out.println("tokens="+tokens.getTokens());
    	MagicParser parser = new MagicParser(tokens);
    	ParseTree tree = parser.init(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        new TreeViewer(Arrays.asList(parser.getRuleNames()), tree).open();
    }
}
