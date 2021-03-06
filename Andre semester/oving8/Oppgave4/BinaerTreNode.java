package Oppgave4;

public class BinaerTreNode<T> {
	private T element;
	private BinaerTreNode<T> venstre;
	private BinaerTreNode<T> hoyre;
	
	BinaerTreNode(T el) {
		element = el;
		venstre = null;
		hoyre = null;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public BinaerTreNode<T> getVenstre() {
		return venstre;
	}

	public void setVenstre(BinaerTreNode<T> venstre) {
		this.venstre = venstre;
	}

	public BinaerTreNode<T> getHoyre() {
		return hoyre;
	}

	public void setHoyre(BinaerTreNode<T> hoyre) {
		this.hoyre = hoyre;
	}
	
	
}
