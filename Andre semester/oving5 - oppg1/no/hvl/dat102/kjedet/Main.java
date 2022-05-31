package no.hvl.dat102.kjedet;

import javax.swing.JOptionPane;

import no.hvl.dat102.listeklient.Person;
import no.hvl.dat102.tabell.TabellOrdnetListe;

public class Main {
	public static void main(String[] args) {
		
		TabellOrdnetListe<Person> personTabell = new TabellOrdnetListe<>();
		KjedetOrdnetListe<Person> personKjedet = new KjedetOrdnetListe<>();
		
		for (int i = 0; i < 4; i++) {
			String personInfo = JOptionPane.showInputDialog("Oppgi film i form" + "\n" + "(fornavn;etternavn;fødselsår)");
			String[] pI = personInfo.split(";");
			personTabell.leggTil(new Person(pI[0], pI[1], Integer.parseInt(pI[2])));
			personKjedet.leggTil(new Person(pI[0], pI[1], Integer.parseInt(pI[2])));
		}
		
		System.out.println("Person tabell:");
		personTabell.visTab();
		System.out.println("Person kjedet:");
		personKjedet.visTab();
        
	}
}
