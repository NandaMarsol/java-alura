
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario luck = new Funcionario();
		luck.setNome("Luck Bird");
		luck.setCpf("123456789-10");
		luck.setSalario(5200.00);
		
		System.out.println("O nome do funcion�rio � " +luck.getNome());
		System.out.println("E ele recebeu R$" +luck.getBonificacao()+ " de b�nus no sal�rio.");
	}

}
