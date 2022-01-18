/* Oppgave G4 - Valgsetninger
 * -----------------------------------
 * a) Lag et program som leser inn to heltall a og 
 *    b, og skriver ut verdien av a/b hvis ikke b er 
 *    0, og en feilmelding ellers (siden det ikke 
 *    går an å dele med 0).
 * b) Test programmet med ulike verdier for (a,b)
 *    = (10,2), (9,2) og (8,0)
 */
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG4 {
	
	public static void main(String[] args) {
		
		// leser inn verdiene
		int a = parseInt(showInputDialog("Oppgi heltall a: "));
		int b = parseInt(showInputDialog("Oppgi heltall b: "));

		/* skriver ut verdiene av a/b hvis ikke b = 0
		 * og en feilmelding ellers */
		if (b != 0) {
			showMessageDialog(null, "a delt på b = " + a/b);
		} else {
			showMessageDialog(null, "Heltall b kan ikke være 0!");
		}
		
		
	}
	
}
