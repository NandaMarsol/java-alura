
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1212, 2626);

		Conta conta2 = new Conta(1234, 5432);

		Conta conta3 = new Conta(5454, 6060);

		System.out.println("O total de contas criadas são " + Conta.getTotal());
	}

}
