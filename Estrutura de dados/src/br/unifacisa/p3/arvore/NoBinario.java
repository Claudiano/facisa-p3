package br.unifacisa.p3.arvore;

/**
 * @author klaupacius
 *
 */
public class NoBinario {
	
	private int dado;
	private NoBinario esq = null;
	private NoBinario dir = null;
	
	public NoBinario(int valor) {
		this.dado = valor;
	}
	
	public NoBinario getEsq(){
		return this.esq;
	}
	
	public NoBinario getDir(){
		return this.dir;
	}
	
	public int getDado(){
		return dado;
	}
	
	public void setEsq(int item){
		esq = new NoBinario(item);
	}
	
	public void setDir(int item){
		dir = new NoBinario(item);
	}

}
