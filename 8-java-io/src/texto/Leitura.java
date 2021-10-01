package texto;

import java.io.*;

public class Leitura {

    public static void main(String[] args) throws IOException {

        InputStream file = new FileInputStream("arquivoteste.txt");
        Reader reader = new InputStreamReader(file);
        BufferedReader bufferReader = new BufferedReader(reader);

        //Linha 1
        String linha = bufferReader.readLine();

        // Linha 2 até o final
        while (linha != null) {
            System.out.println(linha);
            linha = bufferReader.readLine();
        }

        //Precisa sempre fechar
        bufferReader.close();
    }
}
