package shape;

public class Circle extends Shape {
	private double radius;
	private double center;
	
	public Circle() {
		
	}
	
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Draw the Circle");
	}
	
	public double area() {
		return radius * radius * 3.14;
	}

	public double getCenter() {
		return center;
	}

	public void setCenter(double center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}