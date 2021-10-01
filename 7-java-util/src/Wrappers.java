import java.util.ArrayList;
import java.util.List;

public class Wrappers {

    public static void main(String[] args) {

        /**
         Integer.valueOf() returns an Integer object while Integer.parseInt() returns a primitive int.
         */

        //String to Integer or int
        String numeroTexto = "10";
        int numero1 = Integer.parseInt(numeroTexto);
        Integer numero2 = Integer.valueOf(numeroTexto); //autoboxing
        System.out.println(numero1);
        System.out.println(numero2);

        //Integer to int
        Integer idadeRef = Integer.valueOf(38);
        int valor = idadeRef.intValue(); //unboxing
        System.out.println(valor);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.1);
        lista.add(25.6f);

    }
}
