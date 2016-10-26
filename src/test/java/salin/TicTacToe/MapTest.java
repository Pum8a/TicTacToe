package salin.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MapTest {
	@Test
	public void MapCreateTest() {
		Map map = new Map();
		for(int i=1; i<=map.getSize(); i++) {
			assertEquals(Integer.toString(i), map.getCurrent(i));
		}
	}
}