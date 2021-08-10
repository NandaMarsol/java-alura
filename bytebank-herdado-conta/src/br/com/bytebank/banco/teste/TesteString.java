package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Melvin"; //object literal
	    String outro = new String("Alura"); //m� pr�tica, sempre prefere a sintaxe literal
	    
	    // m�todo replace
//	    String novo = outro.replace("A", "a");
//	    System.out.println(novo);
	    
	    // m�todo toLowerCase
	    String novo = nome.toLowerCase(); //tamb�m teste toUpperCase()
	    System.out.println(novo);
	    
	    // m�todo charAt
	    char c = nome.charAt(3); //char i
	    System.out.println(c);

	    // m�todo indexOf
	    int pos = nome.indexOf("rio");
	    System.out.println(pos);

	    // m�todo substring
	    String sub = nome.substring(1);
	    System.out.println(sub);
	    
	    // mostra todas as caracteres linha por linha usando um la�o for junto com os m�todos length e charAt
	    for(int i = 0; i < nome.length(); i++) {
	        System.out.println(nome.charAt(i));
	    } 

	}

}

/*
 * - objetos da classe String s�o imut�veis e usamos uma sintaxe literal para criar (object literal)
 * - qualquer m�todo de altera��o da classe String devolve uma nova String que representa a altera��o
 * - a classe String � uma CharSequence
 * - se precisamos concatenar muitas String devemos usar a classe StringBuilder
 */
