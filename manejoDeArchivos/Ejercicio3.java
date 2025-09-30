package manejoDeArchivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3 {
	//Añada 3 línes de texto escritas por el usuario al final de un archivo.
	public static void main(String[] args) {
		String rutaArchivo = "C:\\Users\\Usuario\\OneDrive\\Desktop\\ALED\\prueba_lectura_datos.txt";
		
		try {
			File f = new File(rutaArchivo);
			FileOutputStream fos = new FileOutputStream(f,true);
			PrintWriter pw = new PrintWriter(fos);
			
			Scanner sc = new Scanner(System.in);
			String mensajeUsuario = sc.nextLine();	
			
			pw.println("\n"+mensajeUsuario);
		
			sc.close();
			pw.close();
			fos.close();
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("no se ha podido ejecutar el main");
		}
	}

}
