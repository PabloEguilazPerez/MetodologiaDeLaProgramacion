
public class Circle {

	private double radius;

	public Circle(double r) {
		radius = r;
	}

	public Circle(Circle c) {
		radius = c.getRadius();
	}

	public void setRadius(double r) {
		radius = r > 0 ? r : 0;
	}

	public double getRadius() {
		return radius;
	}

	public double perimeter() {
		return 2 * Math.PI * getRadius();
	}

	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
}
