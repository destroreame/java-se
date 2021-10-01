import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenarStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("lord of the rings");
        palavras.add("star wars");
        palavras.add("castlevania");
        palavras.add("naruto shippuden");
        palavras.add("one piece");
        palavras.add("forgotten realms");

        /**
         * Comparar por tamanho - antes do java 8
         */
        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        Collections.sort(palavras, comparador);
        System.out.println(palavras);

        /**
         * Comparar por tamanho - java 8
         */
        //com comparator em uma classe separada
        palavras.sort(comparador);

        //ou, com comparator em classe anônima, mas a legibilidade é ruim:
        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length())
                    return -1;
                if (s1.length() > s2.length())
                    return 1;
                return 0;
            }
        });

        //ou com lambda, que por trás dos panos usa uma classe com um método só implantando functional interface
        palavras.sort((s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        });

        //ou ainda, lambda usando o método compare
        palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

        //ou passar um lambda no comparing
        palavras.sort(Comparator.comparing(s -> s.length()));

        //ou ainda, com reference methods, que por trás dos panos utiliza lambda
        palavras.sort(Comparator.comparing(String::length));

        //Outras opções de comparator
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}

