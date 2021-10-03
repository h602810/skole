/* Oppgave B2
 * ----------------------------------
 * Lag en klasse der du i main-metoden regner ut x^n p� 
 * begge m�ter (Math.pow & while-l�kke. Verdier til x 
 * og n skal leses inn fra tastaturet (dialogboks). 
 * Skriv ut resultatet med forklarende tekst.
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class OppgaveB2 {

	public static void main(String[] args) {
			
		double x = parseDouble(showInputDialog("Oppgi x: "));
		int n = parseInt(showInputDialog("Oppgi n: "));
		double test = 1.0;

		double resultat1 = Math.pow(x, n);
		
		System.out.println("Ved bruk av Math.pow metoden s� finner vi ut \n"
							+ "at resultatet av " + x + " opph�yd i " + n + " blir " + resultat1);
		
		while ( test * x < n ) {
			x *= test;
			test++;
		}
		

	}

}
