package br.unifacisa.p3.arvore;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArvoreBinariaTest {

	@Test
	public void inserirArvore1() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserirItem(45);
		arvore.inserirItem(25);
		assertEquals(true, arvore.hasItem(25));
	}
	
	@Test
	public void inserirArvore2() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserirItem(25);
		assertEquals(true, arvore.hasItem(25));
	}

	@Test
	public void inserirArvore3() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserirItem(45);
		arvore.inserirItem(25);
		arvore.inserirItem(89);
		assertEquals(true, arvore.hasItem(89));

	}
	
}
