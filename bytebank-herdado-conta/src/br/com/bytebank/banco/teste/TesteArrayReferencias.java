package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// criando Array com cinco posições para guardar contas
		ContaCorrente[] contas = new ContaCorrente[5];
		
		// instanciando duas contas e guardando-as nas duas primeiras posições do Array
		ContaCorrente cc1 = new ContaCorrente(44, 11);
        ContaCorrente cc2 = new ContaCorrente(22, 22);

        contas[0] = cc1;
        contas[1] = cc2;
        
        // acessando a conta da primeira posição e imprimindo
        System.out.println(contas[0].getAgencia());
	}

}
