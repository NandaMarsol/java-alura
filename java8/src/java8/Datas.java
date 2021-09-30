package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		// data atual com LocalDate
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		// criando uma data com LocalDate
		LocalDate aniversarioTrintando = LocalDate.of(2023, Month.JUNE, 27);
		int anos = aniversarioTrintando.getYear() - hoje.getYear();
		System.out.println("Falta " +anos+ " anos...");
		
		// criando um período entre duas datas
		Period periodo = Period.between(hoje, aniversarioTrintando);
		System.out.println(periodo);
		
		// criando um formatador para o pattern dd/MM/yyyy e imprimindo a data de hoje formatada
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(hoje);
		System.out.println(dataFormatada);

	}

}
