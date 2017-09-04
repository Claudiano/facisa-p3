package br.unifacisa.exercicio04;

public class Utils {
	
	public static double toCelsius(double temperatura) throws FahrenheitException{
		double temperaturaConvetida = 0.0;
		if(temperatura < -459.67){
			throw new FahrenheitException();
		}
		temperaturaConvetida = (5*(temperatura - 32)) / 9;
		return temperaturaConvetida;
	}

}
