package Cliente;

import SistemaInterno.AutenticacaoUtils;
import funcionario.Autenticavel;

public class CLiente implements Autenticavel {

    private AutenticacaoUtils autenticacaoUtils = new AutenticacaoUtils();
    private int senha;

    public CLiente(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(int senha){
        return autenticacaoUtils.autenticar(senha);
    }

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public int getSenha() {
        return this.senha;
    }


}
