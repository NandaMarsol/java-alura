
public class TesteReferencias {public static void main(String[] args) {
	
	// classe que instancia funcionários diferentes, registra suas bonificações e visualiza sua soma
	Gerente g1 = new Gerente(); // criando objeto
	g1.setNome("Jared");
	g1.setSalario(5000.0);
	
	EditorVideo ev = new EditorVideo();
	ev.setNome("Luck");
	ev.setSalario(2500.0);
	
	Designer d = new Designer();
	d.setNome("Laskito");
	d.setSalario(2000.0);
	
	ControleBonificacao controle = new ControleBonificacao();
	controle.registra(g1);
	controle.registra(ev);
	controle.registra(d);
	
	System.out.println(controle.getSoma());
}
	
	

}
