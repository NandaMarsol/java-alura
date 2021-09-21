package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		// criando uma lista de strings
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");
		
		// ordenando essa lista
		Collections.sort(palavras);
		System.out.println(palavras);
		
		// para ordenar com esse novo crit�rio de compara��o, podemos fazer
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		Collections.sort(palavras, comparador);
//		System.out.println(palavras);
		
		// ao inv�s de usar o Collections.sort, podemos invocar essa opera��o na pr�pria List
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		palavras.sort(comparador);
		System.out.println(palavras);

		// foreach, para cada String p dentro de palavras, fa�a/ imprima...
//		for (String p : palavras) {
//			System.out.println(p);
//			}
		
		// podemos passar uma inst�ncia dessa para o forEach
		Consumer<String> consumidor = new ImprimeNalinha();
		palavras.forEach(consumidor);
	}

}

//se abrir o JavaDoc ver� que List.forEach recebe um Consumer, que � uma das muitas interfaces do novo pacote java.util.functions
//vamos criar um consumidor de String:
class ImprimeNalinha implements Consumer<String> {
	
	// dada uma String, imprima essa String
	@Override
 public void accept(String s) {
     System.out.println(s);
 }
}

// E se quisermos ordenar essas palavras em uma ordem diferente? Por exemplo, pela ordem do tamanho das palavras. 
// Nesse caso, utilizaremos um Comparator. Podemos cri�-la como uma outra classe, por enquanto apenas o esqueleto:
class ComparadorDeStringPorTamanho implements Comparator<String> {

	// vamos dizer que uma String � "menor" que outra se ela tiver menos caracteres
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) {
        	return -1;
        }
        if (s1.length() > s2.length()) {
        	return 1;
        }
        return 0;
    }

}

