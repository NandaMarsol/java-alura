package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// criando Array com cinco posições para guardar contas
        Conta[] contas = new Conta[5]; // alterando o tipo
		
     // cria instância de ContaCorrente
		ContaCorrente cc1 = new ContaCorrente(44, 11);
		contas[0] = cc1;
		
		// cria instância de ContaPoupanca
        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2; 
        
        // acessando a conta da primeira posição e imprimindo
        System.out.println(contas[1].getNumero());

        // não compila
 //     ContaCorrente ref = contas[0]; // Ao mudarmos o tipo do array contas de ContaCorrente, a seguinte instrução deixa de compilar
        // Porque em tempo de execução, temos um objeto do tipo ContaCorrente como primeiro elemento do array contas, sua referência é do tipo Conta quando acessarmos contas[0]. 
        // Sendo assim, uma solução é alterarmos o tipo da variável ref para Conta:
        
     // alterou o tipo, agora compila
        Conta ref = contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
	}

}


/* - uma array do tipo Object pode guardar qualquer tipo de referência
   - quando convertemos uma referência genérica para uma referência mais específica é preciso usar um type cast
   - o cast só compila quando é possível, mesmo assim pode falhar na hora de rodar
   - quando o type cast falha podemos receber uma ClassCastException
   - para receber valores ao chamar o programa Java na linha de comando podemos usar o array String[] no método main
*/