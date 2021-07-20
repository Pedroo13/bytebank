
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contadoPaulo = new Conta();
		contadoPaulo.saldo = 100;
		contadoPaulo.deposita(50);
		System.out.println(contadoPaulo.saldo);
		
		boolean conseguiuRetirar = contadoPaulo.saca(160);
		System.out.println(contadoPaulo.saldo);

		System.out.println(conseguiuRetirar);
		
		Conta contadaMarela = new Conta();
		contadaMarela.deposita(1000);
		boolean sucessoTransferencia = contadaMarela.transfere(300, contadoPaulo);
		
		if(contadaMarela.transfere(300, contadoPaulo)) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Falta de dinheiro");
		}
		System.out.println(contadaMarela.saldo);
		System.out.println(contadoPaulo.saldo);

		
	
	}
}
