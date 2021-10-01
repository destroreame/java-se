public class Conta {

    double saldo;
    int agencia;
    int numero;
    Cliente cliente;
    private static int total = 0;

    public Conta() {
        Conta.total++;
    }

    public Conta (int agencia, int numero){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 100;
        Conta.total++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }

        return false;
    }

    public static int getTotal() {
        return Conta.total;
    }

}
