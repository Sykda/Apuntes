package poorra;

import poorra.Constantes;

public class Porra implements Constantes{

	private double bote;
	
	public Porra() {
		bote=0;
	}
	
	public void aumentarBote(double dinero) {		
		bote+=dinero;		
	}
	
	public void vaciarBote() {		
		bote=0;		
	}
	
	public void jornadas() {
		
		Resultados resultados= new Resultados();
		String[] partidos;
		
		for(int i=0;i<NUMERO_JORNADA;i++) {
			
			System.out.println("Jornada "+ (i+1));
			System.out.println("");
			
			//apuesta
			for (int j=0;j<JUGADORES.length;j++) {
				if(JUGADORES[j].puedePagar()) {
					JUGADORES[j].ponerEnElBote();
					JUGADORES[j].generarResultados();
					aumentarBote(DINERO_CADA_JORNADA);
				}else {
					JUGADORES[j].reiniciarResultados();
				}
				
			}
			
			
			//Partido
			resultados.generarResultados();
			partidos =resultados.getPartidos();
				
			
			
			//Comprobacion
			for (int j=0;j<JUGADORES.length;j++) {
				
				if(JUGADORES[j].haAcertadoPorra(partidos)) {
					JUGADORES[j].ganarBote(bote);
					vaciarBote();
				}
			}
			
			System.out.println("");
			System.out.println("");
			
			System.out.println(toString());
			
			System.out.println("");
			System.out.println("");
		}
		
		for (int i=0;i<JUGADORES.length;i++) {
			System.out.println(JUGADORES[i]);
		}
			
			
		
	}

	@Override
	public String toString() {
		return "El bote es " +bote+ "€";
	}
	
	
}
