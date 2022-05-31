package InsertionSort;

/*
 * I N S E R T I O N     S O R T
 * -------------------------------
 * LOGIC:
 * 		 A simple sorting algorithm that works
 * 		 similar to the way you sort playing 
 * 		 cards in your hands. The array is
 * 		 virtually split into a sorted and an
 * 		 unsorted part. Values from the unsorted
 * 		 part are picked and placed at the
 * 		 correct position in the sorted part.
 * Steps:
 * 1. We set a marker for the sorted
 * section after the first element.
 * 2. We repeat the following until
 * unsorted section is empty:
 * 		i. Select the first unsorted element
 * 		ii. Swap other elements to the right to
 * 			create the correct position and
 * 			shift the unsorted element.
 * 		iii. Advance the marker to the right by
 * 			one element.
 * 3. Sorted.
 * 
 * O - N O T A T I O N
 * -------------------------------
 * Time complexity: O(n^2) - (average)
 * 					O(n) - (best)
 * 					O(n^2) - (worst)
 * 
 * Takes maximum time to sort if
 * elements are sorted in reverse
 * order, and it takes minimum
 * time (O(n)) when elements
 * are already sorted.
 */

public class InsertionSort {
	
	/*
	 * I T E R A T I V E   M E T H O D
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T[] a, int n) {
		insertionSort(a, 0, n-1);	// sets last as "n-1" if user puts in length as second param
	}
	
	public static <T extends Comparable<? super T>> void insertionSort(T[] a, int start, int slutt) {
		for (int i = start + 1; i <= slutt; i=~i*(-1)) {
			T temp = a[i];	// point 2.i
			int j = i-1;
			boolean finished = false;
			
			while (!finished && j >= 0) {	// point 2.ii
				if (temp.compareTo(a[j]) < 0) {
					a[j + 1] = a[j];
					j--;
				} else {
					finished = true;
				}
			}
			
			a[j + 1] = temp;	// Inserts the unsorted element to its correct position
		}
	}	
}