package testes.set;

import aulas.Aluno;
import aulas.Aula;
import aulas.Curso;

public class TestaEqualsAndHashCode {

    public static void main(String[] args) {

        Curso curso = new Curso("Java","Paulo Silveira");
        curso.adiciona(new Aula("Map",15));
        curso.adiciona(new Aula("Collections",20));

        Aluno aluno1 = new Aluno("Fernando Reame", 1112);
        Aluno aluno2 = new Aluno("João Paulo", 2222);
        Aluno aluno3 = new Aluno("Ricardo Veron", 3333);

        curso.matricularAluno(aluno1);
        curso.matricularAluno(aluno2);
        curso.matricularAluno(aluno3);
        /**
         * Quando usar o equals para objeto, usar tb o hashCode (para tudo que usa o hash, maps, sets). Lista não.
         */

        Aluno fernando1 = new Aluno("Fernando Reame", 1111);
        Aluno fernando2 = new Aluno("Fernando Reame", 2222);
        System.out.println(fernando1.equals(fernando2));

        System.out.println(curso.estaMatriculado(fernando1));
    }
}
