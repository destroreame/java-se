package testes.list;

import aulas.Aula;
import aulas.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListaCurso {

    public static void main(TestaListaString[] args) {

        Curso curso = new Curso("Paulo Silveira", "Java");

        //mais verboso e vai dar exceptions, pois retorna uma unmodifiable list
        //curso.getAulas().add(new Aula("Collections",20));
        // melhor pratica
        curso.adiciona(new Aula("Map",15));
        curso.adiciona(new Aula("Collections",20));

        // exception pq é imutavel
        List<Aula> aulasImultaveis = curso.getAulas();
        //Collections.sort(aulasImultaveis);

        List<Aula> aulas = new ArrayList<>(aulasImultaveis);
        Collections.sort(aulas);

        aulas.forEach( aula -> {
            System.out.println(aula);
        });

        System.out.println("Tempo total: " + curso.getTempoTotal());
        System.out.println("Tempo total usando stream: " + curso.getTempoTotalComStream());

    }
}
