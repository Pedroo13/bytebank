//gerente é um funcionario ou gerente herda da classe funcionario.
public class Designer extends Funcionario {


	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do designer ");
		return 200;
	}  
}

