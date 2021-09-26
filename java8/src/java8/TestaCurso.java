package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestaCurso {

	public static void main(String[] args) {
		
		// criando lista
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		// ordenar lista pela quantidade de alunos
		
		// usando lambda
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		
		// usando method reference
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		// Utilizando a API de Stream
		// criando um filtro para todos os cursos que tenham mais de 50 alunos
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .forEach(c -> System.out.println(c.getNome()));
		
		// transformando o Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
	}

}
