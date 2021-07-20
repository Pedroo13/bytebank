
public class TesteFuncionario {
	//metodo
	public static void main(String[] args) {
							  //instanciei um gerente 
		Gerente pedro = new Gerente();
		pedro.setNome("Pedro Eesa");
		pedro.setCpf("12345678-9");
		pedro.setSalario(1800.0);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
		
	}

}
