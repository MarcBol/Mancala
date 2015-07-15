package nl.sogyo.Mancala_MB;

import junit.framework.TestCase;
import nl.sogyo.Mancala_MB.*;

public class VakjeTest extends TestCase {
	
	public void testVakje01() {
		Vakje v = new SpeelVakje();
		int resultaat = v.stenen;
		assertEquals(13, resultaat);
	}
	
	public void testVakje02() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje03() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje04() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje05() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje06() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje07() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(0, resultaat);
	}
	
	public void testVakje08() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje09() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje10() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje11() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje12() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje13() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(4, resultaat);
	}
	
	public void testVakje14() {
		Vakje v = new SpeelVakje();
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(0, resultaat);
	}
	
	public void testLeegVakje() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.verwijderStenen();
		int resultaat = v.stenen;
		assertEquals(0, resultaat);
	}
	
	public void testZaaien1() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien2() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien3() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien4() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien5() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien6() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(1, resultaat);
	}
	
	public void testZaaien7() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien8() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien9() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien10() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien11() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien12() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(5, resultaat);
	}
	
	public void testZaaien13() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(0, resultaat);
	}
	
	public void testLoop() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.stenen;
		assertEquals(1, resultaat);
	}
	
	public void testSlaanUitvoerbaar() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		boolean resultaat = v.isSlaanUitvoerbaar();
		assertEquals(true, resultaat);
	}
	
	public void testGetTegenover() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		Vakje resultaat = s.getTegenover(v);
		assertEquals(v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende, resultaat);
	}
	
	public void testSlaan() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(0, resultaat);
	}
	
	public void testDump() {
		Vakje v = new SpeelVakje();
		SpeelVakje s = (SpeelVakje) v;
		s.zet(s);
		int resultaat = v.volgende.volgende.volgende.volgende.volgende.volgende.stenen;
		assertEquals(6, resultaat);
	}
}

