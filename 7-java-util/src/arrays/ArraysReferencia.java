package arrays;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class ArraysReferencia {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5]; //Inicializa o array com null

        Conta conta1 = new Conta(1232, 123123, "");
        Conta conta2 = new Conta(1232, 123124, "");
        Conta conta3 = new Conta(1232, 123125, "");
        Conta conta4 = new Conta(1232, 123126, "");
        Conta conta5 = new Conta(1232, 123127, "");

        contas[0] = conta1;
        contas[1] = conta2;
        contas[2] = conta3;
        contas[3] = conta4;

        System.out.println(contas[1].toString());
        Conta ref = conta2;
        System.out.println(ref.getConta());

        //Nullpointer
        //System.out.println(contas[4].getConta());

        //Referencias genéricas
        ContaCorrente cc1 = new ContaCorrente(1234, 1212, "");
        ContaPoupanca cp1 = new ContaPoupanca(1234, 213123, "");

        contas[4] = cc1;
        ContaCorrente cc2 = (ContaCorrente) contas[4]; //Tem que ter o cast (o cpompilador confia no dev)
        System.out.println(cc2.getConta());

        //se passar uma conta poupança em um cast de conta conrrente: ClassCastException
        contas[4] = cp1;
        ContaCorrente cc3 = (ContaCorrente) contas[4];
        System.out.println(cc3.getConta());
    }
}
