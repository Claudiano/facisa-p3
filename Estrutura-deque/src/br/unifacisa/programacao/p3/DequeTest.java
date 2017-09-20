package br.unifacisa.programacao.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeTest {

	@Test
	public void insertFront1() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertFront(123);
		assertEquals(123, deck.front());
		
	}
	
	@Test
	public void insertFront2() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.insertFront(2);
		deck.insertFront("arroz");
		assertEquals("arroz", deck.front());
	}
	@Test
	public void insertFront3() throws DeckFullException {
		Deck <Integer> deck= new Deck<>(3);
		deck.insertFront(1);
		deck.insertFront(2);
		assertEquals((Integer)2, deck.front());
	}
	
	@Test(expected=DeckFullException.class)
	public void insertFront4() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.insertFront(2);
		deck.insertFront("arroz");
		deck.insertFront(13456);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void insertFront5() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.insertFront(null);
		
	}
	
	@Test
	public void insertBack1() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertBack(123);
		assertEquals(123, deck.front());
		
	}
	
	@Test
	public void insertBack2() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertBack(1);
		deck.insertBack(2);
		deck.insertBack("arroz");
		assertEquals("arroz", deck.back());
	}
	@Test
	public void insertBackt3() throws DeckFullException {
		Deck <Integer> deck= new Deck(3);
		deck.insertBack(1);
		deck.insertBack(2);
		assertEquals((Integer)2, deck.back());
	}
	
	@Test(expected=DeckFullException.class)
	public void insertBack4() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertBack(1);
		deck.insertBack(2);
		deck.insertBack("arroz");
		deck.insertBack(13456);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void insertBack5() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertBack(1);
		deck.insertBack(null);
	}
	
	
	@Test
	public void removeFront1() throws DeckFullException, DequeVoidException{
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.insertFront(2);
		deck.insertFront("arroz");
		deck.removeFront();
		assertEquals(2, deck.front());
	}
	
	@Test
	public void removeFront2() throws DeckFullException, DequeVoidException{
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.removeFront();
		assertEquals(null, deck.front());
	}
	
	@Test(expected = DequeVoidException.class)
	public void removeFront3() throws DeckFullException, DequeVoidException{
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.removeFront();
		deck.removeFront();
	}
	
	@Test
	public void size1() throws DeckFullException {
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.insertBack(5);
		deck.insertFront(3);
		assertEquals(3, deck.size());
	}
	
	@Test
	public void size2(){
		Deck deck = new Deck(3);
		assertEquals(0, deck.size());
	}
	
	@Test
	public void size11() throws DeckFullException, DequeVoidException {
		Deck deck = new Deck(3);
		deck.insertFront(1);
		deck.insertBack(5);
		deck.insertFront(3);
		deck.removeFront();
		deck.removeBack();
		assertEquals(1, deck.size());
	}
	
	

}
