package nl.sogyo.Mancala_MB;

import java.util.Scanner;

public class UserInput {
	
	public int index;
	
	
	public int getInvoer() {
		
		Scanner scanner = new Scanner(System.in);
		
		if (Speler.p1Beurt) {
			System.out.println("\nSpeler 1, welke index wil je spelen?");
		} else {
			System.out.println("\nSpeler 2, welke index wil je spelen?");
		}	
		
		try {
			index = scanner.nextInt();
			while (Speler.p1Beurt && (index < 1 | index > 6)) {
				System.out.println("Speler 1, geef een geldige index tussen 1 en 6:");
				index = scanner.nextInt();
			} 
			while (!Speler.p1Beurt && (index < 8 | index > 13)) {
				System.out.println("Speler 2, geef een geldige index tussen 8 en 13:");
				index = scanner.nextInt();
			} 
			//scanner.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return index;
		
	}	
	
	
}
