/* Uke 34 - Oppgave 4
	Lag et program som regner en tid gitt i hele sekunder 
	om til timer, minutter og sekunder. Antall sekunder leses inn fra dialogboks.
	Svaret skal skrives på formatet: 1 timer, 1 minutter, 30 sekunder 
	(alt skrives på samme linje).
*/

/* <algoritmebeskrivelse> */
/* Beregningene utføres i den rekkefølgen at man først deler sekundene på 3600 for
  	å få antall timer, deretter fjerner man de sekundene fra antall timer fra totaltsekundene
  	så deler man totalsekundene på 60 for å finne minuttene og fjerner sekundene fra antall minutter 
  	på samme måte som timene fra totalsekundene. Til slutt finner man restsekundene fra de totalsekundene
  	man har igjen
 */

package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class SekundOmgjoring {

public static void main(String[] args) {

// Les inn 
int sekunderTotalt = parseInt(showInputDialog("Oppgi antall sekunder: "));
int total = sekunderTotalt;

// Beregning
int timer = sekunderTotalt / 3600;
sekunderTotalt = sekunderTotalt - (timer*3600);
int minutter = sekunderTotalt / 60;
sekunderTotalt = sekunderTotalt - (minutter*60);
int sekunder = sekunderTotalt % 60;
	
// Skriver ut resultat
String utTekst = total + " sekunder er lik: \n" + timer + " timer " + 
				minutter + " minutter " + sekunder + " sekunder";
showMessageDialog(null,utTekst);
}

}