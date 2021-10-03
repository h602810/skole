package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Klasse {
	public static void main(String[] args) {
		
		int klasseAntall = parseInt(showInputDialog("Oppgi antall studenter i klassen: "));
		
		for ( int i = 0; i < klasseAntall; i++) {
			int nr = parseInt(showInputDialog("Oppgi studentnummeret til student "));
			String fnavn = showInputDialog("Oppgi fornavn p� student " + nr);
			String enavn = showInputDialog("Oppgi etternavn p� student " + nr);
			Student s = new Student(nr, fnavn, enavn);
			s.skrivUt();
		}

// uten konstrukt�r i Student og uten skrivUt
//		for (int i = 0; i < klasseAntall; i++) {
//			Student s = new Student();
//			s.studNr = parseInt(showInputDialog("Oppgi studentnummeret til student "));
//			s.fornavn = showInputDialog("Oppgi fornavn p� student " + s.studNr);
//			s.etternavn = showInputDialog("Oppgi etternavn p� student " + s.studNr);
//			System.out.println("Student " + s.studNr + " heter " + s.fornavn + " " + s.etternavn);
//		}
		
	}
}