package diamante;

public interface B extends A{
	
	default void imcrementar(){
		System.out.println("Esso metodo imcrementa mais 1");
	}
	

}
