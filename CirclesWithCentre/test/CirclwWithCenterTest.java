import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirclwWithCenterTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCircleWithCentre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCentre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCentreIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCentrePoint() {
		fail("Not yet implemented");
	}

	@Test
	void testOverlaps() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRadius() {
		
		CircleWithCentre c1 = new CircleWithCentre(1, 1, 6.0);
		
		c1.setRadius(10);
		assertEquals(10, c1.getRadius());
		
		c1.setRadius(0);
		assertEquals(0, c1.getRadius());
		
		c1.setRadius(-1);
		assertEquals(0, c1.getRadius());
		
	}

	@Test
	void testGetRadius() {
		fail("Not yet implemented");
	}

	@Test
	void testPerimeter() {
		fail("Not yet implemented");
	}

	@Test
	void testArea() {
		fail("Not yet implemented");
	}

}
