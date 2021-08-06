// Classe para demonstrar o lan�amento de exce��es no m�todo2() e atribuir uma mensagem � ela; 

public class FluxoComTratamento {

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
        //Exemplo sem guardar a exce��o em uma refer�ncia, pode lan��-la diretamente em uma linha s�:
        throw new ArithmeticException("Deu um erro :("); // pode enviar uma mensagem por par�metro para o construtor da exce��o
        
//        ArithmeticException exception = new ArithmeticException(); // instanciando uma ArithmeticException
//        throw exception; // lan�ando uma exce��o     
    }
}
