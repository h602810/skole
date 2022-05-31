package no.hvl.dat102.kjedet;

public class tester {
	public static void main(String[] args) {
		KjedetOrdnetListe<Integer> liste = new KjedetOrdnetListe<>();
		liste.leggTil(1);
		liste.leggTil(2);
		liste.leggTil(3);
		liste.visTab();
		System.out.println();
		
		// sjekk fjernFoerste
		liste.fjernFoerste();
		liste.visTab();
		System.out.println();
		
		// sjekk fjernSiste
		liste.fjernSiste();
		liste.visTab();
	}
}
