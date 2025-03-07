// Program that test the class DynamicVectorIntegers
public class DynamicVectorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a dynamic vector from a static one
		int[] v = { 1, 2, 3, 4, 5 };
		// int [] v = null;
		DynamicVectorIntegers dVI = new DynamicVectorIntegers(v);
		dVI.show();

		// Modify the dynamic vector and observe the changes

		dVI.add(5);
		dVI.add(25);
		dVI.show();

		/*
		 * //dVI[2]=26; That would be nice dVI.set(2, 26); dVI.show();
		 * 
		 * dVI.set(1, dVI.get(2)+10); dVI.show();
		 */

		dVI.remove(2);
		dVI.show();

		dVI.erase();
		dVI.show();
		dVI.insert(dVI.length(), 100);
		dVI.show();

		/*
		 * dVI.push(1000); dVI.show();
		 * 
		 * int x = dVI.pop(); dVI.show();
		 * 
		 * dVI.remove(4); dVI.show();
		 * 
		 * dVI.add(-25); dVI.show();
		 * 
		 */

		// Now, some interesting algorithms (Implemented in the class
		// DynamicVectorIntegers)

		// 1.- Get from a dVI another that contain only the even numbers

		// DynamicVectorIntegers dVI1 = dVI.onlyEven();
		// dVI1.show();

		// 2.- Check if all elements in the vector provided as parameter are contained
		// in this vector

		// boolean h = dVI.contains(dVI1);

		// System.out.println(h);

		// 3.- Remove all elements that are negative

		// int[] v1 = {-1,-2,1,-2,2,-3,-4,-5,3,-6,4};
		// DynamicVectorIntegers dVI3 = new DynamicVectorIntegers(v1);
		// dVI3.removeNegatives();
		// dVI3.show();

		// 4.- Of course: sort a dVI (ascending)

		// dVI.sort();

		// 5.- Check if a vector is sorted

		// boolean h1 = dVI.isSorted();

		// 6.- The same as in 2., but assuming that the two dVIs are sorted

		// boolean h2 = dVI.containsSorted(dVI1);

		// 7.- Remove duplicated values in a sorted dVI

		// dVI.removeDuplicatesSorted();

		// 8.- Remove all instances of x in a vector (not necessarily sorted)

		// dVI.removeAllInstances(25);

		// 9.- Insert a new element in a sorted dVI maintaining it sorted

		// dVI.insertSorted(23);

		// 10.- Given another dVI, both sorted, get another dVI that contains all
		// elements from
		// both sorted as well.

		// DynamicVectorIntegers dVI2 = dVI.mixSorted(dVI1);

		// 11.- Return a new vector as the concatenation of this one and other given as
		// parameter.

		// DynamicVectorIntegers dVI4 = dVI.concat(dVI1);
		// dVI4.show();

		// 12.- Given another dVI, identify if the values from the vector given as
		// parameter appear in this one in the same order and consecutively
		// from any position. If this is true, return the position of the first time it
		// appears

		// int pos1 = dVI1.isSubVector(dVI2);

	}
}
