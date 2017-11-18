package br.edu.unifacisa.p3;

public class Stack <T>{
	
	private int tamanho;
	public static final int ALOCACAO = 3;
	private T vetor[];
	
	public Stack(){
		this.vetor = (T[])new Object[ALOCACAO];
	}
	
	public void push(T item){
		if(vetor.length == tamanho){
			T novoVetor[] = (T[]) new Object [vetor.length + ALOCACAO];
			for(int i = 1; i < vetor.length; i++){
				novoVetor[i] = vetor[i];
			}
			vetor = novoVetor;
		}
		vetor[tamanho] = item;	
		tamanho++;
	}
	
	public T top() {
		T item = null;
		if(!isEmpty()){
			item = vetor[tamanho - 1];
		}
		return item;
	}
	
	private boolean isEmpty() {
		return tamanho == 0;
	}

	public T pop(){
		T item = null;
		if(!isEmpty()){
			item = vetor[tamanho - 1];
			vetor[tamanho - 1] = null;
			tamanho--;
		}
		return item;
	}
	
	public int size(){
		return tamanho;
	}
	
}
