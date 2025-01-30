
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y; 
	}
	
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public static double distance(Point a, Point b) {
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

}
