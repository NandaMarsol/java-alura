import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(8, 4);
		
		
		// queremos verificar se a vari�vel soma � igual a um determinado valor, precisamos de uma assertiva de igualdade (Assert.assertEquals) que compare os dois valores. 
		// Essa classe recebe dois par�metros: o primeiro � o valor esperado como resultado da soma (12) e o segundo � a vari�vel a ser comparada com esse n�mero (soma).
		Assert.assertEquals(12, soma); 
		
		/*
		 * precisamos informar ao JUnit o que fazer para verificar se o c�digo que escrevemos funciona corretamente,
		 * para isso, usaremos uma classe do JUnit chamada Assert, que possui v�rios m�todos est�ticos para fazer assertivas (verifica��es).
		 * 
		 */
	}
	
}
