package ficheros_acceso;

import java.io.*;
import java.util.*;

public class RAF {
	
	static Scanner sc = new Scanner(System.in);
    static RandomAccessFile fichero = null;

    public static void main(String[] args) throws IOException {
        
    	    	
		int numero;
        try {
            
            fichero = new RandomAccessFile("C:\\Users\\admin\\Desktop\\enteros.dat", "rw");
            mostrarFichero(); 
            System.out.print("Introduce un número entero para añadir al fichero: ");                    
            numero = sc.nextInt(); 
            fichero.seek(fichero.length()); 
            fichero.writeInt(numero);    
            mostrarFichero();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
                
       
    }

    public static void mostrarFichero() {
        int n;
        try {
            fichero.seek(0);
            while (true) {
                n = fichero.readInt();                                
                System.out.println(n); 
            }
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
     
}