// Test program for the class VectorIntegers

public class VectorIntegersMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a vector from an array
		int[] v = { 1, 2, 3, 4, 5 };

		VectorIntegers vI1 = new VectorIntegers(v);
		vI1.show();

        // Modify an element
		// vOI[2]=26 // We would like that
		vI1.set(2, 26);
		vI1.show();

		// Update an element based on another
		vI1.set(1, vI1.get(2) + 10);
		vI1.show();

		// Display the vector using toString()
		System.out.println("vI1: " + vI1);

		// Now some interesting algorithms (implemented with static methods ...Test)

		// Create another vector
		VectorIntegers vI2 = new VectorIntegers(new int[] { 7, 3, 6, 5, 26, 36, 4 });
		System.out.println("Vector2:" + vI2);

		// 1.- Check if a value is in the vector
		System.out.print("The element 5 ");
		if (vI2.member(5))
			System.out.print("is");
		else
			System.out.print("is not");
		System.out.println(" in the vector vector");

		System.out.println("The element 8 is " + (vI2.member(8) ? "" : "not") + " in the vector");

		// 2.- Get the first position in the vector of a value ( or -1 if the value is
		// not in the vector)
		System.out.println("Position of 6 in the vector: " + vI2.position(6));
		System.out.println("Position of 12 in the vector: " + vI2.position(12));

		// 3.- Get the maximum value of the vector
		int max = vI2.searchMaximum();
		System.out.println("The maximum is: " + max);

		// 4.- Sort the elements of the vector in ascending order
		System.out.println("vI2 before sorting: " + vI2);
		vI2.sortVector();
		System.out.println("vI2 after sorting:" + vI2);

		// 5.- Check if all elements of the vector are contained in another

		boolean h = vI1.isContained(vI2);

		System.out.println(h);

		// 6.- Check if a vector is sorted

		boolean h1 = vI1.isSorted();

		// 7.- Check if a sorted vector contains a value x (dichotomic search) and if
		// true return a position in which x is

		//int pos = vI1.dichotomicSearch(23);
		//System.out.println(pos);

		// 8.- Tell if the values of the vector appear in another
		// in the same order and consecutive
		// from any position in the second. If true, return the position of the first
		// time they appear

		int pos1 = vI1.isSubVector(vI2);

		// . . .
	}
}
