package cz.tomek.anki.mavenapp;

import java.io.InputStream;
import java.io.PrintWriter;

public class App {
	
	public static void main(String[] args) throws Exception {
		PrintWriter out = new PrintWriter(System.out, true);
		InputStream is = App.class.getClassLoader().getResourceAsStream("readme.txt");
		byte[] binaryData = new byte[is.available()];
		is.read(binaryData);
		String content = new String(binaryData);
		out.println(content);
	}
	
	public void handle() {}
	
}
