package nl.sogyo.Mancala_MB;

public class SpeelVakje extends Vakje {
	
	private int zaaiVoorraad;
	private static int tellerVakjes;
	private int dumpAantal
	
	public SpeelVakje(int aantalVakjes, Vakje eerste) {
		stenen = 4;
		if (aantalVakjes == 9 | aantalVakjes == 2) {
			volgende = new Kalaha(aantalVakjes - 1, eerste);
		} else {
			volgende = new SpeelVakje(aantalVakjes - 1, eerste);
		}
	}
	
	public SpeelVakje() {
		stenen = 13;
		volgende = new SpeelVakje(13, this);
	}
	
	public void zet(Vakje eerste) {
		verwijderStenen();
		volgende.ontvang(zaaiVoorraad-1, eerste);
	}
	
	public void verwijderStenen() {
		zaaiVoorraad = stenen;
		stenen = 0;
	}
	
	public boolean isKalaha(Vakje vakje) {
		return false;
	}
	
	public void slaan(Vakje vakje) {
		Vakje tegenover = getTegenover(this);
		dumpAantal = tegenover.stenen;
		tegenover.stenen = 0;
		vakje = getKalaha(this);
		vakje.dump(dumpAantal, vakje);		
	}
	
	public void getTegenstander() {
		
	}
	
	public Vakje getKalaha(Vakje vakje) {
		while (!vakje.isKalaha(vakje)) {
			vakje = vakje.volgende;
		} 
		return vakje;
			
		
	}
	
	public Vakje getTegenover(Vakje vakje) {
		while (vakje.isKalaha(vakje) == false) {
			tellerVakjes++;
			vakje = vakje.volgende;
		}
		while (tellerVakjes > 0) {
			tellerVakjes--;
			vakje = vakje.volgende;
		}
		return vakje;
	}
	
	
		
	
	
	
}

