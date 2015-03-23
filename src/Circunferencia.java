
public class Circunferencia {

	private Punto2D centro;
	private float radio;
	
	public Circunferencia(){
		super();
	}

	public Punto2D getCentro() {
		return centro;
	}

	public void setCentro(Punto2D centro) {
		this.centro = centro;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public void moverCentro(float offsetX, float offsetY){
		centro.moveX(offsetX);
		centro.moveY(offsetY);
	}
	
}
