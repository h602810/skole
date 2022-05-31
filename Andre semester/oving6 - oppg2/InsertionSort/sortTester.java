package InsertionSort;

public class sortTester {

	private static int n = 10;
	private static Integer[] tab = new Integer[n];
	    
	public static void main(String[] args) {
		fyllTab(tab);
		InsertionSort.insertionSort(tab, n);
		skrivUt(tab);	
	}
	    
    public static void fyllTab(Integer[] tab) {
        for(int i = 0; i < n; i++) {
            int random = (int) (Math.random() * n);
            tab[i] = random;
        }
    }
    
    public static void skrivUt(Integer[] tab) {
        for(int i = 0; i < tab.length;i++) {
            System.out.println(tab[i]);
        }
    }
}