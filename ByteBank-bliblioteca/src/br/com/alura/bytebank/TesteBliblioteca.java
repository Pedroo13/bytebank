package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBliblioteca {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 456);	
		c.deposita(1010);
		System.out.println(c.getSaldo());
	}

}
