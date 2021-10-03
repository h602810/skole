/* Forelesningsoppgave: HoydeGjennomsnitt
 * Lese inn et ukjent antall h�yder, avslutt innlesning n�r brukeren gir 0, skriv ut gjennomsnitt
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
			hoyde = parseInt(showInputDialog("Oppgi h�yde: \n" + "'0' for � avslutte programmet"));
			if (hoyde != 0) {
				hoydeAntall++;
				sum += hoyde;
			}
		} while (hoyde != 0);
		
		double gjennomsnitt = (double) sum / hoydeAntall;
		
		showMessageDialog(null, "Gjennomsnittet p� h�ydene oppgitt er " + gjennomsnitt + "cm");
		
	}
	
}