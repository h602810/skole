/* Oppgave B1 - Filer og unntak
 * ----------------------------------
 * a) Se p� side 274 i Java.boken og start 
 * 	  med � kj�re programmet ovenfor ved eks. 
 * 	  ved � angi LeseFraFil.java som filnavn.
 * b) Unntaket FileNotFoundException kan 
 *    kastes/signaleres om filen vi fors�ker � 
 *    �pne ikke finnes. Siden det er et 
 *    sjekket-unntak (checked exception) m� vi 
 *    bruke en throws-klausul for � angi at koden 
 *    potensielt kan signalere et slik unntak. 
 *    Kj�r programmet � hva skjer om filen ikke finnes? 
 *    For � fremprovosere unntaket m� du taste inn et 
 *    filnavn som ikke finnes.
 * c) Skriv koden ovenfor om slik der brukes en try-catch 
 *    blokk til � fors�ke � lese inn innholdet i filen 
 *    og slik FileNotFoundException unntaket fanges opp 
 *    med en catch og en feilmelding gis til brukeren. 
 *    Kj�r programmet � hva skjer n� om filen ikke finnes?
 * d) Utvid programmet slik brukeren f�r et antall fors�k 
 *    til � angi en fil som finnes. N�r antall fors�k er 
 *    oppbrukt skal programmet stoppe.
 * e) Skriv om programmet slik det bruker klassen 
 * 	  BufferedReader til � lese en innholdet av filen. 
 *    Generelt sett er bruken av denne klassen mer 
 *    effektiv ift. Scanner da den leser st�rre mengder 
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
