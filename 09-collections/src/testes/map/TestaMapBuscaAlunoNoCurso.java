package testes.map;

import aulas.Aluno;
import aulas.Aula;
import aulas.Curso;

public class TestaMapBuscaAlunoNoCurso {

    public static void main(String[] args) {

        Curso curso = new Curso("Java","Paulo Silveira");
        curso.adiciona(new Aula("Map",15));
        curso.adiciona(new Aula("Collections",20));

        Aluno aluno1 = new Aluno("Fernando", 1111);
        Aluno aluno2 = new Aluno("João Paulo", 2222);
        Aluno aluno3 = new Aluno("Ricardo Veron", 3333);

        curso.matricularAluno(aluno1);
        curso.matricularAluno(aluno2);
        curso.matricularAluno(aluno3);

        // Busca não performatico
        System.out.println("Quem é o aluno com matrícula 2222");
        Aluno aluno = curso.buscaMatriculado(2222);
        System.out.println(aluno.getNome());

        // Busca com HashMap
        System.out.println("Quem é o aluno com matrícula 3333");
        aluno = curso.buscaMatriculadoComHashMap(3333);
        System.out.println(aluno.getNome());

        aluno = curso.buscaMatriculadoComHashMap(4444);

        /**
         * Assim como o HashSet, o HashMap não mantém a ordem de inserção dos seus elementos. Mas há uma implementação de Map que garante essa ordem de inserção para nós, que implementação é essa?
         * LinkedHashMap - é a mesmo coisa ("planilha excel", com indice e valores, porém são ordenados a cada inclusão)
         */


    }
}
