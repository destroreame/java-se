package texto;

import java.io.*;

public class Escrita {

    public static void main(String[] args) throws IOException {

        //forma mais trabalhosa
        OutputStream file = new FileOutputStream("arquivoteste2.txt");
        Writer writer = new OutputStreamWriter((file));
        BufferedWriter bw = new BufferedWriter(writer);

        //ou
        //BufferedWriter bw = new BufferedWriter(new FileWriter("arquivoteste2.txt"));

        bw.write("Testes escrita");
        bw.newLine();
        bw.newLine();
        bw.write("daadasdsa");
        bw.newLine();
        bw.write("1111");
        bw.write("2222");

        bw.close();
    }
}
