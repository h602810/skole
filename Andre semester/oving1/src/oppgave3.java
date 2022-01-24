package src;

import java.util.HashSet;
import java.util.Set;

public class oppgave3 {
	public static void main(String[] args) {
		// Oppgave A
		Set<String> mengde1 = new HashSet<>();
		mengde1.add("Bitcoin");
		mengde1.add("Ethereum");
		mengde1.add("Decentraland");
		mengde1.add("Bitcoin");
		
		Set<String> mengde2 = new HashSet<>();
		mengde2.add("Bitcoin");
		mengde2.add("Cardano");
		mengde2.add("Hedera");
		mengde2.add("Solana");
		mengde2.add("Polkadot");
		
		System.out.println("Oppgave A");
		
		for (String s : mengde1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (String s : mengde2) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// Oppgave B
		System.out.println("\nOppgave B");
		Set<String> kopi = new HashSet<>();
		kopi.addAll(mengde1);
		
		mengde1.retainAll(mengde2);	// Snitt
		for (String s : mengde1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// Oppgave C
		System.out.println("\nOppgave C");
		
		kopi.addAll(mengde2);	// Union
		for (String s : kopi) {
			System.out.print(s + " ");
		}
		System.out.println();
		
	}
}