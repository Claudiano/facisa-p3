package br.unifacisa.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedDeckTest {

	@Test
	public void insertFront1() {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertFront(123);
		assertEquals(123, deck.getStart());
	}
	
	@Test
	public void insertFront2() {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertFront(123);
		deck.insertFront(1);
		assertEquals(1, deck.getStart());
	}
	
	@Test
	public void insertFront3() {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertFront(123);
		deck.insertFront(2);
		deck.insertFront(1);
		assertEquals(1, deck.getStart());
	}
	
	@Test
	public void insertBack1() {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertBack(123);
		assertEquals(123, deck.getEnd());
	}
	
	@Test
	public void insertBack2() {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertBack(123);
		deck.insertBack("olho");
		assertEquals("olho", deck.getEnd());
	}
	
	@Test
	public void insertBack3() {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertBack(123);
		deck.insertFront("teste");
		assertEquals(123, deck.getEnd());
	}
	
	@Test
	public void removeFront1() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertFront(1);
		deck.removeFront();
		assertEquals(0, deck.size());		
	}
	
	@Test
	public void removeFront2() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertBack("test");
		deck.insertFront(0102);
		deck.removeFront();
		assertEquals("test", deck.getStart());
	}
	
	@Test
	public void removeFront3() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertBack("test");
		deck.insertFront(0102);
		deck.removeFront();
		deck.removeFront();
		assertEquals(0, deck.size());
	}
	
	@Test(expected=LinkedDeckVoidException.class)
	public void removeFront4() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.removeFront();
	}
		
	@Test(expected=LinkedDeckVoidException.class)
	public void removeFront5() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertFront(123);
		deck.removeFront();
		deck.removeBack();
	}
	
	@Test(expected=LinkedDeckVoidException.class)
	public void removeBack1() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.removeBack();
	}
	
	public void removeBack2() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertFront(123);
		deck.removeBack();
		assertEquals(0, deck.size());
	}
		
	public void removeBack3() throws LinkedDeckVoidException {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertBack(1234);
		deck.insertFront("Test");
		deck.insertBack("11010");
		deck.removeBack();
		assertEquals(1234, deck.getEnd());
	}
	
	
	@Test
	public void size1() {
		LinkedDeck deck = new LinkedDeck<>();
		deck.insertFront(123);
		deck.insertFront(2);
		deck.insertFront(1);
		assertEquals(3, deck.size());
	}
	
	@Test
	public void size2() {
		LinkedDeck deck = new LinkedDeck<>();
		assertEquals(0, deck.size());
	}

}
