package funcionario.tipos;

import SistemaInterno.AutenticacaoUtils;
import funcionario.Autenticavel;
import funcionario.Funcionario;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;
    private AutenticacaoUtils autenticador = new AutenticacaoUtils();

    public Gerente() {
      super();
    }

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }

    @Override
    public boolean direitoValeRefeicao() {
        return false;
    }

    @Override
    public boolean autenticar(int senha) {
        return autenticador.autenticar(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public int getSenha() {
        return this.senha;
    }

    @Override
    public String toString() {
        return "funcionario.tipos.Gerente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", senha=" + this.getSenha() +
                '}';
    }
}
