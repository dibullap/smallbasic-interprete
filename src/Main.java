import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
//import gen.MyVisitor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        SmallBasicLexer lexer = new SmallBasicLexer(CharStreams.fromFileName("input/entrada.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SmallBasicParser parser = new SmallBasicParser(tokens);
        ParseTree tree = parser.s();

        MyVisitor loader = new MyVisitor();
        loader.visit(tree);
    }
}