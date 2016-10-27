package salin.TicTacToe;

import java.util.Scanner;

public class Game {
	private Player player;
	private Map map;

	public Game() {
		player = new Player();
		map = new Map();    	
	}

	public String getPlayer() {
		return player.getPlayerSymbol();
	}

	public void getMap() {
		map.printMap();
	}
	
	public void play() {
		
		System.out.println("Game Started");
		while(true) {
			getMap();
			System.out.print("player ");
			System.out.print(getPlayer());
			System.out.println(" Trun");
			System.out.println("Pick a number between 1-9");
			Scanner scan = new Scanner(System.in);
			int key = scan.nextInt();
			
			map.updateMap(key, getPlayer());
			player.swapPlayer();
		}
	}


}
