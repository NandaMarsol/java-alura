// não pode instanciar um "funcionário" dessa classe, pq é uma classe abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//método sem corpo, não há implementação
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

//private - apenas visível dentro da classe
//protected - visível dentro da classe e também para as filhas
//public - visível em todo lugar

/* Classes abstratas: não podem ser instanciadas, para instanciar devemos criar
 * primeiro uma classe filha não abstrata. Uma classe abstrata representa um 
 * conceito, algo abstrato e o compilador não permite instanciar um objeto
 * dessa classe.  
 */