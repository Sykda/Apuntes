package ficheros_acceso;

import java.io.*;
import java.util.*;

public class EjemploRandomAccessFile {

	public static void main(String[] args) throws Exception {

		//Crear programa un fichero enteros.dat con la clase RAF
		//Leer longitud, puntero, introducir un numero en el fichero y la posicion del fichero
		
		Scanner sc = new Scanner(System.in);
		RandomAccessFile fichero = null;
		
		int numeroTeclado;
		
		
		File archivo = new File ("C:\\Users\\admin\\Desktop\\enteros.dat");
		
		BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
		String data="Solo para que no este vacío";
		salida.write(data);
		salida.close();
	
		
		fichero = new RandomAccessFile(archivo,"rw");
		System.out.println(fichero.read());
		
		
		
		
		
	}

}
