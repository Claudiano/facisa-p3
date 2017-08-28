package diamante;

public interface C extends A{
	default void imcrementar(){
		System.out.println("Esso metodo imcrementa mais 10");
	}
}
