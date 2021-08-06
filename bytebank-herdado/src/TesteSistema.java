
public class TesteSistema {

	public static void main(String[] args) {
		Gerente ge = new Gerente();
		ge.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(ge);

	}

}
