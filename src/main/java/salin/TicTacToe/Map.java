package salin.TicTacToe;

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
	
	public void updateMap(int key, String player) {
		map[key-1] = player;
	}
	
	public void printMap() {
		System.out.println("*******************************");
		System.out.println("*         |         |         *");
		System.out.println("*    " + map[0] + "    |    " + map[1] + "    |    " + map[2] + "    *");
		System.out.println("*_________|_________|_________*");
		System.out.println("*         |         |         *");
		System.out.println("*    " + map[3] + "    |    " + map[4] + "    |    " + map[5] + "    *");
		System.out.println("*_________|_________|_________*");
		System.out.println("*         |         |         *");
		System.out.println("*    " + map[6] + "    |    " + map[7] + "    |    " + map[8] + "    *");
		System.out.println("*         |         |         *");
		System.out.println("*******************************");
	}
}