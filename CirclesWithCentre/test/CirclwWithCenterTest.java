import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirclwWithCenterTest {

	CircleWithCentre c1, c2;

	@BeforeEach
	void setUp() throws Exception {

		c1 = new CircleWithCentre(2, 4, 6.0);
		c2 = new CircleWithCentre(2, 40, 6.0);

	}

	@Test
	void testCircleWithCentre() {
		assertNotNull(c1, "");
		assertEquals(2, c1.getCentre().getX(), "");
		assertEquals(4, c1.getCentre().getY(), "");
		assertEquals(6.0, c1.getRadius(), "");
	}

	@Test
	void testGetCentre() {
		assertEquals(new Point(2, 4), c1.getCentre());
		assertEquals(new Point(2, 40), c2.getCentre());
	}

	@Test
	void testSetCentreIntInt() {
		c1.setCentre(5, 5);
		assertEquals(new Point(5, 5), c1.getCentre());
	}

	@Test
	void testSetCentrePoint() {
		Point p = new Point(8, 8);
		c1.setCentre(p);
		assertEquals(p, c1.getCentre());
	}

	@Test
	void testOverlaps() {
		assertTrue(CircleWithCentre.overlaps(c1, c1));
		assertFalse(CircleWithCentre.overlaps(c1, c2));
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRadius() {

		c1.setRadius(10);
		assertEquals(10, c1.getRadius());

		c1.setRadius(-5);
		assertEquals(0, c1.getRadius());

	}

	@Test
	void testGetRadius() {
		
		assertEquals(6.0, c1.getRadius());
		
		assertEquals(6.0, c2.getRadius());
		
	}

	@Test
	void testPerimeter() {
		
		assertEquals(37.69911184307752, c1.perimeter());
		
		assertEquals(37.69911184307752, c2.perimeter());
		
	}

	@Test
	void testArea() {
		
		assertEquals(113.09733552923255, c1.area());
		
		assertEquals(113.09733552923255, c2.area());
		
	}

}
