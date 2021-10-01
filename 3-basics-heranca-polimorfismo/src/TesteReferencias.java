import funcionario.ControleBonificacao;
import funcionario.tipos.EditorVideo;
import funcionario.tipos.Gerente;

public class TesteReferencias {

    public static void main(String[] args) {

        ControleBonificacao controle = new ControleBonificacao();

        Gerente gerente = new Gerente();
        gerente.setNome("funcionario.tipos.Gerente");
        gerente.setSalario(1000.0);
        System.out.println("Direito VR " + gerente.direitoValeRefeicao());

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setNome("Editor Video");
        editorVideo.setSalario(2000.0);
        System.out.println("Direito VR " + editorVideo.direitoValeRefeicao());

        controle.registra(gerente);
        System.out.println("Somando funcionario.tipos.Gerente " + controle.getSoma());
        controle.registra((editorVideo));
        System.out.println("Somando Editor Video " + controle.getSoma());

    }
}
