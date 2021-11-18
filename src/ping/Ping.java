package ping;

import java.io.*;

public class Ping {

	public static void main(String[] args) throws Exception {
		
	
		ProcessBuilder ping = new ProcessBuilder("ping", "www.google.com");
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(ping.start().getInputStream()));
		 
		String linea;
		
		while((linea= br.readLine())!=null) {
			System.out.println(linea);
		}		
	}
}