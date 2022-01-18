/* Oppgave B3 / K3O13 - Løkker
 * ----------------------------------
 * Lag et program som tegner en "murvegg",
 * dvs. et antall rektangler organisert i
 * rader og kolonner. Legg til at annenhver
 * rad starter med en halv murstein, og at 
 * det øvrige slutter med en halv murstein.
 */

package no.hvl.dat100;

import static java.lang.Integer.*;
import easygraphics.*;

public class OppgaveB3 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		final int VINDU_X = 400, VINDU_Y = 300;
		
		makeWindow("Murvegg", VINDU_X, VINDU_Y);
		
		// murvegg høyde
		int murveggHoyde = parseInt(getText("Oppgi høyde på murvegg:"));
		
		// steindimensjoner
		// b er bredde, h er høyde
		int steinPrRad = 10;
		int bredde = (int)Math.round(VINDU_X/(steinPrRad + 0.5));
		int hoyde = bredde/2;
		
		// tegn vegg
		setSpeed(1);	// hastighet på murlegging
		for(int radNr = 1; radNr <= murveggHoyde; radNr++) {
			int y = VINDU_Y - radNr*hoyde;
			int m = 0;
			// legger innledene halvdel
			if (radNr % 2 == 0) {
				int id = drawRectangle(0, -hoyde, bredde/2, hoyde);
				moveRectangle(id, 0, y);
				m = bredde/2;
			}
			// legger vanlig stein
			for (int stein = 0; stein < steinPrRad; stein++) {
				int id = drawRectangle(0, -hoyde, bredde, hoyde);
				moveRectangle(id, m+stein*bredde, y);
				pause(10);
			}
			// legger avsluttende halvdel
			if (radNr % 2 == 1) 
				drawRectangle((VINDU_X-bredde/2), y, bredde, hoyde);
		}
		
	}
		
}
