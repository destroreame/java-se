package javautil.lists;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorLists {

    public static void main(String[] args) {

        /**Vector:
         * Primeiramente vamos falar sobre o fato de Vector ser sincronizado e o ArrayList não. Significa dizer que se você possui uma aplicação que precisa ser thread-safe em determinado ponto, use Vector e você estará garantido.
         * Vector também usa um array.
         * Vector é uma lista.
         * Outro ponto importante é a alocação dinâmica do Vector, que é diferente do ArrayList. Lembra que falamos que o ArrayList aumenta 50% do seu tamanho quando a lista está cheia ? O Vector aumenta o dobro, ou seja, se você tem uma lista de 10 elementos cheia, essa lista aumentará para 20, com 10 posições vazias. Mas isso não é ruim ? Depende do que você precisar, se você está precisando aumentar a quantidade de elementos com muita frequência, então o ideal é usar o Vector que aumenta o dobro e você ficará com muito mais espaço do que no ArrayList que precisará ficar aumentando com mais frequência, diminuindo assim a performance da sua aplicação.
         **/
        List lista = new Vector();

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
