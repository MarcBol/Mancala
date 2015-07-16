package test.java;

import nl.sogyo.Mancala_MB.UserInput;
import junit.framework.TestCase;

public class UserInputTest extends TestCase {
	
	public void testUserInput() {
		UserInput invoer = new UserInput();
		int resultaat = invoer.getInvoer();
		assertEquals(1, resultaat);
	}
}