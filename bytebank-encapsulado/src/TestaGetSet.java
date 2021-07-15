
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1212, 2626);
		conta.setNumero(1234); // edita o n�mero do atributo
		System.out.println(conta.getNumero()); // mostra n�mero
		
		Cliente fernanda = new Cliente();
		
		fernanda.setNome("Fernanda Marsol");
		fernanda.setCpf("12345678910");
		fernanda.setProfissao("Dev");
		
		conta.setTitular(fernanda);
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getCpf());
		
		conta.getTitular().setProfissao("Programadora");
		System.out.println(conta.getTitular().getProfissao());
		
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programadoraaa");
		
		// ambos s�o o mesmo cliente, s� s�o formas diferentes 
		System.out.println(titularDaConta);
		System.out.println(fernanda);
		System.out.println(conta.getTitular());
	}

}
