package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Tekstgrensesnitt {
	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm(){
		int filmnr = parseInt(showInputDialog("Oppgi filmnr: "));
		String filmskaper = showInputDialog("Oppgi filmskaper: ");
		String tittel = showInputDialog("Oppgi filmtittel: ");
		int aar = parseInt(showInputDialog("Oppgi lanseringsår: "));
		String sjanger1 = showInputDialog("Oppgi sjanger: ");
		Sjanger sjanger2 = null;
		String filmselskap = showInputDialog("Oppgi filmselskap: ");
		
		switch(sjanger1) {
		case "action": sjanger2 = Sjanger.ACTION; break;
		case "drama": sjanger2 = Sjanger.DRAMA; break;
		case "history": sjanger2 = Sjanger.HISTORY; break;
		case "scifi": sjanger2 = Sjanger.SCIFI; break;
		case "war": sjanger2 = Sjanger.WAR; break;
		case "comedy": sjanger2 = Sjanger.COMEDY; break;
		}
		
		return new Film(filmnr, filmskaper, tittel, aar, sjanger2, filmselskap);
	}
	
	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		film.toString();
	}
	
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		Film[] filmTitler = filma.soekTittel(delstreng);
		for (int i = 0; i < filmTitler.length; i++) {
			System.out.println(filmTitler[i].toString());
		}
	}
	
	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		Film[] filmGruppe = filma.soekFilmskaper(delstreng);
		for (int i = 0; i < filmGruppe.length && filmGruppe[i] != null; i++) {
			System.out.println(filmGruppe[i].getFilmskaper());
		}
	}
	
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		int antall = filma.antall();
		int action = filma.antall(Sjanger.ACTION);
		int drama = filma.antall(Sjanger.DRAMA);
		int history = filma.antall(Sjanger.HISTORY);
		int scifi = filma.antall(Sjanger.SCIFI);
		int war = filma.antall(Sjanger.WAR);
		int comedy = filma.antall(Sjanger.COMEDY);
		
		System.out.println("Antall filmer total: " + antall + "\n" +
							"Antall action filmer: " + action + "\n" +
							"Antall drama filmer: " + drama + "\n" +
							"Antall history filmer: " + history + "\n" +
							"Antall scifi filmer: " + scifi + "\n" + 
							"Antall war filmer: " + war + "\n" +
							"Antall comedy filmer: " + comedy + "\n");
	}
	
}
