/* Uke 34 - Oppgave 3
	Lag et program som ber brukeren om � skrive inn en dato som tre heltall: 
	et dagnummer, et m�nedsnummer, og et �rstall. Skriv datoen ut p� vanlig m�te 
	med punktum og skilletegn, f.eks, 4.11.2013. Det er ikke n�dvendig � sjekke at 
	datoen er lovlig.
*/

package no.hvl.dat100;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Dato {

public static void main(String[] args) {

// Les inn 
String dagTekst = showInputDialog("Skriv inn tallnummeret for datoen idag: ");
int dag = parseInt(dagTekst);
String mndTekst = showInputDialog("Skriv inn tallnummeret for m�neden idag: ");
int mnd = parseInt(mndTekst);
String aarTekst = showInputDialog("Skriv inn tallnummeret for �ret idag: ");
int aar = parseInt(aarTekst);
	
// TEST PROGRAM
/* Sjekk om dato er ordentlig
 	hvis �r er > 9999 funker ikke
	ellers hvis mnd er st�rre enn 12 funker ikke
	hvis mnd er 2 sjekk om dager er st�rre enn 28 - g�r ikke
	hvis mnd er 
	
 	if (dag > 31) {
	out.print("S� mange dager finnes det ikke i en m�ned");
	}
*/

// Skriver ut resultat
String utTekst = "Datoen idag er " + dag + "." + mnd + "." + aar + ".";
showMessageDialog(null,utTekst);
}

}