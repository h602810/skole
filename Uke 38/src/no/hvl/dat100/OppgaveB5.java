/* Oppgave B5 / K3O14 - Løkker
 * ----------------------------------
 * Lag et program som tegner en slags blink.
 * Sirklene innover blinken må ha samme sentrum
 * og en jevnt avtagende radius.
 * Les inn det ønskede antallet sirkler (2-10)
 * fra brukeren.
 * Ytterste sirkel må være svart!
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import easygraphics.*;

public class OppgaveB5 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		int antall = parseInt(showInputDialog("Oppgi antall sirkler: "));
		
		if (antall < 2 || antall > 10) {
			showMessageDialog(null, "Ulovlig verdi!");
		} else {
			makeWindow("Oppgave B5", 400, 400);
			int radius = 200;
			int x = 200, y = 200;
			
			for (int i = 0; i < antall; i++) {
				setColor(0, 0, 0);
				fillCircle(x, y, radius);
				radius -= 10;
				setColor(255, 255, 255);
				fillCircle(x, y, radius);
				radius -= 10;
			}
		}
		
	}

}
