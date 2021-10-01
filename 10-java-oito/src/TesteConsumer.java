import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TesteConsumer {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("lord of the rings");
        palavras.add("star wars");
        palavras.add("castlevania");
        palavras.add("naruto shippuden");
        palavras.add("one piece");
        palavras.add("forgotten realms");

        /**
         * Loop forEach - antes do java 8
         */
//        for (String p : palavras) {
//            System.out.println(palavras);
//        }

        /**
         * Loop forEach com Consumer - java 8
         * obs: ImprimeNaLinha poderia ser classe anônima (ou lambda rs, ver teste Ordear Strings)
         */
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);

        //ou lambda
        palavras.forEach(s -> System.out.println(s));

        //ou methods references - usar lambdas por trás
        palavras.forEach(System.out::println);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
