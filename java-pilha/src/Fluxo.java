// Classe para demonstrar o tratamento de exce��es nos m�todos com o bloco try-catch

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (ArithmeticException | NullPointerException exception) { // tratando m�ltiplas exce��es com o pipe |
        	String msg = exception.getMessage(); // pegando a mensagem da exce��o
            System.out.println("Exception " + msg);
            exception.printStackTrace(); // pegando o rastro da nossa exce��o "stacktrace"
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
 //           try { // tratamento da exce��o para evitar que caia na pilha de execu��o 
 //           	int a = i / 0; // for�ando uma exce��o ArithmeticException
 //           } catch (ArithmeticException ex) {
 //           	System.out.println("Exce��o ArithmeticException");
 //           }
            
        }
        System.out.println("Fim do metodo2");        
    }
}
