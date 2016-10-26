package salin.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
	@Test
	public void swapPlayerSymbol() {
		Player player = new Player();
		player.swapPlayer();
		assertEquals("O", player.getPlayerSymbol());
	}

	@Test
	public void swapPlayerTwice() {
		Player player = new Player();
		player.swapPlayer();
		player.swapPlayer();
		assertEquals("X", player.getPlayerSymbol());
	}
}
