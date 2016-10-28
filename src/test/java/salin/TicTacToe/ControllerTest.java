package salin.TicTacToe;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ControllerTest {
	@Test
	public void testIfNumber() {
		String s = "1202";
		Controller control = new Controller();
		assertTrue(control.isNumber(s));
	}

	@Test public void testIfNotNumber() {
		String s = "Quit";
		Controller control = new Controller();
		assertFalse(control.isNumber(s));
	}
}