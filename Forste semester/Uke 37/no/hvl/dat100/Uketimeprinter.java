package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Uketimeprinter {

	public static void main(String[] args) {
		String[] dag = {"mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag", "søndag"};
		int[] innLes = new int[7];

		for (int i = 0; i < innLes.length; i++) {
			innLes[i] = parseInt(showInputDialog("Hvor mange timer jobbet du på " + dag[i] + "?"));
			
			String[] dag2 = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};
			
			if (innLes[i] == 1) {
				System.out.print(dag2[i] + " jobbet du " + innLes[i] + " time.\n");
			} else {
			System.out.print(dag2[i] + " jobbet du " + innLes[i] + " timer.\n");
			}
		}
		
	}

}
