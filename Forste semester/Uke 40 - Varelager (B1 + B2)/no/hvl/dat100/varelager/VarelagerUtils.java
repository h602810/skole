package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
//		Vare temp = varer[0];
//		
//		for (int i = 0; i < varer.length; i++) {
//			if (varer[i].getPris() < temp.getPris()) {
//				temp = varer[i];
//			}
//		}
//		
//		return temp;
		
		Vare billigste = varer[0];
		for (int i = 1; i < varer.length; i++) {
			if (varer[i].erBilligereEnn(billigste)) {
				billigste = varer[i];
			}
		}
		return billigste;
	}
	
	public static double totalPris(Vare[] varer) {
		double total = 0;
		for (int i = 0; i < varer.length; i++) {
			total += varer[i].getPris();
		}
		return total;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		int[] varenrTab = new int[varer.length];
		
		for (int i = 0; i < varer.length; i++) {
//			int varenr = varer[i].getVarenr();
			varenrTab[i] = varer[i].getVarenr();
		}
		
		return varenrTab;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		double[] diff = new double[varer.length-1];
		
		for (int i = 0; i < diff.length; i++) {
			diff[i] = varer[i+1].getPris() - varer[i].getPris();
		}
		
		return diff;
		
	}
}
