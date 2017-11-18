package br.unifacisa.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmTest {

	@Test
	public void testeBubbleSort1() {
		int[] array = {2, 5, 4, 1};
		Algorithm.bubbleSort(array);
		assertEquals(1, array[0]);
	}

	@Test
	public void testeBubbleSort2() {
		char[] array = {'3','2', '5', '4', '#'};
		Algorithm.bubbleSort(array);
		assertEquals('#', array[0]);
	}
	
		
	@Test
	public void testeBubbleSort3() {
		double[] array = {2.0, 5, 4, 1.111111111, 1.111111111110};
		Algorithm.bubbleSort(array);
		assertEquals(1.111111111, array[0], 0);
	}
	
	@Test
	public void testeBubbleSort4() {
		String[] array = {"carlos", "jose", "antonio", "twoberto"};
		Algorithm.bubbleSort(array);
		assertEquals("jose", array[0]);
	}


}
