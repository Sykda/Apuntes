package join_procesos;

public class Join {

	public static void main(String[] args) {
		Hilo h1 = new Hilo("H1");
		Hilo h2 = new Hilo("H2");
		try {

			h1.run();
			h1.join();

			h2.start();
			h2.join();

		} catch (InterruptedException ex) {
			System.out.println("Hilo principal interrumpido.");
		}
		System.out.println("Hilo principal terminado.");
	}

}
