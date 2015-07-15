package nl.sogyo.Mancala_MB;

public class Speler {
	
	public static boolean p1Beurt = true;
	
	public boolean aanDeBeurt() {
		if (p1Beurt) {
			p1Beurt = false;
			return p1Beurt;
		} else {
			p1Beurt = true;
			return p1Beurt;
		}
	}
	
	public boolean nogEenBeurt() {
		if (p1Beurt) {
			return p1Beurt;
		} else {
			return p1Beurt;
		}
	}
}
