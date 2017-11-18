package br.unifacisa.p3.arvore;

public class ArvoreBinaria {

	private NoBinario raiz;

	/**
	 * Metodo que insere item na arvore
	 * 
	 * @param item corresponde ao item que será inserido na arvore
	 */
	public void inserirItem(int item) {
		if (raiz == null) {
			raiz = new NoBinario(item);
		} else {
			inserirItem(raiz, item);
		}
	}

	/**
	 * Metodo interno que insere um item de forma recursiva na arvore
	 * 
	 * @param no
	 *            é o no onde se encontra no momento
	 * @param item
	 *            corresponde ao item que será inserido na arvore
	 */
	public void inserirItem(NoBinario no, int item) {

		if (no.getDado() > item) {
			if(no.getEsq() == null){
				no.setEsq(item);
			} else {
				inserirItem(no.getEsq(), item);
			}
		} else if (no.getDado() < item) {
			if(no.getDir() == null){
				no.setDir(item);
			} else {
				inserirItem(no.getDir(), item);
			}
		}

	}

	/**
	 * Metodo que avalia se existe o item desejado na arvore
	 * 
	 * @param item
	 *            representa o item que que esta se procurado
	 * @return valor booleano com a resposta com a proposta descrita acima
	 */
	public boolean hasItem(int item) {
		if (raiz.getDado() == item) {
			return true;
		}
		return hasItem(raiz, item);
	}

	/**
	 * Metodo interno que auxilia na procura por determinado item
	 * 
	 * @param no
	 *            representa o no que se encontra no momento
	 * @param item
	 *            representa o item a ser pesquisado
	 * @return valor booleano se o item existe na arvore
	 */
	public boolean hasItem(NoBinario no, int item) {

		if (no == null) {
			return false;
		} else if (no.getDado() == item) {
			return true;
		} else if (no.getDado() < item) {
			return hasItem(no.getDir(), item);
		} else {
			return hasItem(no.getEsq(), item);
		}

	}

	public void removerItem(int item) {
		if (raiz == null) {
			throw new IllegalArgumentException();
		}
		if (raiz.getDado() == item) {
			// remove item
			NoBinario noAux = raiz.getDir();

		} else if (raiz.getDado() < item) {
			removerItem(raiz.getEsq(), item);
		} else {
			removerItem(raiz.getDir(), item);
		}
	}

	public void removerItem(NoBinario esq, int item) {
		// TODO Auto-generated method stub

	}

}
