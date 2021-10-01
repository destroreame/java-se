public class Teste {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.agencia = 2000;
        conta.numero = 121312;
        conta.saldo = 1000;

        System.out.println(conta.toString());

        Conta conta2 = new Conta();
        conta2.saldo = 200;
        System.out.println(conta2.saldo);

        conta.depositar(100);

    }
}
