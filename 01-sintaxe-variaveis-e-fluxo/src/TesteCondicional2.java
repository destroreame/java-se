public class TesteCondicional2 {

    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 2;

        if ((idade >= 18) || (quantidadePessoas >= 2)) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("não pode entrar");
        }

        boolean acompanhado = quantidadePessoas >= 2;
        if ((idade >= 18) || (acompanhado)) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("não pode entrar");
        }

    }
}
