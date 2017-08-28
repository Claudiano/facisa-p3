package br.com.unifacisa.pacote2;


import br.com.unifacisa.pacote1.ClassePublicaPacote1;

class ClasseDefaultPacote2 {
	
	
	
	public ClasseDefaultPacote2() {
		
		//ClasseDefaultPacote1 a = new ClasseDefaultPacote1(); // a classe só pode ser usada no mesmo pacote
		ClassePublicaPacote1 b = new ClassePublicaPacote1();
		ClasseDefaultPacote2 c = new ClasseDefaultPacote2(); 
		ClassePublicaPacote2 d = new ClassePublicaPacote2();

		//b.metodoDefault();  //chamada de metodo só permitido no pacote
		//b.metodoProtegido(); //chamada de metodo só permitido no pacote e heranca
		// b.metodoPrivado(); //chamada de metodo só pode ser acessado na classe
		b.metodoPublico();

		c.metodoDefault(); 
		c.metodoProtegido();
		c.metodoPrivado();
		c.metodoPublico(); 
		
		d.metodoDefault(); 
		d.metodoProtegido();
		//d.metodoPrivado(); //chamada de metodo só permitido dentro da classe
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
