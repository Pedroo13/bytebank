
public class TesteRefencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
	
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
