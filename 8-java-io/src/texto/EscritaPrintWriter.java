package texto;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class EscritaPrintWriter {

    public static void main(String[] args) throws IOException {
        
        PrintWriter pw = new PrintWriter("arquivoteste2.txt", "UTF-8");
        pw.println("bla bla bla");
        pw.println();
        pw.println("buaaa buaa buaaaaooo");
        pw.close();
    }
}
