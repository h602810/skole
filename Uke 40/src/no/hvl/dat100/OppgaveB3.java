/* Oppgave B3 - Tabeller ("arrays") og strenger
 * --------------------------------------------
 * a) Lag en klasse med en main-metode som leser antall ord
 *    og oppretter en strengtabell med den gitte st�rrelsen.
 *    Les deretter ordene fra brukeren og plasser dem i tabellen.
 *    Skriv ut tabellen for � se at ordene er kommet inn.
 * b) Utvid main-metoden s� den leser inn et m�nster (streng).
 * 	  Tell hvor mange ord i tabellen fra pkt. a) som inneholder
 * 	  m�nsteret og skriv ut svaret.
 * 	  Se om det finnes en metode for � teste om en streng
 * 	  inneholder en gitt sekvens av tegn (char).
 * c) G� gjennom tabellen og skriv ut de midterste tegnene i hver
 * 	  steng der du bruker f�lgende regler.
 * 	  Dersom strengen inneholder bare ett tegn, skrives hele strengern
 *    ut.
 *    Dersom lengden er partall, skal de to midterste tegnene skrives
 *    ut.
 *    Dersom lengden er oddetall, skal de tre midterste tegnene skrives
 *    ut om strengen inneholder 3 tegn eller mer.
 * d) Lag en metode som skriver ut en streng baklengs:
 * e) Lag en metode som gitt en tabell av tekststrenger, returnerer den
 * 	  strengen i tabellen som kommer f�rst i (Unikode) alfabetet.
 * 	  Hint: Du skal brue en l�kke og CompareTo-metoden for strenger.
 * f) Implementer selv en CompareTo-metode tilsvarende metoden fra
 * 	  String-klassen brukt i pkt. e).
 *    Hint: Du skal bruke l�kke.
 */
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB3 {
	public static void main(String[] args) {
		// a 
		int antall = parseInt(showInputDialog("Oppgi antall ord: "));
		
		String[] stringarray = new String[antall];
		
		for (int i = 0; i < stringarray.length; i++) {
			String ord = showInputDialog("Oppgi ord");
			stringarray[i] = ord;
			System.out.print(stringarray[i] + " ");
		}
		System.out.println();
		
		// b, c, f mangler
		
		// test d
		String s = "Sindre";
		skrivUt(s);
		System.out.println();
		
		// test e
		System.out.println(firstString(stringarray));
		
		
	}
	
	// d
	public static String skrivUt(String s) {
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		return s;
	}
	
	// e
	public static String firstString(String[] s) {
		boolean status = false;
		int i = 0;
		
		while (i < s.length && status) {
			if (s[i].compareTo("a") < 0) {
				status = true;
				return s[i];
			}
			i++;
		}
		
		return s[i];
	}
		
	// f
	public static int compareToF(String s) {
		if (s.equals("s"))
			return 0;
		else
		
		return 0;
	}
		
}	