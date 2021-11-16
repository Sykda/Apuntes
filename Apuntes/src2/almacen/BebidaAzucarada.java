package almacen;

public class BebidaAzucarada extends Bebida {
	
	private double porcentajeAzucar;
	private boolean promocion;
	
	
	public BebidaAzucarada(double litros, double precio, String marca, double porcentajeAzucar, boolean promocion) {
		super(litros, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}
	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}
	public boolean isPromocion() {
		return promocion;
	}
	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	@Override
	public double getPrecio() {
		if(isPromocion()) {
			return super.getPrecio()*0.9;
		}else {
			return super.getPrecio();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Porcentaje de azucar= " + porcentajeAzucar+"%" + ", Promoción= " + promocion;
	}
	
	

}
