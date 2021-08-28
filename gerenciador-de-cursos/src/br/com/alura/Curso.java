package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// classe que representa um Curso
// esse curso terá um punhado de aulas que representaremos através de uma lista de Aula
public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
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


}
