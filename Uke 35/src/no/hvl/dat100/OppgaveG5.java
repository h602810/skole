/* Oppgave G5 - Input og for-løkker
 * -----------------------------------
 * a) Skriv et program som leser et tall inn fra 
 *    brukeren og skriver dette tall ut på skjermen 
 *    via System.out.println-metoden.
 * b) Utvid programmet ovenfor med en for-løkke slik 
 *    programmet leser inn fem (5) tall og for hver 
 *    gang et tall er lest inn skrives dette ut på 
 *    skjermen.
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG5 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
		String tallTxt = showInputDialog("Gi et tall:");
		int tall = parseInt(tallTxt);
		System.out.println(tall);
		}

	}
}