package br.unifacisa.p3.grafo;

public class Vertice {

	private int dado;
	private int peso;
	
	public Vertice(int aresta, int peso){
		dado = aresta;
		this.peso = peso;
	}
	
	public int getDado() {
		return dado;
	}
	public int getPeso() {
		return peso;
	}
	
}
