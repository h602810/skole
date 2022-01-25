package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {
	
	private Film[] filmarkiv;
	private int antall;
	
	public Filmarkiv(int n) {
		filmarkiv = new Film[n];
		antall = 0;
	}
	
	private void utvid() {
		Film[] utvidetTab = new Film[antall * 2];
		
		for (int i = 0; i < antall && this.filmarkiv[i] != null; i++) {
			utvidetTab[i] = this.filmarkiv[i];
		}
		
		filmarkiv = utvidetTab;
	}

	@Override
	public void visFilm(int nr) {
		for (int i = 0; i < filmarkiv.length && filmarkiv[i] != null; i++) {
			if (filmarkiv[i].getFilmnr() == nr) {
				System.out.println("Film som vises: \n" + filmarkiv[i].toString());
				return;
			}
		}
		System.out.println("Oppgitt filmnummer finnes ikke i filmarkivet!");
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall == filmarkiv.length) {
			utvid();
		}
		else {
			filmarkiv[antall] = nyFilm;
			antall++;
		}
	}

	@Override
	public boolean slettFilm(int filmnr) {
		for (int i = 0; i < antall; i++) {
			if (filmarkiv[i].getFilmnr() == filmnr) {
				filmarkiv[filmnr] = null;
				antall--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		int lengde = 0;
		for (int i = 0;	i < antall; i++) {
			if (filmarkiv[i].getTittel().contains(delstreng)) {
				lengde++;
			}
		}
		
		Film[] filmer = new Film[lengde];
		int funnet = 0;
		for (int i = 0; i < antall; i++) {
			if (filmarkiv[i].getTittel().contains(delstreng)) {
				filmer[funnet] = filmarkiv[i];
				funnet++;
			}
		}
		
		return filmer;
	}

	@Override
	public int antall(Sjanger sjanger) {
		int sjangere = 0;
		for(int i = 0; i < antall; i++) {
			if (filmarkiv[i].getSjanger().equals(sjanger)) {
				sjangere++;
			}
		}
		return sjangere;
	}

	@Override
	public int antall() {
		return antall;
	}
	
	@Override
	public Film[] soekFilmskaper(String delstreng) {
		int lengde = 0;
		for (int i = 0;	i < antall; i++) {
			if (filmarkiv[i].getFilmskaper().contains(delstreng)) {
				lengde++;
			}
		}
		
		Film[] filmer = new Film[lengde];
		int funnet = 0;
		for (int i = 0; i < antall; i++) {
			if (filmarkiv[i].getFilmskaper().contains(delstreng)) {
				filmer[funnet] = filmarkiv[i];
				funnet++;
			}
		}
		
		return filmer;
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		// n er antall elementer
		Film[] nytab = new Film[n];
		int i = 0;
		while (i < n) {
		nytab[i] = tab[i];
		i++;
		}
		return nytab;
	}
	
}
