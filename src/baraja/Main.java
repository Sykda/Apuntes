package baraja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Baraja b = new Baraja();
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("\n1. Mostrar baraja");
			System.out.println("2. Saca una carta");
			System.out.println("3. Pedir cartas (introducir número)");
			System.out.println("4. Ver cartas disponibles");
			System.out.println("5. Ver cartas del montón");
			System.out.println("6. Barajar");
			System.out.println("0. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					b.mostrarBaraja();
					break;
				case 2:
					System.out.println(b.siguienteCarta());
					break;
				case 3:
					Scanner opc3 = new Scanner(System.in);
					System.out.println("¿Cuántas cartas quieres?");
					Carta[] c = b.darCartas(opc3.nextInt());

					for (int i = 0; i < c.length; i++) {
						System.out.println(c[i]);
					}
					break;

				case 4:
					System.out.println("Quedan" + b.cartasDisponibles() + " cartas disponibles");
					break;
				case 5:
					b.cartasMonton();
					break;
				case 6:
					b.barajar();
					System.out.println("Barajado!!");
					break;
				case 0:
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 0 y 6");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}			
		}
		sn.close();
	}
}
