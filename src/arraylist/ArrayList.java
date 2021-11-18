package arraylist;

public class ArrayList {

	public static void main(String[] args) {

		java.util.ArrayList<String> frutArr = new java.util.ArrayList<String>();

		frutArr.add("Uva");
		frutArr.add("Sandia");
		frutArr.add("Platano");
		frutArr.add("Manzana");

		for (String i : frutArr) {

			if (i == "Sandia")
				continue;

			else
				System.out.println(i);
		}
	}
}
