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
	
	public void updateMap(int key, String player) {
		map[key-1] = player;
	}
	
	public void printMap() {
		String line1;
		String line2;
		String line3;
		
		line1 = map[0]+" | "+map[1]+" | "+map[2];
		line2 = map[3]+" | "+map[4]+" | "+map[5];
		line3 = map[6]+" | "+map[7]+" | "+map[8];
		
		out.println(line1);
		out.println();
		out.println("----------");
		out.println();
		out.println(line2);
		out.println();
		out.println("----------");
		out.println();
		out.println(line3);
	}
}