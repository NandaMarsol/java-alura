
public class ContaCorrente extends Conta {
	
	// construtor da classe repassando os par�metros para a classe m�e atrav�s do super();
	public ContaCorrente(int agencia, int numero){
	    super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	// classe filha deve implementar o m�todo deposita
	@Override
	public void deposita(double valor){
	    super.saldo += valor;
	}
}
