
public class MinhaExcecao extends Exception { // herdando da classe Exception //checked
	
	// construtor que recebe uma mensagem do tipo string e passa ela para o construtor da classe m�e RuntimeException
	public MinhaExcecao(String msg) {
        super(msg);
    }

}


// 1) Existe uma hierarquia grande de classes que representam exce��es. 
// Por exemplo, ArithmeticException � filha de RuntimeException, que herda de Exception, que por sua vez � filha da classe mais ancestral das exce��es, Throwable. 

// 2) Throwable � a classe que precisa ser extendida para que seja poss�vel jogar um objeto na pilha (atrav�s da palavra reservada throw)

// 3) A hierarquia iniciada com a classe Throwable � dividida em exce��es e erros. Exce��es s�o usadas em c�digos de aplica��o.
// Erros s�o usados exclusivamente pela m�quina virtual. Classes que herdam de Error s�o usadas para comunicar erros na m�quina virtual. Desenvolvedores de aplica��o n�o devem criar erros que herdam de Error

// 4) StackOverflowError � um erro da m�quina virtual para informar que a pilha de execu��o n�o tem mais mem�ria.

// 5) Exce��es s�o separadas em duas grandes categorias: aquelas que s�o obrigatoriamente verificadas pelo compilador e as que n�o s�o verificadas. 
// As primeiras s�o denominadas checked e s�o criadas atrav�s do pertencimento a uma hieraquia que n�o passe por RuntimeException. As segundas s�o as unchecked, e s�o criadas como descendentes de RuntimeException.