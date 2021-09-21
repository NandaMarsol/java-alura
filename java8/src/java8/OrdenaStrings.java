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
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		palavras.sort(comparador);
//		System.out.println(palavras);
		
		// 1) forma de classe an�nima,
		palavras.sort(new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        if (s1.length() < s2.length())
		            return -1;
		        if (s1.length() > s2.length())
		            return 1;
		        return 0;
		    }
		});
		
		// 2) Como aplicar a mesma l�gica para transformar isso em um lambda? Basta removermos quase tudo da assinatura do m�todo, assim como o new Comparator e adicionar o -> entre os par�metros e o bloco. Al�m disso, podemos tirar o tipo dos par�metros:
		palavras.sort((s1, s2) -> {
		    if (s1.length() < s2.length())
		        return -1;
		    if (s1.length() > s2.length())
		        return 1;
		    return 0;
		});
		
		// 3) Conhecendo a API do Java, podemos ver que h� um m�todo que compara dois inteiros e retorna negativo/positivo/zero dependendo se o primeiro for menor/maior/igual ao segundo. � o Integer.compare. Com ele, reduzimos o lambda para o seguinte:
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length());
		});
		
		// 4) Como h� apenas um �nico statement, podemos remover as chaves. Al�m disso, o return pode ser eliminado que o compilador vai inferir que deve ser retornado o valor que o pr�prio compare devolver:
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// 5) At� podemos fugir do m�todo compare, subtraindo os valores:
		
		
		
		// foreach, para cada String p dentro de palavras, fa�a/ imprima...
//		for (String p : palavras) {
//			System.out.println(p);
//			}
		
		// evitar a cria��o da vari�vel consumidor, passando a classe an�nima diretamente para o forEach
		palavras.forEach(new Consumer<String>() {
		    @Override
			public void accept(String s) {
		        System.out.println(s);
		    }
		});
		
		// LAMBDA
		// Como essa interface s� tem um m�todo, n�o precisamos escrever o nome do m�todo. 
		// Tamb�m n�o daremos new. Apenas declararemos os argumentos e o bloco a ser executado, separados por ->:
		palavras.forEach((String s) -> {
		    System.out.println(s);
		});
		
		// � uma forma bem mais sucinta de escrever! Essa sintaxe funciona para qualquer interface que tenha apenas um m�todo abstrato, 
		// por esse motivo que nem precisamos falar que estamos implementando o m�todo accept, j� que n�o h� outra possibilidade. 
		// podemos ir al�m e remover a declara��o do tipo do par�metro, que o compilador tamb�m infere:
		palavras.forEach((s) -> {
		    System.out.println(s);
		});
		
		// quando h� apenas um par�metro, nem mesmo os parenteses s�o necess�rios:
		palavras.forEach(s -> {
		    System.out.println(s);
		});
		
		// D� pra melhorar? Sim. podemos remover as chaves de declara��o do bloco, assim como o ponto e v�rgula, pois s� existe uma �nica instru��o:
		// para cada palavras "s", imprima...
		palavras.forEach(s -> System.out.println(s));
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


/*
 * Quantos m�todos uma interface funcional pode ter?
 * 1 �nico m�todo abstrato. Al�m desse m�todo ela pode ter outros m�todos, contanto que sejam default ou 'static'
 *
 */
