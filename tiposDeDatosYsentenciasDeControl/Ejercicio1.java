package tiposDeDatosYsentenciasDeControl;

public class Ejercicio1 {
	/*
	 * def variables que representen el nº de días de un año, nº de horas que tiene un día
	 * nº d minutos q tiene una hora y nº de segundos q tiene un minuto
	 * usar variables q ocupen el mín espacio posible
	 * calcular el nº d segundo q tiene un año, almacenar valor en otra variable
	 */
	public static void main(String[] arg) {
	/*valor máx nº días d un año = 365 -> uso datos tipo short (byte es demasiado petit, 
	 * solo llega a 2^8 representaccs, máx 128, mín 127!!!, nisito representar al menos 365) 
	 */
		short daysOfAyear;
		byte numberOfHoursInAday;
		byte numberOfMinutesInAnHour;
		byte numberOfSecondsInAMinute;
		
		//cálculo nº d segundos en un año
		int numberOfSecondsInAyear = 365*24*60*60;
		
	}

}
