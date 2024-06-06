import java.io.FileWriter;
import java.io.Writer;

public class HelloIO03 {
    public static void main(String[] args) throws Exception{
        Writer out = new FileWriter("/tmp/hello.txt");
        out.write('a');
        out.write('b');
        out.write('c');
        out.close();
    }
}
