package tiposDeDatosYsentenciasDeControl;
import java.util.Scanner;

public class Ejercicio8 {
	
	/*
	 * Solicite al usuario dos vectores tridimensionales e imprima su producto escalar
	 */
	
	public static void main(String[] args) {
		int[] v1 = new int[3];
		int[] v2 = new int[3];
		
		System.out.println("escribe 2 vectores tridimensionales, seis enteros espaciados sin signos de puntuación");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
				v1[i] = sc.nextInt();	
		}
		
		for(int i = 0; i<3; i++) {
			v2[i] = sc.nextInt();	
	}
		
		int productoEscalar = v1[0]*v2[0]+v1[1]*v2[1]+v1[2]*v2[2];
		
		System.out.println("el producto escalar de los dos vectores es: "+productoEscalar);
		
		sc.close();
		
	}

}
