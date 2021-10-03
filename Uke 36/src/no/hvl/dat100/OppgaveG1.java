/* Oppgave G1
 * ----------------------------------
 * Lag et program som skriver tallene
 * fra 1 opptil med ikke verdien av
 * variabelen n.
 * 
 * Ved negativ verdi av n kjører ikke programmet
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG1 {
	
	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Oppgi tallet n"));
		
		for(int i = 1; i < n; i++) {
			System.out.println(i);
		}
		
	}
	
}
