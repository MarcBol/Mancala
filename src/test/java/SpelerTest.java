package test.java;

import nl.sogyo.Mancala_MB.*;
import junit.framework.TestCase;

public class SpelerTest extends TestCase {
	
	Speler speler = new Speler();
	
	public void testAanDeBeurt() {
		boolean resultaat = speler.aanDeBeurt();
		assertEquals(false, resultaat);
	}
	
	public void testNogEenBeurt() {
		boolean resultaat = speler.nogEenBeurt();
		assertEquals(false, resultaat);
	}
}
