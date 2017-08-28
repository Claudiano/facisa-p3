package br.com.unifacisa.pacote1;

import br.com.unifacisa.pacote2.ClassePublicaPacote2;

class ClasseDefaultPacote1 {

	public ClasseDefaultPacote1() {
		
		ClasseDefaultPacote1 a = new ClasseDefaultPacote1();
		ClassePublicaPacote1 b = new ClassePublicaPacote1();
		// ClasseDefaultPacote2 c = new ClasseDefaultPacote2(); // a classe só pode ser usada no pacote
		ClassePublicaPacote2 d = new ClassePublicaPacote2();

		a.metodoDefault();
		a.metodoProtegido();
		a.metodoPrivado();
		a.metodoPublico();

		b.metodoDefault();
		b.metodoProtegido();
		// b.metodoPrivado(); //chamada de metodo só permitido na classe
		b.metodoPublico();

		// d.metodoDefault(); //chamada de metodo só permitido no pacote
		// d.metodoProtegido(); //chamada de metodo só permitido no pacote ou
		// herança
		// d.metodoPrivado(); //chamada de metodo só permitido dentro da classe
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
