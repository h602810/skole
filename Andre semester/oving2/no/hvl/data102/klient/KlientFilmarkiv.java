package no.hvl.data102.klient;

import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.FilmarkivADT;

public class KlientFilmarkiv {
	public static void main(String[] args) {
		FilmarkivADT filmer = new Filmarkiv(100);
		Meny meny = new Meny(filmer);
		meny.start();
	}
}
