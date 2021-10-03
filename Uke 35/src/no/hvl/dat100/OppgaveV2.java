/* Oppgave V2 - Bruk av statisk import 
 * ----------------------------------
 * Skriv om B1-programmet for beregning av kulevolum
 * slik at det ikke bruker statisk import, og modifiser
 * programmet slik at det ikke oppstår kompileringsfeil.
 */

package no.hvl.dat100;

import java.lang.Math.*;
import java.lang.Integer.*;
import javax.swing.JOptionPane.*;

public class OppgaveV2 {
	
	public static void main(String[] args) {
		
		int radius = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Oppgi radius av kule i cm:"));
		int opphoyd = (int) Math.pow(radius, 3);
		int volum = (int) (4*Math.PI*opphoyd)/3;
		
		System.out.println("Volumet til kula er " + volum + "cm^3");
		
	}
	
}
