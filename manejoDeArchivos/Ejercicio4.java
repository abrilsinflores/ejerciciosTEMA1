package manejoDeArchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4 {
	//copiar contenido de un archivo a otro
	public static void main(String[] args) {
		String rutaArchivo = "C:\\Users\\Usuario\\OneDrive\\Desktop\\ALED\\prueba_lectura_datos.txt";

		try {
			
			File f = new File(rutaArchivo);
			File newf = new File("C:\\Users\\Usuario\\OneDrive\\Desktop\\ALED\\newf");
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(newf);
			Scanner sc = new Scanner(fis);
			PrintWriter pw = new PrintWriter(fos);
			
			while(sc.hasNext()) {
				String line = sc.nextLine();
				pw.println(line);
				
			}
			
			sc.close();
			fis.close();
			pw.close();
			fos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
