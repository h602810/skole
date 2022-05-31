	package Oppgave4;

import java.util.Iterator;

public class BS_Tre<T extends Comparable<? super T>> implements SoektreInterface<T> {
	
	private BinaerTreNode<T> rot;
	
	public BS_Tre() {
		rot = null;
	}
	
	public BS_Tre(T element) {
		rot = new BinaerTreNode<T>(element);
	}
	
	/*
	 * Oppgave 4a
	 * 
	 * Lag en rekursive metode for å finne 
	 * høyden av et binært tre.
	 */
	public int finnHoyde() {
		return finnHoyde(rot) - 1;
	}
	
	private int finnHoyde(BinaerTreNode<T> node) {
		if (node == null) {		// basistilfelle
			return 0;
		} else {
			return 1 + Math.max(finnHoyde(node.getVenstre()), finnHoyde(node.getHoyre()));
		}
	}
	
	/*
	 * Søker etter et gitt element i treet
	 * 
	 * @param element elementet vi søker etter
	 * @return true om elementet finst, false ellers
	 */
	public boolean inneholder(T element) {
		if (finn(element) == null) {
			return false;
		}
		return true;
	}

	/*
	 * Henter et element i treet
	 * 
	 * @param element elementet vi leter etter
	 * @return elementet dersom det finnes, ellers null
	 */
	public T finn(T element) {
		return finn(element, rot);
	}
	
	private T finn(T element, BinaerTreNode<T> node) {
		T svar = null;
		
		// basistilfelle (node == null) -> tomt tre og svar blir null
		if (node != null) {
			int sml = element.compareTo(node.getElement());
			if (sml == 0) {
				svar = node.getElement();
			} else if (sml < 0) {
				svar = finn(element, node.getVenstre());
			} else {
				svar = finn(element, node.getHoyre());
			}
		}
		return svar;
	}

	/*
	 * Legg et element til treet dersom det ikke finnes fra
	 * før. Ellers blir det gamle elementet erstatte med
	 * det nye.
	 * 
	 * @param nyElement elementet som skal legges til
	 * @return null om elementet ikke finnes fra før.
	 * 			Ellers det elementet som var i treet fra før.
	 */
	public BinaerTreNode<T> leggTil(T nyElement) {
		return leggTil(rot, nyElement);
	}
	
	private BinaerTreNode<T> leggTil(BinaerTreNode<T> node, T element) {
		if (node == null) {		// basistilfelle
			return new BinaerTreNode<T>(element);
		} else {
			if (element.compareTo(node.getElement()) < 0) {
				node.setVenstre(leggTil(node.getVenstre(), element));
			} else {
				// Alternativ med to kodelinjer
				BinaerTreNode<T> p = leggTil(node.getHoyre(), element);
				node.setHoyre(p);
			}
		}
		return node;
	}

	/*
	 * Fjerner et element fra treet
	 * 
	 * @param element elementet som skal fjernes
	 * @return elementet som ble fjerna eller null om
	 * 			det ikke finnes
	 */
	public T fjern(T element) {
		return null;
	}

	/*
	 * Lager en iterator som går gjennom alle element i
	 * treet i inorden
	 * 
	 * @return en iterator som elementa i sortert rekkefølge
	 */
	public Iterator<T> getInordenIterator() {
		return null;
	}
	
}
