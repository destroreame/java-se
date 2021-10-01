package texto;

import java.io.*;

public class EscritaPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("arquivoteste2.txt");
        ps.println("bla bla bla");
        ps.println();
        ps.println("buaaa buaaa buaaaa");
        ps.close();
    }
}
