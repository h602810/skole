package MergeSort;

/*
 * M E R G E     S O R T
 * -------------------------------
 * LOGIC:
 * 		 Uses the same idea as QuickSort
 * 		 of divide and conquer. It divides
 * 		 the input array into two halves,
 * 		 calls itself for the two halves,
 * 		 and then merges the two sorted
 * 		 halves. 
 * Steps:
 * 1. Create temp arrays
 * 2. Compares the elements of two subarrays
 * 		and merges them.
 * 3. Copies the remaining elements of L[],
 * 		if there are any.
 * 4. Copies the remaining elements of R[],
 * 		if there are any.
 * 
 * O - N O T A T I O N
 * -------------------------------
 * Time complexity: O(n log (n))
 * 					(best, average, worst)
 * 
 * Two functions are involved in this algorithm:
 *  - The merge() function is used for merging
 *  	two halves.
 *  - The Mergesort() function recursively calls
 *  	itself to divide the array till size
 *  	becomes one.
 */

public class MergeSort {
	/*
	 * R E C U R S I V E   M E T H O D
	 */
	public static <T extends Comparable<? super T>> void mergeSort(T[] a, int n) {
		mergeSort(a, 0, n-1);
	}
	
	public static <T extends Comparable<? super T>> void mergeSort(T[] a, int first, int last) {
		// The cast is safe because the new array contains null entries
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Comparable<?>[a.length]; // unchecked cast
		mergeSort(a, tempArray, first, last);
	}
	
	private static <T extends Comparable<? super T>> void mergeSort(T[] a, T[] tempTab, int first, int last) {
		if (first >= last) { // Basecase: 0 or 1 element
			// does nothing
		} else {
			int middle = (first + last) / 2;
			mergeSort(a, tempTab, first, middle);	// Sorts left part
			mergeSort(a, tempTab, middle+1, last);	// Sorts right part
			merge(a, tempTab, first, middle, last);	// Merges together
		}
	}
	
	private static <T extends Comparable<? super T>> void merge(T[] a, T[] tempTab, int first, int middle, int last) {
		/*
		 * Merges together two parts that is besides eachother. 
		 * first, ..., middle and middle + 1, ..., last
		 */
		int firstV = first;
		int endV = middle;
		int firstH = middle + 1;
		int endH = last;
		
		// As long as its an element in both parts, move the smallest over to tempTab
		int index = firstV;	// Next available location in tempArray
		for (; (firstV <= endV) && (firstH <= endH); index++) {
			if (a[firstV].compareTo(a[firstH]) < 0) {
				tempTab[index] = a[firstV];
				firstV++;
			} else {
				tempTab[index] = a[firstH];
				firstH++;
			}
		}
		
		// Now will one of the parts be two. Copy over the rest in the second part.
		
		// Left part, can be empty
		for (; firstV <= endV; firstV++, index++) {
			tempTab[index] = a[firstV];
		}
		
		// Right part, can be empty
		for (; firstH <= endH; firstH++, index++) {
			tempTab[index] = a[firstH];
		}
		
		// Copies the sorted part back
		for (index = first; index <= last; index++) {
			a[index] = tempTab[index];
		}
	}
}