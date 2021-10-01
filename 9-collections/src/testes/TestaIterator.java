package testes;

import aulas.Aluno;
import aulas.Aula;
import aulas.Curso;

import java.util.Iterator;
import java.util.Set;

public class TestaIterator {

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

        Set<Aluno> alunos = curso.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        //Usado antes do forEach (antes do java 7)
        while (iterador.hasNext()) {
            Aluno a = iterador.next();
            System.out.println(a);
        }
    }
}
