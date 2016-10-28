package salin.TicTacToe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GameTest {
	@Test
	public void testConstructor() {
		Game game = new Game();
		assertNotNull(game.getPlayer());
	}

	@Test
	public void testWinner() {
		Game game = new Game();
		game.map.updateMap(1, "X");
		game.map.updateMap(2, "X");
		game.map.updateMap(3, "X");
		assertTrue(game.winner());
	}

	@Test
	public void testWinner1() {
		Game game = new Game();
		game.map.updateMap(2, "X");
		game.map.updateMap(5, "X");
		game.map.updateMap(8, "X");
		assertTrue(game.winner());
	}

	@Test
	public void testWinner2() {
		Game game = new Game();
		game.map.updateMap(1, "O");
		game.map.updateMap(5, "O");
		game.map.updateMap(9, "O");
		assertTrue(game.winner());
	}
}


