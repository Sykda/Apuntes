package ficheros_acceso;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEjemplo {

	public static void main(String[] args) {

		try {

			BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\fuente.txt"));

			String lineaActual;

			while ((lineaActual = lector.readLine()) != null) {
				System.out.println(lineaActual);
			}

			lector.close();

		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero" + e.getMessage());
		} catch (IOException e1) {
			e1.getMessage();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}
}