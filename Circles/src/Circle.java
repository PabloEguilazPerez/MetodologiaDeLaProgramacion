public class Circle {
	
	private double radius;
	
	public Circle(double r) {
		setRadius(r);
	}
	
	public Circle(Circle c) {
		setRadius(c.getRadius());
	}

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double perimeter() {
		return (2 * radius) * Math.PI;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
