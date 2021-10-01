package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortsList {

    public static void main(String[] args) {

        Conta c1 = new ContaCorrente(22, 2, "Maria");
        Conta c2 = new ContaPoupanca(22, 4, "Fernando");
        Conta c3 = new ContaCorrente(22, 3, "Bruna");
        Conta c4 = new ContaPoupanca(22, 3, "Ana");

        List<Conta> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);


        System.out.println("Ordenando...");
        for (Conta c : contas) {
            System.out.println(c.getConta() + " " +  c.getNome());
        }

        /**
        No java 8, as listas possuem o método sort
         **/
        contas.sort(null); //Ordem natural (definido na classe através da implemetação da interface Comparable
        //contas.sort(new NomeContaComparator());
        //contas.sort(new NumeroContaComparator());

        /**
         * Antes do Java 8, era usado Collections
         */
        Collections.sort(contas); //Ordem natural (definido na classe através da implemetação da interface Comparable
        //Collections.sort(contas, new NomeContaComparator());
        //Collections.sort(contas, new NumeroContaComparator());

        System.out.println("----------");
        for (Conta c : contas) {
            System.out.println(c.getConta()  + " " +  c.getNome());
        }
        System.out.println("----------");
        //Collections.reverse(contas); // Reverte
        //Collections.shuffle(contas);  // Embaralha
        //Collections.rotate(contas, 2); // Rotaciona

        for (Conta c : contas) {
            System.out.println(c.getConta()  + " " +  c.getNome());
        }


    }
}

/**
 * Comparator com Integer
 */
class NumeroContaComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getConta(), c2.getConta());
    }
}

/**
 * Comparator com String
 */
class NomeContaComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        return  c1.getNome().compareTo(c2.getNome());
    }
}
