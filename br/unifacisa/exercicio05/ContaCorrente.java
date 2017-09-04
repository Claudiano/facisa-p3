package br.unifacisa.exercicio05;

public class ContaCorrente {

	private double valorLimite;
	private double limite = 1000.0;
	private double saldo;

	public void sacar(double valor) throws Exception {
		
		if(valor > limite){
			throw new LimiteAlcancadoException("Valor maior que o limite");
		} else if (valor <= this.saldo) {
				this.saldo -= valor;
		} else if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente para a operação, seu saldo atual é: " + this.saldo);
		} else if (valor <= 0) {
			throw new Exception("valor invalido");
		}
	}

	public void depositar(double valor) throws Exception {
		if (0 < valor) {
			this.saldo += valor;
		} else if(valor <= 0){
			throw new Exception("valor invalido");
		}
	}

	public void setValorLimite(double valor) throws Exception{
		if(0 < valor){
			this.valorLimite = valor;
		} else if(valor <= 0){
			throw new Exception("valor invalido");
		}
		
	}

	public double getSaldo() {
		return this.saldo;
	}

}
