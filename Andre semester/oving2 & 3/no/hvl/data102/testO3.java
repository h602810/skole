package no.hvl.data102;

import java.util.LinkedList;

public class testO3 {
	public static void main(String[] args) {
		
		Filmarkiv2 arkiv = new Filmarkiv2();
		
		arkiv.leggTilFilm(new Film(1, "Mordi", "Moren din", 1999, Sjanger.ACTION, "WarnerBros"));
		arkiv.leggTilFilm(new Film(2, "Pappa", "Moren din", 1999, Sjanger.ACTION, "WarnerBros"));
		
		// firsNode
		arkiv.leggTilFilm(new Film(3, "Josef Fritzel", "Moren din", 1999, Sjanger.ACTION, "WarnerBros"));

		
		System.out.println(arkiv.antall());
		
		arkiv.slettFilm(3);
		
		System.out.println(arkiv.antall());
		
		arkiv.visFilm(1);
		arkiv.visFilm(2);
		
		System.out.println("Antall sjangere: " + arkiv.antall(Sjanger.ACTION));
		System.out.println("::::");
		
		Film[] filmer = arkiv.soekTittel("din");
		for(int i = 0; i < filmer.length && filmer[i] != null; i++) {
			System.out.println(filmer[i].toString());
			
		}
		
		System.out.println("::::");
		Film[] filmer2 = arkiv.soekFilmskaper("pp");
		for(int i = 0; i < filmer2.length && filmer2[i] != null; i++) {
			System.out.println(filmer2[i].toString());
			
		}
	}
}