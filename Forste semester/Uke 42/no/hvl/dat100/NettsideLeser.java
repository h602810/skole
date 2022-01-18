package no.hvl.dat100;

import java.io.*;
import java.net.*;
import java.util.*;

public class NettsideLeser {

	public static void main(String[] args) throws Exception{
		URL url = new URL("https://jarin.me/");
		URLConnection connection = url.openConnection();
		
		InputStream inn = connection.getInputStream();
		Scanner leser = new Scanner (new InputStreamReader(inn));
		
		while (leser.hasNextLine()) {
			System.out.println(leser.nextLine());
		}
		leser.close();

	}

}
