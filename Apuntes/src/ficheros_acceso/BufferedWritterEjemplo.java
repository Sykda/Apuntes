package ficheros_acceso;

import java.io.*;

public class BufferedWritterEjemplo {

	public static void main(String[] args) {

		String data = "Hola mundo";

	    try {
	      
	      FileWriter file = new FileWriter("C:\\Users\\admin\\Desktop\\output.txt");
   
	      BufferedWriter salida = new BufferedWriter(file);
  
	      salida.write(data);

	      salida.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	}
}
