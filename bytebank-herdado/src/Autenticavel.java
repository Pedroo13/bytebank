//contrato autenticavel 
//quem assina esse conatrato precisa implementar 
//metodo setsenha
//metodo autentica
public abstract interface Autenticavel {


	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
