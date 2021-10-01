package SistemaInterno;

import funcionario.Autenticavel;

public class SistemaInterno {

    public void autenticar(Autenticavel pessoaAutenticavel) {

        boolean autenticou = pessoaAutenticavel.autenticar(pessoaAutenticavel.getSenha());
        if (autenticou) {
            System.out.println("Autenticou");
        } else {
            System.out.println("You cannot pass");
        }
    }
}
