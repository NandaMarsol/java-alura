
public abstract interface Autenticavel{
	
	
	public abstract void setSenha(int senha);
	
	
	public abstract boolean autentica(int senha);
}

// contrato Autenticavel, quem assina esse contrato precisa implementar:
// m�todo setSenha e m�todo autentica

// interfaces n�o tem atributos e nem implementa��o de m�todos