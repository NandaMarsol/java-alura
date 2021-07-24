// n�o pode instanciar um "funcion�rio" dessa classe, pq � uma classe abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//m�todo sem corpo, n�o h� implementa��o
	public abstract double getBonificacao();

	
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

/* Classes abstratas: n�o podem ser instanciadas, para instanciar devemos criar
 * primeiro uma classe filha n�o abstrata. Uma classe abstrata representa um 
 * conceito, algo abstrato e o compilador n�o permite instanciar um objeto
 * dessa classe.  
 */