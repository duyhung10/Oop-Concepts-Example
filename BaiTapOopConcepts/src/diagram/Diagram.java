package diagram;

import java.util.ArrayList;
import shape.*;

public class Diagram {
	public ArrayList<Layer> layerGroup = new ArrayList<>();
	public ArrayList<Circle> circleGroup = new ArrayList<>();
	public ArrayList<Rectangle> rectangleGroup = new ArrayList<>();
	public ArrayList<Square> squareGroup = new ArrayList<>();
	public ArrayList<Triangle> triangleGroup = new ArrayList<>();

	// VeHinh
	public void drawDiagram() {
		for (int i = 0; i < layerGroup.size(); i++) {
			if (layerGroup.get(i).isVisible() == true) {
				layerGroup.get(i).drawAllShape();
			}
		}
	}

	// Xoa cac doi tuong thuoc lop Circle
	public void deleteObjectOfCirInDiagram() {
		for (int i = 0; i < layerGroup.size(); i++) {
			for (int j = 0; j < layerGroup.get(i).shapeGroup.size(); j++) {
				if (layerGroup.get(i).shapeGroup.get(j) instanceof Circle) {
					layerGroup.get(i).shapeGroup.remove(i);
				}
			}
		}
	}

	// Phan loai cac loai hinh
	public void classifyShape() {
		for (int i = 0; i < layerGroup.size(); i++) {
			for (int j = 0; j < layerGroup.get(i).shapeGroup.size(); j++) {
				if (layerGroup.get(i).shapeGroup.get(j) instanceof Circle) {
					circleGroup.add((Circle) layerGroup.get(i).shapeGroup.get(j));
				}
				if (layerGroup.get(i).shapeGroup.get(j) instanceof Triangle) {
					triangleGroup.add((Triangle) layerGroup.get(i).shapeGroup.get(j));
				}
				if (layerGroup.get(i).shapeGroup.get(j) instanceof Rectangle) {
					rectangleGroup.add((Rectangle) layerGroup.get(i).shapeGroup.get(j));
				}
				if (layerGroup.get(i).shapeGroup.get(j) instanceof Square) {
					squareGroup.add((Square) layerGroup.get(i).shapeGroup.get(j));
				}
			}
		}
	}

}
