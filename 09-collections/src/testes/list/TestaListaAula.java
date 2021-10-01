package testes.list;

import aulas.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

    public static void main(TestaListaString[] args) {

        ArrayList<Aula> aulas = new ArrayList<>();
        Aula aula1 = new Aula("Revisitando ArrayLists", 10);
        Aula aula2 = new Aula("Lista de Objetos", 12);
        Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        System.out.println("------");

        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("Sort por titulo:");
        Collections.sort(aulas);
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("Sort por tempo:");
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        //Forma mais enxuta (java 8)
        aulas.sort( Comparator.comparing(Aula::getTempo));

    }
}
