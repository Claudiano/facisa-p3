package br.edu.unifacisa.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public <T> void inserir1() {
		 
		Stack<String> stack = new Stack<>();
		stack.push("hello");
		assertEquals("hello", stack.top());
	}

}
