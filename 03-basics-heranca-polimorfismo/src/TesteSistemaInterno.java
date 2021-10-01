import Cliente.CLiente;
import SistemaInterno.SistemaInterno;
import funcionario.tipos.Administrador;
import funcionario.tipos.EditorVideo;
import funcionario.tipos.Gerente;

public class TesteSistemaInterno {

    public static void main(String[] args) {

        SistemaInterno sistemaInterno = new SistemaInterno();

        Gerente gerente= new Gerente("Nome", "2929274937", 1000, 123 );
        sistemaInterno.autenticar(gerente);

        Administrador administrador= new Administrador("Nome", "2929274937", 1000, 123 );
        sistemaInterno.autenticar(administrador);

        CLiente cliente = new CLiente(1234);
        sistemaInterno.autenticar(cliente);

        EditorVideo editorVideo = new EditorVideo();
        //sistemaInterno.autentica(editorVideo);

    }

}
