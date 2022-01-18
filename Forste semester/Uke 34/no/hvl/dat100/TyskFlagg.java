package no.hvl.dat100;

import easygraphics.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TyskFlagg extends EasyGraphics {

	  public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
	    int prosent = parseInt(showInputDialog("Skaler flagget i prosent: "));
	    
	    int vanligBredde = 75, vanligLengde = 400;
	    int bredde = vanligBredde*prosent/100;
	    int lengde = vanligLengde*prosent/100;
	    int x = 50;
	    int y = 50;
		  
		makeWindow("Det tyske flagget");

	    // svart
	    setColor(0, 0, 0);
	    fillRectangle(x, y, lengde, bredde);
	    // rød
	    setColor(255, 0, 0);
	    fillRectangle(x, y+bredde, lengde, bredde);
	    // gul
	    setColor(255, 255, 0);
	    fillRectangle(x, y+(bredde*2), lengde, bredde);
	    // ramme
	    setColor(0, 0, 0);
	    drawRectangle(x, y, lengde, bredde*3);
	  }

	}


/*package no.hvl.dat100;

import easygraphics.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TyskFlagg extends EasyGraphics {

	  public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
		  
makeWindow("Det tyske flagget");

// svart
setColor(0, 0, 0);
fillRectangle(50, 50, 400, b);
//
setColor(255, 0, 0);
fillRectangle(50, 125, 400, b);
// gul
setColor(255, 255, 0);
fillRectangle(50, 200, 400, b);
// ramme
setColor(0, 0, 0);
drawRectangle(50, 50, 400, b2);
}

}*/