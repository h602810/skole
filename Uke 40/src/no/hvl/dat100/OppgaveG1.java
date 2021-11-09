/* Oppgave G1 - Oppgave 6.2 i Java boka
 * ----------------------------------
 * Lag en ny klasse Kvadrat som har kun en heltallig
 * objektvariabel sidelengde, en konstruktør og metoder 
 * for å beregne både arealet og omkretsen av kvadratet,
 * samt lengden av diagonalen.
 * 
 * Kvadrat-objekt skal unne tegne seg ut i konsollvinduet
 * ved sidelengde både som (antall) linjer og kolonner.
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

public class OppgaveG1 {
	public static void main(String[] args) {
		Kvadrat k3 = new Kvadrat(3);
		Kvadrat k4 = new Kvadrat(4);
		Kvadrat k5 = new Kvadrat(5);
		
		System.out.println("Kvadratinfo: \n" 
							+ "----------------------------\n"
							+ "Sidelengde: " + k3.sidelengde + "\n"
							+ "Areal: " + k3.areal() + "\n"
							+ "Omkrets: " + k3.omkrets() + "\n"
							+ "Diagonal: " + k3.diagonal() + "\n");
		k3.skrivUt();
		k4.skrivUt();
		k5.skrivUt();
		
		if(k5.sum(k3, k4)) {
			System.out.println("k5^2 = k3^2 + k4^2");
		} else 
			System.out.println("Ikke kvadratsum!");
	}
}
