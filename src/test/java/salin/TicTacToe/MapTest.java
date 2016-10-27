package salin.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MapTest {
	@Test
	public void mapCreateTest() {
		Map map = new Map();
		assertEquals("1", map.getCurrent(1));
	}

	@Test
	public void mapUpdateTest() {
		Map map = new Map();
		map.updateMap(3, "X");
		assertEquals("X", map.getCurrent(3));
	}

	@Test
	public void getIndexTest() {
	    Map map = new Map();
        asserEquals("1",map.getCurrent(1));
	}
}
