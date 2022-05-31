package Oppgave3;

public class HeltallsListeMain {
	public static void main(String[] args) {
		int n = 10;
		
		HeltallsListe liste = new HeltallsListe();
		for (int i = 0; i < n; i++) {
			int random = (int) (Math.random() * n);
			liste.leggTilFoerst(random);
		}
		
		System.out.print("Aktuell heltallsliste: ");
		liste.skrivUt();
		
		// antall()-test
		System.out.println("\nAntall: " + liste.antall());
		
		// sum()-test
		System.out.println("\nSum: " + liste.sum());
		
		// maks()-test
		System.out.println("\nMaks: " + liste.maks());
		
		// erSortert()-test
		System.out.println("\nerSortert: " + liste.erSortert());
		
		// skrivBaklengs()-test
		System.out.print("\nskrivBaklengs: ");
		liste.skrivBaklengs();
		
		System.out.println("\n\n********************************************\n");
		
		// erSortert()-test (alltid true)
		HeltallsListe sortertListe = new HeltallsListe();
		for (int i = n; i > 0; i--) {
			sortertListe.leggTilFoerst(i);
		}
		System.out.print("Sortert heltallsliste: ");
		sortertListe.skrivUt();
		System.out.println("erSortert: " + sortertListe.erSortert());
	}
}
