package otrosEjercicios;

public class EjerciciosStrings {
	
	//imprimir por pantalla el primer número que aparezca en un String
	public static void imprimirPrimerNumero(String texto) {
		char caracter = '\0';
		for(int i = 0; i<texto.length(); i++) {
			caracter = texto.charAt(i);
			if(Character.isDigit(caracter)) {
				System.out.println("el primer número es: "+caracter);
				return;
			} 
		}
		System.out.println("no hay números en este String");
	}

	public static void main(String[] args) {
	
		String textoConNumero = "abcd2n4";
		String textoSinNumero = "en este String no hay números";
		EjerciciosStrings.imprimirPrimerNumero(textoConNumero);
		EjerciciosStrings.imprimirPrimerNumero(textoSinNumero);
	}

}
