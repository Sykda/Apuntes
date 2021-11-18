package ficheros_acceso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pasar_Info_de_Un_Fichero_A_Otro {

	public static void main(String[] args) {

		try {
			FileReader in = new FileReader("C:\\Users\\admin\\Desktop\\fuente.txt");
			FileWriter out = new FileWriter("C:\\Users\\admin\\Desktop\\destino.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

			in.close();
			out.close();

		} catch (FileNotFoundException e1) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e2) {
			System.out.println("Error" + e2.getMessage());
		}
	}
}