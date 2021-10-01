public class TestaBanco {

    public static void main(String[] args) {

        Conta contaFernando = new Conta();
        contaFernando.cliente = new Cliente();
        contaFernando.cliente.nome = "Fernando";
        contaFernando.cliente.cpf = "123123123";
        contaFernando.cliente.profissao = "dev";
        System.out.println(contaFernando.cliente.nome);
        System.out.println(contaFernando.cliente);
    }
}
