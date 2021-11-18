package almacen;

public class AguaMineral extends Bebida {

	private String manantial;

	public AguaMineral(double litros, double precio, String marca, String manantial) {
		super(litros, precio, marca);
		this.manantial = manantial;
	}

	public String getManantial() {
		return manantial;
	}

	public void setManantial(String manantial) {
		this.manantial = manantial;
	}

	@Override
	public String toString() {
		return super.toString() + ", Manantial= " + manantial;
	}

}
