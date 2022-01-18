/* Oppgave G1 - Utvidet for-l�kke og oppdatering av tabeller
 * ----------------------------------
 * a) Kj�r programmet. Blir resultatet som �nsket dvs. 
 * 	  blir tabellen oppdatert?
 * b) Skriv om programmet ovenfor slik at tabellen blir
 * 	  korrekt oppdatert dvs.
 * c) Kj�r programmet. Oppdateres objektene som �nskes i utvidet
 *    for-l�kke? Hvorfor virker en utvidet for-l�kke her mens
 *    den ikke virket for oppdatering i deloppgave a)?
 */
package no.hvl.dat100.oppgaveg1;

public class Oppdatering {

	public static void main(String[] args) {
		
		int[] tab = {1,2,3,4,5,6};
		
		// skriv ut
		System.out.print("[ ");
		
		for (int x : tab) {
			System.out.print(x + " ");
		}
		
		System.out.println("]");
				
		// oppdater
		for (int x = 0; x < tab.length; x++) {
		  tab[x] += 1;
		}

		// skriv ut
		System.out.print("[ ");
		
		for (int x : tab) {
			System.out.print(x + " ");
		}
		
		System.out.println("]");
	}

}

	//a
	/*
	 * Nei, resultatet blir ikke som �nsket. Tabellen
	 * oppdateres ikke.
	 */
	
	// b
	/*
	 * Usikker l�sning, men funker.
	 */
	// c
	/*
	 * Fordi her s� endres verdien av objektet med metoder inni
	 * Data-klassen.
	 */