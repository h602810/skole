/* Oppgave V1 - Valgsetninger
 * ------------------------------------------------
 * a) Lag et program som leser inn tre heltall fra brukeren, og skriver 
 * 	  ut igjen tallene sortert i stigende rekkef�lge.
 * 		1. L�s oppgaven ved bare � bruke if-setninger.
 * 		2. L�s oppgaven ved � bruke if-else-setninger.
 */
package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveV1 {

	public static void main(String[] args) {
		
		int tall1 = parseInt(showInputDialog("Oppgi heltall 1"));
		int tall2 = parseInt(showInputDialog("Oppgi heltall 2"));
		int tall3 = parseInt(showInputDialog("Oppgi heltall 3"));

		String mld = null;
		
		if (tall1 > tall2) {
			if (tall2 > tall3) {
				mld = "Stigende rekkef�lge - " + tall1 + " " + tall2 + " " + tall3;
			} else {
				mld = "Stigende rekkef�lge - " + tall1 + " " + tall3 + " " + tall2;
			}
		} else if (tall2 > tall1) {
			if (tall1 > tall3) {
				mld = "Stigende rekkef�lge - " + tall2 + " " + tall1 + " " + tall3;
			} else {
				mld = "Stigende rekkef�lge - " + tall2 + " " + tall3 + " " + tall1;
			}
		} else if (tall3 > tall2) {
			if (tall2 > tall1) {
				mld = "Stigende rekkef�lge - " + tall3 + " " + tall2 + " " + tall1;
			} else {
				mld = "Stigende rekkef�lge - " + tall3 + " " + tall1 + " " + tall2;
			}
		}
		
		
		/* if (tall1 > tall2) {
			if (tall2 > tall3) {
				mld = tall1 + " " + tall2 + " " + tall3;
			}
			if (tall2 < tall3) {
				mld = tall1 + " " + tall3 + " " + tall2;
			}
		}
		if (tall2 > tall1) {
			if (tall1 > tall3) {
				mld = tall2 + " " + tall1 + " " + tall3;
			}
			if (tall1 < tall3) {
				mld = tall2 + " " + tall3 + " " + tall1;
			}
		}
		if (tall3 > tall2) {
			if (tall2 > tall1) {
				mld = tall3 + " " + tall2 + " " + tall1;
			}
			if (tall2 < tall1) {
				mld = tall3 + " " + tall1 + " " + tall2;
			}
		} */
		
		System.out.println(mld);
		
	}
	
}
