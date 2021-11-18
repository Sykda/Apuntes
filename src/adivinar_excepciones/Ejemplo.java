package adivinar_excepciones;

public class Ejemplo {
	
	static void metodo(int posicion){
		int array []= new int [3];	
		try {	
			
			System.out.println(array[posicion]);	
						
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("No existe " + e.getMessage());
				//e.printStackTrace();
				
				try {
					System.out.println(array[posicion-1]);
				}catch(ArrayIndexOutOfBoundsException e2){
					System.out.println("No existe " + e.getMessage());
				}
			
			}finally {
				System.out.println("Esto es el finally");
			}
		}

	public static void main(String[] args) {
		
				
		metodo(5);
		

	}

}
