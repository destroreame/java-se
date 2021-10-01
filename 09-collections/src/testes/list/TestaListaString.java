package testes.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaString {

    public static void main(String[] args) {

        java.lang.String aula1 = "1 - Conhecendo mais de listas";
        java.lang.String aula3 = "3 - Trabalhando com cursos e sets";
        java.lang.String aula2 = "2 - Modelando classe aula";

        ArrayList<java.lang.String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula3);
        aulas.add(aula2);

        //toString
        System.out.println(aulas);

        //get
        java.lang.String primeiraAula = aulas.get(0);
        System.out.println("Primeira aula:" + primeiraAula);

        //for basico
        for (int i = 0;i < aulas.size(); i++) {
            System.out.println(aulas.get(i));
        }

        for (java.lang.String aula : aulas) {
            System.out.println(aula);
        }

        //forEach - java8
        aulas.forEach(aula -> {
            System.out.println("forEach: " + aula);
        });

        //ordenar
        Collections.sort(aulas);
        System.out.println("----------------");

        aulas.forEach(aula -> {
            System.out.println("forEach: " + aula);
        });

        //remocao por indice ou objeto
        aulas.remove(0);
        System.out.println(aulas);

    }
}
