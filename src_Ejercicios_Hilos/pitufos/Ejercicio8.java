package pitufos;

public class Ejercicio8 extends Thread {
	private String nombre;

	public Ejercicio8(String nombre) {
		this.nombre = nombre;
	}

	public void run() {
		for (int a = 1; a <= 3; a++) {
			System.out.println(nombre + " come un " + a + "� pan con queso");
		}
		System.out.printf("%s termin�\n", nombre);
	}

	public static void main(String[] args) {
		String[] nombres = { "Papa pitufo", "pitufina", "Fil�sofo", "pintor", "Gru��n", "bromista", "dormil�n",
				"t�mido", "tont�n", "bonach�n", "romantico" };
		for (String nomb : nombres) {
			Ejercicio8 e = new Ejercicio8(nomb);
			Thread t = new Thread(e);
			t.start();
		}
	}
}