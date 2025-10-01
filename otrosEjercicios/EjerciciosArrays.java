package otrosEjercicios;

import java.util.Arrays;

public class EjerciciosArrays {

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
		float promedio = EjerciciosArrays.devolverPromedio(array);
		System.out.println("el promedio de los nºs del 0 al 10 es: "+promedio);
		
		float[][] matrix = {
				{1f, 3f, 5f},
				{7f, 4f, 8f},
				{9f, 2f, 1f}
		};
		float[] valoresMaxFila = EjerciciosArrays.matrizArray(matrix);
		System.out.println(Arrays.toString(valoresMaxFila));
		
		int[] array300 = new int[300];
		for(int i = 0, j = 0; i<array300.length; i++) {
			array300[i]=j++;
			if(j>=16) {j=0;}
		}
		System.out.println(Arrays.toString(array300));
			
		int[] arrayNuevo300 = new int[300];
		char[] arrayChar = {'A', 'B', 'C', 'D', 'E', 'F'};
		for(int i = 0, j = 0, k = 0; i<arrayNuevo300.length; i++) {
			if(j<10) {
				arrayNuevo300[i]=j;
			}
			if(j>=10 && j<15) {
				arrayNuevo300[i]=arrayChar[k++];
			}
			j++;
			if(k==5) {k=0;}
			if(j==15) {j=0;}
		}
		System.out.println(Arrays.toString(arrayNuevo300));
		//el código funciona bien, por pantalla se imprimen los números correspondientes
		//a las letras A,B,C,D,E,F según el código ASCII (xq estamos aplicando el método
		//toString a un array q tiene enteros y caracteres!!!
	}

}
