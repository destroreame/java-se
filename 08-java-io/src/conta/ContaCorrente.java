package conta;

public class ContaCorrente extends Conta {

    private static final String tipo = "CONTA_CORRENTE";

    public ContaCorrente() {
    }

    public ContaCorrente(int agencia, int conta, String nome ) {
        super(agencia, conta, nome);
    }

    public static String getTipo() {
        return tipo;
    }
}
