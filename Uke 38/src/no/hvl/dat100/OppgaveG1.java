/* Oppgave G1 - Tabeller
 * ----------------------------------
 * a) Legg inn en tabell med heltall int[] 
 * 	  tabell = {1, 3, 4, 7, 9, 10} i main-metoden.
 * b) Legg til kode i main-metoden som skriver ut 
 *    innholdet/verdien som står på posisjon 2 i 
 *    tabellen (riktig svar er 4).
 * c) Legg til kode i main-metoden som endrer 
 * 	  innholdet som er lagret på posisjon 2 fra 
 *    verdien 4 til verdien 7.
 * d) Legg til kode i main-metoden som skriver ut 
 *    innholdet av tabellen ved bruk av en for-løkke 
 *    med indeks.
 * e) Flytt koden fra d) ut i en egen metode public 
 *    void skrivUt(int[] tab) som kan skrive ut 
 *    innholdet av en tabell. Kall skrivUt-metoden 
 *    fra main-metoden.
 * f) Modifiser metoden fra e) slik den bruker en 
 *    utvidet for-løkke.
 * g) Skriv en metode public void finnes
 *    (int[] tabell, int tall) som returnerer true 
 *    om tall finnes i tabellen og false ellers. 
 *    Bruk en while-løkke.
 * h) Skriv en metode public int[] skiftfortegn 
 *    (int[] tabell) som returnerer en ny tabell 
 *    som er identisk med tabellen gitt med som 
 *    parameteren med hvor alle verdier har fått 
 *    endret fortegn.
 */

package no.hvl.dat100;

public class OppgaveG1 {

	public static void main(String[] args) {
		// a
		int[] tabell = {1, 3, 4, 7, 9, 10};
		
		// b
		System.out.print("b) ");
		System.out.println(tabell[2]);
		
		// c
		tabell[2] = 7;
		
		// d
		System.out.print("d) ");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		
		// e
		System.out.print("\ne) ");
		skrivUt(tabell);
			
		// f - test
		System.out.print("\nf) ");
		skrivUt2(tabell);
		
		// g - test
		System.out.println("\ng) " + finnes(tabell, 4));
		
		// h - test
		int[] nyTabell = skiftfortegn(tabell);
		System.out.print("f) ");
		skrivUt(nyTabell);
	}
	
	// e
	public static void skrivUt(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	}
	
	// f
	public static void skrivUt2(int[] tab) {
		for (int i : tab) {
			System.out.print(i + " ");
		}
	}
	
	// g
	public static boolean finnes(int[] tabell, int tall) {
		int i = 0;
		boolean sjekk = false;
		while (i < tabell.length) {
			if (tabell[i] == tall) {
				sjekk = true;
			}
			i++;
		}
		return sjekk;
	}
	
	// h
	public static int[] skiftfortegn(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
//			System.out.print("-" + i + " ");
			nyTabell[i] = tabell[i] * -1;
		}
		return nyTabell;
	}

}
