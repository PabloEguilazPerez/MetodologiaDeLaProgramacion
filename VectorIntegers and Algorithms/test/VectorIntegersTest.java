
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class VectorIntegersTest {

	/**
	 * Test method for {@link VectorIntegers#length()}.
	 */
	@Test
	void testLength() {
		// The length of an empty vector should be 0
		VectorIntegers v = new VectorIntegers();
		assertEquals(0, v.length());

		// The length of a vector with 5 slots should be 5
		v = new VectorIntegers(5);
		assertEquals(5, v.length());
	}

	/**
	 * Test method for {@link VectorIntegers#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		// A vector without contect is empty
		VectorIntegers v = new VectorIntegers();
		assertTrue(v.isEmpty());

		// But if it contains anything, then it is not empty
		v = new VectorIntegers(1);
		assertFalse(v.isEmpty());
	}

	/**
	 * Test method for {@link VectorIntegers#get(int)}.
	 */
	@Test
	void testGet() {
		VectorIntegers v = new VectorIntegers(1);
		// If we set the value 7 in the first position ...
		v.set(0, 7);
		// we should get that very value
		assertEquals(7, v.get(0));
	}

	/**
	 * Test method for {@link VectorIntegers#toString()}.
	 */
	@Test
	void testToString() {
		int[] aux = { 1, 2, 3, 4, 5 };
		VectorIntegers v = new VectorIntegers(aux);

		// The toString method should return a string with the content of the vector
		assertEquals("[ 1 2 3 4 5 ]", v.toString());
	}

	/**
	 * Test method for {@link VectorIntegers#set(int, int)}.
	 */
	@Test
	void testSet() {
		VectorIntegers v = new VectorIntegers(1);
		// If we set the value 7 in the first position ...
		v.set(0, 7);
		// we should get that very value
		assertEquals(7, v.get(0));
	}


	/**
	 * Test method for {@link VectorIntegers#member(int)}.
	 */
	@Test
	void testMember() {
		VectorIntegers v = new VectorIntegers(new int[]{1, 2, 3, 4, 5});
		assertTrue(v.member(3), "Value 3 should be in the vector");
		assertFalse(v.member(6), "Value 6 should not be in the vector");
	}


	/**
	 * Test method for {@link VectorIntegers#position(int)}.
	 */
	@Test
	void testPosition() {
		VectorIntegers v = new VectorIntegers(new int[]{1, 2, 3, 4, 5});
		assertEquals(2, v.position(3), "Value 3 should be at index 2");
		assertEquals(-1, v.position(6), "Value 6 should return -1 as it's not in the vector");
	}

	/**
	 * Test method for {@link VectorIntegers#searchMaximum()}.
	 */
	@Test
	void testSearchMaximum() {
		VectorIntegers v = new VectorIntegers(new int[]{1, 2, 3, 4, 5});
		assertEquals(5, v.searchMaximum(), "Maximum value should be 5");

		v = new VectorIntegers(new int[]{5, 4, 3, 2, 1});
		assertEquals(5, v.searchMaximum(), "Maximum value should still be 5");

		v = new VectorIntegers(new int[]{0});
		assertEquals(0, v.searchMaximum(), "Maximum value should be 0 in a single-element");
	}
	
	/**
	 * Test method for {@link Vector#sortVector()}.
	 */
	 @Test
	    void testSortVector() {
	        VectorIntegers v = new VectorIntegers(new int[]{5, 3, 4, 1, 2});
	        v.sortVector();
	        assertEquals("[ 1 2 3 4 5 ]", v.toString(), "Vector should be sorted in ascending order");

	        v = new VectorIntegers(new int[]{1, 2, 3, 4, 5});
	        v.sortVector();
	        assertEquals("[ 1 2 3 4 5 ]", v.toString(), "Already sorted vector should remain unchanged");

	        v = new VectorIntegers(new int[]{5, 5, 5});
	        v.sortVector();
	        assertEquals("[ 5 5 5 ]", v.toString(), "Vector with identical elements should remain unchanged");

	        v = new VectorIntegers(new int[]{});
	        v.sortVector();
	        assertEquals("[ ]", v.toString(), "Empty vector should remain unchanged after sorting");
	    }
}
