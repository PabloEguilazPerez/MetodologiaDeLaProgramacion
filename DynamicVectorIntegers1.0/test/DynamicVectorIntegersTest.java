import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynamicVectorIntegersTest {
	
	DynamicVectorIntegers vI1;

	@BeforeEach
	void setUp() throws Exception {
		
		vI1 = new DynamicVectorIntegers(new int[] { 1, 2, 3, 4, 5 });
		
	}

	@Test
	void testOnlyEven() {
		DynamicVectorIntegers vI2 = new DynamicVectorIntegers(new int[] { 2, 4 });
		assertEquals(vI2, vI1.onlyEven());
	}

}
