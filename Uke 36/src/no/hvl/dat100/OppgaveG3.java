/* Oppgave G3
 * ----------------------------------
 * Lag et program som skriver ut A hvis i
 * verdien har 1, B = 2, i en for-loop som går
 * fra 1 til 20.
 * 
 * Bruk både switch og if inni for-loopen
 */

package no.hvl.dat100;

public class OppgaveG3 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
//			String bokstav;
//			switch (i) {
//			case 1: bokstav = "A"; break;
//			case 2: bokstav = "B"; break;
//			default: bokstav = "C"; break; 
//			// ork å skrive alle casene
//			}
//			System.out.println(bokstav);
			
			if (i == 1) {
				System.out.println("A");
			} else
			if (i == 2) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
			// ork å skrive alle casene
		}
		
	}

}
