/* Uke 34 - Oppgave 5
	Feilsøk koden oppgitt med gruppa.
*/

public class Eksperiment { // manglet { 
  public static void main(String[] args) { 

    int a = 5;
    String s = "Hei";
    double b = 4.2; // b var ikke initiert med double

    System.out.println(a);
    System.out.println(s);
    System.out.println(b);
    System.out.println(s + a + 3);
    System.out.println(3 + a + s);
    System.out.println(s.replace("H", "")); // kan ikke ta minus fra string
    System.out.println(7 / a);
    System.out.println(13 - 2 * 5);

    String c = "1578"; // gjør om int til string
    System.out.println(c.length()); // c er ikke en string
    System.out.println(s.length());
  } // manglet }
} // manglet }