package ArrayList;

public class arrayWhile {

	public static void main(String[] args) {

		java.util.ArrayList<String> frutArr=new java.util.ArrayList<String>();
		
        
        frutArr.add("Uva");
        frutArr.add("Sandia");
        frutArr.add("Platano");
        frutArr.add("Manzana");
        frutArr.add("Naranja");
        
        
        
        //frutArr.forEach((i) -> { System.out.println(i);	});
        for (int i = frutArr.size() - 1; i >= 0; i--) {
        	System.out.println(frutArr.get(i));
         }
    }        
}
