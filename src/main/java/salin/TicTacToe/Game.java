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

	private boolean winner() {
		if(map.getCurrent(1) == "X" && map.getCurrent(2) == "X" && map.getCurrent(3) == "X") {
			return true;
		}
		if(map.getCurrent(4) == "X" && map.getCurrent(5) == "X" && map.getCurrent(6) == "X") {
			return true;
		}
		if(map.getCurrent(7) == "X" && map.getCurrent(8) == "X" && map.getCurrent(9) == "X") {
			return true;
		}
		if(map.getCurrent(1) == "X" && map.getCurrent(4) == "X" && map.getCurrent(7) == "X") {
			return true;
		}
		if(map.getCurrent(2) == "X" && map.getCurrent(5) == "X" && map.getCurrent(8) == "X") {
			return true;
		}
		if(map.getCurrent(3) == "X" && map.getCurrent(6) == "X" && map.getCurrent(9) == "X") {
			return true;
		}
		if(map.getCurrent(1) == "X" && map.getCurrent(5) == "X" && map.getCurrent(9) == "X") {
			return true;
		}
		if(map.getCurrent(3) == "X" && map.getCurrent(5) == "X" && map.getCurrent(7) == "X") {
			return true;
		}

		if(map.getCurrent(1) == "O" && map.getCurrent(2) == "O" && map.getCurrent(3) == "O") {
			return true;
		}
		if(map.getCurrent(4) == "O" && map.getCurrent(5) == "O" && map.getCurrent(6) == "O") {
			return true;
		}
		if(map.getCurrent(7) == "O" && map.getCurrent(8) == "O" && map.getCurrent(9) == "O") {
			return true;
		}
		if(map.getCurrent(1) == "O" && map.getCurrent(4) == "O" && map.getCurrent(7) == "O") {
			return true;
		}
		if(map.getCurrent(2) == "O" && map.getCurrent(5) == "O" && map.getCurrent(8) == "O") {
			return true;
		}
		if(map.getCurrent(3) == "O" && map.getCurrent(6) == "O" && map.getCurrent(9) == "O") {
			return true;
		}
		if(map.getCurrent(1) == "O" && map.getCurrent(5) == "O" && map.getCurrent(9) == "O") {
			return true;
		}
		if(map.getCurrent(3) == "O" && map.getCurrent(5) == "O" && map.getCurrent(7) == "O") {
			return true;
		}
		
		return false;
	}

}
