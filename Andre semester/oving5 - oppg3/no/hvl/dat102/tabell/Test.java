package no.hvl.dat102.tabell;

public class Test {

	public static void main(String[] args) {
		TabellStabel<String> stack = new TabellStabel<>();
		
		String s = "kuk{b�sj[(log)]}hei";
		stack.push(s);
		
		System.out.println(stack.erBalansert(s));

	}

}
