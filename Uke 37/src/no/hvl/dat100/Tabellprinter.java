package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Tabellprinter {

	public static void main(String[] args) {
		int antallInnles = parseInt(showInputDialog("Oppgi lengde på tabell: "));
		double[] innLes = new double[antallInnles];
		
		System.out.print("[");
		
		for (int i = 0; i < innLes.length; i++) {
			innLes[i] = parseDouble(showInputDialog("Oppgi tall: " + i));
//			System.out.print("Indeks " + i + " inneholder " + innLes[i] + "\n");
			System.out.print(" " + innLes[i]);
		}
		
		System.out.println(" ]");

	}

}
