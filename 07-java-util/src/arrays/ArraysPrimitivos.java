package arrays;

public class ArraysPrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5]; //Inicializa o array com 0

        idades[0] = 29;
        idades[1] = 31;
        idades[2] = 40;
        idades[3] = 35;
        idades[4] = 18;

        System.out.println(idades[0]);
        System.out.println(idades.length);

        for (int i = 0 ; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0 ; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        //ArrayIndexOutOfBoundException
        //System.out.println(idades[59]);

        //Forma literal de criar array
        int[] anos = {2020,2021,0,2023,2024};

        for (int i = 0 ; i < anos.length; i++) {
            System.out.println(anos[i]);
        }
    }
}
