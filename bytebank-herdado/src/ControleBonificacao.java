
public class ControleBonificacao {
	
	private double soma;
	
	// método registra recebe um funcionário por parâmetro
	// pega a sua bonificação e soma com as outras bonificações
	public void registra(Funcionario f){
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	// método para retornar o valor do atributo soma 
	public double getSoma() {
		return soma;
	}

}
