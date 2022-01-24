package src;
import java.util.ArrayList;
import java.util.List;

public class oppgave2 {
	public static void main(String[] args) {
		
		// Oppgave A
		List<Integer> liste = new ArrayList<>();
		
		liste.add(2);
		for (int i = 1; i < 5; i++) {
			liste.add(i);
		}
//		liste.add("hei");	- Fungerer ikke ettersom typen i listen er Integer og ikke String
		
		System.out.println(liste.get(4));
		/* 
		 * System.out.print(liste.get(5));
		 * Får feilmelding ettersom listen er 5 lang, men index 5 er outOfBounds
		 */
		
		
		// Oppgave B
		System.out.println(liste.size());
		liste.add(1, 420);
		skrivUt(liste);
		
		
		// Oppgave C
		System.out.println(liste.contains(2));
		System.out.println(liste.contains(20));
		
		// Oppgave D - ??
		System.out.println(liste.indexOf(2));
		
		// Oppgave E
		liste.clear();
		skrivUt(liste);
	}
	
	public static void skrivUt(List<?> liste) {
		for (int i = 0; i < liste.size(); i++) {
			System.out.print(liste.get(i) + " ");
		}
		System.out.println();
	}
}
