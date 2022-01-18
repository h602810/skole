/* Oppgave B4 - Tabeller og decimaltall
 * ----------------------------------
 * Lag et program for å lese inn temperaturen
 * i Bergen for et bestemt klokkeslett for alle
 * dager i en bestemt uke (dvs. 7 temperaturer)
 * Temperaturer skal lagres i en tabell.
 * Programmet skal videre finne og skrive ut
 * gj.snittet av disse verdiene og den høyeste
 * temperaturen for hele uken.
 */

package no.hvl.dat100;

import static java.lang.System.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		// tittel - analyse av temperaturer
		out.println("Analyse av temperaturer\n" +
					"***********************\n" +
					"Temperaturene for uka var:");
		
		// temperaturer for uka
		int ant_dager = 7;	// antall dager i uka
		double maxTemp = -20;
		double totalSum = 0;
		
		for (int i = 0; i < ant_dager; i++) {
			double temperatur = parseDouble(showInputDialog("Oppgi dagnr " + (i+1) + " sin temperatur klokka 13: "));
			out.println((i+1) + ". dag: " + temperatur);
			if (temperatur > maxTemp) {
				maxTemp = temperatur;
			}
			totalSum += temperatur;
		}
		double snittTemp = Math.round(totalSum/ant_dager * 10) / 10.0;
		
		out.println("\nGjennomsnittstemperaturen var " + snittTemp + " grader.");
		out.println("Maksimumstemperaturen for denne uka var " + maxTemp + " grader.");
		

	}
}
