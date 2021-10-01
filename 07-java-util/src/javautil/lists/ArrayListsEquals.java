package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsEquals {

    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<>();

        Conta cc1 = new ContaCorrente(1234, 11, "");
        Conta cc2 = new ContaCorrente(1234, 11, "");

        lista.add(cc1);

        /** CONTAINS - Usa o equals da classe - compara a refência e não o valor (caso não sobrescrito)
         * Nesse caso o método equals foi sobrescrito na superclasse conta para comparar o valor, então o contains vai usar o equals de conta
         */
        boolean existe;
        existe = lista.contains(cc1);
        System.out.println("Contains - Existe cc1: " + existe);

        existe = lista.contains(cc2);
        System.out.println("Contains - Existe cc2: " + existe);

        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}
