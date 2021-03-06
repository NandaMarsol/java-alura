package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaFernanda = new Conta();
		contaDaFernanda.saldo = 100; // atributo
		contaDaFernanda.deposita(50); // m?todo deposita sendo chamado
		System.out.println("Saldo atual da Fernanda ? R$" +contaDaFernanda.saldo);
		
		// criamos uma vari?vel conseguiuRetirar para guardar true ou false (n?o obrigat?rio)
		// m?todo ? um boolean
		boolean conseguiuRetirar = contaDaFernanda.saca(20);
	 	System.out.println("O saldo atual ap?s efetuado o saque ? de: R$ " +contaDaFernanda.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaLuna = new Conta();
		contaDaLuna.saldo = 1000;
		System.out.println("Saldo atual da Luna ? R$" +contaDaLuna.saldo);
		
		
		if(contaDaLuna.transfere(1000, contaDaFernanda)){
			System.out.println("Transfer?ncia feita com sucesso");
		} else {
			System.out.println("Falta dinheiro para transferir.");
		}
		
		System.out.println("Saldo atual da Luna ap?s transfer?ncia R$" +contaDaLuna.saldo);
		System.out.println("Saldo atual da Fernanda ap?s receber transfer?ncia R$" +contaDaFernanda.saldo);

	}

}
