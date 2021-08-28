package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeCursos {

	public static void main(String[] args) {
		
		// instanciando cursos
		Curso c1 = new Curso("Estudando Listas", 21);
		Curso c2 = new Curso("ArrayLists", 15);
		Curso c3 = new Curso("Java Básico", 12);
		
		// criando uma lista de cursos
		ArrayList<Curso> cursos = new ArrayList<>();
		
		// adicionando cursos na lista
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		
		System.out.println(cursos);
		
		// E se quisermos ordenar essa lista de acordo com o tempo de um curso? Poderíamos alterar o método compareTo, mas assim todas as ordenações de cursos seriam afetadas; 
		// Há uma forma bastante enxuta de se fazer
		cursos.sort(Comparator.comparing(Curso::getTempo));
		
		System.out.println(cursos);
		
	}

}

/* resultado ao executar o sysout: [br.com.alura.Curso@762efe5d, br.com.alura.Curso@5d22bbb7, br.com.alura.Curso@41a4555e]
 * Isso aconteceu porque o método toString da classe ArrayList percorre todos os elementos da lista, concatenando seus valores também de toString. 
 * Como a classe Curso não possui um toString reescrito (override), ele utilizará o toString definido em Object, que retorna o nome da classe, concatenado com um @ e seguido de um identificador único do objeto.
 * Vamos reescrever o método da classe Curso e executar novamente;
 */ 
