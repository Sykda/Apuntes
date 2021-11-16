package ejercicios_simulacro;

import java.io.*;

public class CuentaVocales {

	public static void main(String[] args) {
	
		int contador=0;
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Syk18\\Desktop\\letras.txt"));
	   
	        String lineaActual;   
	        
	        char[] vocales= {'a','e','i','o','u','A','E','I','O','U'};
	       
	        while ((lineaActual = lector.readLine()) != null) {    
	        	for(int x=0;x<lineaActual.length();x++) {
	        		for(int j=0;j<vocales.length;j++) {	
	        			 if (lineaActual.charAt(x)==vocales[j]){ 
	        	       		    contador++;
	        			 }
	        		}
	        	}
	        }
	        
	        System.out.println("El archivo contiene " + contador + " vocales");
	        
	        lector.close();
	        
		}catch (FileNotFoundException e){
			System.out.println("No existe el fichero"+ e.getMessage());
		}catch (IOException e1) {
			e1.getMessage();
		}catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}
}
