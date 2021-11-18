package poorra;

public class Resultados implements Constantes, MetodosInterfaz {

	private String[] partidos;

	public Resultados() {

		partidos = new String[NUMERO_PARTIDOS];
	}

	public void generarResultados() {

		int pLocal, pVisitante; // punto local, punto visitante

		for (int i = 0; i < partidos.length; i++) {
			pLocal = Metodos.generarNumeroAleatorio(RESULTADO_MINIMO, RESULTADO_MAXIMO);
			pVisitante = Metodos.generarNumeroAleatorio(RESULTADO_MINIMO, RESULTADO_MAXIMO);

			partidos[i] = pLocal + " - " + pVisitante;

			System.out.println("El partido " + (i + 1) + " ha generado el resultado " + partidos[i]);

		}
	}

	public String[] getPartidos() {
		return partidos;
	}
}
