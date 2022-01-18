package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		varer = new Vare[n];
		antall = 0;
	}
	
	public Vare[] getVarer() {
		return varer;
	}
	
	public boolean leggTilVare(Vare v) {
		boolean plass = false;
		if (antall < varer.length) {
				varer[antall] = v;
				antall++;
				plass = true;
		}
		return plass;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
//		boolean lagtTil = false;
//		Vare nyVare = new Vare(varenr, navn, pris);
//		boolean add = leggTilVare(nyVare);
//		
//		if (add == true) {
//			lagtTil = true;
//		} 
		
		Vare nyVare = new Vare(varenr, navn, pris);
		boolean lagtTil = leggTilVare(nyVare);
		
		return lagtTil;
	}
	
	public Vare finnVare(int varenr) {
//		for (int i = 0; i < varer.length; i++) {
//			if (varenr == varer[i].getVarenr()) {
//				return varer[i];
//			}
//		}
//		return null;
		
		Vare v = null;
		int i = 0;
		while (i < varer.length && (v == null)) {
			int vnr = varer[i].getVarenr();
			if (vnr == varenr) {
				v = varer[i];
			}
			i++;
		}
		return v;
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
		System.out.println(SEP);
//		for (int i = 0; i < varer.length; i++) {
		for (Vare v : varer) {
//			System.out.println(varer[i].toString());
			System.out.println(v.toString());
		}
		System.out.println(SEP);
	}
	
}
