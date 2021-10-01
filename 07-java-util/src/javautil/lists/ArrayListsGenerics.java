package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;

public class ArrayListsGenerics {

    public static void main(String[] args) {

/**
 * Generics - Vantagens:
 * O código mais legível, já que fica explícito o tipo dos elementos
 * Evitar casts excessivos
 * Antecipar problemas de casts no momento de compilação.
 */
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(1234, 112233, "");
        Conta cp = new ContaPoupanca(1234, 112234, "");
        Conta cc1 = new ContaCorrente(1234, 112235, "");

        lista.add(cc);
        lista.add(cp);
        lista.add(cc1);
        System.out.println("Conteúdo: " + lista);
        System.out.println("Size: "  + lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getAgencia());

        System.out.println("Removendo primeiro item...");
        lista.remove(0);
        System.out.println("Conteúdo: " + lista);
        System.out.println("Size: "  + lista.size());

        //For roots
        for (int i = 0 ; i < lista.size(); i++ ) {
            Conta conta = lista.get(0);
            System.out.println(conta);
        }

        System.out.println("--------");

        //for mais usado hoje em dia
        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}
