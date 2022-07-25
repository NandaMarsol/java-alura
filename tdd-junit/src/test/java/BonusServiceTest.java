import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Luna", LocalDate.now(), new BigDecimal("25000"))));
		
		// O assertThrows funciona da seguinte maneira: antes de escrever um m�todo, precisamos dizer a classe da exception que estamos esperando. No nosso caso, � uma IllegalArgumentException. 
		// Ap�s fornecer essa informa��o, acrescentamos uma v�rgula e passamos uma fun��o lambda do Java 8 para informar o segundo par�metro

	}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Luna", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.0"), bonus);

	}

}
