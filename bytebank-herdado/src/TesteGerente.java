
public class TesteGerente {

	public static void main(String[] args) {
		//usando o construtor padrao criou a referencia 
		Gerente pablo = new Gerente();
		
		pablo.setNome("Pablo Picasso");
		pablo.setCpf("12345678-9");
		pablo.setSalario(3000.0);
		
		System.out.println(pablo.getNome());
		System.out.println(pablo.getCpf());
		System.out.println(pablo.getSalario());
		
		pablo.setSenha(2222);
		boolean autenticou = pablo.autentica(2222);
		System.out.println(autenticou);
		System.out.println(pablo.getBonificacao());
		//classe 			   //filho
		Funcionario bruno = new Designer();
		bruno.setSalario(200);
		System.out.println(bruno.getBonificacao());

		
	}

}
