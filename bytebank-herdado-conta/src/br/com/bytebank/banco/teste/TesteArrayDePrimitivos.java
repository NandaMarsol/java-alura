package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		// criando array de inteiros com cinco posi��es para guardar as idades
		int[] idades = new int[5]; // inicializa o array com 0
		
		// inicializando cada posi��o do array com uma idade
		idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;
        
        // ao acessar alguma posi��o do array, ele retorna o valor guardado nessa posi��o   
        int idade4 = idades[3]; // guardando o valor da quarta posi��o do array em uma vari�vel

        System.out.println(idade4);
        System.out.println(idades.length);

	}

}


/* 
 * - Um array � uma estrutura de dados e serve para guardar elementos (valores primitivos ou refer�ncias)
 * - Arrays usam colchetes ([]) sintaticamente
 * - Arrays t�m um tamanho fixo;
 * - Um array tamb�m � um objeto;
 * - Arrays s�o zero-based (o primeiro elemento se encontra na posi��o 0)
 * - Um array � sempre inicializado com os valores padr�es.
 * - Ao acessar uma posi��o inv�lida recebemos a exce��o ArrayIndexOutOfBoundException
 * - Arrays possuem um atributo length para saber o tamanho
 * - A forma literal de criar uma Array � com o uso de chaves {}.
 */
