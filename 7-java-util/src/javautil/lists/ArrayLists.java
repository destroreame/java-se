package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        /**
         * An array is a collection of items stored at contiguous memory locations.
         * The idea is to store multiple items of the same type together.
         * However, the limitation of the array is that the size of the array is predefined and fixed.
         * There are multiple ways to solve this problem. In this article,
         * the difference between two classes which are implemented to solve this problem named ArrayList and LinkedList is discussed.
         */

        /** Arraylist:
         * acesso fácil e performático pelo índice
         * usar quando não há muita remoção de itens de lista
         * This class works better when the application demands storing the data and accessing it.
         * This class implements a List interface. Therefore, this acts as a list.
         * Desvantagem: quando existe muito remove (manilupação de dados), pois por trás dos panos é uma array que precisa ser remodelada
         **/
        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(1234, 112233, "");
        Conta cp = new ContaPoupanca(1234, 112234, "");
        Conta cc1 = new ContaCorrente(1234, 112235, "");

        lista.add(cc);
        lista.add(cp);
        lista.add(cc1);
        System.out.println("Conteúdo: " + lista);
        System.out.println("Size: "  + lista.size());

        Conta ref = (Conta) lista.get(0); //transformando generico pra mais especifico, pois a lista é Object
        System.out.println(ref.getAgencia());

        System.out.println("Reomvendo primeiro item...");
        lista.remove(0);
        System.out.println("Conteúdo: " + lista);
        System.out.println("Size: "  + lista.size());

        //For roots
        for (int i = 0 ; i < lista.size(); i++ ) {
            Object oRef = lista.get(0);
            System.out.println(oRef);
        }

        System.out.println("--------");

        //for mais usado hoje em dia
        for (Object oRef: lista) {
            System.out.println(oRef);
        }

        //Lista com capacidade inicial
        ArrayList estados = new ArrayList(26); //capacidade inicial
        lista.add("RJ");
        lista.add("SP");

        //Lista a partir de outra
        ArrayList nova = new ArrayList(lista); //criando baseado na primeira lista
    }
}
