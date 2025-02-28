
public class CircleWithCentre extends Circle {

	private Point centre;

	public CircleWithCentre(int x, int y, double r) {
		super(r);
		centre = new Point(x, y);
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(int x, int y) {
		centre.setX(x);
		centre.setY(y);
	}

	public void setCentre(Point p) {
		centre = p;
	}

	public static boolean overlaps(CircleWithCentre c1, CircleWithCentre c2) {
		if (c1 == null || c2 == null)
			return false;
		double d = Point.distance(c1.getCentre(), c2.getCentre());

		return d < (c1.getRadius() + c2.getRadius());
	}

	@Override
	public String toString() {
		return "(" + getCentre() + "|" + getRadius() + ")";
	}
}
