public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226); //parametro que eu passei 	
		// conta.numero = 1777;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente Paulo = new Cliente();
		//conta.titular = paulo;
		Paulo.setNome("Paulo Silveira");
		conta.setTitular(Paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());

	}
}
