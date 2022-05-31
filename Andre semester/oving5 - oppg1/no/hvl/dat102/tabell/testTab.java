package no.hvl.dat102.tabell;

public class testTab {
	public static void main(String[] args) {
		TabellOrdnetListe<Integer> liste = new TabellOrdnetListe<>();
		liste.leggTil(1);
		liste.leggTil(2);
		liste.leggTil(3);
		liste.leggTil(5);
		liste.leggTil(6);
		
		liste.visTab();
		
		System.out.println();
		
		// sjekk leggTil
		liste.leggTil(4);
		liste.visTab();
		
		// sjekk fjernSiste
		System.out.println(":" + liste.fjernSiste() + ":");
		
		// sjekk fjernFoerste
		System.out.println(":" + liste.fjernFoerste() + ":");
		
		// sjekk finn - er private
//		System.out.println(liste.finn(5));
	}
}
