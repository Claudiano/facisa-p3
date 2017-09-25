package br.unifacisa.p3;

/**
 * @author Claudiano Sampaio
 * Essa classe generica representa uma estrutura de dados chamada Deck com lista encadeada
 *
 */
public class LinkedDeck<T> {
	
	private No start;
	private No end;
	private int lengthDeck;

	/**
	 * Construtor da classe, iniciando os atributos start e end com o mesmo valor
	 */
	public LinkedDeck() {
		start = new No();
		end = start;
	}

	/**
	 * Esse metodo inserir um item na parte frontal do deck
	 * @param item representa o item que sera inserido no deck
	 */
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

	/**
	 * Esse metodo inserir um item no final do deck
	 * @param item representa o item que sera inserido no deck
	 */
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

	/**
	 * Metodo de remocao do item na parte fontal do deck 
	 * @throws LinkedDeckVoidException excecao lancado caso o deck esteja vazio e
	 * tente ser feito alguma remocao
	 */
	public void removeFront() throws LinkedDeckVoidException {
		if(lengthDeck == 0) {
			throw new LinkedDeckVoidException();
		}
		
		No aux = start;
		start = aux.getNext();
		aux.setNext(null);		
		
		lengthDeck--;
	}

	/**
	 * Metodo de remocao do item no final do deck 
	 * @throws LinkedDeckVoidException excecao lancado caso o deck esteja vazio e
	 * tente ser feito alguma remocao
	 */
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

	/**
	 * @return data do item no inicio do deck
	 */
	public T getStart() {
		return (T) start.getData();
	}

	/**
	 * @return data do item no fim do deck
	 */
	public T getEnd() {
		return (T) end.getData();
	}

	/**
	 * retorna o tamanho de deck
	 * @return lengthDeck
	 */
	public int size() {
		return lengthDeck;
	}

}
