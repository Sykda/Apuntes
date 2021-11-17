package almacen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Almacen a = new Almacen();
		Bebida b;

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("\n1. Introduce una bebida");
			System.out.println("2. Muestra las bebidas");
			System.out.println("3. Elimina una bebida");
			System.out.println("4. Calcula el precio total de una marca");
			System.out.println("5. Calcula el precio total de una columna");
			System.out.println("6. Calcula el precio total de todas las bebidas");
			System.out.println("0. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:

					Scanner ob = new Scanner(System.in);
					System.out.println("¿Qué tipo de bebida es?");
					System.out.println("\n1. Agua");
					System.out.println("2. Azucarada");
					int opcionBebida;
					opcionBebida = ob.nextInt();

					switch (opcionBebida) {

					case 1:

						Scanner opc1 = new Scanner(System.in);
						System.out.println("Introduce el número de litros: ");
						double litros = opc1.nextDouble();
						System.out.println("Introduce el precio: ");
						double precio = opc1.nextDouble();
						System.out.println("Introduce la marca: ");
						String marca = opc1.next();
						System.out.println("Introduce el manantial: ");
						String manantial = opc1.next();

						b = new AguaMineral(litros, precio, marca, manantial);
						a.agregarBebida(b);
						break;

					case 2:

						Scanner opc2 = new Scanner(System.in);
						System.out.println("Introduce el número de litros: ");
						double litros1 = opc2.nextDouble();
						System.out.println("Introduce el precio: ");
						double precio1 = opc2.nextDouble();
						System.out.println("Introduce la marca: ");
						String marca1 = opc2.next();
						System.out.println("Introduce el porcentaje de azucar: ");
						double azucar = opc2.nextDouble();
						System.out.println("¿Está en promoción? true/false");
						boolean promocion = opc2.nextBoolean();

						b = new BebidaAzucarada(litros1, precio1, marca1, azucar, promocion);
						a.agregarBebida(b);
						break;
					}

					break;
				case 2:

					a.mostrarbebida();
					break;

				case 3:

					Scanner opcId = new Scanner(System.in);
					System.out.println("Introduzca el ID de la bebida que quiere eliminar");
					int ID = opcId.nextInt();
					a.eliminarbebida(ID);
					break;

				case 4:

					Scanner opcMarca = new Scanner(System.in);
					System.out.println("Introduzca la marca");
					String marca = opcMarca.next();
					System.out.println(a.calcularPrecioBebidas(marca) + "€");
					break;
				case 5:

					Scanner opcColumna = new Scanner(System.in);
					System.out.println("Introduzca la columna");
					int columna = opcColumna.nextInt();
					System.out.println(a.calcularPrecioBebidas(columna) + "€");
					break;
				case 6:

					System.out.println(a.calcularPrecioBebidas() + "€");
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
	}
}
