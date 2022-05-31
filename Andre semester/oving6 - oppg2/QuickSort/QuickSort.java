package QuickSort;

import InsertionSort.InsertionSort;

/*
 * Q U I C K     S O R T
 * -------------------------------
 * LOGIC:
 * 		 Uses the idea of divide
 * 		 and conquer. It finds the
 * 		 element called Pivot which
 * 		 divides the array into two
 * 		 halves in such a way that
 * 		 elements in the left half
 * 		 are smaller than pivot and
 * 		 elements in the right are
 * 		 greater than pivot.
 * Steps (recursively):
 * 1. Bring the pivot to its appropriate
 * 		position such that left of the
 * 		pivot is smaller and right
 * 		is greater.
 * 2. Quick sort the left part.
 * 3. Quick sort the right part.
 * 4. Sorted.
 * 
 * O - N O T A T I O N
 * -------------------------------
 * Time complexity: O(n log (n)) (average case)
 * 	- BEST CASE O(n log n) (partition middle)
 * 		* Uses partition to go through the 
 * 			list, O(n) operations.
 *  - WORST CASE O(n^2) (sorted array)
 *  	* It will split the array from
 *  		index 1 through last, then 1
 *  		through last, the 2 through
 *  		last, and so do n, n-1, ...
 *  		n(n+1)/2 operations.
 *  	* Fix for worst case:
 *  		- Select middle element as pivot
 *  		- Select random element as pivot
 * 
 * Sorts an array into ascending order.
 * Uses quick sort with median-of-three
 * pivot selection for arrays of at least
 * MIN_SIZE entries, and uses insertion
 * sort for other arrays.
 */

public class QuickSort {
	/*
	 * R E C U R S I V E   M E T H O D
	 */
	public static final int MIN_SIZE = 5;
	
	public static <T extends Comparable<? super T>> void quickSort(T[] array, int n) {
		quickSort(array, 0, n - 1);
		InsertionSort.insertionSort(array, n);
	}
	
	public static <T extends Comparable<? super T>> void quickSort(T[] a, int first, int last) {
		if ( (last - first + 1) >= MIN_SIZE) {	// first > last, minimum two elements
			int p = partition(a, first, last);
			quickSort(a, first, p-1);
			quickSort(a, p+1, last);
		} // else basis, does nothing..
	}
	
	/*
	 * Patitions an array as part of quicksort into two subarrays
	 * called Smaller and Larger that are separated by a single
	 * entry called the pivot.
	 * 
	 * Entries in Smaller are <= pivot and appear before the pivot
	 * in the array.
	 * Entries in Larger are >= pivot and appear after the pivot
	 * in the array.
	 * 
	 * Parameters:
	 * - "a", which is an array of Comparable objects
	 * - "first", which is the integer index of the first array entry:
	 * 		* first >= 0 and < a.length
	 * - "last", which is the integer index of the last array entry:
	 * 		* last - first >= 3; last < a.length
	 * 
	 * Returns the index of the pivot
	 */
	private static <T extends Comparable<? super T>> int partition(T[] a, int first, int last) {
		int middle = (first + last) / 2;
		
		// Sorts first, middle and last element
		sortFirstMidLast(a, first, middle, last);
		
		// Move pivot next to last place
		swap(a, middle, last - 1);
		int pivotIndex = last - 1;
		T pivotValue = a[pivotIndex];
		
		/* 
		 * Find first in left part which is smaller/bigger than the pivot.
		 * Last in right part is smaller than pivot.
		 */
		int fromLeft = first + 1;
		int fromRight = last - 2;
		
		boolean finished = false;
		while (!finished) {
			
			while (a[fromLeft].compareTo(pivotValue) < 0) {
				fromLeft++;
			}
			
			while (a[fromRight].compareTo(pivotValue) > 0) {
				fromRight--;
			}
			
			if (fromLeft < fromRight) {
				swap(a, fromLeft, fromRight);
				fromLeft++;
				fromRight--;
			} else {
				finished = true;
			}
		}
		
		// Plave pivotValue between the subarrays Smaller and Larger
		swap(a, pivotIndex, fromLeft);
		pivotIndex = fromLeft;
		
		return pivotIndex;
	}
	
	/*
	 * Sorts the first, middle and last entries of an array into ascending order.
	 * 
	 * Parameters:
	 * - "a", which is an array of Comparable objects
	 * - "first", which is the integer index of the first array entry:
	 * 		* first >= 0 and < a.length
	 * - "last", which is the integer index of the last array entry:
	 * 		* last - first >= 3; last < a.length
	 */
	private static <T extends Comparable<? super T>> void sortFirstMidLast(T[] a, int first, int middle, int last) {
		order(a, first, middle);	// Makes a[first] <= a[middle]
		order(a, middle, last); 	// Makes a[middle] <= a[last]
		order(a, first, middle);	// Makes a[first] <= a[middle]
	}
	
	// Orders two given array elements into ascending order so that a[i] <= a[j]
	private static <T extends Comparable<? super T>> void order(T[] a, int i, int j) {
		if (a[i].compareTo(a[j]) > 0) {
			swap(a, i, j);
		}
	}
	
	// Swaps a[i] and a[j]. Assumes that both i and j are legal indexes in the array
	private static <T extends Comparable<? super T>> void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
