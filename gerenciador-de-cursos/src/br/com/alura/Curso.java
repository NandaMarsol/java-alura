package br.com.alura;

// precisa implementar a interface Comparable definindo um crit�rio de compara��o para os objetos desse tipo
public class Curso implements Comparable<Curso>{
	
	private String titulo;
	private int tempo;
	
	// construtor recebendo os 2 atributos e populando os objetos
	public Curso(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}
	
	@Override
    public String toString() {
        return "[Curso: " + this.titulo + ", " + this.tempo + " minutos]";
    }
	
	// Definindo um crit�rio de compara��o na classe Curso pelo "titulo" para ordenar a lista
	@Override
    public int compareTo(Curso outroCurso) {
        return this.titulo.compareTo(outroCurso.getTitulo());
    }

}
