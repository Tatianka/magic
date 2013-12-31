import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.*;
import java.util.*;

public class Compiler {
    public static void main(String[] args) throws Exception {
    	CharStream input = new ANTLRFileStream(args[0]);
    	MagicLexer lexer = new MagicLexer(input);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	IndentTokenSource indentedSource = new IndentTokenSource(tokens);
    	tokens = new CommonTokenStream(indentedSource);
    	MagicParser parser = new MagicParser(tokens);
    	ParseTree tree = parser.init(); // begin parsing at init rule

        CompilerVisitor eval = new CompilerVisitor();
        try {
            CodeFragment code = eval.visit(tree);
            System.out.print(code.toString());
        } catch (CodeException e) {
            System.err.println(e.toString());
            System.exit(-1);
        }
    }
}
