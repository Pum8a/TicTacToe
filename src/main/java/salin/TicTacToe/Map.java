package salin.TicTacToe;

public class Map {
	private int size;
	private String[] map;
	
	public Map() {
		int size = 9;
		map = new String[size];
		for(int i=1; i<size; i++) {
			map[i] = Integer.toString(i);
		}
		
	}
	
	public String getCurrent(int key) {
		return map[key];
	}
	
	public int getSize() {
		return size;
	}
	
}