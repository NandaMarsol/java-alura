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
		// as listas s�o indexadas a partir do 0,  portanto o �ndice 1 aponta para o segundo elemento da lista
		cursos.remove(1);
		System.out.println(cursos);
		
		// como se l� um foreach?
		// para cada String "curso" dentro de cursos, fa�a o seguinte
		for (String curso : cursos) {
			System.out.println("Curso: " + curso);
		}
		
		// outra forma de percorrer uma lista
		String primeiroCurso = cursos.get(0);
		System.out.println("O primeiro curso �: " + primeiroCurso);
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Cursinho: " + cursos.get(i));
		}
		// vendo quantos elementos tem dentro de uma lista
		System.out.println("Essa lista tem: " + cursos.size() + " cursos");
		
		// vai performar uma a��o para cada elemento dentro dessa cole��o
		cursos.forEach(curso -> {
			System.out.println("Percorrendo: ");
			System.out.println("Curso lambda: " + curso);}); // vamos passar aqui direto um lambda
								// voc� vai falar dentro do forEach, para cada refer�ncia de Objeto
								// para cada curso, flechinha ->, que est� dentro de "cursos", execute esse c�digo

		cursos.add("Aumentando o nosso conhecimento");
		System.out.println(cursos);
		
		// ordena a minha lista que se chama "cursos"
		Collections.sort(cursos); //ordenando de acordo com as Strings (em ordem alfab�tica)
		System.out.println("Depois de ordenado: " + cursos);
	}

}


/*
 * Independente da quantidade de vezes que executarmos a classe TestandoListas, os nomes dos cursos sempre aparecem na ordem em que foram adicionados no ArrayList. 
 * Isso acontece porque essa estrutura de lista usa um array internamente, sem interferir na ordem em que os valores s�o adicionados. 
 * Mas e se quisermos mostrar essa lista de nomes dos cursos em ordem alfab�tica?
 * A classe java.util.Collections (repare o s no final, que � diferente da interface Collection, que ser� vista mais para a frente) possui um conjunto de m�todos est�ticos auxiliares as cole��es;
 * Dentro dela h� o m�todo sort, que nos ajuda com esse tipo de ordena��o natural
 */
