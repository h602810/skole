/* Oppgave G2 (Konto) - Oppgave 6.3 i Java boka
 * ----------------------------------
 * Lag en klasse Konto med objektvariabler
 * kontonummer og saldo. Klassen skal ha
 * konstrukt�r for initiering av objektvariablene,
 * samt metoder for � avlese saldo, og for � sette
 * inn og ta ut penger fra kontroen.
 * 
 * Lag et testprogram opprette tre Konto-objekt,
 * pr�ve ut objektmetodene og skrive ut samlet
 * saldo for kontoene;
 */

package no.hvl.dat100;

public class Konto {
	private int kontoNr;
	private double saldo;
	
	public Konto(int kontoNr, double startSaldo) {
		this.kontoNr = kontoNr;
		saldo = startSaldo;
	}

	public int getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(int nyKontoNr) {
		kontoNr = nyKontoNr;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double belop) {
		saldo += belop;
	}
	
	
}
