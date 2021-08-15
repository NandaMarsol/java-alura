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
	   
	    // testando se a lista contém uma conta usando o método contains
	    boolean existe = lista.contains(cc2); //novo
	    System.out.println("Já existe? " + existe); // a saída é false, mas não é isso que queremos pois os dois objetos representam a mesma conta

	    // testando o método ehIgual criado na classe Conta que verificará se uma conta é igual a outra
//	    boolean igual = cc1.ehIgual(cc2);
	    boolean igual = cc1.equals(cc2);
	    System.out.println("É igual? " + igual); //deve imprimir true
	    
	    for(Conta conta : lista){
	        System.out.println(conta);
	    }

	}

}
