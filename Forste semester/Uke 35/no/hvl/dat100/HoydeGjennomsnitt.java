/* Forelesningsoppgave: HoydeGjennomsnitt
 * Lese inn et ukjent antall høyder, avslutt innlesning når brukeren gir 0, skriv ut gjennomsnitt
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class HoydeGjennomsnitt {

	public static void main(String[] args) {
		
		int hoydeAntall = 0;
		int sum = 0;
		int hoyde = 0;
		
		do {
			hoyde = parseInt(showInputDialog("Oppgi høyde: \n" + "'0' for å avslutte programmet"));
			if (hoyde != 0) {
				hoydeAntall++;
				sum += hoyde;
			}
		} while (hoyde != 0);
		
		double gjennomsnitt = (double) sum / hoydeAntall;
		
		showMessageDialog(null, "Gjennomsnittet på høydene oppgitt er " + gjennomsnitt + "cm");
		
	}
	
}