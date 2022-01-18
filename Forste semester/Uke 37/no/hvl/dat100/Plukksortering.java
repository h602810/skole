package no.hvl.dat100;

public class Plukksortering {

	public static void main(String[] args) {
		// Opprinnelig datasett legges i en tabell
		int[] tall = {7, 2, 1, 4};
		// Oppretter hjelpetabell til sortering
		int[] nyeTall = new int[tall.length];
		
		for (int tallNr = 0; tallNr < tall.length; tallNr++) {
			int minPos = 0;		// Antar at minimum er på 0-plassen
			for (int posNr = 1; posNr < tall.length; posNr++) {
				if (tall[posNr] < tall[minPos]) {
					minPos = posNr;
				}
			}
			// Nå er minste verdi lokalisert til minPos og verdien kopieres over i hjelpetabellen
			nyeTall[tallNr] = tall[minPos];
			
			// Sletter denne minimumsverdien fra opprinnelig datasett (legger inn en STOR verdi i stedet)
			tall[minPos] = Integer.MAX_VALUE;
		}
		tall = nyeTall;		// tall-tabellen er nå sortert
		
		for (int i = 0; i < tall.length; i++) {
			System.out.print(tall[i] + " ");
		}
	}

}
