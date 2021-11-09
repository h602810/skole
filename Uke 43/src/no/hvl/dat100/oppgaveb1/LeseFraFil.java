/* Oppgave B1 - Filer og unntak
 * ----------------------------------
 * a) Se på side 274 i Java.boken og start 
 * 	  med å kjøre programmet ovenfor ved eks. 
 * 	  ved å angi LeseFraFil.java som filnavn.
 * b) Unntaket FileNotFoundException kan 
 *    kastes/signaleres om filen vi forsøker å 
 *    åpne ikke finnes. Siden det er et 
 *    sjekket-unntak (checked exception) må vi 
 *    bruke en throws-klausul for å angi at koden 
 *    potensielt kan signalere et slik unntak. 
 *    Kjør programmet – hva skjer om filen ikke finnes? 
 *    For å fremprovosere unntaket må du taste inn et 
 *    filnavn som ikke finnes.
 * c) Skriv koden ovenfor om slik der brukes en try-catch 
 *    blokk til å forsøke å lese inn innholdet i filen 
 *    og slik FileNotFoundException unntaket fanges opp 
 *    med en catch og en feilmelding gis til brukeren. 
 *    Kjør programmet – hva skjer nå om filen ikke finnes?
 * d) Utvid programmet slik brukeren får et antall forsøk 
 *    til å angi en fil som finnes. Når antall forsøk er 
 *    oppbrukt skal programmet stoppe.
 * e) Skriv om programmet slik det bruker klassen 
 * 	  BufferedReader til å lese en innholdet av filen. 
 *    Generelt sett er bruken av denne klassen mer 
 *    effektiv ift. Scanner da den leser større mengder 
 *    av data fra fil om gangen.
 */
package no.hvl.dat100.oppgaveb1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/oppgaveb1/";

	static public void main(String[] args) throws FileNotFoundException {
		String filnavn = "";
		
		int i = 3;
		
		do {
			try {
				filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);
				i--;
				File file = new File(MAPPE_STR + filnavn);
				BufferedReader reader = new BufferedReader(new FileReader(file));
		
				int linenumber = 1;
				
				// les innhold i filen linje for linje
				String line;
		
				while (reader.ready()) {
					line = reader.readLine();
					System.out.println(linenumber + " " + line);
					linenumber++;
				}
		
				reader.close();
			} catch(FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
			}
			catch(IOException f) {
				JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + f.getMessage());
			}
		} while (i > 0);
	}
}
