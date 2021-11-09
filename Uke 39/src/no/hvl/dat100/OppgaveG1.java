/* Oppgave G1 - Flerdimensjonale tabeller
 * ----------------------------------
 * a) Legg til en metode som skriver ut en gitt
 * 	  2-dimensjonel tabell av heltall. Bruk metoden
 * 	  til � skrive ut tabellen obs.
 * 	  Bruk b�de n�stet vanlige for-l�kker med index
 * 	  og ved n�stede utvidede for-l�kker.
 * b) Legg til kode i main-metoden som skriver ut
 * 	  obs.length. Forklar hvor det som skrives ut har
 * 	  verdien 3.
 * c) Legg til kode i main-metoden som skriver ut obs[0].length,
 * 	  obs[1].length og obs[2].length, forklar resultatet.
 * d) Legg til en metode som avgj�r om det finnes en 
 * 	  observasjon i tabellen som er st�rre enn limit.
 * e) Skriv koden som bytter om p� raden p� index 0 og 
 *    p� raden p� index 2 i tabellen.
 *    
 */
package no.hvl.dat100;

public class OppgaveG1 {
	public static void main(String[] args) {

	    double[][] obs = {
	    				{1.4,1.7,1.9,2.0},
	    				{5.4,7.8,9.8,7.9,3.0},
	    				{-1.7,-1.7,-2.8}
	    };

	    // a
	    skrivUt(obs);
	    
	    // b - verdi 3 pga det er 3 rader 
	    System.out.println("\n" + obs.length);

	    // c - resultatet er lengden p� hver av de 3 radene
	    System.out.println("\n" + obs[0].length + " " + obs[1].length + " " + obs[2].length + "\n");
	    
	    // d - test
	    System.out.println(finnes(obs, 100) + "\n");
	    
	    // e
	    double[] temp1 = new double[obs[0].length];
	    double[] temp2 = new double[obs[2].length];
	    
	    for (int q = 0; q < obs[0].length; q++) {
	    	temp1[q] = obs[0][q];
	    }
	    for (int r = 0; r < obs[2].length; r++) {
	    	temp2[r] = obs[2][r];
	    }
	    
	    obs[0] = new double[temp2.length];
	    obs[2] = new double[temp1.length];
    	
	    for (int i = 0; i < obs[0].length; i++) {
	    	obs[0][i] = temp2[i];
	    }
	    for (int j = 0; j < obs[2].length; j++) {
	    	obs[2][j] = temp1[j];
	    }
	    skrivUt(obs);
	    
	}

	// a
	public static void skrivUt(double[][] tabell) {
		// n�stet vanlig for-l�kker med index
//		for (int i = 0; i < tabell.length; i++) {
//			for (int j = 0; j < tabell[i].length; j++) {
//				System.out.print(tabell[i][j] + " ");
//			}
//			System.out.println();
//		}
		// n�stet utvidet for-l�kker
		for (double[] rad : tabell) {
			for (double t : rad) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
	}
	
	// d
	public static boolean finnes(double[][] obs, double limit) {
		boolean funnet = false;
		
		for (int i = 0; i < obs.length; i++) {
			for (int j = 0; j < obs[i].length; j++) {
				if (obs[i][j] > limit) {
					funnet = true;
					return funnet;
				}
			}
		}
		return funnet;
	}
}

