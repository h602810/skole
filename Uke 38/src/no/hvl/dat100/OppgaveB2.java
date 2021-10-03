/* Oppgave B2 - Metoder og løkker
 * ----------------------------------
 * a) Utvid klassen ovenfor med en metode private static 
 *    int lesInnTall(String message) som leser inn et tall 
 *    via showInputDialog og returner heltallverdien. 
 *    Parametren message er den tekst som skal vises i 
 *    dialogboksen.
 * b) Modifiser main-metoden i programmet ovenfor slik den 
 *    bruker metoden fra a) til å lese inn høyde og bredde.
 * c) Utvid metoden lesInnTall fra a) slik metoden fortsetter 
 *    med å lese inn et tall inntil tallet er positivt. 
 *    Hint: bruk en do-while løkke.
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB2 {

	public static void main(String[] args) {
		
		// b
		int bredde = lesInnTall("Bredde: ");
		int hoyde = lesInnTall("Høyde: ");

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
	
	private static int lesInnTall(String message) {
		// a
//		int tall = parseInt(showInputDialog(message));
//		return tall;
		
		// c
		int tall;
		do {
			tall = parseInt(showInputDialog(message));
		} while (tall < 0);
		
		return tall;
	}
	
}