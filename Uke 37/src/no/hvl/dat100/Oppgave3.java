/* Oppgave 3
 * ----------------------------------
 * Lag et program som presenterer kjønnsfordelingen
 * i tre skoleklasser som delte linjediagram.
 */

package no.hvl.dat100;

import easygraphics.*;

public class Oppgave3 extends EasyGraphics {
	   
	   public static void main(String [] args) {
	       launch(args);
	   }

	   public void run() {
		   makeWindow("Kjønnsfordeling", 500, 350);
		   
		   int standardBredde = 400;
		   int hoyde = 50;
		   int y = 48;
		   int x = 50;
		   
		   int aBredde = standardBredde * 28/100;
		   int aBredde2 = standardBredde * 72/100;
		   
		   int bBredde = standardBredde * 38/100;
		   int bBredde2 = standardBredde * 62/100;
		   
		   int cBredde = standardBredde * 46/100;
		   int cBredde2 = standardBredde * 54/100;
		   
		   int[] breddeTabell = {aBredde, aBredde2, bBredde, bBredde2, cBredde, cBredde2};
		   
		   // tekst
		   setColor(0, 0, 0);
	       drawString("A", 250, y);
	       drawString("B", 250, y+100);
	       drawString("C", 250, y+200);
	       drawString("Gutter", 50, y);
	       drawString("Jenter", 415, y);
	       drawString("28%", 50, y+75);
	       drawString("72%", 415, y+75);
	       drawString("38%", 50, y+175);
	       drawString("62%", 415, y+175);
	       drawString("46%", 50, y+275);
	       drawString("54%", 415, y+275);
		   
	       // grafer
		   for (int i = 0; i <= 4; i +=2) {
		       setColor(0, 255, 0);
		       fillRectangle(50, x, breddeTabell[i], hoyde);
		       setColor(255, 0, 0);
		       fillRectangle(breddeTabell[i] + 50, x, breddeTabell[i+1], hoyde);
		       setColor(0,0,0);
		       drawRectangle(50, x, standardBredde, hoyde);
		       y += 100;
		       x += 100;
		   }
		   
	   }
}

/* ---- ALT FOR KOMPLISERT KODE ---- */
//		   int bredde = 400;
//		   int hoyde = 270;
//		   int rHoyde = 50;
//		   int rBredde = 375;
//		   int yPos = 30;
//		   int vsX = 10;
//		   int mellomrom = 80;
//		   int midten = 200;
//		   double prosentA = 0.28;
//		   int aBredde = (int)(rBredde*prosentA);
//		   double prosentB = 0.38;
//		   int bBredde = (int)(rBredde*prosentB);
//		   double prosentC = 0.46;
//		   int cBredde = (int)(rBredde*prosentC);
//		   
//	       makeWindow ("Kjønnsfordeling", bredde, hoyde);
//		   
//	       // tekst
//	       drawString("Gutter", vsX, 20);
//	       drawString("Jenter", 350, 20);
//	       drawString("A", midten, 25);
//	       drawString("B", midten, 100);
//	       drawString("C", midten, 180);
//	       
//	       // 28%
//	       setColor(0, 255, 0);
//	       fillRectangle(vsX, yPos, aBredde, rHoyde);
//	       setColor(0, 0, 0);
//	       drawString("28%", vsX, yPos*3);
//	       drawString("72%", 350, yPos*3);
//	       
//	       // 38%
//	       setColor(0, 255, 0);
//	       fillRectangle(vsX, yPos+mellomrom, bBredde, rHoyde);
//	       setColor(0, 0, 0);
//	       drawString("38%", vsX, yPos*3+mellomrom);
//	       drawString("62%", 350, yPos*3+mellomrom);
//	       
//	       // 46%
//	       setColor(0, 255, 0);
//	       fillRectangle(vsX, yPos+mellomrom*2, cBredde, rHoyde);
//	       setColor(0, 0, 0);
//	       drawString("46%", vsX, yPos*6+mellomrom);
//	       drawString("54%", 350, yPos*6+mellomrom);
//	       
//	       // resterende rødt
//	       setColor(255, 0, 0);
//	       fillRectangle(vsX+aBredde, yPos, rBredde-aBredde, rHoyde);
//	       fillRectangle(vsX+bBredde, yPos+mellomrom, rBredde-bBredde, rHoyde);
//	       fillRectangle(vsX+cBredde, yPos+mellomrom*2, rBredde-cBredde, rHoyde);
//	       
//	       // svart outline
//	       setColor(0, 0, 0);
//	       drawRectangle(vsX, yPos, rBredde, rHoyde);
//	       drawRectangle(vsX, yPos+mellomrom, rBredde, rHoyde);
//	       drawRectangle(vsX, yPos+mellomrom*2, rBredde, rHoyde);