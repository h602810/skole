/* Uke 34 - Oppgave 2
	Metoden min i klassen Math finner det minste av to tall dvs. min(1,10) = 1. 
	Bruk denne metoden til å beregne og skrive ut det minste av 4 tall som brukeren 
	skriver inn. Benytt gjerne sammensatte metodekall.
*/

package no.hvl.dat100;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class MinsteTall {

public static void main(String[] args) {

// Les inn 
String tallTekst1 = showInputDialog("Oppgi 4 heltall:");
int tall1 = parseInt(tallTekst1);
String tallTekst2 = showInputDialog("Oppgi 4 heltall:");
int tall2 = parseInt(tallTekst2);
String tallTekst3 = showInputDialog("Oppgi 4 heltall:");
int tall3 = parseInt(tallTekst3);
String tallTekst4 = showInputDialog("Oppgi 4 heltall:");
int tall4 = parseInt(tallTekst4);

// Beregning
int minste1 = Math.min(tall1, tall2);
int minste2 = Math.min(tall3, minste1);
int minste3 = Math.min(tall4, minste2);
	
// Skriver ut resultat
String utTekst = "Det minste av de 4 tallene oppgitt er " + minste3;
showMessageDialog(null,utTekst);
}

}