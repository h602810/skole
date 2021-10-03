/* Oppgave B1 - Uttrykk og kulevolum 
 * ----------------------------------
 * Skriv program som beregner volum av en kule
 * ved bruk av Math-biblioteket
 */

package no.hvl.dat100;

import static java.lang.Math.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB1 {
	
	public static void main(String[] args) {
		
		double radius = parseDouble(showInputDialog("Oppgi radius av kule i cm:"));
		double opphoyd = pow(radius, 3);
		double volum = (4*PI*opphoyd)/3;
		double rundetOpp = round(volum*100.0)/100.0;
		
		System.out.println("Volumet til kula er " + rundetOpp + "cm^3");
		
	}
	
}
