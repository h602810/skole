package Oppgave4;

import java.util.Iterator;

public interface SoektreInterface<T extends Comparable<? super T>> {
	/*
	 * S�ker etter et gitt element i treet
	 * 
	 * @param element elementet vi s�ker etter
	 * @return true om elementet finst, false ellers
	 */
	boolean inneholder(T element);
	
	/*
	 * Henter et element i treet
	 * 
	 * @param element elementet vi leter etter
	 * @return elementet dersom det finnes, ellers null
	 */
	T finn(T element);
	
	/*
	 * Legg et element til treet dersom det ikke finnes fra
	 * f�r. Ellers blir det gamle elementet erstatte med
	 * det nye.
	 * 
	 * @param nyElement elementet som skal legges til
	 * @return null om elementet ikke finnes fra f�r.
	 * 			Ellers det elementet som var i treet fra f�r.
	 */
	BinaerTreNode<T> leggTil(T nyElement);
	
	/*
	 * Fjerner et element fra treet
	 * 
	 * @param element elementet som skal fjernes
	 * @return elementet som ble fjerna eller null om
	 * 			det ikke finnes
	 */
	T fjern(T element);
	
	/*
	 * Lager en iterator som g�r gjennom alle element i
	 * treet i inorden
	 * 
	 * @return en iterator som elementa i sortert rekkef�lge
	 */
	Iterator<T> getInordenIterator();
}
