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
	public void skrivUtFilmProdusent(FilmarkivADT filmer, String delstreng) {
		Film[] filmGruppe = new Film[filmer.antall()];
		for (int i = 0; i < filmGruppe.length; i++) {
			if (filmGruppe[i].getFilmskaper().equals(delstreng)) {
				System.out.println(filmGruppe[i].getFilmskaper());
			}
		}
		
	}
	
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		Film[] filmer = new Film[filma.antall()];
		for (int i = 0; i < filmer.length; i++) {
			
		}
	}
	// ... Ev. andre metoder
	
}
