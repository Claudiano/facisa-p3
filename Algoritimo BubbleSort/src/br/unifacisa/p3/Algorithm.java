package br.unifacisa.p3;

public class Algorithm <T>{

	public static void bubbleSort(int[] array){
		int i = 0;
		boolean haTrocas = true;
		int tamanhoArray = array.length;
		while(haTrocas && i < tamanhoArray){
			haTrocas = false;
			for(int j = 0; j < tamanhoArray -1 -i; j++){
				if(array[j] > array[j + 1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					haTrocas = true;
				} 
			}
			i++;
		}
		
	}
	
	public static void bubbleSort(double[] array){
		int i = 0;
		boolean haTrocas = true;
		int tamanhoArray = array.length;
		while(haTrocas && i < tamanhoArray){
			haTrocas = false;
			for(int j = 0; j < tamanhoArray -1 -i; j++){
				if(array[j] > array[j + 1]){
					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					haTrocas = true;
				} 
			}
			i++;
		}
		
	}
	
	public static void bubbleSort(char[] array){
		int i = 0;
		boolean haTrocas = true;
		int tamanhoArray = array.length;
		while(haTrocas && i < tamanhoArray){
			haTrocas = false;
			for(int j = 0; j < tamanhoArray -1 -i; j++){
				if(array[j] > array[j + 1]){
					char temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					haTrocas = true;
				}			}
			i++;
		}
		
	}
	
	public static void bubbleSort(String[] array){
		int i = 0;
		boolean haTrocas = true;
		int tamanhoArray = array.length;
		while(haTrocas && i < tamanhoArray){
			haTrocas = false;
			for(int j = 0; j < tamanhoArray -1 -i; j++){
				if(array[j].length() > array[j + 1].length()){
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					haTrocas = true;
				}
			}
			i++;
		}
		
	}
	
}
