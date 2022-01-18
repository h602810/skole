/* Oppgave B2 - Uttrykk og vekslepenger 
 * ----------------------------------
 * Skriv program som leser inn pris og et bel�p
 * (begge heltall) som er betalt og beregner hvor
 * mange 10 og 1-kr kunden skal ha igjen i veksle-
 * penger slik at kunden f�r f�rrest mulig antall
 * mynter tilbake.
 * 
 * -- valgte selv � lage litt vanskeligere --
 */

package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB2 {
	
	public static void main(String[] args) {
		
		int pris = parseInt(showInputDialog("Oppgi pris:"));
		int belop = parseInt(showInputDialog("Oppgi bel�p:"));
		
		int vekslepenger = belop - pris;
		int printVeksel = vekslepenger;
		
		int ant20kr = vekslepenger/20;
		vekslepenger = vekslepenger - (ant20kr*20);
		int ant10kr = vekslepenger/10;
		vekslepenger = vekslepenger - (ant10kr*10);
		int ant5kr = vekslepenger/5;
		vekslepenger = vekslepenger - (ant5kr*5);
		int ant1kr = vekslepenger%10;
		
		showMessageDialog(null, "Du f�r igjen " + printVeksel + "kr \n"
							+ ant20kr + " - 20 kroninger" + "\n"
							+ ant10kr + " - 10 kroninger" + "\n"
							+ ant5kr + " - 5 kroninger" + "\n"
							+ ant1kr + " - 1 kroninger");
		
	}

}
