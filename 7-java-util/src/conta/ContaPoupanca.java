package conta;

public class ContaPoupanca extends Conta{
    private static final String tipo = "CONTA_POUPANCA";

    public ContaPoupanca(int agencia, int conta, String nome) {
        super(agencia, conta, nome);
    }
}
