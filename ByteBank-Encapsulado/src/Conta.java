public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; //associar duas classes
	private static int total;
	
	
	//construtor para inicializar para criar o objeto
	 public Conta( int agencia, int numero) { 
		 	Conta.total++;
		 	System.out.println("o total de contas é " + Conta.total);
	        this.agencia = agencia;
	        this.numero = numero;
	        System.out.println("estou criando uma conta" + this.numero);
	    }
// metodo do tipo double 
	 // não retorna informação void
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
//metodo
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
//metodo
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return; 
			}
		this.numero = numero;
	}
// pega informaçao  ascessar os atributos
	public int getAgencia() {
		return this.agencia;
	}
	//seta informaçoes 
	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
//metodo da classe	     //palavra chave
	public static int getTotal() {
		return total;
	}
}