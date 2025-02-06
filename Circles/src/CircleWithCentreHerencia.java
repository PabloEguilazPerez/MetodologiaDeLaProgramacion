
public class CircleWithCentreHerencia extends Circle {
	
	private Point center;

	public CircleWithCentreHerencia(int x, int y, double r) {

		super(r);
		center = new Point(x, y);

	}

	public double getRadius() {
		return this.getRadius();
	}

	public void setRadius(double r) {
		this.setRadius(r);
	}

	public Point getCentre() {
		return center;
	}

	public void setCentre(Point p) {
		center = p;
	}

	public void setCentre(int x, int y) {
		center.setX(x);
		center.setY(y);
	}

	public double perimeter() {
		return this.perimeter();
	}

	public double area() {
		return this.area();
	}

	@Override
	public String toString() {
		return "CircleWithCentre [c=" + this + ", p=" + center + "]";
	}

	public static boolean overlaps(CircleWithCentre c1, CircleWithCentre c2) {
		double dis = new Point(0, 0).distance(c1.getCentre(), c2.getCentre());
		return dis <= (c1.getRadius() + c2.getRadius());
	}

}
