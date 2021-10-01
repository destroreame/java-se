public class Curso {

    private String nome;
    private int qtdeAlunos;
    
	public Curso(String nome, int qtdeAlunos) {
		this.nome = nome;
		this.qtdeAlunos = qtdeAlunos;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQtdeAlunos() {
		return qtdeAlunos;
	}

	public void setQtdeAlunos(int qtdeAlunos) {
		this.qtdeAlunos = qtdeAlunos;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", qtdeAlunos=" + qtdeAlunos + "]";
	}
    
}
