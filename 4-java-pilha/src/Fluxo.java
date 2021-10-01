public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage() );
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Fim do metodo2");

        //int number = 8 / 0;
        //throw new NullPointerException("Deu ruim");
        throw new MinhaExcecao("Deu ruim");
    }
}
