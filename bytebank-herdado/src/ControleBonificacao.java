
public class ControleBonificacao {
	
	private double soma;
	
	// m�todo registra recebe um funcion�rio por par�metro
	// pega a sua bonifica��o e soma com as outras bonifica��es
	public void registra(Funcionario f){
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	// m�todo para retornar o valor do atributo soma 
	public double getSoma() {
		return soma;
	}

}
