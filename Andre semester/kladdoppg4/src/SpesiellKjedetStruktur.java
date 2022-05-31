package src;

public class SpesiellKjedetStruktur<T> {
	private int antall;  // antall elementer i mengden  
    private LinearNode4<T> start; 
    
    /****************************************************************** 
     * Oppretter en tom mengde. 
     ******************************************************************/ 
    public SpesiellKjedetStruktur(){ 
    	antall = 0; 
    	start = null; 
    } 
 
    /****************************************************************** 
     * Legger til elementet foran i denne mengden. 
     ******************************************************************/ 
    public void leggTil (T element) { 
    	LinearNode4<T> nyNode = new LinearNode4<T> (element); 
    	nyNode.setNeste(start); 
    	start = nyNode; 
    	antall++; 
    }
    
    /******************************************************************** 
     * Snur listen. Fyll ut kode
     ********************************************************************/
      
     public void snuKjedetStruktur(){ 
//    	 ... Her skal du fylle ut kode; Bruk ikke stabel til hjelp. 
    	 LinearNode4<T> current = start;
    	 LinearNode4<T> prev = null;
    	 LinearNode4<T> next = null;
    	 
    	 while (current != null) {
    		 next = current.getNeste();
    		 
    		 current.setNeste(prev);
    		 prev = current;
    		 
    		 current = next;
    	 }
    	 
    	 start = prev;
     }
     
     /****************************************************************** 
      * Returnerer sann hvis mengden er tom og usann ellers. 
      ******************************************************************/ 
     public boolean erTom()  { 
    	 return (antall() == 0); 
     } 
   
     /****************************************************************** 
      * Returnerer antall elementer i den kjedete strukturen. 
      ******************************************************************/ 
     public int antall(){ 
    	 return antall; 
     }
     
     /****************************************************************** 
      * Returnerer en strengrepresentasjon av elementene.  
      ******************************************************************/ 
     public String toString(){ 
    	 String resultat = ""; 
    	 LinearNode4<T> aktuell = start; 
    	 
    	 while (aktuell != null) { 
    		 resultat = resultat + aktuell.getElement().toString() ; 
    		 aktuell = aktuell.getNeste(); 
         } 
 
         return resultat; 
     }
     
     /****************************************************************** 
      * Som finner og returnerer med antall elementer i strukturen som 
      * er lik elementet gitt i parameteren (test på lik med metoden 
      * equals(...)).  
      ******************************************************************/ 
     public int finnAntalLik(T el) {
    	 int antall = 0;
    	 LinearNode4<T> aktuell = start;
    	 
    	 while (aktuell != null) {
    		 if (aktuell.getElement().equals(el)) {
    			 antall++;
    		 }
    		 aktuell = aktuell.getNeste();
    	 }
    	 
    	 return antall;
     }
     
     /****************************************************************** 
      * Som legger til en ny node med elementet nyttElement rett bak 
      * noden med elementet el. Dersom el ikke fins i strukturen, skal 
      * den nye noden plasseres inn helt framme.   
      ******************************************************************/ 
     public void leggTilBak(T el, T nyttElement) {
    	 LinearNode4<T> aktuell = start;
    	 LinearNode4<T> nyNode = new LinearNode4<T>(nyttElement);
    	 
    	 while (aktuell != null) {
    		 if (aktuell.getElement().equals(el)) {
    			  aktuell.setNeste(nyNode);
    		 }
    		 aktuell = aktuell.getNeste();
    	 }
     }

} // class