package cz.tomek.anki.mavenapp;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;

public class MessagingIT {
	
	@Test
	public void shouldHandle() {
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("shouldHandle");
		InputStream is = ClassLoader.getSystemResourceAsStream("it-data.txt");
		try (Scanner sc = new Scanner(is)) {
			while (sc.hasNextLine()) {
				out.println(sc.nextLine());
			}
		}
	}

}
