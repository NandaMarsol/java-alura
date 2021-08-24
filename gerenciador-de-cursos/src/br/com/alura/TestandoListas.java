package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		// lista de cursos
		String curso1 = "Java 8 - Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificacao Java SE 8 Programmer I";
		
		// adicionando cursos no ArrayList
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		
		// removendo o segundo item da lista
		// as listas são indexadas a partir do 0,  portanto o índice 1 aponta para o segundo elemento da lista
		cursos.remove(1);
		System.out.println(cursos);
		
		// como se lê um foreach?
		// para cada String "curso" dentro de cursos, faça o seguinte
		for (String curso : cursos) {
			System.out.println("Curso: " + curso);
		}
		
		// outra forma de percorrer uma lista
		String primeiroCurso = cursos.get(0);
		System.out.println("O primeiro curso é: " + primeiroCurso);
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Cursinho: " + cursos.get(i));
		}
		// vendo quantos elementos tem dentro de uma lista
		System.out.println("Essa lista tem: " + cursos.size() + " cursos");
		
		// vai performar uma ação para cada elemento dentro dessa coleção
		cursos.forEach(curso -> {
			System.out.println("Percorrendo: ");
			System.out.println("Curso lambda: " + curso);}); // vamos passar aqui direto um lambda
								// você vai falar dentro do forEach, para cada referência de Objeto
								// para cada curso, flechinha ->, que está dentro de "cursos", execute esse código

		cursos.add("Aumentando o nosso conhecimento");
		System.out.println(cursos);
		
		// ordena a minha lista que se chama "cursos"
		Collections.sort(cursos); //ordenando de acordo com as Strings (em ordem alfabética)
		System.out.println("Depois de ordenado: " + cursos);
	}

}


/*
 * Independente da quantidade de vezes que executarmos a classe TestandoListas, os nomes dos cursos sempre aparecem na ordem em que foram adicionados no ArrayList. 
 * Isso acontece porque essa estrutura de lista usa um array internamente, sem interferir na ordem em que os valores são adicionados. 
 * Mas e se quisermos mostrar essa lista de nomes dos cursos em ordem alfabética?
 * A classe java.util.Collections (repare o s no final, que é diferente da interface Collection, que será vista mais para a frente) possui um conjunto de métodos estáticos auxiliares as coleções;
 * Dentro dela há o método sort, que nos ajuda com esse tipo de ordenação natural
 */
