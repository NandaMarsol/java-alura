package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	// construtor da classe repassando os par�metros para a classe m�e atrav�s do super();
	public ContaPoupanca(int agencia, int numero){
	    super(agencia, numero);
	}
	
	// classe filha deve implementar o m�todo deposita
	@Override
	public void deposita(double valor){
	    super.saldo += valor;
	}

}
