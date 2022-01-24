package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static javax.swing.JOptionPane.*;

public class oppgave4 {
	public static void main(String[] args) {
		// Oppgave A
		List<String> ord = new ArrayList<>();
		ord.add("er");
		ord.add("det");
		ord.add("alle");
		ord.add("er");
		ord.add("det");
		ord.add("det");
		
		Map<String, Integer> frekvens = new HashMap<>();
		
		for (int i = 0; i < ord.size(); i++) {
			
			if (!frekvens.containsKey(ord.get(i))) {
				frekvens.put(ord.get(i), 1);
			}
			else if (frekvens.containsKey(ord.get(i))) {
				frekvens.replace(ord.get(i), frekvens.get(ord.get(i)) + 1);
			}
		}
		
		for (int i = 0; i < frekvens.size(); i++) {
			System.out.println(ord.get(i) + " " + frekvens.get(ord.get(i)));
		}
		
		System.out.println();
		
		// Oppgave B
		List<String> bOrd = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			bOrd.add(showInputDialog("oppgi et ord"));
		}
		
		Map<String, Integer> bFrekvens = new HashMap<>();
		
		for (String s : bOrd) {
			if (bFrekvens.containsKey(s)) {
				bFrekvens.replace(s, (bFrekvens.get(s)) + 1);
			}
			else {
				bFrekvens.put(s,  1);
			}
		}
		
		for (Map.Entry<String,Integer> entry: bFrekvens.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// bugga..?
//		for (int i = 0; i < bOrd.size(); i++) {
//			
//			if (!bFrekvens.containsKey(bOrd.get(i))) {
//				bFrekvens.put(bOrd.get(i), 1);
//			}
//			else if (bFrekvens.containsKey(bOrd.get(i))) {
//				bFrekvens.replace(bOrd.get(i), bFrekvens.get(bOrd.get(i)) + 1);
//			}
//		}
//		
//		for (int i = 0; i < bFrekvens.size(); i++) {
//			System.out.println(bOrd.get(i) + " " + bFrekvens.get(bOrd.get(i)));
//		}
		
	}
	
}
