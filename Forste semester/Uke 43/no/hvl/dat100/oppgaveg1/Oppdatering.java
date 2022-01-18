/* Oppgave G1 - Utvidet for-løkke og oppdatering av tabeller
 * ----------------------------------
 * a) Kjør programmet. Blir resultatet som ønsket dvs. 
 * 	  blir tabellen oppdatert?
 * b) Skriv om programmet ovenfor slik at tabellen blir
 * 	  korrekt oppdatert dvs.
 * c) Kjør programmet. Oppdateres objektene som ønskes i utvidet
 *    for-løkke? Hvorfor virker en utvidet for-løkke her mens
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
	 * Nei, resultatet blir ikke som ønsket. Tabellen
	 * oppdateres ikke.
	 */
	
	// b
	/*
	 * Usikker løsning, men funker.
	 */
	// c
	/*
	 * Fordi her så endres verdien av objektet med metoder inni
	 * Data-klassen.
	 */