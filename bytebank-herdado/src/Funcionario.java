
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// bonifica��o padr�o de 10% do sal�rio
	public double getBonificacao() {
        return this.salario * 0.1;
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}

//private - apenas vis�vel dentro da classe
//protected - vis�vel dentro da classe e tamb�m para as filhas
//public - vis�vel em todo lugar