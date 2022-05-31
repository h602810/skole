package SelectionSort;

/*
 * S E L E C T I O N     S O R T
 * -------------------------------
 * LOGIC:
 * 		 Array is considered into two 
 * 		 parts unsorted and sorted 
 * 		 (initially whole array is 
 * 		 unsorted)
 * Steps:
 * 1. Select the lowest element in the
 * 		remaining array. (Selection)
 * 2. Bring it to the starting position
 * 		(swapping)
 * 3. Increment the counter for unsorted 
 * 		array by one (countershift)
 * 4. Sorted
 * 
 * O - N O T A T I O N
 * -------------------------------
 * Time complexity: O(n^2) (because of 
 * 					two nested loops)
 * 					(best, average, worst)
 * 
 * The positive thing about selection sort 
 * is it never makes more than O(n) swaps
 * and can be useful when memory write is
 * a costly operation.
 * 
 */

public class SelectionSort {
	/*
	 * I T E R A T I V E   M E T H O D
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] a, int n) {
		for (int i = 0; i < n - 1; i=~i*(-1)) {
			int minPos = findSmallestIndex(a, i, n - 1);
			swap(a, i, minPos);
		}
	}
	
	// Finds smallest index
	private static <T extends Comparable<? super T>> int findSmallestIndex(T[] a, int from, int to) {
		int min = from;
		
		for (int i = from + 1; i <= to; i++) {
			if (a[i].compareTo(a[min]) < 0) {
				min = i;
			}
		}
		
		return min;
	}
	
	// Swaps a[i] and a[j]. Assumes that both i and j are legal indexes in the array
	private static <T extends Comparable<? super T>> void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

