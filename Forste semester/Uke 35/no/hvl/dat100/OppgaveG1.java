/* Oppgave G1 - Variable og tilordninger
 * -----------------------------------
 * a) Skriv inn deklarasjon av to variable a og b 
 *    av typen int (heltall) i main-metoden.
 * b) Legg til to tilordningssetninger etter 
 *    deklarasjonen i a) som gir variablen a 
 *    verdien 5 og b verdien 7.
 * c) Skriv ut verdien av variablene a og b på 
 *    slutten av programmet ved å bruke 
 *    System.out.println-metoden. Kjør programmet 
 *    og se at verdiene 5 og 7 blir skrevet ut i 
 *    Console nederst i Eclipse-vinduet.
 * d) Prøv å endre typen på variablen a fra int til 
 *    boolean. Dette skal gi en feilmelding i Eclipse. 
 *    Hvorfor?
 */
package no.hvl.dat100;

public class OppgaveG1 {
	
	public static void main(String[] args) {
		boolean a;
		int b;
		
		a = 5;
		b = 7;
		
		System.out.println(a + " " + b);
		
		// d
		/* 
		  hvis a skal være boolean så kan den
		  ikke har heltallet 5 som verdi ettersom
	 	  boolean har kun true/false verdier 
		*/
		
		
	}
	
}
