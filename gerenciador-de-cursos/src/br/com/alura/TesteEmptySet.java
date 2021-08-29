package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		
		Set<String> nomes = Collections.emptySet();
        nomes.add("Lilicooo"); //o que acontece aqui?
        // Recebemos a exceção: UnsupportedOperationException
	}
}


/*
 * Um conjunto destinado a ser vazio não pode ter um elemento. Mas para que um conjunto vazio poderia ser útil?
 * imagina que você precisa representar um curso que foi cancelado pois não teve matriculas. Nesse caso faria todo sentido devolver um Collections.emptySet()
 */ 