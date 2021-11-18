package ejercicios_simulacro;

//Crear un programa(ConvierteAMayusculas) utilizando la clase RandomAccessFile 
//que dado por teclado un palabra, realice una b�squeda y la modifique la en el fichero original convirti�ndola en may�scula.
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
			linea = fichero.readLine(); // leemos la primera l�nea

			while (linea != null) { // mientras no lleguemos al final del fichero

				palabraEnLinea = linea.indexOf(palabra); // buscamos la palabra en la l�nea le�da
				while (palabraEnLinea != -1) { // mientras la l�nea contenga esa palabra (por si est� repetida)

					// paso la l�nea a un StringBuilder para modificarla
					constructor = new StringBuilder(linea);
					constructor.replace(palabraEnLinea, palabraEnLinea + palabra.length(), palabra.toUpperCase());
					linea = constructor.toString();

					fichero.seek(pos); // La posici�n donde empieza la l�nea actual la estoy guardando en la variable
										// pos
					fichero.writeBytes(linea);

					// compruebo si se repite la misma palabra en la l�nea
					palabraEnLinea = linea.indexOf(palabra);
				}
				pos = fichero.getFilePointer(); // posici�n de la l�nea actual que voy a leer
				linea = fichero.readLine(); // lectura de la l�nea
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