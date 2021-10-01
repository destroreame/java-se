package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        /**linkedList:
         * inserção e remoção performática em qualquer posição, também no início
         * usar quando quando há muita remoção (manupulação de dados) de itens de lista
         * This class works better when the application demands manipulation of the stored data.
         * This class implements both the List interface and the Deque interface. Therefore, it can act as a list and a deque.
         * Este tipo de lista possui melhor performance nos métodos add e remove, do que os métodos add e remove do ArrayList, em compensação seus métodos get e set possuem uma performance pior do que os do ArrayList.
         * desvantagem: acesso mais demorado pelo índice, é preciso pesquisar os elementos
         **/
        LinkedList lista = new LinkedList();

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
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("--------");

        //for mais usado hoje em dia
        for (Object oRef: lista) {
            System.out.println(oRef);
        }

        //Lista a partir de outra
        LinkedList nova = new LinkedList(lista); //criando baseado na primeira lista
    }
}
