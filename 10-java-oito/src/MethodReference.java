import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("lord of the rings");
        palavras.add("star wars");
        palavras.add("castlevania");
        palavras.add("naruto shippuden");
        palavras.add("one piece");
        palavras.add("forgotten realms");

        Function<String, Integer> funcao1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        
        Function<String, Integer> funcao2 = s -> s.length();
        Function<String, Integer> funcao3 = String::length;

        Comparator<String> comparator = Comparator.comparing((funcao1));
        Comparator<String> comparator1 = Comparator.comparing((funcao2));
        Comparator<String> comparator2 = Comparator.comparing((funcao3));

        palavras.sort(comparator);
        palavras.sort(comparator1);
        palavras.sort(comparator2);

        palavras.forEach(s -> System.out.println(s));
        palavras.forEach(System.out::println);
    }
}
