
public class Teste {

	public static void main(String[] args) {
		FuncionarioTeste patrick = new FuncionarioTeste();
		patrick.setSalario(3000.0);
		System.out.println(patrick.getTipo());
		System.out.println(patrick.getBonificacao());
		
		FuncionarioTeste bruna = new FuncionarioTeste();
		bruna.setTipo(1);
		bruna.setSalario(3000.0);
		System.out.println(bruna.getTipo());
		System.out.println(bruna.getBonificacao());
		
		FuncionarioTeste henrique = new FuncionarioTeste();
		henrique.setTipo(2);
		henrique.setSalario(3000.0);
		System.out.println(henrique.getTipo());
		System.out.println(henrique.getBonificacao());
		
		
		

		

	}

}
