

public class Conta {
	
		// atributos da classe
		double saldo;
		int agencia;
		int numero;
		Cliente titular;
		
		// m�todos - definem o comportamento de um objeto 
		
		// void � quando n�o tem / n�o precisa de retorno
		public void deposita(double valor){ // recebe valor do tipo double
			//this.saldo = this.saldo + valor; // usamos o this dentro de um m�todo para acessar um atributo
			this.saldo += valor;
		}
		
		public boolean saca(double valor){
			if(this.saldo >= valor){
				//this.saldo = this.saldo - valor;
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
		}
		
		public boolean transfere(double valor, Conta destino){
			if(this.saca(valor)){
			//if(this.saldo >=valor) {	
				//this.saldo -= valor;
				destino.deposita(valor);
				return true;
			} else {
				return false;
			}
		}
}
