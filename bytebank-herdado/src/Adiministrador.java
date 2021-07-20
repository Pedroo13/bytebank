public class Adiministrador extends Funcionario implements Autenticavel {
	private int senha;

	private AutenticacaoUtil autenticador;

	public Adiministrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	// forma de garantir que você está sobrescrevendo um método e não criando um
	// novo.
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}