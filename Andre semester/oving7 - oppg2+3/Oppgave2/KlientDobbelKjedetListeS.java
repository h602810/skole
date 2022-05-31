package Oppgave2;

public class KlientDobbelKjedetListeS {
	public static void main(String[] args) {
		DobbelKjedetListeS<Integer> liste = new DobbelKjedetListeS<Integer>(-1, 101);
		
		// leggTil()-metode
		System.out.println("leggTil()-metode (visListe() - før fjernet element):");
		liste.leggTil(1);
		liste.leggTil(2);
		liste.leggTil(3);
		liste.leggTil(4);
		liste.visListe();
		
		System.out.println();
		
		// fins()-metode
		System.out.println("fins()-metode:");
		System.out.println(liste.fins(1));
		
		System.out.println();
		
		// fjern-metode
		System.out.println("fjern()-metode:");
		System.out.println(liste.fjern(3));
		
		System.out.println();
		
		// visListe()-metode
		System.out.println("visListe()-metode (etter fjernet element):");
		liste.visListe();
	}
}
