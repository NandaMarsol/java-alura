package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// classe que representa um Curso
// esse curso ter� um punhado de aulas que representaremos atrav�s de uma lista de Aula
public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); // inst�ncia de HashMap, que ir� associar o aluno com a sua matr�cula
	
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

	// retorna um Collections.unmodifiableList(aulas), para que n�o seja mais poss�vel alterar o valor dessa lista por fora da pr�pria classe Curso
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	// m�todo adiciona que permite adicionar novas aulas na lista do Curso
	public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
	
	// m�todo para somar o tempo total das aulas de um Curso
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
	
	// m�todo para matricular um aluno no curso
	// para associar uma matr�cula com o seu aluno, sempre que o mesmo for matriculado, basta fazermos a associa��o dentro do m�todo matricula
	// dentro do m�todo, adicionamos o aluno associado com a sua matr�cula no mapa, invocando o m�todo put
	public void matricula(Aluno aluno){
		// adiciona no Set de alunos
	    this.alunos.add(aluno);
	    
	 // cria a rela��o no Map
	    this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	// m�todo que devolve o Set mas de maneira n�o modific�vel
	public Set<Aluno> getAlunos() {
	    return Collections.unmodifiableSet(alunos);
	}
	
	// m�todo recebe um aluno e verifica se o mesmo j� est� matriculado no Curso
	public boolean estaMatriculado(Aluno aluno) {
	    return this.alunos.contains(aluno);
	}

	// para implementar o m�todo que busca o aluno, basta delegarmos a sua funcionalidade para o m�todo get, de Map 
	// passando como par�metro a chave, o n�mero de matr�cula, que � passada por par�metro para o m�todo buscaMatriculado
	public Aluno buscaMatricula(int numero) {
		return this.matriculaParaAluno.get(numero);
	}
}
