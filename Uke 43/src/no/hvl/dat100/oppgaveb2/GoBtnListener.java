/* Oppgave B2 - MyWebBrowser og unntaksh�ndtering
 * ----------------------------------
 * Gj�r ferdig implementasjonen av actionPerformed
 * ved � legge inn unntaksh�ndtering slik at koden
 * kan kompilere. Bruk try-catch-finally.
 * Det skal skrives feilmelding ut i det store feltet
 * webpagetextarea om URL'en ikke er lovlig eller
 * hvis nettsidedn ikke finnes. 
 * Feltet der URLen skrives inn urltextfield skal
 * alltid settes til en tom streng n�r brukeren har
 * trykket p� Go.
 */
package no.hvl.dat100.oppgaveb2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GoBtnListener implements ActionListener {

	private JTextArea webpagetextarea;
	private JTextField urltextfield;

	public GoBtnListener(JTextArea webpagetextarea, JTextField urltextfield) {
		this.webpagetextarea = webpagetextarea;
		this.urltextfield = urltextfield;
	}

	public void actionPerformed(ActionEvent e) {

		// URL som bruker har testet inn i addresse-linjen
		String urlstr = urltextfield.getText();

		// skal lagre tekst som vi mottar over nettet via url
		String text = "";
		
		Scanner in = null;
		
		try {
			
			// konstruer URL objekt
			URL url = new URL(urlstr);
			
			// opprett scanner som kan lese informasjon strøm av tekst fra url'en
	
			URLConnection connection = url.openConnection();
	
			in = new Scanner(connection.getInputStream());
	
			// akkumuler teksten som leses via scanner
			int i = 1;
			while (i <= MyBrowser.MAX_LINES && in.hasNextLine()) {
	
				String linje = in.nextLine();
	
				text = text + linje + "\n";
			}
	
			// legg teksten som er lest fra URL'en inn i hovedvinduet
			webpagetextarea.setText(text);
	
			if (in != null) {
				in.close();
			}
		} catch (MalformedURLException f) {
			text = "Feil format p� URL" + f.getMessage();
			webpagetextarea.setText(text);
		} catch(IOException g) {
			JOptionPane.showMessageDialog(null, "Nettsiden " + urlstr + " finnes ikke" + g.getMessage());
		}
		finally {
			urltextfield.setText("");
		}
		/* 
		 
		 håndter unntak MalformedURLException (Feil format på URL) og
		 IOException (web siden kunne ikke åpnes) ved å skive ut feilmelding
		 bruk setText metoden på webpagetextarea-objektet til å sette teksten
		 bruk finally til altid å sette addresse-linjen til den tomme teksten
		 adresse-linjen er representert ved urltextfield
		
        */
	}
}
