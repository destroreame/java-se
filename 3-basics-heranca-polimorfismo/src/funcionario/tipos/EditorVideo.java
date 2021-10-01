package funcionario.tipos;

import funcionario.Funcionario;

public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 100;
    }

    @Override
    public boolean direitoValeRefeicao() {
        return true;
    }
}
