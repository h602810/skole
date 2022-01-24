package no.hvl.data102;

public class Film {
	private int filmnr;
	private String filmskaper;
	private String tittel;
	private int lanseringsAar;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() { 
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, 
				int lanseringsAar, Sjanger sjanger, String filmselskap) {
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.lanseringsAar = lanseringsAar;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
		
	}
	
	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getLanseringsAar() {
		return lanseringsAar;
	}

	public void setLanseringsAar(int lanseringsAar) {
		this.lanseringsAar = lanseringsAar;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public boolean equals(Object film) {
		return this.getFilmnr() == ((Film) film).getFilmnr();
	}
	
	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}

	@Override
	public String toString() {
		return "Film [filmnr=" + filmnr + ", filmskaper=" + filmskaper + ", tittel=" + tittel + ", lanseringsAar="
				+ lanseringsAar + ", sjanger=" + sjanger + ", filmselskap=" + filmselskap + "]";
	}
	
	
	
} // class