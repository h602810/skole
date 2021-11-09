/* DAT100 – Filer - Oppgave
 * -----------------------------
 * Kan du skrive et program som leser en navneliste, 
 * sorterer den alfabetisk også skriver det sorterte 
 * resultatet ut til en ny fil?
 */

package no.hvl.dat100;

import java.io.*;
import java.util.*;

public class SotertNavnliste {
	public static void main(String[] args) throws Exception{
		// Åpner filen for lesing
		String filnavn = "navn.txt";
		Scanner leser = new Scanner(new File(filnavn));
		
		String[] navnTab;
		int maks = leser.nextInt();
		leser.nextLine();
		navnTab = new String[maks];
		
		// Leser filen inn i ny tabell
		for (int i = 0; i < maks; i++) {
			System.out.println();
			navnTab[i] = leser.nextLine();
		}
		leser.close();
		
		// Sorterer den alfrabetisk
		Arrays.sort(navnTab);
		
		// Skriver det sorterte resultatet til en ny fil
		filnavn = "sortert.txt";
		PrintWriter skriver = new PrintWriter(new File(filnavn));
		for (int j = 0; j < navnTab.length; j++) {
			skriver.println(navnTab[j]);
		}
		skriver.close();
	}
}
