
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaLuna =  new Conta(); // instancio uma Conta
		System.out.println(contaDaLuna.saldo);
		
		// instanciando um Cliente na mesma linha da contaDaLuna
		contaDaLuna.titular = new Cliente();
		System.out.println(contaDaLuna.titular);
		
		contaDaLuna.titular.nome = "Luna";
		System.out.println(contaDaLuna.titular.nome);
	}

}
