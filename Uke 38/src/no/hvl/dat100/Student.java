package no.hvl.dat100;

public class Student {
	
	// objektvariabler
	int studNr;
	String fornavn;
	String etternavn;
	
	// konstruktør (med "this" for å slippe kunstige navn)
	public Student(int studNr, String fornavn, String etternavn) {
		this.studNr = studNr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}
//		// Uten "this"
//		public Student(int studNrInit, String fornavnInit, String etternavnInit) {
//			studNr = studNrInit;
//			fornavn = fornavnInit;
//			etternavn = etternavnInit;
//		}
	
	// objektmetoder
	public void skrivUt() {
		System.out.println(studNr + ": " + fornavn + " " + etternavn);
	}
	
	public String navn() {
		return etternavn + ", " + fornavn;
	}
	
	public void endreEtternavn(String nyttEtternavn) {
		etternavn = nyttEtternavn;
	}
}
