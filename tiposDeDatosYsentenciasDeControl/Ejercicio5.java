package tiposDeDatosYsentenciasDeControl;

public class Ejercicio5 {
	//Muestre por pantalla la tabla de multiplicar de los 10 primeros números naturales

	public static void main(String[] args) {
		System.out.println("tabla de multiplicar de los 10 primeros números naturales");
		for(int i = 0; i<=10; i++) {
			System.out.println("tabla de multiplicar del "+i+" :");
			for(int j = 0; j<=10; j++) {
				int numero = i*j;
				System.out.println(numero);

			}
			
		}
		

	}

}
