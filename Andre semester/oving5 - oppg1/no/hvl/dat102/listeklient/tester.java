package no.hvl.dat102.listeklient;

public class tester {

	public static void main(String[] args) {
		Person sindre = new Person("Sindre", "Kjelsrud", 1999);
		Person stein = new Person("Stein", "Roar", 1987);
		Person sindre2 = new Person("Sindre", "Larsen", 1999);
		Person peder = new Person("Peder", "Roar", 1987);
		
		// sjekker om sindre er yngre enn stein - sindre er yngst (1)
		System.out.println("sindre yngst (1)" + sindre.compareTo(stein));
		
		// sjekker om stein er eldre enn sindre - stein er eldst (-1)
		System.out.println("stein eldst (-1)" + stein.compareTo(sindre));
		
		// sjekker om etternavn til sindre er tidligere enn sindre - Kjelsrud først (-1)
		System.out.println(sindre.compareTo(sindre2));
		
		// sjekker om etternavn til sindre2 er etter sindre sitt - Larsen er etter (1)
		System.out.println(sindre2.compareTo(sindre));
		
		// sjekker om fornavn til stein kommer etter peder sitt - stein er sist (1)
		System.out.println(stein.compareTo(peder));
		
		// sjekker om fornavn til peder er før stein sitt - peder er først (-1)
		System.out.println(peder.compareTo(stein));
	}

}
