// Gerente � um Funcionario, "extends" herda da classe Funcionario
public class Gerente extends Funcionario {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
	    if (this.senha == senha) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	// o gerente tem a bonifica��o de um funcion�rio comum + um sal�rio
	public double getBonificacao() {
	    return super.getBonificacao() + super.getSalario(); // reescrita de m�todo
	}



}
