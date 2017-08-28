package br.com.unifacisa;

public class ExemploSingleton {
	
	private static ExemploSingleton instancia;
	
	private ExemploSingleton(){
	}
	
	public static synchronized ExemploSingleton getInstance(){
		if(instancia == null){
			instancia = new ExemploSingleton();
		}
		return instancia;
	}

}
