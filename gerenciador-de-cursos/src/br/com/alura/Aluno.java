package br.com.alura;

public class Aluno {
	
	String nome;
	int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) { // se o nome for nulo, jogar uma NullPointerException
	        throw new NullPointerException("Nome não pode ser nulo");
	    }
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}


	public String getNome() {
		return nome;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	// sobrescrevendo o método equals de Aluno, utilizando o nome para comparação
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj; // cast
		return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
