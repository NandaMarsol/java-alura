package br.com.alura;

// precisa implementar a interface Comparable definindo um critério de comparação para os objetos desse tipo
public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	// construtor recebendo os 2 atributos e populando os objetos
	public Aula(String titulo, int tempo) {
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
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
	
	// Definindo um critério de comparação na classe Curso pelo "titulo" para ordenar a lista
	@Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }

}
