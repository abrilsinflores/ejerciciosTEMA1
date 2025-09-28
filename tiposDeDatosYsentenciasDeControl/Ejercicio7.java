package tiposDeDatosYsentenciasDeControl;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Tome un número entero escrito por el usuario y lo descomponga en factores primos. 
	 * Por ejemplo: 40 = 2 × 2 × 2 × 5.
	 */
	
	//creo un método para saber si un número es primo , static para poder llamarlo en el main
			public static boolean esPrimo(int number) {
				boolean esPrimo = false;
				int divisores = 0;
				
				for(int i = 1; i<=number; i++) {
					if(number%i==0) {
						divisores++;
					}
				}
				
				if(divisores==2) {
					esPrimo = true;
				}
				
				return esPrimo;
			}
	
	public static void main (String[] args) {
		System.out.println("introduzca un número");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
	
		if(esPrimo(numero)) {
			System.out.println("el número introducido es primo, su descomposición en factores primos es él mismo y 1");
		} else {
			System.out.print("descomposición en factores primos: "+numero+" = ");
			for(int i = 1; i<=numero; i++) {
				if(esPrimo(i)) {
					while(numero%i==0) {
						System.out.print(i+" x ");
						numero /=i;
					}
				}
				
			}
			
		}
		
		sc.close();
		
	}

}
