/* Oppgave B2 - Oversvømmelse
 * ----------------------------------
 * 
 */
package no.hvl.dat100;

import easygraphics.*;

public class OppgaveB2 extends EasyGraphics {

	// nesten dekket hvis mindre en fra havoverflaten
	int NESTEN_DEKKET = 1;
	
	int RADIUS = 20; // radius for cirkler som skal tegnes
	int MARGIN = 50; // venstre/høyre margin i tegneområdet

	// terreng hogde
	int[][] terreng = { 
			{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 }, 
			{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
			{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } };

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		makeWindow("FLOODING", 800, 300);

		visualiser();
	}

	public void visualiser() {

		int y = 1;
		setColor(0,0,255); // blå - vann
		for (int i = 0; i < 3; i++) {
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN + 2*RADIUS , RADIUS);
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN*2 + 2*RADIUS , RADIUS);
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN*3 + 2*RADIUS , RADIUS);
			y++;
		}
		setColor(255,140,0); // oransje - søle
		for (int i = 0; i < 3; i++) {
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN + 2*RADIUS , RADIUS);
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN*2 + 2*RADIUS , RADIUS);
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN*3 + 2*RADIUS , RADIUS);
			y++;
		}
		setColor(222,184,135); // lysebrun - tørt
		for (int i = 0; i < 4; i++) {
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN + 2*RADIUS , RADIUS);
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN*2 + 2*RADIUS , RADIUS);
			fillCircle(MARGIN*y + 2*RADIUS , MARGIN*3 + 2*RADIUS , RADIUS);
			y++;
		}
		
		System.out.println("Angi havhøyde i tegnevinduet ...");
		int hav = Integer.parseInt(getText("havhøyde"));
		
		while (hav >= 0) {
			
			if (hav == 1) {
				
			}
			
			// TODO - SLUTT

			System.out.println("Angi havhøyde i tegnevinduet ...");
			hav = Integer.parseInt(getText("havhøyde"));
		}
	}
}
