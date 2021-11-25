package estaciones;

import java.util.Scanner;

public class Ejercicio6 extends Thread {
	Scanner dato = new Scanner(System.in);
	String estaciones[] = { "Primavera", "Otoño", "Invierno", "Verano" };
	String estacion;

	public void run() {
		String n = " ";
		for (int i = 0; i < estaciones.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(estaciones[i]);
		}
		System.out.print("*************** \n");
		System.out.println("Ingrese el nombre de la estacion ");
		estacion = dato.next();
		if (estacion.equals("Primavera")) {
			try {
				Thread.sleep(2000);
				System.out.println("Setiembre");
				Thread.sleep(3000);
				System.out.println("Octubre");
				Thread.sleep(4000);
				System.out.println("Noviembre");
			} catch (Exception e) {
			}
		} else if (estacion.equals("verano")) {
			try {
				Thread.sleep(2000);
				System.out.println("Diciembre..........");
				Thread.sleep(3000);
				System.out.println("Enero..........");
				Thread.sleep(4000);
				System.out.println("Febrero..........");
			} catch (Exception e) {
			}
		} else if (estacion.equals("otono")) {
			try {
				Thread.sleep(2000);
				System.out.println("Marzo");
				Thread.sleep(3000);
				System.out.println("Abril");
				Thread.sleep(4000);
				System.out.println("Mayo");
			} catch (Exception e) {
			}
		} else if (estacion.equals("invierno")) {
			try {
				Thread.sleep(2000);
				System.out.println("Junio");
				Thread.sleep(3000);
				System.out.println("Julio");
				Thread.sleep(4000);
				System.out.println("Agosto");
			} catch (Exception e) {
			}
		}
	}

	public static void main(String args[]) {
		Ejercicio6 est = new Ejercicio6();
		est.start();
	}
}