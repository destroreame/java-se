package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

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
         * Sort com classe anônima
         **/
        contas.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                return Integer.compare(c1.getConta(), c2.getConta());
            }
        });

        /**
         * Sort com Lambda
         */
        contas.sort((conta1, conta2) -> conta1.getNome().compareTo(conta2.getNome()));

        /**
         * Sort usando Comparator.comparing
         */
        contas.sort(Comparator.comparing(Conta::getConta));
        Collections.sort(contas, Comparator.comparing(Conta::getNome));

        System.out.println("----------");

        /**
         * For each com classe anônima
         */
        contas.forEach(new Consumer<Conta>() {
            @Override
            public void accept(Conta c) {
                contas.forEach(conta -> System.out.println("Classe anônima: " + c.getConta()  + " " +  c.getNome()));
            }
        });

        /**
         * For each com Lambda
         */
        contas.forEach(c -> System.out.println("Lambda: " + c.getConta()  + " " +  c.getNome()));

    }
}
