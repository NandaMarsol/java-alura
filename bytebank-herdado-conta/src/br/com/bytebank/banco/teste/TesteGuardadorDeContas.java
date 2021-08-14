package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(55, 66);
		guardador.adiciona(cc);
		
		// adicionando mais uma conta
		Conta cc2 = new ContaCorrente(77, 88);
		guardador.adiciona(cc2);
		
		// verificando se a quantidade de elementos dentro do guardador é 2
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("Tamanho de contas dentro do guardador: " + tamanho + " contas");
		
		//  para recuperar determinado elemento do guardador a partir de uma posição
		Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());

	}

}
