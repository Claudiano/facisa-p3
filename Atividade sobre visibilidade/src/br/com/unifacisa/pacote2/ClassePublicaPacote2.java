package br.com.unifacisa.pacote2;

import br.com.unifacisa.pacote1.ClassePublicaPacote1;

public class ClassePublicaPacote2 {
	
	public ClassePublicaPacote2() {
		
		//ClasseDefaultPacote1 a = new ClasseDefaultPacote1(); // a classe só pode ser usada neste pacote
		ClassePublicaPacote1 b = new ClassePublicaPacote1();
		ClasseDefaultPacote2 c = new ClasseDefaultPacote2(); 
		ClassePublicaPacote2 d = new ClassePublicaPacote2();
		
		
		// b.metodoDefault();   //chamada de metodo só permitido no pacote
		// b.metodoProtegido(); //chamada de metodo só permitido no pacote e heranca
		// b.metodoPrivado(); //chamada de metodo só pode ser acessado na classe
		b.metodoPublico();

		c.metodoDefault(); 
		c.metodoProtegido();
		// c.metodoPrivado(); //chamada de metodo só permitido na classe
		c.metodoPublico();

		d.metodoDefault(); 
		d.metodoProtegido();
		d.metodoPrivado();
		d.metodoPublico();

	}
	
	
	//metodos da classe
	public void metodoPublico() {
	}

	private void metodoPrivado() {
	}

	void metodoDefault() {
	}

	protected void metodoProtegido() {
	}



}
