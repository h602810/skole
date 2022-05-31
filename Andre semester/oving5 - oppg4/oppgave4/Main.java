package oppgave4;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	private static Set<Integer> mengde = new TreeSet<>();
	
	public static void main(String[] args) {
		// 4a) sumFoersteNaturlig
		System.out.println(sumFoersteNaturlig(100));
		
		// 4b) finnListe
        finnListe(10);
        
        Object[] mg = mengde.toArray();
        
        for(int i = 0; i < 10; i++) {
            System.out.println(mg[i]);
        }
		
        // 4c) Fibonacci
	    System.out.println("Det 9. fibonacci nummeret er: " + fibonacci(9));
	    
	    // 4d) Ikke-rekursiv Fibonacci
	    System.out.println("Det 9. fibonacci nummeret er (ikkeRekursiv): " + ikkeRekFibonacci(9));
	}
	
	// Oppgave 4a)
	static int sumFoersteNaturlig(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n + sumFoersteNaturlig(n-1);
	}
	
	// Oppgave 4b)
	static int finnListe(int n) {
		// mengde = new HashSet<>();
        
        // Basis
        if(n == 1) {
            mengde.add(5);
            return 5;
        }
        if(n == 0) {
            mengde.add(2);
            return 2;
        }
        else {
            mengde.add(5*finnListe((n-1)) - 6*finnListe((n-2)) + 2);
            return 5*finnListe((n-1)) - 6*finnListe((n-2)) + 2;
        }
	}
	
	// Oppgave 4c)
	static int fibonacci(int n) {
		if (n == 0 || n == 1) { // Basis
			return n;
		}
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	// Oppgave 4d)
	static int ikkeRekFibonacci(int n) {
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n];
	}
	
}