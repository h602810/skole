package Oppgave4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaerTreKlient {
	
	public static final int TRAER = 100;
	public static final int NODER = 1023;
	
	public static void main(String[] args) {
		// Oppgave 4a
		BS_Tre<Integer> tre = new BS_Tre(10);
		tre.leggTil(3);
		tre.leggTil(54);
		tre.leggTil(21);
		tre.leggTil(14);
		tre.leggTil(9);
		tre.leggTil(1);
		
		System.out.println("Treets høyde: " + tre.finnHoyde() + "\n");
		
		// Oppgave 4b
		HashMap<String, BS_Tre> skogen = new HashMap<>();
		
		// i) antall noder n 
		System.out.println("Antall noder: " + (TRAER*NODER) + "\n");
		
		/*
		 * ii) den minimale teoretiske høyden 
		 * 	   
		 * 	   (her vil det være naturlig å lage 
		 * 	    en metode som regner ut denne
		 *	    verdien for en gitt verdi av n)
		 */
		System.out.println("Minimale teoretiske høyden: log2n." + "\n");
		
		// iii) den maksimale teoretiske høyden 
		System.out.println("Maksimale teoretiske høyden: (n-1)." + "\n");

		// iv) minste høyde i løpet av kjøringene 
		System.out.println("Minste høyden i løpet av kjøringene: " + minsteHoyde(skogen) + "\n");
		
		// v) største høyde i løpet av kjøringene 
		System.out.println("Storste hoyde ila kjoringen: " + maksHoyde(skogen) + "\n");
		
		// vi) gjennomsnittlig høyde av alle kjøringene 
		System.out.println("Gjennomsnittshoyde av alle kjoringer: " + snittHoyde(skogen) + "\n");

	}
	
	// Metode for å fylle opp skogen med traer
	public static void fyllSkog(HashMap<String, BS_Tre> skogen) {
		// Oppretter 100 TRAER til skogen
		for (int i = 0; i < TRAER; i++) {
			skogen.put("tre " + i, new BS_Tre<>((int) (Math.random() * TRAER)));
			
			// Legger til 1023 NODER i hvert tre
			for (int j = 0; j < NODER; j++) {
				skogen.get("tre " + i).leggTil((int) (Math.random() * TRAER));
			}
		}
	}
	
	// Metode for å finne minste hoyde 
	private static Integer minsteHoyde(HashMap<String, BS_Tre> skogen) {
		List<Integer> tall = new ArrayList<>();
		
		for (int i = 0; i < TRAER; i++) {
			tall.add(skogen.get("tre " + i).finnHoyde());
		}
		tall.sort(null);
		return tall.get(0);
	}
	
	// Metode for å finne maks hoyde
	private static Integer maksHoyde(HashMap<String, BS_Tre> skogen) {
		List<Integer> tall = new ArrayList<>();
		for(int i = 0; i < TRAER; i++) {
			tall.add(skogen.get("tre" + i).finnHoyde());
		}
		tall.sort(null);
		return tall.get(TRAER - 1);
	}
	
	// Metode for å finne gjennomsnittelig hoyde
	private static Integer snittHoyde(HashMap<String, BS_Tre> skogen) {
		Integer sum = 0;
		for(int i = 0; i < TRAER; i++) {
			sum += skogen.get("tre" + i).finnHoyde();
		}
		return (sum / TRAER);
	}

} // end class