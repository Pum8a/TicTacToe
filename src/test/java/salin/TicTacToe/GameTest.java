package salin.TicTacToe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class GameTest {
	@Test
	public void testConstructor() {
		Game game = new Game();
		assertNotNull(game.getPlayer());
	}
}


