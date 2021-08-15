package br.com.bytebank.banco.teste;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// instanciando uma lista de Conta
		ArrayList<Conta> lista = new ArrayList<Conta>();

	    Conta cc1 = new ContaCorrente(22, 22);
	    Conta cc2 = new ContaCorrente(22, 22);

	    lista.add(cc1);
	   
	    // testando se a lista cont�m uma conta usando o m�todo contains
	    boolean existe = lista.contains(cc2); //novo
	    System.out.println("J� existe? " + existe); // a sa�da � false, mas n�o � isso que queremos pois os dois objetos representam a mesma conta

	    // testando o m�todo ehIgual criado na classe Conta que verificar� se uma conta � igual a outra
//	    boolean igual = cc1.ehIgual(cc2);
	    boolean igual = cc1.equals(cc2);
	    System.out.println("� igual? " + igual); //deve imprimir true
	    
	    for(Conta conta : lista){
	        System.out.println(conta);
	    }

	}

}
