package run;
import shape.*;
import diagram.*;

public class Run {
	public static void main(String args[]) {
		Triangle tri1 = new Triangle(3, 7, 5, 3, 4);
		Triangle tri2 = new Triangle(5, 4, 9, 2, 12);
		Circle cir1 = new Circle(5, 10, 5);
		Rectangle rec1 = new Rectangle(7, 7, 4, 5);
		Square squ1 = new Square(5, 3, 8);
		Square squ2 = new Square(10, 5, 3);

		Layer layer1 = new Layer();
		Layer layer2 = new Layer();
		layer1.setVisible(true);
		layer2.setVisible(true);
		
		Diagram diagram = new Diagram();
		
		layer1.shapeGroup.add(tri1);
		layer1.shapeGroup.add(cir1);
		layer1.shapeGroup.add(squ1);
		
		layer2.shapeGroup.add(tri2);
		layer2.shapeGroup.add(rec1);
		layer2.shapeGroup.add(squ2);
		
		diagram.layerGroup.add(layer1);
		diagram.layerGroup.add(layer2);
		
		diagram.drawDiagram();
	}

}
