package salin.TicTacToe;

import static java.lang.System.out;

public class Map {
	private int size;
	private String[] map;
	
	public Map() {
		int size = 9;
		map = new String[size];
		for(int i=0; i<size; i++) {
			map[i] = Integer.toString(i+1);
		}
		
	}
	
	public String getCurrent(int key) {
		return map[key-1];
	}
	
	public int getSize() {
		return size;
	}
	
	public void updateMap(int key, String Player) {
		map[key-1] = Player;
	}
	
}