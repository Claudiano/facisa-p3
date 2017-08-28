package diamante;

public class D implements B, C{
	
	@Override
	public void imcrementar() {
		// TODO Auto-generated method stub
		C.super.imcrementar();
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.imcrementar();
		
	}

}
