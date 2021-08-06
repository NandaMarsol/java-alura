// Gerente é um Funcionario, "extends" herda da classe Funcionario
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
	    if (this.senha == senha) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	// o gerente tem a bonificação de um funcionário comum + um salário
	public double getBonificacao() {
	    return super.getSalario(); // reescrita de método
	}



}
