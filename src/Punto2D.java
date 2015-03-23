public class Punto2D {

	private float x;
	private float y;

	public Punto2D() {
		super();
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void moveX(float cantidad) {
		x += cantidad;
	}

	public void moveY(float cantidad) {
		y += cantidad;
	}

	public float distanciaPuntos(Punto2D punto){
		float ret = 0;
		
		ret = (float) Math.sqrt((Math.pow(punto.getX(), 2)-Math.pow(this.getX(), 2))+(Math.pow(punto.getY(), 2)-Math.pow(this.getY(), 2)));
		
		return ret;
	}
}
