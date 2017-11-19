package br.unifacisa.p3.grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private int numeroDeVertices;
	private int[][] matrizAdjacentes;

	public Grafo(int numeroDeVertices) {
		this.numeroDeVertices = numeroDeVertices;
		matrizAdjacentes = new int[this.numeroDeVertices][this.numeroDeVertices];

		for (int i = 0; i < numeroDeVertices; i++) {
			for (int j = 0; j < numeroDeVertices; j++) {
				matrizAdjacentes[i][j] = Integer.MIN_VALUE;
			}
		}

	}

	public void inserirAresta(int origem, int destino, int peso) {
		matrizAdjacentes[origem][destino] = peso;
		matrizAdjacentes[destino][origem] = peso;
	}

	public boolean bfs(int origem, int destino) {

		boolean achou = false;
		boolean visitados[] = new boolean[numeroDeVertices];

		for (int i = 0; i < visitados.length; i++) {
			visitados[i] = false;
		}

		// fila que guarda a ordem de visita
		List<Integer> fila = new ArrayList<Integer>();
		fila.add(origem);
		visitados[origem] = true;

		int atual;
		while (!fila.isEmpty()) {
			atual = fila.get(0);
			fila.remove(0);
			for (int i = 0; i < numeroDeVertices; i++) {
				if (matrizAdjacentes[atual][i] > Integer.MIN_VALUE && !visitados[i]) {
					fila.add(i);
					visitados[i] = true;
					if (destino == i) {
						achou = true;
					}
				}

			}
		}

		return achou;
	}

	public boolean dfs(int atual, int destino) {
		boolean visitados[] = new boolean[numeroDeVertices];

		for (int i = 0; i < visitados.length; i++) {
			visitados[i] = false;
		}
		return dfsAux(atual, destino, visitados);
	}

	private boolean dfsAux(int atual, int destino,boolean [] visitados) {
		if(atual !=  destino){
		for (int i = 0; i < numeroDeVertices; i++) {
			if (matrizAdjacentes[atual][i] > Integer.MIN_VALUE && !visitados[i]) {
				visitados[i] = true;
				return dfsAux(i, destino, visitados);
			}
		}
		} else {
			return true;
		}
		return false;
		
	}
	
	

}
