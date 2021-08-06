
public class MinhaExcecao extends Exception { // herdando da classe Exception //checked
	
	// construtor que recebe uma mensagem do tipo string e passa ela para o construtor da classe mãe RuntimeException
	public MinhaExcecao(String msg) {
        super(msg);
    }

}


// 1) Existe uma hierarquia grande de classes que representam exceções. 
// Por exemplo, ArithmeticException é filha de RuntimeException, que herda de Exception, que por sua vez é filha da classe mais ancestral das exceções, Throwable. 

// 2) Throwable é a classe que precisa ser extendida para que seja possível jogar um objeto na pilha (através da palavra reservada throw)

// 3) A hierarquia iniciada com a classe Throwable é dividida em exceções e erros. Exceções são usadas em códigos de aplicação.
// Erros são usados exclusivamente pela máquina virtual. Classes que herdam de Error são usadas para comunicar erros na máquina virtual. Desenvolvedores de aplicação não devem criar erros que herdam de Error

// 4) StackOverflowError é um erro da máquina virtual para informar que a pilha de execução não tem mais memória.

// 5) Exceções são separadas em duas grandes categorias: aquelas que são obrigatoriamente verificadas pelo compilador e as que não são verificadas. 
// As primeiras são denominadas checked e são criadas através do pertencimento a uma hieraquia que não passe por RuntimeException. As segundas são as unchecked, e são criadas como descendentes de RuntimeException.