package conta;

public class Conta implements Comparable<Conta>{

    private int agencia;
    private int conta;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public Conta(int agencia, int conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia){
            return false;
        }
        if(this.conta != outra.conta){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public int compareTo(Conta outraConta) {
        return this.nome.compareTo(outraConta.getNome());
    }
}
