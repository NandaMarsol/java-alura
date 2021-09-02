package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();

		// map que associa uma pessoa com a sua idade
        pessoas.put(21, "Luna Marsol");
        pessoas.put(27, "Kiko");
        pessoas.put(19, "Lilico");
        pessoas.put(23, "Jim");

        // utilizando o forEach para iterar pelo conjunto de chaves que é retornado pelo método keySet(). 
        // depois, para cada chave idade, nós pegamos o seu valor através do método get e imprimimos
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });
	}

}
