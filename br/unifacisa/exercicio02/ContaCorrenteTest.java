package br.unifacisa.exercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

import br.unifacisa.exercicio01.ContaCorrente;
import br.unifacisa.exercicio01.LimiteAlcancadoException;
import br.unifacisa.exercicio01.SaldoInsuficienteException;

public class ContaCorrenteTest {

	@Test(expected = SaldoInsuficienteException.class)
	public void sacar1() throws LimiteAlcancadoException, SaldoInsuficienteException {
		//sacar sem saldo
		ContaCorrente conta = new ContaCorrente();
		conta.sacar(100);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void depositar1(){
		//depositar valor negativo ou não valido
		ContaCorrente conta = new ContaCorrente();
		conta.depositar(-100);
	}
	
	@Test
	public void depositar2(){
		//depositar valor válido
		ContaCorrente conta = new ContaCorrente();
		conta.depositar(1000);
		assertEquals(1000, conta.getSaldo(), 0.1);
	}
	
	@Test(expected = LimiteAlcancadoException.class)
	public void sacar2() throws LimiteAlcancadoException, SaldoInsuficienteException{
		//sacar valor acima do limite
		ContaCorrente conta = new ContaCorrente();
		conta.depositar(2000);
		conta.sacar(2000);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setValorLimite(){
		//valor limite negativo ou zero
		ContaCorrente conta = new ContaCorrente();
		conta.setValorLimite(-100);
	}
	
	@Test
	public void setValorlimite(){
		//valor limite válido
		ContaCorrente conta = new ContaCorrente();
		conta.setValorLimite(1000);
	}

}
