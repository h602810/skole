/* Oppgave 1
 * ----------------------------
 * Gitt klassen LinearNode<T>. Det er laget en liste (vha kjedet struktur) med peker start til første node 
 * og i alt 3 noder med objektene "Kari", "Per" og "Tine". For å sette inn ny node med  "Alina" fremst i 
 * listen utfører vi følgende: 
 * 		String person = ”Alina”; 
 * 		LinearNode<String> ny = new LinearNode<>(person); 
 * 		ny.setNeste(start); 
 * 		start = ny; 
 * Du kan anta at start er definert i hovedklassen som også har antall, sammenlign Bag. 
 */
package src;

public class LinearNode2<T> {
	public LinearNode2(String string) {
		
	}
	
	// i) Legg inn ny node som nr. 2 i listen med objekt "Berit"
	LinearNode<String> nyNode = new LinearNode<String>("Berit");
	nyNode.setNeste(start.getNeste());
	start.setNeste(nyNode);

	// ii) Anta at listen har fått over 10 noder. Lag en ny node som nr.10 (med objekt "Person 10"). 
	LinearNode<String> pos = start;
	LinearNode<String> nyNode = new LinearNode<String>("Person 10");
	
	int i = 1;
	while (i < 9) {
		pos = pos.getNeste();
		i++;
	}
	
	nyNode.setNeste(pos.getNeste());
	pos.setNeste(nyNode);
	
	// iii) Legg til ny node helt til slutt i listen med objekt "Sistemann".
	LinearNode<String> pos = start;
	LinearNode<String> temp = null;
	LinearNode<String> nyNode = new LinearNode<String>("Sistemann");
	
	while (pos != null) {
		temp = pos;
		pos = pos.getNeste();
	}
	
	if (temp == null) { // tom liste
		start = nyNode;
	}
	else {	// ikke tom liste
		temp.setNeste(nyNode);
	}
	
	// iv) Fjern node nr. 2 i liste bare ved å endre på nodepeker. 
	LinearNode<String> pos = start.getNeste();
	start.setNeste(pos.getNeste());

	// v) Fjern siste node i en lang liste bare ved å endre på nodepeker.
	LinearNode<String> node1 = start;
	LinearNode<String> node2 = start;
	
	while (node1.getNeste() != null) {
		node2 = node1;
		node1 = node1.getNeste();
	}
	node2.setNeste(null);

}