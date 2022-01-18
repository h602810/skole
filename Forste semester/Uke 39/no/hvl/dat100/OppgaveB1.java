/* Oppgave B1 - Auditorie
 * ----------------------------------
 * a) Skriv kode som teller sammen hvor mange ledige plasser
 *    som er i auditoriet.
 * b) Skriv kode som finner og skriver ut hvor stor en
 * 	  prosentdel av plassene som er opptatt. Metoden
 * 	  skal virke generelt uavhengig av antall rad og
 *    antall plasser på hver rad.
 * c) Skriv kode som finner og skriver første ledige
 *    plass (rad og posisjon). Prøv å skrive kode som
 *    begynner på rad(rekke 0 og kode som begynner på
 *    siste rad.
 * d) Skriv en metode som bruker en dobbel for-løkke
 *    med return til å finne ut om det finnes en ledig
 *    plass. Skriv om til å bruke en dobbel utvidet
 *    for-løkke med return.
 * e) Skriv kode som sjekker om det er minimum to
 *    ledige plasser mellom personer i auditoriet (smittevern)
 *    
 */
package no.hvl.dat100;

public class OppgaveB1 {

	public static void main(String[] args) {

		boolean[][] aud = { 
							{ false, false, false, false}, // rad 0
							{ false, true, true,  false}, // rad 1
							{ true,  false, true,  true }, // rad 2
							{ true,  true,  true,  true }, // rad 3
															};

		// a 
		int antPlassA = 0;
		int antOpptatteA = 0;
		for (int i = 0; i < aud.length; i++) {
			for (int j = 0; j < aud[i].length; j++) {
				antPlassA++;
				if (aud[i][j])
					antOpptatteA++;
			}
		}
		int ledigeA = antPlassA - antOpptatteA;
		System.out.println(ledigeA + " ledige plasser");
			
		// b 
		double antPlassB = 0;
		double antOpptatte = 0;
		for (int i = 0; i < aud.length; i++) {
			for (int j = 0; j < aud[i].length; j++) {
				antPlassB++;
				if (aud[i][j])
					antOpptatte++;
			}
		}
		double gjsnitt = (antOpptatte / antPlassB) * 100;
		System.out.println(gjsnitt + "% av auditoriet er opptatt");
		
		// c
		int i = 0;
		int j = 0;
		while (aud[i][j] != true) {
			if (aud[i][j]) {
				System.out.print(i + " " + j);
			}
			i++;
			j++;
		}
	
	}
}
