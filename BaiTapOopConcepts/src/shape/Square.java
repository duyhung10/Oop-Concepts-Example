package shape;

public class Square extends Shape {
	private double side;
	
	public Square() {
		
	}
	
	public Square(double x, double y, double side) {
		super(x,y);
		this.side = side;
	}
	
	public void draw() {
		System.out.println("Draw the Square");
	}
	
	public double area() {
		return side * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}