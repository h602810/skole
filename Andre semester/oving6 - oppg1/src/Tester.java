package src;

import java.util.Random;

public class Tester {
    
    private static int n = 70000;
    private static Integer[] tab = new Integer[n];
    private static Integer[] tab2 = new Integer[n];
    private static Integer[] tab3 = new Integer[n];
    
    public static void main(String[] args) {
    	// Insertion Sort
		System.out.println("Insertion Sort");
		System.out.printf("%-10s %-10s %-10s\n","Kodetype", "n", "målt tid");
			// Vanlig
	        fyllTab(tab);
	        long start = System.currentTimeMillis();
	        Oppgave1.sorteringVedInnsetting(tab, n);
	        long slutt = System.currentTimeMillis(); 
	        long tidVanlig = Math.abs(start-slutt);
			System.out.printf("%-10s %-10s %-10s\n", "Vanlig", n, tidVanlig + "ms");
	        // Modifisert
	        fyllTab(tab2);
	        long start2 = System.currentTimeMillis();
	        Oppgave1.modifisertA(tab2, n);
	        long slutt2 = System.currentTimeMillis();
	        long tidModA = Math.abs(start2-slutt2);
			System.out.printf("%-10s %-10s %-10s\n", "Omvendt", n, tidModA + "ms");
			// Modifisert 2
	        fyllTab(tab3);
	        long start3 = System.currentTimeMillis();
	        Oppgave1.modifisertA2(tab3, n);
	        long slutt3 = System.currentTimeMillis();
	        long tidModA2 = Math.abs(start3-slutt3);
			System.out.printf("%-10s %-10s %-10s\n", "Minste", n, tidModA2 + "ms");
    }
    
    public static void fyllTab(Integer[] tab) {
        for(int i = 0; i < n; i++) {
            int random = (int) (Math.random() * n);
            tab[i] = random;
        }
    }
    
    public static void skrivUt(Integer[] tab) {
        for(int i = 0; i < tab.length;i++) {
            System.out.println(tab[i]);
        }
    }
}
