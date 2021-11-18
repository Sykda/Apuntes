package jamaica_procesos;

//extiende de la clase thread o del interfaz runnable
class Hilo extends Thread {

	public Hilo(String str) {
		super(str);
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(getName());
		}

		System.out.println("Terminé -----> " + getName());
	}
}
