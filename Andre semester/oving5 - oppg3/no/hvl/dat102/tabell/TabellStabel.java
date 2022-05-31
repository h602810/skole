package no.hvl.dat102.tabell;

import no.hvl.dat102.adt.Parentessjekker;
import no.hvl.dat102.adt.StabelADT;
import no.hvl.dat102.exception.EmptyCollectionException;

//  Tabellimplementasjon av en stabel.
//********************************************************************

public class TabellStabel<T> implements StabelADT<T>, Parentessjekker {
	private final static int STDK = 100;
	private int topp; // indikerer toppen
	private T[] stabel;

	/*******************************************************************
	 * Oppretter en tom stabel.
	 *******************************************************************/

	public TabellStabel() {
		this(STDK);
	}

	/*******************************************************************
	 * Oppretter en tom stabel med en spesifisert kapasitet.
	 *******************************************************************/
	public TabellStabel(int startKapasitet) {
		topp = -1;
		stabel = (T[]) (new Object[startKapasitet]);
	}

	/*******************************************************************
	 * Legger til det spesifiserte elementet på toppen av stabelen, utvider
	 * kapasiteten til stabelen hvis nødvendig.
	 *******************************************************************/
	@Override
	public void push(T element) {
		if(topp == stabel.length-1)
			utvid();
		topp++;
		stabel[topp]=element;
	}

	/*******************************************************************
	 * 
	 * Fjerner toppelementet og returnereret referansen. Hvis stabelen tom fra før,
	 * kastes unntak
	 *******************************************************************/
	@Override
	public T pop() {
		if (erTom())
			throw new EmptyCollectionException("Stabel");
		T resultat = stabel[topp];
        stabel[topp] = null;
        topp--;
		return resultat;
	}

	/*******************************************************************
	 * Returnerer toppelementet uten å fjerne det. Hvis stabelen er tom fra før,
	 * returneres null-ref.
	 *******************************************************************/
	@Override
	public T peek() {
		if (erTom())
			throw new EmptyCollectionException("Stabel");

		return stabel[topp];
		
	}

	/*******************************************************************
	 * Returnerer sann hvis stabelen er tom og usann ellers.
	 *******************************************************************/
	@Override
	public boolean erTom() {
		return (topp < 0);
	}

	/*******************************************************************
	 * Oppretter en ny tabell for å lagre innholdet.
	 *******************************************************************/
	private void utvid() {
		T[] hjelpeTabell = (T[]) (new Object[stabel.length * 2]);

		for (int indeks = 0; indeks < stabel.length; indeks++)
			hjelpeTabell[indeks] = stabel[indeks];

		stabel = hjelpeTabell;
	}

	@Override
	public boolean erVenstreparentes(char p) {
		return (p ==  '{' || p == '[' || p == '(');
	}

	@Override
	public boolean erHogreparentes(char p) {
		return (p ==  '}' || p == ']' || p == ')');
	}

	@Override
	public boolean erParentes(char p) {
		return erVenstreparentes(p) || erHogreparentes(p);
	}

	@Override
	public boolean erPar(char venstre, char hogre) {
		boolean lik = false;
		String samla = venstre + "" + hogre;
		
		if (samla.equals("()") || samla.equals("[]") || samla.equals("{}")) {
			lik = true;
		}
		
		return lik;
	}

	@Override
	public boolean erBalansert(String s) {
		TabellStabel<Character> st = new TabellStabel<Character>();

        for(char chr : s.toCharArray())
        {
            switch(chr) {

                case '{':
                case '(':
                case '[':
                    st.push(chr);
                    break;

                case ']':
                    if(st.erTom() || st.pop() != '[') 
                        return false;
                    break;
                case ')':
                    if(st.erTom() || st.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(st.erTom() || st.pop() != '{')
                        return false;
                    break;
            }
        }
        return st.erTom();
	}
}
