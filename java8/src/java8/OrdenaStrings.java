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
		palavras.add("casa do código");
		palavras.add("caelum");
		
		// ordenando essa lista
		Collections.sort(palavras);
		System.out.println(palavras);
		
		// para ordenar com esse novo critério de comparação, podemos fazer
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		Collections.sort(palavras, comparador);
//		System.out.println(palavras);
		
		// ao invés de usar o Collections.sort, podemos invocar essa operação na própria List
//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		palavras.sort(comparador);
//		System.out.println(palavras);
		
		// 1) forma de classe anônima,
		palavras.sort(new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        if (s1.length() < s2.length())
		            return -1;
		        if (s1.length() > s2.length())
		            return 1;
		        return 0;
		    }
		});
		
		// 2) Como aplicar a mesma lógica para transformar isso em um lambda? Basta removermos quase tudo da assinatura do método, assim como o new Comparator e adicionar o -> entre os parâmetros e o bloco. Além disso, podemos tirar o tipo dos parâmetros:
		palavras.sort((s1, s2) -> {
		    if (s1.length() < s2.length())
		        return -1;
		    if (s1.length() > s2.length())
		        return 1;
		    return 0;
		});
		
		// 3) Conhecendo a API do Java, podemos ver que há um método que compara dois inteiros e retorna negativo/positivo/zero dependendo se o primeiro for menor/maior/igual ao segundo. É o Integer.compare. Com ele, reduzimos o lambda para o seguinte:
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length());
		});
		
		// 4) Como há apenas um único statement, podemos remover as chaves. Além disso, o return pode ser eliminado que o compilador vai inferir que deve ser retornado o valor que o próprio compare devolver:
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// 5) Até podemos fugir do método compare, subtraindo os valores:
		
		
		
		// foreach, para cada String p dentro de palavras, faça/ imprima...
//		for (String p : palavras) {
//			System.out.println(p);
//			}
		
		// evitar a criação da variável consumidor, passando a classe anônima diretamente para o forEach
		palavras.forEach(new Consumer<String>() {
		    @Override
			public void accept(String s) {
		        System.out.println(s);
		    }
		});
		
		// LAMBDA
		// Como essa interface só tem um método, não precisamos escrever o nome do método. 
		// Também não daremos new. Apenas declararemos os argumentos e o bloco a ser executado, separados por ->:
		palavras.forEach((String s) -> {
		    System.out.println(s);
		});
		
		// É uma forma bem mais sucinta de escrever! Essa sintaxe funciona para qualquer interface que tenha apenas um método abstrato, 
		// por esse motivo que nem precisamos falar que estamos implementando o método accept, já que não há outra possibilidade. 
		// podemos ir além e remover a declaração do tipo do parâmetro, que o compilador também infere:
		palavras.forEach((s) -> {
		    System.out.println(s);
		});
		
		// quando há apenas um parâmetro, nem mesmo os parenteses são necessários:
		palavras.forEach(s -> {
		    System.out.println(s);
		});
		
		// Dá pra melhorar? Sim. podemos remover as chaves de declaração do bloco, assim como o ponto e vírgula, pois só existe uma única instrução:
		// para cada palavras "s", imprima...
		palavras.forEach(s -> System.out.println(s));
	}
}


// E se quisermos ordenar essas palavras em uma ordem diferente? Por exemplo, pela ordem do tamanho das palavras. 
// Nesse caso, utilizaremos um Comparator. Podemos criá-la como uma outra classe, por enquanto apenas o esqueleto:
class ComparadorDeStringPorTamanho implements Comparator<String> {

	// vamos dizer que uma String é "menor" que outra se ela tiver menos caracteres
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
 * Quantos métodos uma interface funcional pode ter?
 * 1 único método abstrato. Além desse método ela pode ter outros métodos, contanto que sejam default ou 'static'
 *
 */
