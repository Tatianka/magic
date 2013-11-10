import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	CharStream input = new ANTLRFileStream(args[0]);
    	SimplangLexer lexer = new SimplangLexer(input);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	SimplangTokenSource indentedSource = new SimplangTokenSource(tokens);
    	tokens = new CommonTokenStream(indentedSource);
    	//System.out.println("tokens="+tokens.getTokens());
    	SimplangParser parser = new SimplangParser(tokens);
    	ParseTree tree = parser.init(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        new TreeViewer(Arrays.asList(parser.getRuleNames()), tree).open();
    }
}
