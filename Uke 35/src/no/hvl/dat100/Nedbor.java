/* Forelesningsoppgave: Nedbør
 * Lese inn nedbør for hver dag i en uke og beregne totalsummen.
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Nedbor {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <=7; i++) {
			int nedborTall = parseInt(showInputDialog("Oppgi nedbør for dag " + i + ":"));
			System.out.println("Dag " + i + " nedbørsmengde: " + nedborTall);
			sum += nedborTall;
		}
		
		System.out.println("---------------------------\n" + "Total nedborsmengde: " + sum);
		
		
	}
	
}