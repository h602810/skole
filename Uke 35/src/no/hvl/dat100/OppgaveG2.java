/* Oppgave G2 - Variable og uttrykk
 * -----------------------------------
 * a) Modifiser programmet fra oppgave G1 ved 
 * 	  å legge til en deklarasjon av en variabel c.
 * b) Legg til en tilordningssetning som setter 
 * 	  verdien for variablen c lik summen av verdiene
 *    tildelt til a og b. Skriv verdien av variablen 
 *    c ut i slutten av programmet. Kjør programmet 
 *    og se at der 12 blir skrevet ut i Console 
 *    nederst i Eclipse-vinduet.
 * c) Modifiser verdien av a fra 5 til 8 og 
 *    sjekk at c nå har verdien 15 når den 
 *    skrives ut.
 */
package no.hvl.dat100;

public class OppgaveG2 {
	
	public static void main(String[] args) {
		// a (variabel c lagt til)
		int a;
		int b;
		int c;
		// b (c er summen av a+b)
		a = 8;
		b = 7;
		c = a + b;
		// c (printer ut verdien 15 nå)
		System.out.println(c);
		
	}
	
}
