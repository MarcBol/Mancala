package nl.sogyo.Mancala_MB;

import junit.framework.TestCase;

public class UserInputTest extends TestCase {
	
	public void testUserInput() {
		UserInput invoer = new UserInput();
		int resultaat = invoer.getInvoer();
		assertEquals(1, resultaat);
	}
}