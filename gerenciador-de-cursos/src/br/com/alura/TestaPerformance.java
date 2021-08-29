package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
//
public class TestaPerformance {

	public static void main(String[] args) {
		
//		Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numeros = new HashSet<>();

		// vamos usar o método currentTimeMillis(), de System, para cronometrar o tempo gasto com a adição e pesquisa dos elementos
        long inicio = System.currentTimeMillis();

        //  insere 50 mil números em uma ArrayList e os pesquisa
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);
	}

}
