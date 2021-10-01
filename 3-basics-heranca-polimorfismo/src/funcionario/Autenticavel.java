package funcionario;

public interface Autenticavel{

    void setSenha(int senha);

    int getSenha();

    boolean autenticar(int senha);
}



