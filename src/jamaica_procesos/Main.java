package jamaica_procesos;

public class Main {

	public static void main(String[] args) {

		Hilo uno, dos;
		
		uno=new Hilo("Jamaica");
		dos=new Hilo("Fiji");
		
		uno.start();
		dos.start();
		
		try {
			uno.join();
			dos.join();
		} catch (InterruptedException e) {
			
			System.out.println("Hilo principal interrumpido.");
		}
		System.out.println("Hilo principal terminado.");
		
	}
}
