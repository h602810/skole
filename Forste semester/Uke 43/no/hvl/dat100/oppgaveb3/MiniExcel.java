/* Oppgave B3 - Flerdimensjonale tabeller
 * ----------------------------------
 * a) Implementer metoden skrivUt()
 * b) Implementer metoden beregnSum() som summerer
 * 	  rekker og søyler og skriver summen i siste
 *    posisjon.
 */
package no.hvl.dat100.oppgaveb3;

public class MiniExcel {

	private static int[][] data = { 	
			{ 1, 2, 0 }, 
			{ 3, 4, 0 },
			{ 5, 6, 0 }, 
			{ 0, 0, 0 } 
			
	};

	public static void skrivUt() {

		System.out.println("---------------");

		for (int[] i : data) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("---------------");
	}

	public static void beregnSum() {
		int sum = 0;
		
		for (int i = 0; i < data[i].length; i++) {
			for (int j = 0; j < data[i].length-1; j++) {
				sum += data[i][j];
			}
			data[i][data[i].length-1] = sum;
			sum = 0;
		}
		
		int j;
		
		for (int i = 0; i < data[i].length; i++) {
			for (j = 0; j < data.length-1; j++) {
				sum += data[j][i];
			}
			data[j][i] = sum;
			sum = 0;
		}

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
