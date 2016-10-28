package salin.TicTacToe;

import java.util.Scanner;

public class Game {
	public Player player;
	public Map map;
	private UI ui;

	public Game() {
		player = new Player();
		map = new Map();
		ui = new UI();
	}

	public String getPlayer() {
		return player.getPlayerSymbol();
	}

	public void getMap() {
		map.printMap();
	}

	public void play() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Game Started");
		while(true) {
			getMap();
			System.out.print("player ");
			System.out.print(getPlayer());
			System.out.println(" Turn");
			System.out.println("Pick a number between 1-9 to play");
			System.out.println("Press Q to quit");

			char x = reader.next().charAt(0);
			if(x == 'q' || x == 'Q') {
				break;
			}
			
			int key = Character.getNumericValue(x);
            if(validInput(key)) {
                map.updateMap(key, getPlayer());
                if(winner()) {
                	System.out.println("THE WINNER IS: " + getPlayer());
               		System.out.println();
                	ui.header();
                	break;
                }
                player.swapPlayer();
            }
            else {
                System.out.println("Invaild input!! Try again");
            }
		}
	}

	private boolean validInput(int key) {
        if(key < 1 || key > 9) {
            return false;
        }
        else if(map.getCurrent(key) == "X") {
            return false;
        }
        else if(map.getCurrent(key) == "O") {
            return false;
        }

        return true;
	}

	public boolean winner() {
		if(map.getCurrent(1) == getPlayer() && map.getCurrent(2) == getPlayer() && map.getCurrent(3) == getPlayer()) {
			return true;
		}
		if(map.getCurrent(4) == getPlayer() && map.getCurrent(5) == getPlayer() && map.getCurrent(6) == getPlayer()) {
			return true;
		}
		if(map.getCurrent(7) == getPlayer() && map.getCurrent(8) == getPlayer() && map.getCurrent(9) == getPlayer()) {
			return true;
		}
		if(map.getCurrent(1) == getPlayer() && map.getCurrent(4) == getPlayer() && map.getCurrent(7) == getPlayer()) {
			return true;
		}
		if(map.getCurrent(2) == getPlayer() && map.getCurrent(5) == getPlayer() && map.getCurrent(8) == getPlayer()) {
			return true;
		}
		if(map.getCurrent(3) == getPlayer() && map.getCurrent(6) == getPlayer() && map.getCurrent(9) == getPlayer()) {
			return true;
		}
		if(map.getCurrent(1) == getPlayer() && map.getCurrent(5) == getPlayer() && map.getCurrent(9) == getPlayer()) {
			return true;
		}
		if(map.getCurrent(3) == getPlayer() && map.getCurrent(5) == getPlayer() && map.getCurrent(7) == getPlayer()) {
			return true;
		}
		
		return false;
	}

}
