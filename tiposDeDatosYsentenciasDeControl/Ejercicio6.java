package tiposDeDatosYsentenciasDeControl;

public class Ejercicio6 {
	//Muestre por pantalla la lista de los 100 primeros números primos
	public static void main(String[] args) {
		System.out.println("lista de los 100 primeros números primos");	
		int contador = 0;
		for(int i = 1; contador<=100; i++) {
			int divisores = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j==0) {
					divisores++;
				}
			}
			if(divisores==2) {
			System.out.print(i+", ");
			contador++;
			}
		}
		
		
		
	}

}
