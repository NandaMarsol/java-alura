
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
        try {  // chamando método e fazendo o tratamento
            c.deposita();
        } catch(MinhaExcecao ex) {
            System.out.println("tratamento ....");
        }

	}

}
