package adivinar_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Adivina el numero: ");
		Scanner sn = new Scanner(System.in);
		int numero = (int) (Math.random() * (10 - 1)) + 1;
		boolean salir = false;
		int contador = 0;

		while (!salir) {
			try {
				contador++;
				int opcion = sn.nextInt();

				while (!salir) {

					if (opcion < numero) {
						System.out.println("El número que he pensado es mayor.");
						break;
					}
					if (opcion > numero) {
						System.out.println("El número que he pensado es menor.");
						break;
					} else {
						System.out.println("Acertaste! " + numero);
						System.out.println("Has necesitado " + contador + " intentos.");
						salir = true;
						break;
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();

			}
		}
	}
}
