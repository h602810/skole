package Oppgave2;

//Ny, spesiell ordnet liste med dobbelkjeding 
public class DobbelKjedetListeS<T>{  
                                 
	private DobbelNode<T> foerste; 
	private DobbelNode<T> siste; 
	private int antall; 
	   
	// a) Lag konstruktøren i DobbelKjedetListeS.
	public DobbelKjedetListeS (T minVerdi, T maksVerdi){ 
		foerste = new DobbelNode(minVerdi);
		siste = new DobbelNode(maksVerdi);
		antall = 0;
	} 
	
	// c) Lag metoden leggTil som skal legge et nytt element til listen.
	public void leggTil(T ny) {
		if (fins(ny)) {		// hvis elementet finnes
			return;
		}
		
		DobbelNode<T> nyNode = new DobbelNode(ny);
		DobbelNode<T> aktuell = foerste;
		
		while (aktuell.getNeste() != null) {
			aktuell = aktuell.getNeste();
		}
		
		aktuell.setNeste(nyNode);
		nyNode.setForrige(aktuell);
		antall++;
		
	} 
	
	// d) Lag metoden fjern skal fjerne et element i den ordnede liste
	public T fjern(T x) {
		T fjernetNode = null;
		
		if (fins(x) == false) {		// hvis elementet ikke finnes
			return (T) "finnes ikke";
		}
		
		DobbelNode<T> aktuell = foerste.getNeste();
		boolean fjernet = false;
		
		while (aktuell.getNeste() != null) {
			if (aktuell.getElement().equals(x)) {
				fjernetNode = aktuell.getElement();
				aktuell.getForrige().setNeste(aktuell.getNeste());
				aktuell.getNeste().setForrige(aktuell.getForrige());
				antall--;
			}
			aktuell = aktuell.getNeste();
		}
		
		return fjernetNode;
	} 
	
	// b) Lag metoden fins som returnerer true dersom elementet finnes og false ellers. 
	public boolean fins(T x) {
		DobbelNode<T> aktuell = foerste;
		boolean ferdig = false;
		
		while (aktuell.getNeste() != null) {
			aktuell = aktuell.getNeste();
			if (aktuell.getElement().equals(x)) {
				ferdig = true;
			}
		}
		return ferdig;
	} 
	
	// e) Lag metoden visListe som viser elementene i listen. NB! De kunstige verdiene skal ikke vises.
	public void visListe() {
		String liste = "";
		
		DobbelNode<T> aktuell = foerste.getNeste();
		
		while (aktuell != null) {
			liste += aktuell.getElement().toString();
			aktuell = aktuell.getNeste();
		}
		
		System.out.println(liste);
	} 
	
}//class 