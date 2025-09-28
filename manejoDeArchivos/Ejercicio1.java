package manejoDeArchivos;


import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ejercicio1 {
	 
	 public static void leerArchivo(String rutaArchivo) {
		 try{
			 Scanner sc = new Scanner(new FileInputStream(new File(rutaArchivo)));
			 String line;
			    while (sc.hasNext()) {
			    	line = sc.nextLine();
			        System.out.println(line);
			    }
			 sc.close();
		 }catch(Exception e) {
			 System.out.println("no se ha podido leer el archivo /n El error fue: ");
			 e.printStackTrace();
		 }
		 
	 }

	public static void main(String[] args) {
		
		String rutaArchivo = "C:\\Users\\Usuario\\OneDrive\\Desktop\\ALED\\prueba_lectura_datos.txt";
		
		Ejercicio1.leerArchivo(rutaArchivo);
	}

}
