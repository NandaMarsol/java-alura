package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		
		// instanciando cursos
		Aula a1 = new Aula("Estudando Listas", 21);
		Aula a2 = new Aula("ArrayLists", 15);
		Aula a3 = new Aula("Java B�sico", 12);
		
		// criando uma lista de cursos
		ArrayList<Aula> aulas = new ArrayList<>();
		
		// adicionando cursos na lista
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		// E se quisermos ordenar essa lista de acordo com o tempo de um curso? Poder�amos alterar o m�todo compareTo, mas assim todas as ordena��es de cursos seriam afetadas; 
		// H� uma forma bastante enxuta de se fazer
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}

}

/* resultado ao executar o sysout: [br.com.alura.Aula@762efe5d, br.com.alura.Aula@5d22bbb7, br.com.alura.Aula@41a4555e]
 * Isso aconteceu porque o m�todo toString da classe ArrayList percorre todos os elementos da lista, concatenando seus valores tamb�m de toString. 
 * Como a classe Aula n�o possui um toString reescrito (override), ele utilizar� o toString definido em Object, que retorna o nome da classe, concatenado com um @ e seguido de um identificador �nico do objeto.
 * Vamos reescrever o m�todo da classe Aula e executar novamente;
 */ 
