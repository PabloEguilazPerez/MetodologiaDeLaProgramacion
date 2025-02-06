
public class CircleWithCentreHerencia extends Point {
	
	private Circle circle;

	public CircleWithCentreHerencia(int x, int y, double r) {

		super(x, y);
		circle = new Circle(r);

	}

	public double getRadius() {
		return circle.getRadius();
	}

	public void setRadius(double r) {
		circle.setRadius(r);
	}

	public Point getCentre() {
		return this.getCentre();
	}

	public void setCentre(Point p) {
		this.setCentre(p);
	}

	public void setCentre(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public double perimeter() {
		return circle.perimeter();
	}

	public double area() {
		return circle.area();
	}

	@Override
	public String toString() {
		return "CircleWithCentre [c=" + circle + ", p=" + this.getCentre() + "]";
	}

	public static boolean overlaps(CircleWithCentre c1, CircleWithCentre c2) {
		double dis = new Point(0, 0).distance(c1.getCentre(), c2.getCentre());
		return dis <= (c1.getRadius() + c2.getRadius());
	}

}
