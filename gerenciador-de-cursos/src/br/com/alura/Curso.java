package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// classe que representa um Curso
// esse curso terá um punhado de aulas que representaremos através de uma lista de Aula
public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	// criando construtor apenas com nome e instrutor
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

	// retorna um Collections.unmodifiableList(aulas), para que não seja mais possível alterar o valor dessa lista por fora da própria classe Curso
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	// método adiciona que permite adicionar novas aulas na lista do Curso
	public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
	
	// método para somar o tempo total das aulas de um Curso
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();		
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + " tempo total: " + this.getTempoTotal() + ", aulas: [" + this.aulas +" ]";
	}
	
	//  método para matricular um aluno no curso
	public void matricula(Aluno aluno){
	    this.alunos.add(aluno);
	}
	
	// método que devolve o Set mas de maneira não modificável
	public Set<Aluno> getAlunos() {
	    return Collections.unmodifiableSet(alunos);
	}
	
	// método recebe um aluno e verifica se o mesmo já está matriculado no Curso
	public boolean estaMatriculado(Aluno aluno) {
	    return this.alunos.contains(aluno);
	}
}
