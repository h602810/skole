/* Oppgave V1 - Bondesjakk
 * ----------------------------------
 * a) Implementer metodene:
 * 		- private boolean checkHorizontal(int y, char player)
 *		- private boolean checkVertical(int x, char player)
 *		- private boolean checkDiagonals(char player)
 *	  i klassen GameController.java.
 *    Metodene skal avgjøre om karakteren gitt ved player 
 *    (enten ´X´eller ´O´) finnes på alle posisjoner i en horisontal 
 *    linje (gitt ved x), en vertikal linje (gitt ved y) eller 
 *    på en av de to diagonaler.
 *    Disse metodene vil (automatisk) bli kalt av resten av programmet 
 *    hver gang en spiller har gjort et trekk. Dvs. dere trenger kun å 
 *    se på disse tre metodene og ikke resten av programmet.
 *    
 *    Den aktuelle tilstand av brettet finnes i den to-dimensjonale 
 *    tabellen board definert som:
 *    	- char[][] board = new char[TicTacToe.SIZE][TicTacToe.SIZE];
 *    der TicTacToe.SIZE angir størrelsen på brettet.
 * b) Prøv å endre på verdien av SIZE i klassen TicTacToe.java. 
 * 	  Virker spillet fortsatt korrekt?
 */

package no.hvl.dat100;

import javax.swing.SwingUtilities;

public class TicTacToe {

	// size of game board
	public static int SIZE = 3;

	// character representation of player identity
	public final static char X_PLAYER_CHR = 'X';
	public final static char O_PLAYER_CHR = 'O';

	// string representation of player identity
	public final static String X_PLAYER_STR = Character.toString(TicTacToe.X_PLAYER_CHR);
	public final static String O_PLAYER_STR = Character.toString(TicTacToe.O_PLAYER_CHR);

	public static void main(String[] args) {

		// a bit of voodoo so start the Swing UI thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GameBoard();
			}
		});
	}
}