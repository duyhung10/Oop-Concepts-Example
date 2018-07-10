package diagram;

import java.util.ArrayList;
import shape.*;

public class Layer {
	boolean visible;
	
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public ArrayList<Shape> shapeGroup = new ArrayList<>();
	
	// Draw all of Shape
	void drawAllShape() {
		for (int i = 0; i < shapeGroup.size(); i++) {
			shapeGroup.get(i).draw();
		}
	}
	// Delete all of Object instanceof Triangle Class
	void deleteObjectOfTriInLayer() {
		for(int i = 0; i < shapeGroup.size(); i++) {
			if(shapeGroup.get(i) instanceof Triangle) {
				shapeGroup.remove(i);
			}
		}
	}
	
	// begin -- Methors check duplicate Shapes.
	public boolean checkDupCircle(Circle circle1, Circle circle2){
        if((circle1.getX() == circle2.getX()) && (circle1.getY() == circle2.getY()) && (circle1.getRadius() == circle2.getRadius()))
            return true;
        return false;
    }
    public boolean checkDupTriangle(Triangle triangle1, Triangle triangle2){
        if((triangle1.getX() == triangle2.getX()) && (triangle1.getY() == triangle2.getY()) && 
                (triangle1.getSide1() == triangle2.getSide1()) && (triangle1.getSide2() == triangle2.getSide2()) && (triangle1.getSide3() == triangle2.getSide3()))
            return true;
        return false;
    }
    public boolean checkDupRectangle(Rectangle rectangle1, Rectangle rectangle2){
        if((rectangle1.getX() == rectangle2.getX()) && (rectangle1.getY() == rectangle2.getY()) && 
                (rectangle1.getSide1() == rectangle2.getSide1()) && (rectangle1.getSide2() == rectangle2.getSide2()))
            return true;
        return false;
    }
    public boolean checkDupSquare(Square square1, Square square2){
        if((square1.getX() == square2.getX()) && (square1.getY() == square2.getY()) && 
                (square1.getSide() == square2.getSide()))
            return true;
        return false;
    }
    // end -- 
    
    // Delete duplicate Shapes
    public void deleteDupShape(){ 
        for (int i = 0; i < shapeGroup.size() - 1; i++){
            if (shapeGroup.get(i) instanceof Circle){
                for (int j = i + 1; j < shapeGroup.size(); j++){
                    if (shapeGroup.get(j) instanceof Circle){
                        if (checkDupCircle((Circle) shapeGroup.get(i), (Circle) shapeGroup.get(j))){
                        	shapeGroup.remove(j);
                        }
                    }
                }
            }
            else if (shapeGroup.get(i) instanceof Triangle){
                for (int j = i + 1; j < shapeGroup.size(); j++){
                    if (shapeGroup.get(j) instanceof Triangle){
                        if (checkDupTriangle((Triangle) shapeGroup.get(i), (Triangle) shapeGroup.get(j))){
                            shapeGroup.remove(j);
                        }
                    }
                }
            }
            else if (shapeGroup.get(i) instanceof Rectangle){
                for (int j = i + 1; j < shapeGroup.size(); j++){
                    if (shapeGroup.get(j) instanceof Rectangle){
                        if (checkDupRectangle((Rectangle) shapeGroup.get(i), (Rectangle) shapeGroup.get(j))){
                            shapeGroup.remove(j);
                        }
                    }
                }
            }
            else if (shapeGroup.get(i) instanceof Square){
                for (int j = i + 1; j < shapeGroup.size(); j++){
                    if (shapeGroup.get(j) instanceof Square){
                        if (checkDupSquare((Square) shapeGroup.get(i), (Square) shapeGroup.get(j))){
                            shapeGroup.remove(j);
                        }
                    }
                }
            }
        }
    }
}
