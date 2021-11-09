/* Oppgave G2 - Oppgave 6.3 i Java boka
 * ----------------------------------
 * Lag en klasse Konto med objektvariabler
 * kontonummer og saldo. Klassen skal ha
 * konstruktør for initiering av objektvariablene,
 * samt metoder for å avlese saldo, og for å sette
 * inn og ta ut penger fra kontroen.
 * 
 * Lag et testprogram opprette tre Konto-objekt,
 * prøve ut objektmetodene og skrive ut samlet
 * saldo for kontoene;
 */

package no.hvl.dat100;

public class OppgaveG2 {
	public static void main(String[] args) {
		Konto k1 = new Konto(34832, 398);
		Konto k2 = new Konto(93485, 234);
		Konto k3 = new Konto(37894, 4323);
		
		System.out.println("Kontoinfo for k1: \n" 
				+ "---------------------\n"
				+ "Kontonummer: " + k1.getKontoNr() + "\n"
				+ "Saldo: " + k1.getSaldo() + "kr\n");
		
		System.out.println("Kontoinfo for k2: \n" 
				+ "---------------------\n"
				+ "Kontonummer: " + k2.getKontoNr() + "\n"
				+ "Saldo: " + k2.getSaldo() + "kr\n");
		
		System.out.println("Kontoinfo for k3: \n" 
				+ "---------------------\n"
				+ "Kontonummer: " + k3.getKontoNr() + "\n"
				+ "Saldo: " + k3.getSaldo() + "kr\n");
		
		double sumSaldo = k1.getSaldo() + k2.getSaldo() + k3.getSaldo();
		System.out.println("Total sum fra alle kontoene: " + sumSaldo + "kr");
	}
}
