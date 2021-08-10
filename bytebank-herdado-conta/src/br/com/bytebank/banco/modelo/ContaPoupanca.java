package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	// construtor da classe repassando os parâmetros para a classe mãe através do super();
	public ContaPoupanca(int agencia, int numero){
	    super(agencia, numero);
	}
	
	// classe filha deve implementar o método deposita
	@Override
	public void deposita(double valor){
	    super.saldo += valor;
	}

}
