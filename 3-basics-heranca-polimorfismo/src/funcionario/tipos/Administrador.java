package funcionario.tipos;

import SistemaInterno.AutenticacaoUtils;
import funcionario.Autenticavel;
import funcionario.Funcionario;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;
    private AutenticacaoUtils autenticador = new AutenticacaoUtils();

    public Administrador() {
    }

    public Administrador(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public boolean direitoValeRefeicao() {
        return false;
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
    public boolean autenticar(int senha) {
        return autenticador.autenticar(senha);
    }
}
