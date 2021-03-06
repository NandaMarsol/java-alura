
public class Conta {
	
	// atributos privados s? podem ser editados dentro da classe Conta - isso se chama encapsulamento 
	private double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; // static quer dizer que ? da classe Conta, os outros atributos s?o da inst?ncia/objeto
	
	// construtor te obriga a ter os par?metros definidos numa regra de neg?cio
	// construtores s?o utilizados para inicializa??o dos atributos
	public Conta(int agencia, int numero){
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100; //isso significa que toda conta come?a com 100 de saldo
		System.out.println("Estou criando uma conta, ag?ncia " + this.agencia + ", n?mero " +this.numero);
	}
	
	// m?todos - definem o comportamento de um objeto 
	public void deposita(double valor){
		this.saldo = this.saldo + valor; // o "this" saldo ? referente a contaDaFernanda
		// this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor){
			this.saldo = this.saldo - valor;
			// this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor){
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){ // int numero ? uma vari?vel tempor?ria
		if(numero <= 0) {
			System.out.println("N?o pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero; // this se refere ao atributo numero
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0){
			System.out.println("N?o pode valor menor ou igual a 0 ");
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal(){
		return Conta.total;
	}

}




/* O construtor ? uma rotina de inicializa??o executada ao instanciar um objeto. 
 * Ele n?o ? um m?todo, e s? pode ser executado uma ?nica vez, na cria??o do objeto. */
