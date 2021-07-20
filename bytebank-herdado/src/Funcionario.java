     //palavra chave
 	//não é concreto para cria o objeto ele precisa ser concreto 
	//não pode instanciaar dessa classe, pq é abstrata
public abstract class Funcionario {
	
	//atributos 
	private String nome;
	private String cpf;
	private double salario;//protected publico para os filhos e somente eles esta entre o privador e o publico
	
	//construtor vazio
	//não é obrigatorio pq se vc não inserir um construtor o proprio
	//compilador insere 
	public Funcionario() {
		
	}
	
	//ascessa o salario atraves do this ele é a referencia//outra coisa isso aqui
	//metodo sem corpo não ha implementação 
	public abstract double getBonificacao();
	
	//get  pega informacao busca 		
	public String getNome() {//no get o void anula a informacao que ele dara 
		return nome;
	}
	// = receber//set defini 
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
