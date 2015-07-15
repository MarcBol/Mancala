package nl.sogyo.Mancala_MB;

public class Mancala {
	
	Vakje vakjes = new SpeelVakje();
	SpeelVakje speelVakjes = (SpeelVakje) vakjes;
	UserInput input = new UserInput();
	Vakje eerste = this.speelVakjes;
	String nutteloos = "dit heeft geen nut";
		
	public static void main(String[] args) {
		Mancala spel = new Mancala();
		spel.initialiseerSpel();
		spel.beginSpel();
	}
	
	private void initialiseerSpel() {
		System.out.println("Initialiseer spel...");
		System.out.print("Het spelbord: ");
		for (int x = 0; x < 14; x++) {
			System.out.print(vakjes.stenen+" ");
			vakjes = vakjes.volgende;
		}
	}
	
	private void beginSpel() {
		while (!vakjes.isEindeSpel) {
			int index = input.getInvoer();
			convertNaarVakjes(index);
			speelVakjes.zet(eerste);
			System.out.print("Het huidige spelbord: ");
			for (int x = 0; x < 14; x++) {
				System.out.print(eerste.stenen+" ");
				eerste = eerste.volgende;
			}
		}
		eindeSpel();
	}
	
	private void eindeSpel() {
		System.out.println("Stenen in kalaha speler 1: " + vakjes.stenenKalahaSpeler1);
		System.out.println("Stenen in kalaha speler 2: " + vakjes.stenenKalahaSpeler2);
		
		if (vakjes.stenenKalahaSpeler1 > vakjes.stenenKalahaSpeler2) {
			System.out.println("Speler 1 heeft meer stenen verzameld en is dus de terechte winnaar van dit spel!");
		} else {
			System.out.println("Speler 2 heeft meer stenen verzameld en is dus de terechte winnaar van dit spel!");
		}
		
	}
	
	private Vakje convertNaarVakjes(int index) {
		vakjes = eerste;
		if (index == 1) {
			speelVakjes = (SpeelVakje) vakjes;
		} else {
			for (int x = 1; x < index; x++) {
				vakjes = vakjes.volgende;
			}
			speelVakjes = (SpeelVakje) vakjes;
		}
		return speelVakjes;
	}
	
	

	
	
	
}
