package br.unifacisa.p3;

public class No<T> {
	
	private No next;
	private T data;
	
	public No() {};
	
	public No(T item) {
		data = item;
	}
	
	public void setNext(No no) {
		next = no;
	}
	
	public No getNext() {
		return next;
	}
	
	public T getData() {
		return data;
	}

}
