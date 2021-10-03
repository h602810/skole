package no.hvl.dat100;

public class EnkelTekstanalyse {

	public static void main(String[] args) {
		
		String tekst = "Et ord, men ikke mer.";
		String regex = "(\\.|,| |\n)+";
		String[] ordTab = tekst.split(regex);
		int antallTegn = 0;
		
		for (int i = 0; i < ordTab.length; i++) {
			String ord = ordTab[i];
			antallTegn += ord.length();
			System.out.println(ord + ": " + ord.length());
		}
		int snitt = antallTegn / ordTab.length;
		System.out.print("---------------------------\n" + "Gj. snittlig ordlengde: " + snitt);
		
	}

}
