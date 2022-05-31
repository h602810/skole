package SortingTimer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;

public class Timer {
	private static int malinger = Integer.parseInt(JOptionPane.showInputDialog("antall maalinger pr n"));
	private static int n1 = 5000;
	private static int n2 = 25000;
	private static int n3 = 50000;
    private static Integer[] tab1 = new Integer[n1];
    private static Integer[] tab2 = new Integer[n2];
    private static Integer[] tab3 = new Integer[n3];
    
    public static void main(String[] args) {
    	/*
    	 * Oppgave 1a)
    	 * 
    	 * teoretisk tid finner c med gjennomsnitt av to maalinger med 50000 elementer
    	 */
    	timeInsert(malinger, n1, n2, n3);
    	timeSelection(malinger, n1, n2, n3);
    	timeQuick(malinger, n1, n2, n3);
    	timeMerge(malinger, n1, n2, n3);
    	
    	/*
    	 * Oppgave 1b)
    	 * 
    	 * Går raskere med kun like elementer
    	 */
        timeQuickLike(malinger, n1, n2, n3);
    }
    
    // timeInsert
 	public static void timeInsert(int malingpr, int n1, int n2, int n3) {
 		String desc = String.format("%-10s %-10s %10s %10s\n", "n", "| Antall målinger", "| målt tid (gjennomsnitt)", "| Teoretisk tid");	// antall målinger?
 		desc += "------------------------------------------------------------------------\n";
 	    ArrayList<String> insertionsort = new ArrayList<String>();
 		
 		double c1 = 0.0000017816;
 		
 		// n1
     	long malinger1_a = 0;
     	double malinger1_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab1, n1);
 	    	long startInsertion = System.nanoTime();	// start tidsmåling
 	    		InsertionSort.insertionSort(tab1, n1);
	    	long finishInsertion = System.nanoTime();	// slutt tidsmåling
	    	malinger1_a = finishInsertion - startInsertion;
			malinger1_b = TimeUnit.MILLISECONDS.convert(malinger1_a, TimeUnit.NANOSECONDS);
 	    }
 		String insertion1 = String.format("%-10s %-10s %15s %25s\n", n1, "| " + malingpr, "| " + malinger1_b + "ms", "| " + String.format("%.2f",c1*n1*n1) + "ms");
 	
 		// n2
 		long malinger2_a = 0;
     	double malinger2_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab2, n2);
 	    	long startInsertion = System.nanoTime();	// start tidsmåling
 	    		InsertionSort.insertionSort(tab2, n2);
	    	long finishInsertion = System.nanoTime();	// slutt tidsmåling
	    	malinger2_a = finishInsertion - startInsertion;
			malinger2_b = TimeUnit.MILLISECONDS.convert(malinger2_a, TimeUnit.NANOSECONDS);
 	    }
 		String insertion2 = String.format("%-10s %-10s %16s %26s\n", n2, "| " + malingpr, "| " + malinger2_b + "ms", "| " + String.format("%.2f",c1*n2*n2) + "ms");
 		
 		// n3
 		long malinger3_a = 0;
     	double malinger3_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab3, n3);
 	    	long startInsertion = System.nanoTime();	// start tidsmåling
 	    		InsertionSort.insertionSort(tab3, n3);
	    	long finishInsertion = System.nanoTime();	// slutt tidsmåling
	    	malinger3_a = finishInsertion - startInsertion;
			malinger3_b = TimeUnit.MILLISECONDS.convert(malinger3_a, TimeUnit.NANOSECONDS);
 	    }
 		String insertion3 = String.format("%-10s %-10s %17s %26s\n", n3, "| " + malingpr, "| " + malinger3_b + "ms", "| " + String.format("%.2f",c1*n3*n3) + "ms");
 		
 		// print
 		String resultatInsertion = String.format("%40s", "Insertion Sort:\n");
 	    insertionsort.add(resultatInsertion + "\n" + desc + insertion1 + insertion2 + insertion3);
 	    
 		for (String part : insertionsort) {
 			   System.out.println(part);
 		}
 	
 		System.out.println();
 	}
 	
 	// timeSelection
 	public static void timeSelection(int malingpr, int n1, int n2, int n3) {
 		String desc = String.format("%-10s %-10s %10s %10s\n", "n", "| Antall målinger", "| målt tid (gjennomsnitt)", "| Teoretisk tid");	// antall målinger?
 		desc += "------------------------------------------------------------------------\n";
 	    ArrayList<String> selectionsort = new ArrayList<String>();
 		
 		double c2 = 0.0000011024;
 		
 		// n1
     	long malinger1_a = 0;
     	double malinger1_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab1, n1);
 	    	long startSelection = System.nanoTime();	// start tidsmåling
 	    		SelectionSort.selectionSort(tab1, n1);
	    	long finishSelection = System.nanoTime();	// slutt tidsmåling
	    	malinger1_a = finishSelection - startSelection;
			malinger1_b = TimeUnit.MILLISECONDS.convert(malinger1_a, TimeUnit.NANOSECONDS);
 	    }
 		String selection1 = String.format("%-10s %-10s %15s %25s\n", n1, "| " + malingpr, "| " + malinger1_b + "ms", "| " + String.format("%.2f",c2*n1*n1) + "ms");
 	
 		// n2
     	long malinger2_a = 0;
     	double malinger2_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab2, n2);
 	    	long startSelection = System.nanoTime();	// start tidsmåling
 	    		SelectionSort.selectionSort(tab2, n2);
	    	long finishSelection = System.nanoTime();	// slutt tidsmåling
	    	malinger2_a = finishSelection - startSelection;
			malinger2_b = TimeUnit.MILLISECONDS.convert(malinger2_a, TimeUnit.NANOSECONDS);
 	    }
 		String selection2 = String.format("%-10s %-10s %15s %25s\n", n2, "| " + malingpr, "| " + malinger2_b + "ms", "| " + String.format("%.2f",c2*n2*n2) + "ms");
 		
 		// n3
     	long malinger3_a = 0;
     	double malinger3_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab3, n3);
 	    	long startSelection = System.nanoTime();	// start tidsmåling
 	    		SelectionSort.selectionSort(tab3, n3);
	    	long finishSelection = System.nanoTime();	// slutt tidsmåling
	    	malinger3_a = finishSelection - startSelection;
			malinger3_b = TimeUnit.MILLISECONDS.convert(malinger3_a, TimeUnit.NANOSECONDS);
 	    }
 		String selection3 = String.format("%-10s %-10s %15s %25s\n", n3, "| " + malingpr, "| " + malinger3_b + "ms", "| " + String.format("%.2f",c2*n3*n3) + "ms");
 		
 		// print
 		String resultatSelection = String.format("%40s", "Selection Sort:\n");
 		selectionsort.add(resultatSelection + "\n" + desc + selection1 + selection2 + selection3);
 	    
 		for (String part : selectionsort) {
 			   System.out.println(part);
 		}
 	
 		System.out.println();
 	}
 	
 	// timeQuick
 	public static void timeQuick(int malingpr, int n1, int n2, int n3) {
 		String desc = String.format("%-10s %-10s %10s %10s\n", "n", "| Antall målinger", "| målt tid (gjennomsnitt)", "| Teoretisk tid");	// antall målinger?
 		desc += "------------------------------------------------------------------------\n";
 	    ArrayList<String> quicksort = new ArrayList<String>();
 		
 		double c3 = 0.00001665637338;
 		
 		// n1
     	long malinger1_a = 0;
     	double malinger1_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab1, n1);
 	    	long startQuick = System.nanoTime();	// start tidsmåling
 	    		QuickSort.quickSort(tab1, n1);
	    	long finishQuick = System.nanoTime();	// slutt tidsmåling
	    	malinger1_a = finishQuick - startQuick;
			malinger1_b = TimeUnit.MILLISECONDS.convert(malinger1_a, TimeUnit.NANOSECONDS);
 	    }
 		String quick1 = String.format("%-10s %-10s %15s %25s\n", n1, "| " + malingpr, "| " + malinger1_b + "ms", "| " + String.format("%.2f",c3*n1*log2(n1)) + "ms");
 		
 		// n2
     	long malinger2_a = 0;
     	double malinger2_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab2, n2);
 	    	long startQuick = System.nanoTime();	// start tidsmåling
 	    		QuickSort.quickSort(tab2, n2);
	    	long finishQuick = System.nanoTime();	// slutt tidsmåling
	    	malinger2_a = finishQuick - startQuick;
			malinger2_b = TimeUnit.MILLISECONDS.convert(malinger2_a, TimeUnit.NANOSECONDS);
 	    }
 		String quick2 = String.format("%-10s %-10s %15s %25s\n", n2, "| " + malingpr, "| " + malinger2_b + "ms", "| " + String.format("%.2f",c3*n2*log2(n2)) + "ms");
 		
 		// n3
     	long malinger3_a = 0;
     	double malinger3_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab3, n3);
 	    	long startQuick = System.nanoTime();	// start tidsmåling
 	    		QuickSort.quickSort(tab3, n3);
	    	long finishQuick = System.nanoTime();	// slutt tidsmåling
	    	malinger3_a = finishQuick - startQuick;
			malinger3_b = TimeUnit.MILLISECONDS.convert(malinger3_a, TimeUnit.NANOSECONDS);
 	    }
 		String quick3 = String.format("%-10s %-10s %15s %25s\n", n3, "| " + malingpr, "| " + malinger3_b + "ms", "| " + String.format("%.2f",c3*n3*log2(n3)) + "ms");
 		
 		// print
 		String resultatQuick = String.format("%40s", "Quick Sort:\n");
 		quicksort.add(resultatQuick + "\n" + desc + quick1 + quick2 + quick3);
 	    
 		for (String part : quicksort) {
 			   System.out.println(part);
 		}
 	
 		System.out.println();
 	}
 	
 	// timeMerge
 	public static void timeMerge(int malingpr, int n1, int n2, int n3) {
 		String desc = String.format("%-10s %-10s %10s %10s\n", "n", "| Antall målinger", "| målt tid (gjennomsnitt)", "| Teoretisk tid");	// antall målinger?
 		desc += "------------------------------------------------------------------------\n";
 	    ArrayList<String> mergesort = new ArrayList<String>();
 		
 		double c4 = 0.00009737572127;
 		
 		// n1
     	long malinger1_a = 0;
     	double malinger1_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab1, n1);
 	    	long startMerge = System.nanoTime();	// start tidsmåling
 	    		MergeSort.mergeSort(tab1, n1);
	    	long finishMerge = System.nanoTime();	// slutt tidsmåling
	    	malinger1_a = finishMerge - startMerge;
			malinger1_b = TimeUnit.MILLISECONDS.convert(malinger1_a, TimeUnit.NANOSECONDS);
 	    }
 		String merge1 = String.format("%-10s %-10s %15s %25s\n", n1, "| " + malingpr, "| " + malinger1_b + "ms", "| " + String.format("%.2f",c4*n1*log2(n1)) + "ms");
 		
 		// n2
     	long malinger2_a = 0;
     	double malinger2_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab2, n2);
 	    	long startMerge = System.nanoTime();	// start tidsmåling
 	    		MergeSort.mergeSort(tab2, n2);
	    	long finishMerge = System.nanoTime();	// slutt tidsmåling
	    	malinger2_a = finishMerge - startMerge;
			malinger2_b = TimeUnit.MILLISECONDS.convert(malinger2_a, TimeUnit.NANOSECONDS);
 	    }
 		String merge2 = String.format("%-10s %-10s %15s %25s\n", n2, "| " + malingpr, "| " + malinger2_b + "ms", "| " + String.format("%.2f",c4*n2*log2(n2)) + "ms");
 		
 		// n3
     	long malinger3_a = 0;
     	double malinger3_b = 0;
 	    
 	    for (int i = 0; i <= malingpr; i++) {
 	    	fyllTab(tab3, n3);
 	    	long startMerge = System.nanoTime();	// start tidsmåling
 	    		MergeSort.mergeSort(tab3, n3);
	    	long finishMerge = System.nanoTime();	// slutt tidsmåling
	    	malinger3_a = finishMerge - startMerge;
			malinger3_b = TimeUnit.MILLISECONDS.convert(malinger3_a, TimeUnit.NANOSECONDS);
 	    }
 		String merge3 = String.format("%-10s %-10s %15s %25s\n", n3, "| " + malingpr, "| " + malinger3_b + "ms", "| " + String.format("%.2f",c4*n3*log2(n3)) + "ms");
 		
 		// print
 		String resultatMerge = String.format("%40s", "Merge Sort:\n");
 		mergesort.add(resultatMerge + "\n" + desc + merge1 + merge2 + merge3);
 	    
 		for (String part : mergesort) {
 			   System.out.println(part);
 		}
 	
 		System.out.println();
 	}	
 	
 	// b) timeQuickLike
  	public static void timeQuickLike(int malingpr, int n1, int n2, int n3) {
  		String desc = String.format("%-10s %-10s %10s %10s\n", "n", "| Antall målinger", "| målt tid (gjennomsnitt)", "| Teoretisk tid");	// antall målinger?
  		desc += "------------------------------------------------------------------------\n";
  	    ArrayList<String> quicksort = new ArrayList<String>();
  		
  		double c5 = 0.000007687556943;
  		
  		// n1
      	long malinger1_a = 0;
      	double malinger1_b = 0;
  	    
  	    for (int i = 0; i <= malingpr; i++) {
  	    	fyllTabLik(tab1, n1);
  	    	long startQuick = System.nanoTime();	// start tidsmåling
  	    		QuickSort.quickSort(tab1, n1);
 	    	long finishQuick = System.nanoTime();	// slutt tidsmåling
 	    	malinger1_a = finishQuick - startQuick;
 			malinger1_b = TimeUnit.MILLISECONDS.convert(malinger1_a, TimeUnit.NANOSECONDS);
  	    }
  		String quick1 = String.format("%-10s %-10s %15s %25s\n", n1, "| " + malingpr, "| " + malinger1_b + "ms", "| " + String.format("%.2f",c5*n1*log2(n1)) + "ms");
  		
  		// n2
      	long malinger2_a = 0;
      	double malinger2_b = 0;
  	    
  	    for (int i = 0; i <= malingpr; i++) {
  	    	fyllTabLik(tab2, n2);
  	    	long startQuick = System.nanoTime();	// start tidsmåling
  	    		QuickSort.quickSort(tab2, n2);
 	    	long finishQuick = System.nanoTime();	// slutt tidsmåling
 	    	malinger2_a = finishQuick - startQuick;
 			malinger2_b = TimeUnit.MILLISECONDS.convert(malinger2_a, TimeUnit.NANOSECONDS);
  	    }
  		String quick2 = String.format("%-10s %-10s %15s %25s\n", n2, "| " + malingpr, "| " + malinger2_b + "ms", "| " + String.format("%.2f",c5*n2*log2(n2)) + "ms");
  		
  		// n3
      	long malinger3_a = 0;
      	double malinger3_b = 0;
  	    
  	    for (int i = 0; i <= malingpr; i++) {
  	    	fyllTabLik(tab3, n3);
  	    	long startQuick = System.nanoTime();	// start tidsmåling
  	    		QuickSort.quickSort(tab3, n3);
 	    	long finishQuick = System.nanoTime();	// slutt tidsmåling
 	    	malinger3_a = finishQuick - startQuick;
 			malinger3_b = TimeUnit.MILLISECONDS.convert(malinger3_a, TimeUnit.NANOSECONDS);
  	    }
  		String quick3 = String.format("%-10s %-10s %15s %25s\n", n3, "| " + malingpr, "| " + malinger3_b + "ms", "| " + String.format("%.2f",c5*n3*log2(n3)) + "ms");
  		
  		
  		// print
  		String resultatQuick = String.format("%40s", "Quick Sort (all elements alike):\n");
  		quicksort.add(resultatQuick + "\n" + desc + quick1 + quick2 + quick3);
  	    
  		for (String part : quicksort) {
  			   System.out.println(part);
  		}
  	
  		System.out.println();
  	}
 	
 	// Help-methods
 	public static void fyllTab(Integer[] tabell, int num) {
        for(int i = 0; i < num; i++) {
            int random = (int) (Math.random() * num);
            tabell[i] = random;
        }
    }
 	
 	public static void fyllTabLik(Integer[] tabell, int num) {
        for(int i = 0; i < num; i++) {
            tabell[i] = 5463;
        }
    }
 	
 	public static double log2(int x) {
    	return (Math.log(x) / Math.log(2));
    }
 	
} // end-class
