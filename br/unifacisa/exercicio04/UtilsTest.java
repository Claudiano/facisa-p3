package br.unifacisa.exercicio04;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

	@Test(expected = FahrenheitException.class)
	public void converter1() throws FahrenheitException {
		//teste com temperatura abaixo do zero absoluto
		double temperatura = Utils.toCelsius(-459.68);
	}
	
	@Test
	public void converter2() throws FahrenheitException{
		//teste valido de conversão
		double temperatura = Utils.toCelsius(32);
		assertEquals(0, temperatura, 0.001);
	}

}
