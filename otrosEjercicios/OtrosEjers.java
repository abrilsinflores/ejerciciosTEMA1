package otrosEjercicios;

import java.util.Arrays;

public class OtrosEjers {

	public static float devolverPromedio(float[] array) {
		float promedio = 0;
		for(int i = 0; i<array.length; i++) {
			promedio += array[i];
		}
		
		return (promedio/array.length);
	}
	
	public static float[] matrizArray(float[][] matriz) {
		float[] valoresMaxFila = new float [matriz.length];
		for(int i = 0; i<matriz.length; i++) {
			float valorMax = Float.MIN_VALUE;
			for(int j = 0; j<matriz[i].length; j++) {
				if(valorMax<matriz[i][j]) {
					valorMax=matriz[i][j];
				}
				valoresMaxFila[i]=valorMax;
			}
		}
		return valoresMaxFila;
	}
	
	
	public static void main(String[] args) {
		
		float[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		float promedio = OtrosEjers.devolverPromedio(array);
		System.out.println("el promedio de los nºs del 0 al 10 es: "+promedio);
		
		float[][] matrix = {
				{1f, 3f, 5f},
				{7f, 4f, 8f},
				{9f, 2f, 1f}
		};
		float[] valoresMaxFila = OtrosEjers.matrizArray(matrix);
		System.out.println(Arrays.toString(valoresMaxFila));
		
			
	}

}
