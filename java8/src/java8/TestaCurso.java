package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
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
		
		// cria um Stream<Integer> com a quantidade de alunos dos cursos e em seguida imprime todos eles
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(c -> c.getAlunos())
		   .forEach(x -> System.out.println("Quantidade de alunos de cada curso: " + x));
		
		// código acima usando a sintaxe de method reference no map e no foreach
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		// pegar o primeiro elemento desse Stream filtrado
		// Optional oferece uma variedade imensa de novos métodos que nos permite trabalhar de forma funcional com nossos valores, tirando maior proveito dos novos recursos de default methods, lambdas e method reference
		Optional<Curso> optionalCurso = cursos.stream() 
		   .filter(c -> c.getAlunos() > 50)
		   .findFirst();
		
		Curso curso = optionalCurso.orElse(null);
		System.out.println(curso.getNome());
		
		// calculando a quantidade média de alunos de todos os cursos
		cursos.stream() 
	    .mapToInt(c -> c.getAlunos())
	    .average()
		.ifPresent(System.out::println);
		
		
		// coletando o resultado do stream em uma List
		List<Curso> cursosFiltrados = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
	}
	
		

}
