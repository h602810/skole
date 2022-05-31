package src;

public class Oppgave1 {
	public static void main(String[] args) {
	}
	
	
	/*
	 * OPPGAVE 1A
	 * 
	 * Vi observerer at n�r man flytter minste elementet f�rst f�r
	 * man starter selve sorteringen s� f�rer dette til at tiden
	 * er raskere.
	 * Det samme gjelder omvendt insertion sort, men denne er litt 
	 * treigere enn minste-sorteringen. 
	 * 
	 */
	
	
	/*
	 * Modifisert Insertion Sort (minste element f�rst)
	 */
	public static <T extends Comparable<? super T>> void modifisertA2(T[] a, int n) {
		modifisertA2(a, 0, n - 1);
	}
	
	public static <T extends Comparable<? super T>> void modifisertA2(T[] a, int start, int slutt) {
		T minste = a[0];
		int index = 0;
		for (int i = start; i <= slutt; i++) {
			if ( (minste.compareTo(a[i])) > 0) {
				minste = a[i];
				index = i;
			}
		}
		T tempor = a[index];
		a[index] = a[0];
		a[0] = tempor;
		
		for (int i = start + 2; i <= slutt; i++) {
			T temp = a[i];
			int j = i - 1;
			boolean ferdig = false;
			while (!ferdig && j >= 1) {
				if (temp.compareTo(a[j]) < 0) {
					a[j + 1] = a[j];
					j--;
				} else {
					ferdig = true;
				}
			}
			a[j+1] = temp;
		}
	}

	
	/*
	 * Modifisert Insertion Sort (omvendt vei)
	 */
	public static <T extends Comparable<? super T>> void modifisertA(T[] a, int n) {
		modifisertA(a, 0, n - 1);
	}
	
	public static <T extends Comparable<? super T>> void modifisertA(T[] a, int start, int slutt) {
		for (int i = slutt - 1; i >= start; i--) {	
			T temp = a[i];
			int j = i + 1;
			boolean ferdig = false;
			while (!ferdig && j <= slutt) {
				if (temp.compareTo(a[j]) > 0) {
					a[j - 1] = a[j];
					j++;
				} else {
					ferdig = true;
				}
			}
			a[j-1] = temp;
		}
	}

	/*
	 * Vanlig Insertion Sort
	 */
	
	// Sortering ved innsetting (Insertion sort)
	public static <T extends Comparable<? super T>> void sorteringVedInnsetting(T[] a, int n) {
		sorteringVedInnsetting(a, 0, n - 1);
	}

	// Sorterer ein del av tabellen, start ... slutt (begge grensene er med)
	public static <T extends Comparable<? super T>> void sorteringVedInnsetting(T[] a, int start, int slutt) {
		for (int i = start + 1; i <= slutt; i++) {
			T temp = a[i];
			int j = i - 1;
			boolean ferdig = false;
			while (!ferdig && j >= 0) {
				if (temp.compareTo(a[j]) < 0) {
					a[j + 1] = a[j];
					j--;
				} else {
					ferdig = true;
				}
			}
			a[j+1] = temp;
		}
	} 
	
	/*
	 * OPPGAVE 1B
	 * 
	 * Modifiser koden slik at i stedet for � sette inn ett element om gangen, setter vi inn to. 
	 * S� lenge det st�rste elementet er mindre enn elementet vi sammenligner med i sortert del, s� 
	 * kan vi flytte elementet to plasser til h�yre. 
	 * N�r vi finner rett plass for st�rste, forsetter vi som vanlig med � sette inn det minste. 
	 * Kombiner med � flytte minste elementet f�rst (som i a) f�r sorteringen starter. 
	 * Pass p� at metoden fungerer for b�de odde og jevne n. Skriv kort hva dere observerer. 
	 */
	public static <T extends Comparable<? super T>> void dobbelInnsetting(T[] a, int n) {
        dobbelInnsetting(a, 0, n - 1);
    }

    // Sorterer ein del av tabellen, start ... slutt (begge grensene er med)
    public static <T extends Comparable<? super T>> void dobbelInnsetting(T[] a, int start, int slutt) {
        for (int i = start + 2; i <= slutt; i++) {
            int j = i - 2;
            T ftemp = a[i];
            T btemp = a[i-1];
            T bigtemp = null;
            T minitemp = null;
            boolean ferdig1 = false;
            boolean ferdig2 = false;
            
            if (btemp.compareTo(ftemp) > 0) {
                bigtemp = btemp;
                minitemp = ftemp;
            }
            else {
                bigtemp = ftemp;
                minitemp = btemp;
            }
            
            while (!ferdig1 && j >= 0) {
            if (bigtemp.compareTo(a[j]) < 0) {
                a[j + 2] = a[j];
                j--;
            } else {
                ferdig1 = true;               
                }
            }
            a[j+2] = bigtemp;
    
            
            while (!ferdig2 && j >= 0) {
            if(minitemp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
                
            } else {
                ferdig2 = true;
            }
        }
            a[j+1] = minitemp;
            
        }
        
    }
} // end-class