package tiposDeDatosYsentenciasDeControl;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 *  Calcule el mínimo y el máximo de una serie de números enteros positivos 
	 *  introducidos por el usuario. Cuando el usuario introduzca un número 
	 *  negativo se considerará que el anterior a este es el último número.
	 */
	public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in); //objeto sc guarda lo q ponga el usuario en la terminal

	        int numero;
	        int min = Integer.MAX_VALUE; // valor inicial muy grande
	        int max = Integer.MIN_VALUE; // valor inicial muy pequeño

	        System.out.println("Introduce números enteros positivos (un número negativo para terminar):");

	        while (true) {
	            numero = sc.nextInt(); // voy leyendo todos los nºs  

	            if (numero < 0) { // si es negativo finiquitamos
	                break;
	            }
	            //cada vez q leo un nuevo int q ponga el usuario compruebo si es mayor o menor q el anterior
	            if (numero < min) { 
	                min = numero;
	            }
	            if (numero > max) {
	                max = numero;
	            }
	        }

	        // mostrar resultados
	        if (min == Integer.MAX_VALUE) {
	            System.out.println("no se introdujeron números positivos");
	        } else {
	            System.out.println("Mínimo: " + min);
	            System.out.println("Máximo: " + max);
	        }

	        sc.close();
	}
	
}
