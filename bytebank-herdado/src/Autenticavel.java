
public abstract interface Autenticavel{
	
	
	public abstract void setSenha(int senha);
	
	
	public abstract boolean autentica(int senha);
}

// contrato Autenticavel, quem assina esse contrato precisa implementar:
// método setSenha e método autentica

// interfaces não tem atributos e nem implementação de métodos