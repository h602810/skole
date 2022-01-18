/* Forelesningsoppgave: TerningKast
 * Antall kast før summen er lik 10
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TerningKast {

	public static void main(String[] args) {
		
		int antallKast = 0;
		int sum = 0;
		
		do {
			int kast = parseInt(showInputDialog("Terningkast?"));
			antallKast++;
			sum += kast;
		} while (sum < 10);
		
		showMessageDialog(null, "Antall kast: " + antallKast);
		
	}
	
}