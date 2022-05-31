package Oppgave3;

public class HeltallsListe {
	private HNode start; 
	  
	public HeltallsListe() { 
	  start = null; 
	 } 
	  
	 public HeltallsListe(int verdi) { 
	  start = new HNode(verdi); 
	 } 
	  
	 public void leggTilFoerst(int verdi) { 
	  HNode ny = new HNode(verdi); 
	  ny.setNeste(start); 
	  start = ny; 
	 } 
	 
	 public void skrivUt() {
		 HNode aktuell = start;
		 while (aktuell.getNeste() != null) {
			 System.out.print(aktuell.getVerdi() + " ");
			 aktuell = aktuell.getNeste();
		 }
		 System.out.println(aktuell.getVerdi());
	 }
	 
	 /************************************************************/
	 
	 // a) Lag metoden antall() skal finne antall element i lista.
	 public int antall() {
		 return antall(1, start);
	 } 
	 
	 private int antall(int ant, HNode node) {
		 if (node.getNeste() == null) {		// basistilfelle
			 return ant;
		 } else {
			 return antall(ant+1, node.getNeste());
		 }
		 
	 }
	 
	 /************************************************************/
	 
	 // b)  Lag metoden sum() skal finne summen av elementa i lista.
	 public int sum() {
		 return sum(start);
	 } 
	 
	 private int sum(HNode node) {
		 if (node.getNeste() == null) {		// basistilfelle
			 return node.getVerdi();
		 }
		 
		 return sum(node.getNeste()) + node.getVerdi();
	 }
	 
	 /************************************************************/
	 
	 // c) Lag metoden maks() skal finne største verdi i lista.
	 public int maks() {
		 return maks(0, start);
	 } 
	 
	 private int maks(int maks, HNode node) {
		 if (node.getNeste() == null) {		// basistilfelle
			 return maks;
		 } else if (node.getVerdi() < maks) {
			 return maks(maks, node.getNeste());
		 } else {
			 return maks(node.getVerdi(), node.getNeste());
		 }
	 }
	 
	 /************************************************************/

	 // d) Lag metoden erSortert() skal returnere true om elementa er sortert stigende og false elles. 
	 public boolean erSortert() {
		 return erSortert(false, start);
	 }
	 
	 private boolean erSortert(boolean res, HNode node) {
		 if (node.getNeste() == null && res == false) {		// basistilfelle
			 return false;
		 }
		 if (node.getNeste() == null && res == true) {		// basistilfelle
			 return true;
		 }
		 
		 if (node.getVerdi() < node.getNeste().getVerdi()) {
			 return erSortert(true, node.getNeste());
		 } else {
			 return false;
		 }
	 }
	 
	 /************************************************************/

	 // e)  Lag metoden skrivBaklengs() skal skrive ut lista baklengs (siste først)
	 public void skrivBaklengs() {
		 skrivBaklengs(start);
	 }
	 
	 private void skrivBaklengs(HNode node) {
		 if (node == null) {
			 return;
		 } else {
			 skrivBaklengs(node.getNeste());
			 System.out.print(node.getVerdi() + " ");
		 }
	 }
}
