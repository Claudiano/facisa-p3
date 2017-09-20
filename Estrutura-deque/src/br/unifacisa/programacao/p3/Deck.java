package br.unifacisa.programacao.p3;

/**
 * @author Claudiano Sampaio
 * Está classe representa o comportamento de uma estrutura de dados chamado deque
 * @param <T>
 */
public class Deck<T> {
	
	private int posicao = 0;
	private T[] array;
	
	public Deck(int tamanho){
		this.array =  (T[]) new Object[tamanho];
	}
	
	/**
	 * @param item
	 * @throws DeckFullException
	 */
	public void insertFront(T item) throws DeckFullException{
		if(array.length == posicao){
			throw new DeckFullException();
		}
		
		if(item == null){
			throw new IllegalArgumentException();
		}
		
		for(int i = posicao - 1;  i > 0; i--){
			array[i] = array[i - 1];
		}
		array[0] = item;
		posicao++;
	}
	

	
	/**
	 * @param item
	 * @throws DeckFullException
	 */
	public void insertBack(T item) throws DeckFullException {
		if(array.length == posicao){
			throw new DeckFullException();
		}
		
		if(item == null){
			throw new IllegalArgumentException();
		}
		
		array[posicao] = item;
		posicao++;
		
	}
	
	/**
	 * @throws DequeVoidException
	 */
	public void removeFront() throws DequeVoidException{
		if(posicao == 0){
			throw new DequeVoidException();
		}
		for(int i = 0; i < posicao - 2; i++){
			array[i] = array[i + 1];
		}
		array[posicao - 1] = null;
		posicao--;
		
	}
	
	/**
	 * @throws DequeVoidException
	 */
	public void removeBack() throws DequeVoidException{
		if(posicao == 0){
			throw new DequeVoidException();
		}
		
		array[posicao - 1] = null;
		posicao--;
	}
	
	/**
	 * @return array[0]
	 */
	public T front(){
		return array[0];
	}
	
	/**
	 * @return 
	 */
	public T back(){
		return posicao > 0 ? array[posicao - 1] : array[posicao];
	}
	/**
	 * @return
	 */
	public int size(){
		return posicao;
	}
	

}
