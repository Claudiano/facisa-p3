package br.unifacisa.exercicio03;

public class CaixaApp {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();

		// iniciar o valor limite de saque com valor negativo
		try {
			conta.setValorLimite(-1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// iniciar o valor do limite de saque
		try {
			conta.setValorLimite(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// sacar valor de saldo zerado
		try {
			conta.sacar(500);
			System.out.println("Saque feito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// setar saldo negativo ou zero
		try {
			conta.depositar(-10000);
			System.out.println("Deposito feito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// setar valor do saldo
		try {
			conta.depositar(100);
			System.out.println("Deposito feito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// sacar valor acima do limite
		try {
			conta.sacar(1001);
			System.out.println("Saque feito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// sacar valor acima do saldo
		try {
			conta.sacar(101);
			System.out.println("Saque feito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// sacar valor
		try {
			conta.sacar(100);
			System.out.println("Saque feito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
