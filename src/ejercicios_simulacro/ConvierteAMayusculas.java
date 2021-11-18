package ejercicios_simulacro;

//Crear un programa(ConvierteAMayusculas) utilizando la clase RandomAccessFile 
//que dado por teclado un palabra, realice una búsqueda y la modifique la en el fichero original convirtiéndola en mayúscula.
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ConvierteAMayusculas {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		RandomAccessFile fichero = new RandomAccessFile("C:\\Users\\admin\\Desktop\\letra.txt", "rw");

		String palabra, linea;
		StringBuilder constructor;
		int palabraEnLinea;

		try {

			// Se pide la palabra a buscar
			System.out.print("Introduce palabra: ");
			palabra = sc.nextLine();

			// lectura del fichero
			long pos = 0; // posicion inicial
			linea = fichero.readLine(); // leemos la primera línea

			while (linea != null) { // mientras no lleguemos al final del fichero

				palabraEnLinea = linea.indexOf(palabra); // buscamos la palabra en la línea leída
				while (palabraEnLinea != -1) { // mientras la línea contenga esa palabra (por si está repetida)

					// paso la línea a un StringBuilder para modificarla
					constructor = new StringBuilder(linea);
					constructor.replace(palabraEnLinea, palabraEnLinea + palabra.length(), palabra.toUpperCase());
					linea = constructor.toString();

					fichero.seek(pos); // La posición donde empieza la línea actual la estoy guardando en la variable
										// pos
					fichero.writeBytes(linea);

					// compruebo si se repite la misma palabra en la línea
					palabraEnLinea = linea.indexOf(palabra);
				}
				pos = fichero.getFilePointer(); // posición de la línea actual que voy a leer
				linea = fichero.readLine(); // lectura de la línea
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				if (fichero != null) {
					fichero.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}