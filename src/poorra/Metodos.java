package poorra;

public class Metodos {

	public static int generarNumeroAleatorio(int minimo, int maximo) {
		int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}
}
