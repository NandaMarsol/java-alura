package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		Integer idadeRef = 29; //autoboxinng, é criado um objeto do tipo Integer
        int primitivo = new Integer(21); // unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); //ok
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0);  //unboxing
        Integer i2 = lista.get(1);  //ok

        System.out.println(i1);  //29
        System.out.println(i2); //21
        
        Integer valorRef = Integer.valueOf(33); // delegando a criação para método valueOf
        int valorPri = valorRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(valorPri); //33
        
        // testando o parsing, que é a conversão de String para um tipo específico
        Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44");  //parseando e devolvendo primitivo

        System.out.println(iParseado1); //42
        System.out.println(iParseado2); //44
        
        // verificando as constantes da classe Integer
        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE); //-2^31

        System.out.println(Integer.SIZE); // 32 bits
        System.out.println(Integer.BYTES); //4 Bytes

	}

}

// para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
// a criação do objeto Wrapper é chamada de autoboxing
// a retirada do valor primitivo do objeto Wrapper é chamada de unboxing
// autoboxing e unboxing acontecem automaticamente
// as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
// todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe
