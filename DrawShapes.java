package oops;

public class DrawShapes {

	public static void main(String[] args) {
		Line l = new Line();
		Rectangle r = new Rectangle();
		Cube c = new Cube();
		l.draw();
		r.draw();
		c.draw();
	}

}
class Shape{
	public void draw() {
		System.out.println("Draw their shapes");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("The drawn shape is Line");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("The drawn shape is Rectangle");
}
}
class Cube extends Shape{
	public void draw() {
		System.out.println("The drawn shape is Cube");
}
}