
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente fernanda = new Cliente();
		fernanda.nome = "Fernanda Marsol";
		fernanda.cpf = "123.456.789-10";
		fernanda.profissao = "Engenheira de Software Jr";
		
		Conta contaDaFernanda = new Conta();
		contaDaFernanda.deposita(1000);
		
		// associa a Cliente fernanda com a Conta contaDaFernanda
		contaDaFernanda.titular = fernanda;
		
		System.out.println(contaDaFernanda.titular.nome);

	}

}
