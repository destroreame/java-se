package conta;

public class ContaPoupanca extends Conta{
    private static final String tipo = "CONTA_POUPANCA";

    public ContaPoupanca() {
    }

    public ContaPoupanca(int agencia, int conta, String nome) {
        super(agencia, conta, nome);
    }

    public static String getTipo() {
        return tipo;
    }
}
