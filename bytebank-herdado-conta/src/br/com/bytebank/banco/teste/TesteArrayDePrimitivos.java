package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		// criando array de inteiros com cinco posições para guardar as idades
		int[] idades = new int[5]; // inicializa o array com 0
		
		// inicializando cada posição do array com uma idade
		idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;
        
        // ao acessar alguma posição do array, ele retorna o valor guardado nessa posição   
        int idade4 = idades[3]; // guardando o valor da quarta posição do array em uma variável

        System.out.println(idade4);
        System.out.println(idades.length);

	}

}


/* 
 * - Um array é uma estrutura de dados e serve para guardar elementos (valores primitivos ou referências)
 * - Arrays usam colchetes ([]) sintaticamente
 * - Arrays têm um tamanho fixo;
 * - Um array também é um objeto;
 * - Arrays são zero-based (o primeiro elemento se encontra na posição 0)
 * - Um array é sempre inicializado com os valores padrões.
 * - Ao acessar uma posição inválida recebemos a exceção ArrayIndexOutOfBoundException
 * - Arrays possuem um atributo length para saber o tamanho
 * - A forma literal de criar uma Array é com o uso de chaves {}.
 */
