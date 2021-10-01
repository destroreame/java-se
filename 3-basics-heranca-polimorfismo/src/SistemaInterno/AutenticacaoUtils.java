package SistemaInterno;

public class AutenticacaoUtils {

    private int senha = 123;

    public boolean autenticar(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
