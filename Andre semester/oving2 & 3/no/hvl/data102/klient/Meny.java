package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	public Meny(FilmarkivADT filmarkiv){
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}
	
	public void start(){
		// legg til en del filmer
		filmarkiv.leggTilFilm(new Film(1, "skaper", "tittel", 1999, Sjanger.SCIFI, "filmselskap"));
		filmarkiv.leggTilFilm(new Film(2, "gud", "dommedag", 1998, Sjanger.ACTION, "warner dudes"));
		filmarkiv.leggTilFilm(new Film(3, "sindre", "lol", 2001, Sjanger.COMEDY, "disney"));
		filmarkiv.leggTilFilm(new Film(4, "nabo'n", "wow", 2005, Sjanger.HISTORY, "skedsmo"));
		filmarkiv.leggTilFilm(new Film(5, "svein o' laaaai", "forelesning", 1645, Sjanger.ACTION, "hvl"));
	}
}
