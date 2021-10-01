package texto;

import java.awt.peer.SystemTrayPeer;
import java.io.*;

public class Teclado {

    public static void main(String[] args) throws IOException {

        InputStream file1 = System.in;
        Reader reader = new InputStreamReader((file1));
        BufferedReader br = new BufferedReader(reader);

        OutputStream file2 = System.out;
        Writer writer = new OutputStreamWriter((file2));
        BufferedWriter bw = new BufferedWriter(writer);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
