/* Oppgave B3 - Valgsetninger 
 * ----------------------------------
 * Skriv program som leser inn brukernavn og passord, så sjekker om det er riktig.
 * Hvis ikke skriv ut feil brukernavn/passord.
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB3 {

	public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");
		String passord = showInputDialog("Passord :");
		
		String riktigNavn = "Sindre";
		String riktigPass = "123";
		
		if (brukernavn.equals(riktigNavn) && passord.equals(riktigPass)) {
			showMessageDialog(null, "Velkommen til habbo.no");
		} else {
			showMessageDialog(null, "Feil brukernavn/passord");
		}
		
	}
	
}