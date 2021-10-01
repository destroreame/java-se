package texto;

import java.io.*;

public class CopiarArquivo {

    public static void main(String[] args) throws IOException {

        InputStream file1 = new FileInputStream("arquivoteste.txt");
        Reader reader = new InputStreamReader((file1));
        BufferedReader br = new BufferedReader(reader);

        OutputStream file2 = new FileOutputStream("arquivoteste2.txt");
        Writer writer = new OutputStreamWriter((file2));
        BufferedWriter bw = new BufferedWriter(writer);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
