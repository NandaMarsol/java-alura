import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(8, 4);
		
		
		// queremos verificar se a variável soma é igual a um determinado valor, precisamos de uma assertiva de igualdade (Assert.assertEquals) que compare os dois valores. 
		// Essa classe recebe dois parâmetros: o primeiro é o valor esperado como resultado da soma (12) e o segundo é a variável a ser comparada com esse número (soma).
		Assert.assertEquals(12, soma); 
		
		/*
		 * precisamos informar ao JUnit o que fazer para verificar se o código que escrevemos funciona corretamente,
		 * para isso, usaremos uma classe do JUnit chamada Assert, que possui vários métodos estáticos para fazer assertivas (verificações).
		 * 
		 */
	}
	
}
