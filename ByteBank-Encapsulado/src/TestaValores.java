
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		             //metodo
		conta.setAgencia(12333);
		Conta conta1 = new Conta(1337, 242334);
		
		//metodo estatico
		System.out.println("total é " + Conta.getTotal());

	}

}
