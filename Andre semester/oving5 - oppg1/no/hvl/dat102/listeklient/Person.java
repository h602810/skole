package no.hvl.dat102.listeklient;

public class Person implements Comparable<Person> {

	private String fornavn;
	private String etternavn;
	private int foedselsaar;

	// Konstruktører

	public Person() {
		this("", "", 0);

	}

	public Person(String fornavn, String etternavn, int foedselsaar) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.foedselsaar = foedselsaar;

	}

	public void setFoedselsaar(int foedselsaar) {
		this.foedselsaar = foedselsaar;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	int getFoedselsaar() {
		return foedselsaar;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String toString() {
		return (foedselsaar + "\t" + etternavn + ", " + fornavn);
	}

	public int compareTo(Person denAndrePersonen) {
		int resultat = 0;
        if(this.getFoedselsaar() - denAndrePersonen.getFoedselsaar() < 0)
            resultat = -1;
        else if(this.getFoedselsaar() - denAndrePersonen.getFoedselsaar() > 0)
            resultat = 1;
        else
        {
            if(this.getEtternavn().compareTo(denAndrePersonen.getEtternavn()) < 0)
                resultat = -1;
            else if(this.getEtternavn().compareTo(denAndrePersonen.getEtternavn()) > 0)
                resultat = 1;
            else
            {
                if(this.getFornavn().compareTo(denAndrePersonen.getFornavn()) < 0)
                    resultat = -1;
                else if(this.getFornavn().compareTo(denAndrePersonen.getFornavn()) > 0)
                    resultat = 1;
                else
                    resultat = 0;
            }
        } 
        return resultat;
	}
	
//	 @Override
//	 public int compareTo (Lag detAndre){
//	     int resultat = 0;
//	     if (seire < detAndre.getSeire()){
//	         resultat = -1;
//	     }
//	     else if (this.seire == detAndre.getSeire()){
//	         resultat = 0;
//	      }
//	     else{
//	          resultat = 1;
//	     }
//	    return resultat;
//	  }

}// class