package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Melvin"; //object literal
	    String outro = new String("Alura"); //má prática, sempre prefere a sintaxe literal
	    
	    // método replace
//	    String novo = outro.replace("A", "a");
//	    System.out.println(novo);
	    
	    // método toLowerCase
	    String novo = nome.toLowerCase(); //também teste toUpperCase()
	    System.out.println(novo);
	    
	    // método charAt
	    char c = nome.charAt(3); //char i
	    System.out.println(c);

	    // método indexOf
	    int pos = nome.indexOf("rio");
	    System.out.println(pos);

	    // método substring
	    String sub = nome.substring(1);
	    System.out.println(sub);
	    
	    // mostra todas as caracteres linha por linha usando um laço for junto com os métodos length e charAt
	    for(int i = 0; i < nome.length(); i++) {
	        System.out.println(nome.charAt(i));
	    } 

	}

}

/*
 * - objetos da classe String são imutáveis e usamos uma sintaxe literal para criar (object literal)
 * - qualquer método de alteração da classe String devolve uma nova String que representa a alteração
 * - a classe String é uma CharSequence
 * - se precisamos concatenar muitas String devemos usar a classe StringBuilder
 */
