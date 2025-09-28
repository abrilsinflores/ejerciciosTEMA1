package tiposDeDatosYsentenciasDeControl;

public class Ejercicio3 {
	/*Calcule la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. 
	 * También debe calcular cuántos hay y mostrar visualizar cada uno de ellos
	 */
	
	public static void main(String[] args) {
		int sumaMultiplos = 0;
		int cuantosMultiplosHay = 0;
		System.out.println("a continuación se visualizarán los múltiplos de 5 del 1 al 100");
		for(int i = 0; i<=100; i++) {
			//compruebo si i es múltiplo de 5
			if(i%5 == 0) {
				sumaMultiplos+=i;
				cuantosMultiplosHay++;
				System.out.println(i);
			}
		}
		System.out.println("en total se hay "+cuantosMultiplosHay+" múltiplos de 5 \ny la suma de todos ellos es "+sumaMultiplos);
		

	}

}
