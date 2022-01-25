package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {
	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2() {
		start = null;
		antall = 0;
	}

	@Override
	public void visFilm(int nr) {
		LinearNode<Film> thisNode = start;
		
		while (thisNode != null) {
			if (thisNode.getElement().getFilmnr() == nr) {
				System.out.println(thisNode.getElement().toString());
				return;
			}
			thisNode = thisNode.getNeste();
		}
	}
	
	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> newNode = new LinearNode<>(nyFilm);
		newNode.setNeste(start);
		start = newNode;
		antall++;
	}
	

	@Override
	public boolean slettFilm(int filmnr) {
		if (start == null) return false;
		
		boolean deleted = false;
		
		LinearNode<Film> slettNode = start;
		LinearNode<Film> forrige = null;
		
		if (slettNode.getElement().getFilmnr() == filmnr) {
			slettNode = slettNode.getNeste();
			antall--;
			return true;
		}
		forrige = slettNode;
		slettNode = slettNode.getNeste();
		
		while (slettNode != null) {
			if (slettNode.getElement().getFilmnr() == filmnr) {
				deleted = true;
				forrige.setNeste(slettNode.getNeste());
				antall--;
			}
			forrige = slettNode;
			slettNode = slettNode.getNeste();
		}
		
		return deleted;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		int i = 0;
		Film[] filmer = new Film[antall];
		LinearNode<Film> thisNode = start;
		
		while (thisNode != null) {
			if (thisNode.getElement().getTittel().contains(delstreng)) {
				filmer[i] = thisNode.getElement();
				i++;
			}
			thisNode = thisNode.getNeste();
		}
		
		return filmer;
	}
	
	@Override
	public int antall(Sjanger sjanger) {
		int sjangere = 0;
		LinearNode<Film> thisNode = start;
		
		while (thisNode != null) {
			if (thisNode.getElement().getSjanger().equals(sjanger)) {
				sjangere++;
			}
			
			thisNode = thisNode.getNeste();
		}
		
		return sjangere;
	}

	@Override
	public int antall() {
		return antall;
	}
	
	@Override
	public Film[] soekFilmskaper(String delstreng) {
		int i = 0;
		Film[] filmer = new Film[antall];
		LinearNode<Film> thisNode = start;
		
		while (thisNode != null) {
			if (thisNode.getElement().getFilmskaper().contains(delstreng)) {
				filmer[i] = thisNode.getElement();
				i++;
			}
			thisNode = thisNode.getNeste();
		}
		
		return filmer;
	}
	
}
