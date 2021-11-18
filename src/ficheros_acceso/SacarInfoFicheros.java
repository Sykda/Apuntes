package ficheros_acceso;

import java.io.File;

public class SacarInfoFicheros {

	public static void main(String[] args) {

		File fichero = new File("C:\\Users\\admin\\Desktop\\fuente.txt");

		System.out.println(fichero.getAbsoluteFile());
		System.out.println(fichero.getAbsolutePath());
		System.out.println(fichero.getName());

	}

}
