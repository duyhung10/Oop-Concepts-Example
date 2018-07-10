package shape;

public abstract class Shape {
	protected double x;
	protected double y;
	protected String color;

	public Shape() {
	}
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void draw() {
		System.out.println("Draw the Shape");
	}
	
	public void movie(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract double area();

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
