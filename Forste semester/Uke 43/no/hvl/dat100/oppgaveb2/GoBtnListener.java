/* Oppgave B2 - MyWebBrowser og unntakshåndtering
 * ----------------------------------
 * Gjør ferdig implementasjonen av actionPerformed
 * ved å legge inn unntakshåndtering slik at koden
 * kan kompilere. Bruk try-catch-finally.
 * Det skal skrives feilmelding ut i det store feltet
 * webpagetextarea om URL'en ikke er lovlig eller
 * hvis nettsidedn ikke finnes. 
 * Feltet der URLen skrives inn urltextfield skal
 * alltid settes til en tom streng når brukeren har
 * trykket på Go.
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
			
			// opprett scanner som kan lese informasjon strÃ¸m av tekst fra url'en
	
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
			text = "Feil format på URL" + f.getMessage();
			webpagetextarea.setText(text);
		} catch(IOException g) {
			JOptionPane.showMessageDialog(null, "Nettsiden " + urlstr + " finnes ikke" + g.getMessage());
		}
		finally {
			urltextfield.setText("");
		}
		/* 
		 
		 hÃ¥ndter unntak MalformedURLException (Feil format pÃ¥ URL) og
		 IOException (web siden kunne ikke Ã¥pnes) ved Ã¥ skive ut feilmelding
		 bruk setText metoden pÃ¥ webpagetextarea-objektet til Ã¥ sette teksten
		 bruk finally til altid Ã¥ sette addresse-linjen til den tomme teksten
		 adresse-linjen er representert ved urltextfield
		
        */
	}
}
