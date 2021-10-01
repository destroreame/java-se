package testes.set;

import java.util.*;

public class TestaSetString {

    public static void main(String[] args) {

        Set<String> alunosEmSet = new HashSet<>();

        /**
         * Set é um conjunto, não uma lista. Set ignora itens duplicados.
         * Como não usa índice, não é possível ordenar, e a ordem inicial é ignorada.
         * Há métodos que fazem busca por um objeto, como contains(..) ou remove(..), que são muito mais rápidos se comparado com uma lista.
         */
        alunosEmSet.add("Fdestro Reame");
        alunosEmSet.add("Aragorn");
        alunosEmSet.add("João Ninguém");
        alunosEmSet.add("Ana");
        alunosEmSet.add("Clodoaldo");
        alunosEmSet.add("João Ninguém");

        alunosEmSet.forEach( aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunosEmSet.size());

        boolean anaEstaNaLista = alunosEmSet.contains("Ana");
        System.out.println(anaEstaNaLista);

        /**
         * Se quiser ordenar, basta atribiur o objeto set no construtor do List
         */
        List<String> alunosEmLista = new ArrayList<>(alunosEmSet);

        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);

        /**
         * Emplty set
         */
        Set<String> nomes = Collections.emptySet();
        nomes.add("Fed"); //exception

    }
}
