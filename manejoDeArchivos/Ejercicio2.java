package manejoDeArchivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Ejercicio2 {
	//almacenar un array d floats en un archivo, sobreescribiéndolo
	public static void main (String[] args) {
		String rutaArchivo = "C:\\Users\\Usuario\\OneDrive\\Desktop\\ALED\\prueba_lectura_datos.txt";
		float[] miArray = {1,2,3,4,5,6,7,8,9};
		try {
			File f = new File(rutaArchivo);
			FileOutputStream fis = new FileOutputStream(f);
			PrintWriter pw = new PrintWriter(fis);
			pw.println(Arrays.toString(miArray));
			pw.close();
		} catch (Exception e) {
			System.out.println("no se puedo imprimir en el archivo");
			e.printStackTrace();
		}
	}

}
