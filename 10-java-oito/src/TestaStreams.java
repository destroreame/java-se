import java.util.*;
import java.util.stream.Collectors;

public class TestaStreams {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Python", 30));
        cursos.add(new Curso("C#", 110));
        cursos.add(new Curso("Java", 150));
        cursos.add(new Curso("CSS", 10));

        cursos.stream()
                .filter(c -> c.getQtdeAlunos() >= 100)
                .forEach(System.out::println);

        System.out.println("----");

        cursos.stream()
                .map(Curso::getQtdeAlunos)
                .filter(qtdeAlunos -> qtdeAlunos >= 100)
                .forEach(System.out::println);

        System.out.println("----");

        int sum = cursos.stream()
                .mapToInt(Curso::getQtdeAlunos)
                .filter(qtdeAlunos -> qtdeAlunos >= 100)
                .sum();

        System.out.println(sum);

        System.out.println("----");

        cursos.stream()
                .filter(c -> c.getQtdeAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

         Optional<Curso> cursosFiltrados = cursos.stream()
                .filter(c -> c.getQtdeAlunos() >= 100)
                .findAny();

        System.out.println(cursosFiltrados);

        List<Curso> listaCursosFiltrados = cursos.stream()
                .filter(c -> c.getQtdeAlunos() >= 100)
                .collect(Collectors.toList());

        System.out.println(listaCursosFiltrados);

        Map<String, Integer> mapCursosFiltrados = cursos.stream()
                .filter(c -> c.getQtdeAlunos() >= 100)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getQtdeAlunos));

        cursos.stream()
                .filter(c -> c.getQtdeAlunos() >= 100)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getQtdeAlunos))
                .forEach((nome, aluno) -> System.out.println(nome + " tem " + aluno + " alunos"));

        OptionalInt cursoQtdeMaiorAlunos = cursos.stream()
                .mapToInt((Curso::getQtdeAlunos))
                .max();

        System.out.println(cursoQtdeMaiorAlunos);
    }
}
