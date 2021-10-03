/* Oppgave B1 - Repetisjonsløkke og matematiske funksjoner
 * ----------------------------------
 * Lag en enkel klasse der du i main-metoden skriver
 * ut en tabell over sinus og cosinus til alle vinkler
 * mellom 0 og 180 grader, i steg på 15 grader.
 */

package no.hvl.dat100;

import static java.lang.System.*;
import static java.lang.Math.*;

public class OppgaveB1 {

	public static void main(String[] args) {
		
		String tekst = " x i grader" + "  x i radianer" + "  sin(x)" + "  cos(x)",
			   linje = "\n------------------------------------------------\n";
		out.print(tekst + linje);
		int vinkel = 0;
		
//		// for-løkke
//		for (vinkel = 0; vinkel <= 180; vinkel+=15) {
//			out.print("\n");
//			String xG = "       " + vinkel;
//			
//			double radianer = (PI * vinkel)/180;
//			double radi = round(radianer * 1000 ) / 1000.0;
//			String xR = "    " + radi;
//			
//			double sinus = sin(radi);
//			double sin = round(sinus * 1000) / 1000.0;
//			String xS = "    " + sin;
//			
//			double cosinus = cos(radi);
//			double cos = round(cosinus * 1000) / 1000.0;
//			String xC = "    " + cos;
//			
//			out.print(xG + "   " + xR + "   " + xS + "   " + xC);
//		}
		
		// while-løkke
		while (vinkel <= 180) {
			out.print("       ");
			out.print(vinkel);
			double radi = round(((PI * vinkel)/180.0)*1000) / 1000.0;
			out.print("          ");
			out.print(radi);
			out.print("     ");
			out.format("%.3f", sin(radi));
			out.print("     ");
			out.format("%.3f", cos(radi));;
			vinkel += 15;
			out.println();
		}
		
		out.print(linje);
		
	}

}
