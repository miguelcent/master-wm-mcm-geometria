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

	public void moverPunto(float offsetX, float offsetY) {
		x += offsetX;
		y += offsetY;
	}

}
