// Gerente � um Funcionario, "extends" herda da classe Funcionario
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
	
	// o gerente tem a bonifica��o de um funcion�rio comum + um sal�rio
	public double getBonificacao() {
	    return super.getSalario(); // reescrita de m�todo
	}



}
