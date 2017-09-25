package br.unifacisa.p3;

/**
 * @author Claudiano Sampaio
 * Essa classe representa um item inserido no deck, contendo um atributo data
 * representado o valor item e o atributo next que aponta para outro item 
 *
 */

public class No<T> {
	
	private No next;
	private T data;
	
	/**
	 * Construtor vazio de um No
	 */
	public No() {};
	
	/**
	 * Construtor que recebe um item e o coloca em data
	 * @param item o valor que será incorporado ao atributo data
	 */
	public No(T item) {
		data = item;
	}
	
	/**
	 * Metodo para altera o valor do proximo item
	 * @param no e o valor que será incorporado ao atributo next
	 */
	public void setNext(No no) {
		next = no;
	}
	
	/**
	 * Metodo para retorno do proximo item 
	 * @return next
	 */
	public No getNext() {
		return next;
	}
	
	/**
	 * Metodo para obter o valor do item atual
	 * @return data 
	 */
	public T getData() {
		return data;
	}

}
