/* Oppgave G1 (Kvadrat) - Oppgave 6.2 i Java boka
 * ----------------------------------
 * Lag en ny klasse Kvadrat som har kun en heltallig
 * objektvariabel sidelengde, en konstruktør og metoder 
 * for å beregne både arealet og omkretsen av kvadratet,
 * samt lengden av diagonalen.
 * 
 * Kvadrat-objekt skal unne tegne seg ut i konsollvinduet
 * ved sidelegnde både som (antall) linjer og kolonner.
 * Bruk stjerner som tegnesymbol.
 * 
 * Skriv et testprogram som kan håndtere tre slike Kvadrat-
 * objekt kv3, kv4, kv5, dvs. opprette dem, tegne dem og vise
 * informasjon om både areal, omkrets og diagonal.
 * 
 * Utvid klassen med en objektmetode som avgjør om kvadrat kan
 * skrives som en "sum" av to andre Kvadrat-objekt (parametre).
 * Her skal metodekallet kv5.sum(kv3, kv4) returnere true.
 */
package no.hvl.dat100;

public class Kvadrat {
	
	int sidelengde;
	
	public Kvadrat(int sidelengde) {
		this.sidelengde = sidelengde;
	}
	
	public int areal() {
		return sidelengde*sidelengde;
	}
	
	public int omkrets() {
		return sidelengde*4;
	}
	
	public double diagonal() {
		return Math.sqrt(2)*sidelengde;
	}
	
	public void skrivUt() {
		for (int i = 0; i < sidelengde; i++) {
			for (int j = 0; j < sidelengde; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public boolean sum(Kvadrat a, Kvadrat b) {
		return areal() == (a.areal() + b.areal());
	}
}
