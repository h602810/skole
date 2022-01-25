package no.hvl.data102;

public class testO2 {
	
	public static void main(String[] args) {
		
		Filmarkiv fa = new Filmarkiv(5);
		Film f1 = new Film(1, "skaper", "tittel", 1999, Sjanger.SCIFI, "filmselskap");
		Film f2 = new Film(2, "gud", "dommedag", 1998, Sjanger.ACTION, "warner dudes");
		Film f3 = new Film(3, "sindre", "lol", 2001, Sjanger.COMEDY, "disney");
		Film f4 = new Film(4, "nabo'n", "wow", 2005, Sjanger.HISTORY, "skedsmo");
		Film f5 = new Film(5, "svein o' laaaai", "forelesning", 1645, Sjanger.ACTION, "hvl");
		
		// leggTilFilm
		fa.leggTilFilm(f1);
		fa.leggTilFilm(f2);
		fa.leggTilFilm(f3);
		fa.leggTilFilm(f4);
		fa.leggTilFilm(f5);
		
		// slettFilm
		fa.slettFilm(4);
		
		// visFilm
		fa.visFilm(3);
		
		// soekTittel
		Film[] filmer = fa.soekTittel("skaper");
		for(Film f : filmer)
			System.out.println(f.getTittel());
		
		System.out.println();
		
		// antall.sjanger
		System.out.println("Antall filmer med sjanger - Action: " + fa.antall(Sjanger.ACTION));
		
		System.out.println();

		// equals
		if (f1.equals(f2)) {
			System.out.println("like");
		}
		else {
			System.out.println("ulike");
		}
		
	}

}