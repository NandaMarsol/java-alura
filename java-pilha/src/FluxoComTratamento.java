// Classe para demonstrar o lançamento de exceções no método2() e atribuir uma mensagem à ela; 

public class FluxoComTratamento {

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
        //Exemplo sem guardar a exceção em uma referência, pode lançá-la diretamente em uma linha só:
        throw new ArithmeticException("Deu um erro :("); // pode enviar uma mensagem por parâmetro para o construtor da exceção
        
//        ArithmeticException exception = new ArithmeticException(); // instanciando uma ArithmeticException
//        throw exception; // lançando uma exceção     
    }
}
