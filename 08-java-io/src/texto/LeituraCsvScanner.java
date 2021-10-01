package texto;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LeituraCsvScanner {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv", StandardCharsets.UTF_8.name()));
        ArrayList<Conta> contas = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            Conta conta;

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numeroConta = linhaScanner.nextInt();
            String nome = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            if (tipoConta.equals("CC")) {
                conta = new ContaCorrente();
            } else if (tipoConta.equals("CP")) {
                conta = new ContaPoupanca();
            } else {
                throw new Exception("Tipo conta inválida");
            }

            conta.setAgencia(agencia);
            conta.setConta(numeroConta);
            conta.setNome(nome);
            conta.setSaldo(saldo);
            contas.add(conta);

            /**
             * Com split do String
             */
            //String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));
        };

        System.out.println(contas);

        System.out.println(Charset.defaultCharset());
    }
}
