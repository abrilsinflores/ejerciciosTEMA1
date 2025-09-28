package tiposDeDatosYsentenciasDeControl;

public class Ejercicio2 {
	/*
	 * Muestre por pantalla los mayores números enteros que se pueden representar
	 * mediante un char, un short y un int 
	 */
	
	
	public static void main(String[] args) {
		int mayorPorChar = Character.MAX_VALUE;
		int mayorPorShort = Short.MAX_VALUE;
		int mayorPorInt = Integer.MAX_VALUE;
		
		System.out.println("el mayor valor entero representable es \n" + "por Char: " + mayorPorChar +"\n" + "por Short: " + mayorPorShort +"\n" + "por Int: " + mayorPorInt);
	}

}
