public class TesteReferencia {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 500;
        System.out.println("Saldo primeira: " + primeiraConta.saldo);
        System.out.println("Saldo:segunda " + segundaConta.saldo);


    }
}
