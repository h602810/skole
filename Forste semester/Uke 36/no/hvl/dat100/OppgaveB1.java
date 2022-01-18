/* Oppgave B1
 * ----------------------------------
 * Lag et program for � finne alle oddetallene
 * fra og med en nedre grense til og med en �vre
 * grense. 
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB1 {

	public static void main(String[] args) {
		
		int nedreGrense = parseInt(showInputDialog("Oppgi nedre grense:"));
		int ovreGrense = parseInt(showInputDialog("Oppgi �vre grense:"));
		
		String melding = ("Nedre grense: " + nedreGrense + "\n"
						+ "�vre grense: " + ovreGrense + "\n"
						+ "Resultat: " );
		
		for (int i = nedreGrense; i <= ovreGrense; i++) {
			if (i % 2 == 1) {
				melding += i + " ";
			}
			
		}
		
		showMessageDialog(null, melding);
		
	}
	
}
