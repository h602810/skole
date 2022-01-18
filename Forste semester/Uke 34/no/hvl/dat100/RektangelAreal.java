/* Uke 34 - Oppgave 1
	Lag et program som leser inn to heltall fra brukeren og skriver ut summen av de. 
	Modifiser programmet slik det kan beregne areal av et 
	rektangel der lengden og bredden på rektangelet leses inn fra brukeren.
*/

package no.hvl.dat100;
import static java.lang.System.*; // println osv.
import static java.lang.Math.*; // matte formler
import static java.lang.Integer.*; // int
import static java.lang.Double.*; // double
import static javax.swing.JOptionPane.*; // pop-up bokser
import java.io.*;   // File, PrintWriter
import java.util.*; // Scanner, Array

public class RektangelAreal {

 public static void main(String[] args) {

   // Les inn 
   String lengdeTekst = showInputDialog("Oppgi lengden til rektangelet i heltall:");
   int lengde = parseInt(lengdeTekst);
   String breddeTekst = showInputDialog("Oppgi bredden til rektangelet i heltall:");
   int bredde = parseInt(breddeTekst);

   // Beregning
   int areal = lengde * bredde;

   // Skriver ut resultat
   String utTekst = "Arealet til det oppgitte rektangelet er " + areal;
   showMessageDialog(null,utTekst);
 }

}