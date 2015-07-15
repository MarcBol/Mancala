package nl.sogyo.Mancala_MB;

public class Vakje {
	
	protected int stenen;
	protected Vakje volgende;
	protected static int tellerKalaha;
	private int stenenTotaalSpeler1;
	private int stenenTotaalSpeler2;
	protected boolean isEindeSpel;
	protected int stenenKalahaSpeler1;
	protected int stenenKalahaSpeler2;
	
	Speler speler = new Speler(); 
	
	public void ontvang(int zaaiVoorraad, Vakje eerste) {
		
		if (zaaiVoorraad > 0) {
			
			if(isKalaha(this)) {
			
				tellerKalaha = tellerKalaha + 1;
			
				if (tellerKalaha == 2) {
					volgende.ontvang(zaaiVoorraad, eerste);
				} else {
					stenen++;
					volgende.ontvang(zaaiVoorraad - 1, eerste);
				}
			} else {
				stenen++;
				volgende.ontvang(zaaiVoorraad - 1, eerste);
			}
		} else {
			if (isKalaha(this)) {
				tellerKalaha = tellerKalaha + 1;
				
				if (tellerKalaha == 2) {
					volgende.ontvangLaatste(zaaiVoorraad, eerste);
				} else {
					ontvangLaatste(zaaiVoorraad, eerste);
				}
			} else {
				ontvangLaatste(zaaiVoorraad, eerste);
			}
		}
	}
	
	public void ontvangLaatste(int zaaiVoorraad, Vakje eerste) {
		
		stenen++;
		
		if (isSlaanUitvoerbaar()) {
			this.slaan(this);
		} else if (isNogEenBeurtUitvoerbaar()) {
			speler.nogEenBeurt();
		} else {
			speler.aanDeBeurt();
		}
		tellerKalaha = 0;
		checkEindeSpel(eerste);
	}
	
	protected boolean checkEindeSpel(Vakje eerste) {
		
		if (checkStenenSpeler1(eerste) == 0 || checkStenenSpeler2(eerste.volgende.volgende.volgende.volgende.volgende.volgende.volgende) == 0) {
			return isEindeSpel = true;
		} else {
			return isEindeSpel = false;
		}
		
	}
	
	private int checkStenenSpeler1(Vakje eerste) {
		for (int x = 0; x < 6; x++) {
			stenenTotaalSpeler1 = stenenTotaalSpeler1 + eerste.stenen;
			eerste = eerste.volgende;
		}
		checkKalahaSpeler1(eerste);
		return stenenTotaalSpeler1;
	}
	
	private int checkStenenSpeler2(Vakje eerste) {
		for (int x = 0; x < 6; x++) {
			stenenTotaalSpeler2 = stenenTotaalSpeler2 + eerste.stenen;
			eerste = eerste.volgende;
		}
		
		checkKalahaSpeler2(eerste);
		return stenenTotaalSpeler2;
	}

	public boolean isKalaha(Vakje vakje) {
		return false;
	}
	
	
	
	private boolean isSlaanUitvoerbaar() {
		if (this.stenen == 1 && tellerKalaha != 1) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isNogEenBeurtUitvoerbaar() {
		if (tellerKalaha == 1 && isKalaha(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void slaan(Vakje vakje) {
		
	}
	
	public void dump(int dumpAantal, Vakje vakje) {
				
	}
	
	public int checkKalahaSpeler1(Vakje kalaha) {
		stenenKalahaSpeler1 = kalaha.stenen;
		return stenenKalahaSpeler1;
	}
	
	public int checkKalahaSpeler2(Vakje kalaha) {
		stenenKalahaSpeler2 = kalaha.stenen;
		return stenenKalahaSpeler2;
	}
}
