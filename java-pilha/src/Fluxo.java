// Classe para demonstrar o tratamento de exceções nos métodos com o bloco try-catch

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (ArithmeticException | NullPointerException exception) { // tratando múltiplas exceções com o pipe |
        	String msg = exception.getMessage(); // pegando a mensagem da exceção
            System.out.println("Exception " + msg);
            exception.printStackTrace(); // pegando o rastro da nossa exceção "stacktrace"
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        	metodo2();    
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta c = null;
            c.deposita(); // testando a classe Conta
 //           try { // tratamento da exceção para evitar que caia na pilha de execução 
 //           	int a = i / 0; // forçando uma exceção ArithmeticException
 //           } catch (ArithmeticException ex) {
 //           	System.out.println("Exceção ArithmeticException");
 //           }
            
        }
        System.out.println("Fim do metodo2");        
    }
}
