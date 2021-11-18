package ficheros_acceso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class EjemploRandomAccessFile {

	public static void main(String[] args) throws Exception {

		// Crear programa un fichero enteros.dat con la clase RAF
		// Leer longitud, puntero, introducir un numero en el fichero y la posicion del
		// fichero

		RandomAccessFile fichero = null;

		File archivo = new File("C:\\Users\\admin\\Desktop\\enteros.dat");

		BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
		String data = "Solo para que no este vacío";
		salida.write(data);
		salida.close();

		fichero = new RandomAccessFile(archivo, "rw");
		System.out.println(fichero.read());

		fichero.close();
	}

}
