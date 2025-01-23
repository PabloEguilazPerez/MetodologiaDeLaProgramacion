
// Class that allows us to represent vectors of integers  (int)
//  It includes methods like set, get, length, ...

import java.util.Arrays;

public class VectorIntegers {

	// data representation
	private int[] data;

	// Constructors

	/**
	 * default constructor
	 */
	public VectorIntegers() { // default constructor
		data = new int[0]; // Default to an empty array
	}

	/**
	 * copy constructor
	 * 
	 * @param vOI vector to replicate
	 */
	public VectorIntegers(VectorIntegers vOI) { // copy constructor
		data = new int[vOI.length()];
		for (int i = 0; i < data.length; i++)
			data[i] = vOI.get(i);
	}

	/**
	 * constructor from the vector size
     * Initializes all elements to 0.
	 * 
	 * @param size vector size
	 */
	public VectorIntegers(int size) {
		data = new int[size];
		for (int i = 0; i < data.length; i++)
			data[i] = 0;
	}

	/**
	 * constructor from a Java array
	 * 
	 * @param v array to duplicate
	 */
	public VectorIntegers(int[] v) {
		if (v == null)
			data = null;
		else {
			data = new int[v.length];
			for (int i = 0; i < data.length; i++)
				data[i] = v[i];
		}
	}

	// Getters

	/**
	 * Returns the length of the vector
	 * 
	 * @return vector length
	 */
	public int length() {
		if (data == null)
			return 0;
		else
			return data.length;
	}

	/**
	 * Checks if a vector has size 0
	 * 
	 * @return true if the vector is empty or true otherwise
	 */
	public boolean isEmpty() {
		return length() == 0;
	}

	/**
	 * Getter of one element from the vector
	 * 
	 * @param i  the index of the element
	 * @return the element at the specified index
	 */
	public int get(int i) {
		return data[i];
	}
	
	 /**
     * Returns a string representation of the vector.
     * 
     * @return a string representation of the vector
     */
    @Override
	public String toString() {
		String s;
		s = "[ ";
		for (int i = 0; i < length(); i++)
			s += data[i] + " ";
		s += "]";

		return s;
	}

	/**
	 * Prints the vector's details to the console
	 */
	public void show() {
		System.out.println("\nVectorIntegers");
		System.out.printf("Length: %d\n", length());
		System.out.println("Data: " + toString());
	}

	// Setters

	/**
	 * Modifies the value of an element at the specified position
	 * 
	 * @param i the index of the element
	 * @param x new value
	 */
	public void set(int i, int x) {
		data[i] = x;
	}

	// Other useful methods
	
	/**
	 * Checks if a value is present in the vector.
	 * 
	 * @param x value to search for
	 * @return true if the value is found, false otherwise
	 */
	public boolean member(int x) {
		// TODO
		for (int i = 0; i < data.length; i++) {
			if (data[i] == x) {
				return true;
			}
		}
		
		return false;

	}

	/**
	 * Finds the first occurrence of a value in the vector.
	 * 
	 * @param x value to find
	 * @return the index of the value, or -1 if not found
	 */
	public int position(int x) {
		// TODO
		for (int i = 0; i < data.length; i++) {
			if (data[i] == x) {
				return i;
			}
		}
		
		return -1;

	}

	/**
	 * Search the maximum value of a non empty vector of integers
	 * 
	 * @return the maximum value
	 */
	public int searchMaximum() {
		// TODO
		int max = data[0];
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		
		return max;
	}

	/**
	 * Sorts the elements of the vector in ascending order
	 * 
	 */
	public void sortVector() {
		// TODO
		int aux;
		
		for (int i = 1; i < data.length - 1; i++) {
			for (int j = 0; j < (data.length - i); j++) {
				if (data[j] > data[j + 1]) {
					aux = data[j];
					data[j] = data[j + 1];
					data[j + 1] = aux;
				}
			}
		}
		
	}
	
	
	public boolean isContained(VectorIntegers vI2) {
		
		for (int i = 0; i < data.length - 1; i++) {
			if (vI2.position(data[i]) == -1) 
				return false;
		}
		
		return true;
		
	}
	
	public boolean isSorted() {
	
		for (int i = 1; i < data.length - 1; i++) {
			if (data[i - 1] > data[i]) {
				return false;
			}
		}
		
		return true;
	
	}
	

	public int isSubVector(VectorIntegers vI2) {

		boolean isSubVector = true;

		for (int i = 0; i <= vI2.length() - this.length(); i++) {

			for (int j = 0; j < this.length(); j++) {
				if (vI2.get(i + j) != this.get(j)) {
					isSubVector = false;
					break;
				}
			}

			if (isSubVector) {
				return i;
			}
		}

		return -1;

	}
}
