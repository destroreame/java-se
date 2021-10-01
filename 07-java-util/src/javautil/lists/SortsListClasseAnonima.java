package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortsListClasseAnonima {

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

        contas.sort(new Comparator<Conta>() {
            @Override
             public int compare(Conta c1, Conta c2) {
                return  c1.getNome().compareTo(c2.getNome());
            };
        });

        contas.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                return Integer.compare(c1.getConta(), c2.getConta());
            }
        });

        System.out.println("----------");
        for (Conta c : contas) {
            System.out.println(c.getConta()  + " " +  c.getNome());
        }
    }
}
