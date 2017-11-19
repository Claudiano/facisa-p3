package br.unifacisa.p3.grafo;

public class AppGrafo {

	public static void main(String[] args) {
		Grafo grafo = new Grafo(8);
		
		grafo.inserirAresta(0, 1, 5);
		grafo.inserirAresta(0, 2, 5);
		grafo.inserirAresta(1, 3, 6);
		grafo.inserirAresta(1, 4, 4);
		grafo.inserirAresta(2, 5, 2);
		grafo.inserirAresta(6, 7, 5);
		
		System.out.println(grafo.bfs(0, 5));
		System.out.println(grafo.dfs(0, 5));
		System.out.println(grafo.bfs(0, 7));
		System.out.println(grafo.dfs(0, 7));
	}

}
