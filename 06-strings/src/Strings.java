import java.util.Locale;

public class Strings {

    public static void main(String[] args) {
        String nome  = "fernando";

        // UPPERCASE
        nome = nome.toUpperCase(Locale.ROOT);
        System.out.println(nome);

        // LOWERCASE
        nome = nome.toLowerCase(Locale.ROOT);
        System.out.println(nome);

        // REPLACE
        String replace = nome.replace("A", "I");
        System.out.println(replace);

        // CHAR AT
        char c = nome.charAt(2);
        System.out.println(c);

        // INDEX OF
        int pos = nome.indexOf("U");
        System.out.println(pos);

        // SUBSTRING
        String sub = nome.substring(2, 5);
        System.out.println(sub);

        // LENGTH
        int length = nome.length();
        System.out.println(length);

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        // isEmpty
        String vazio = "";
        System.out.println("Isempty: " + vazio.isEmpty());

        // TRIM
        String comEspaco = "Fernando ";
        String semEspaco = comEspaco.trim();
        System.out.println("Trim: " + semEspaco);

        if (comEspaco.trim().equals("Fernando")) {
            System.out.println("trim funciona");
        }

        // CONTAINS
        System.out.println("Contains: " + nome.toLowerCase(Locale.ROOT).contains("nan"));

        // Use StringBuider em vez de Concaten

        //CONCAT - má performance, pois é criado várias variáveis
        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto);

        //StringBuider - boa prática para várias concatenações
        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String stringBuider = builder.toString();
        System.out.println(stringBuider);

        // Assim como a string, a classe StringBuilder também implementa a interface CharSequence:
        // Isso faz que alguns métodos da classe String saibam trabalhar com o StringBuilder, por exemplo:
        CharSequence cs = new StringBuilder("ooo");
        nome = nome.replace("nan", cs);
        System.out.println(nome);
        // Vice-versa a classe StringBuilder tem métodos que recebem o tipo CharSequence. Dessa forma podemos trabalhar de maneira compatível com as duas classes, baseado numa interface comum.

    }
}
