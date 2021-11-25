package saludo;

public class Ejercicio13 extends Thread {
	String nombre;
	Saludo saludo;
	boolean Profesor;

	Ejercicio13(Saludo s, String n, boolean P) {
		nombre = n;
		saludo = s;
		Profesor = P;
	}

	public void run() {
		System.out.println(" ( " + nombre + " ingresa ) ");
		if (Profesor) {
			saludo.respondersaludo();
		} else {
			saludo.saludarProfe(nombre);
		}
	}

	public static void main(String[] args) {
		Saludo hola = new Saludo();
		Ejercicio13 Yazmin = new Ejercicio13(hola, "Yazmin", false);
		Ejercicio13 Pepito = new Ejercicio13(hola, "Pepito", false);
		Ejercicio13 Miliam = new Ejercicio13(hola, "Miliam", false);
		Ejercicio13 daniza = new Ejercicio13(hola, "daniza", false);
		Ejercicio13 cesar = new Ejercicio13(hola, "cesar", false);
		Ejercicio13 Robinsom = new Ejercicio13(hola, "Robinsom", false);
		Ejercicio13 carlitos = new Ejercicio13(hola, "carlitos", true);
		Yazmin.start();
		Pepito.start();
		Miliam.start();
		daniza.start();
		cesar.start();
		Robinsom.start();
		carlitos.start();
		try {
			Yazmin.join();
			Pepito.join();
			Miliam.join();
			daniza.join();
			cesar.join();
			Robinsom.join();
			carlitos.join();
		} catch (InterruptedException e) {
		}
	}
}