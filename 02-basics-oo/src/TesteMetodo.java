import java.sql.SQLOutput;

public class TesteMetodo {

    public static void main(String[] args) {

        Conta contaFer = new Conta();
        contaFer.depositar(500);
        contaFer.depositar(220);

        System.out.println(contaFer.saldo);

        boolean conseguiuSacar = contaFer.sacar(800);
        if (conseguiuSacar) {
            System.out.println("Conseguiu retirar");
            System.out.println(contaFer.saldo);
        } else {
            System.out.println("Saldo indisponivel");
        }

        Conta contaAna = new Conta();

        contaAna.depositar(1000);
        boolean sucessoTransferencia = contaAna.transfere(500, contaFer);
        if (sucessoTransferencia) {
            System.out.println("Transferencia com sucesso");
        } else {
            System.out.println("faltou saldo");
        }
        System.out.println(contaAna.saldo);
        System.out.println(contaFer.saldo);

        System.out.println(Conta.getTotal());

    }
}
