package no.hvl.dat102.klient;

import no.hvl.dat102.kjedet.DobbelKjedetOrdnetListe;

public class KlientDobbelKjedetListe2 {
	public static void main(String[] args) {
		String ord[] = { "h", "e", "s", "m", "v", "k", "q" };

		DobbelKjedetOrdnetListe<String> liste = new DobbelKjedetOrdnetListe(new String("tESt"), new String("snorK"));
		
		// Legger data inn i listen
		for (int i = 0; i < ord.length; i++) {
			liste.leggTil(ord[i]);
		}
		
		// Test av finn-metode
		System.out.println(liste.finn("s"));

		System.out.println(liste.finn("t"));
		
		// Test av visListe-metode
		liste.visListe();
	}
}
