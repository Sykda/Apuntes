package saludo;

class Saludo {
	synchronized void saludarProfe(String alumnos) {
		try {
			wait();
			System.out.println(alumnos + " --> Buenos dias Profesor !");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	synchronized void respondersaludo() {
		System.out.println("Profesor --> Buenos dias");
		notifyAll();
	}

}