package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// criando Array com cinco posi��es para guardar contas
        Conta[] contas = new Conta[5]; // alterando o tipo
		
     // cria inst�ncia de ContaCorrente
		ContaCorrente cc1 = new ContaCorrente(44, 11);
		contas[0] = cc1;
		
		// cria inst�ncia de ContaPoupanca
        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2; 
        
        // acessando a conta da primeira posi��o e imprimindo
        System.out.println(contas[1].getNumero());

        // n�o compila
 //     ContaCorrente ref = contas[0]; // Ao mudarmos o tipo do array contas de ContaCorrente, a seguinte instru��o deixa de compilar
        // Porque em tempo de execu��o, temos um objeto do tipo ContaCorrente como primeiro elemento do array contas, sua refer�ncia � do tipo Conta quando acessarmos contas[0]. 
        // Sendo assim, uma solu��o � alterarmos o tipo da vari�vel ref para Conta:
        
     // alterou o tipo, agora compila
        Conta ref = contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
	}

}


/* - uma array do tipo Object pode guardar qualquer tipo de refer�ncia
   - quando convertemos uma refer�ncia gen�rica para uma refer�ncia mais espec�fica � preciso usar um type cast
   - o cast s� compila quando � poss�vel, mesmo assim pode falhar na hora de rodar
   - quando o type cast falha podemos receber uma ClassCastException
   - para receber valores ao chamar o programa Java na linha de comando podemos usar o array String[] no m�todo main
*/