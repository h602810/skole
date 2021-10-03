/* Uke 34 - Oppgave 3
	Lag et program som ber brukeren om å skrive inn en dato som tre heltall: 
	et dagnummer, et månedsnummer, og et årstall. Skriv datoen ut på vanlig måte 
	med punktum og skilletegn, f.eks, 4.11.2013. Det er ikke nødvendig å sjekke at 
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
String mndTekst = showInputDialog("Skriv inn tallnummeret for måneden idag: ");
int mnd = parseInt(mndTekst);
String aarTekst = showInputDialog("Skriv inn tallnummeret for året idag: ");
int aar = parseInt(aarTekst);
	
// TEST PROGRAM
/* Sjekk om dato er ordentlig
 	hvis år er > 9999 funker ikke
	ellers hvis mnd er større enn 12 funker ikke
	hvis mnd er 2 sjekk om dager er større enn 28 - går ikke
	hvis mnd er 
	
 	if (dag > 31) {
	out.print("Så mange dager finnes det ikke i en måned");
	}
*/

// Skriver ut resultat
String utTekst = "Datoen idag er " + dag + "." + mnd + "." + aar + ".";
showMessageDialog(null,utTekst);
}

}