package nl.sogyo.Mancala_MB;

public class Kalaha extends Vakje {
	
	
	
	public Kalaha(int aantalVakjes, Vakje eerste) {
		stenen = 0;
		if (aantalVakjes == 8) {
			volgende = new SpeelVakje(aantalVakjes - 1, eerste);
		} else {
			volgende = eerste;
		}
	}
	
	public boolean isKalaha(Vakje vakje) {
		return true;
	}
	
	public void dump(int aantal, Vakje vakje) {
		
		vakje.stenen = vakje.stenen + aantal;
	
	}
	
	
}
