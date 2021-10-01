package aulas;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    public int getTempoTotalComStream() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
        matriculaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }


    //Jeito não performatico
    public Aluno buscaMatriculado(int numero) {
        for (Aluno  aluno : alunos) {
            if (aluno.getNumeroMatricula() == numero) {
                return aluno;
            }
        }
        throw new NoSuchElementException("Matrícula não encontrada");
    }

    //Jeito de buscar com hashMap
    public Aluno buscaMatriculadoComHashMap(int numero) {

        if (!matriculaAluno.containsKey(numero)) {
            throw new NoSuchElementException("Matrícula não encontrada");
        }
        return matriculaAluno.get(numero);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }
}
