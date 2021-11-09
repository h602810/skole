/* Oppgave V1 - Nut of the week
 * ----------------------------------
 * Skriv en metode som kan skrive ut en to-
 * dimensjonel tabell av heltall som bruker
 * kun en løkke.
 */
package no.hvl.dat100;

public class OppgaveV1 {

	public static void main(String[] args) {
		int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
		skrivUt(a);

	}
	
	public static void skrivUt(int[][] tabell) {
		String nut = "";
		for (int i = 0; i < tabell.length * tabell[0].length; i++) {
			nut += tabell[i / tabell.length][i % tabell[0].length];
			nut += " ";
		}
		System.out.println(nut);
	}

}
