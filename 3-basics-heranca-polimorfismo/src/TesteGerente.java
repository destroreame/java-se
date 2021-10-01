import funcionario.Funcionario;
import funcionario.tipos.Gerente;

public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setCpf("3123123");
        g1.setNome("funcionario.tipos.Gerente");
        g1.setSenha(123);
        g1.setSalario(1000);
        g1.autenticar(123);
        g1.getBonificacao();
        System.out.println(g1);
        System.out.println("Bonificação: " + g1.getBonificacao());

        Funcionario f2 = new Gerente();
        f2.setCpf("3123123");
        f2.setNome("funcionario.Funcionario como new gerente");
        f2.setSalario(1000);
        //f2.autentica(123);
        f2.getBonificacao();
        System.out.println(g1);
        System.out.println("Bonificação: " + f2.getBonificacao());
    }
}
