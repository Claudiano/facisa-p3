package br.unifacisa.p3;

import sun.security.util.Length;

public class LinkedDeck<T> {

	private No start;
	private No end;
	private int lengthDeck;

	public LinkedDeck() {
		start = new No();
		end = start;
	}

	public void insertFront(T item) {
		if(lengthDeck == 0) {
			start = new No(item);
			end = start;
		} else {
			No aux = start;
			start = new No(item);
			start.setNext(aux);
		}
		lengthDeck++;
	}

	public void insertBack(T item) {
		if(lengthDeck == 0) {
			start = new No(item);
			end = start;
		}else {
			No aux = end;
			end = new No(item);
			aux.setNext(end);
		}
		lengthDeck++;
	}

	public void removeFront() throws LinkedDeckVoidException {
		if(lengthDeck == 0) {
			throw new LinkedDeckVoidException();
		}
		
		No aux = start;
		start = aux.getNext();
		aux.setNext(null);		
		
		lengthDeck--;
	}

	public void removeBack() throws LinkedDeckVoidException {
		if(lengthDeck == 0) {
			throw new LinkedDeckVoidException();
		}
		
		No aux = start;
		for (int i = 0; i < lengthDeck - 1; i++) {
			aux = aux.getNext();
		}
		end = aux;
		end.setNext(null);
		lengthDeck--;

	}

	public T getStart() {
		return (T) start.getData();
	}

	public T getEnd() {
		return (T) end.getData();
	}

	public int size() {
		return lengthDeck;
	}

}
