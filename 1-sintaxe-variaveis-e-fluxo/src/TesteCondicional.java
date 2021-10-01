public class TesteCondicional {

    public static void main(String[] args) {

        int idade = 17;
        int quantidadePessoas = 1;

        if (idade >= 18) {
            System.out.println("é maior");
        } else if (quantidadePessoas >= 2) {
            System.out.println("pode entrar, está acompanhado");
        } else {
            System.out.println("é menor");
        }
    }
}
