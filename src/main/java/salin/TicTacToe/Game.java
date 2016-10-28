package salin.TicTacToe;

public class Game {
	public Player player;
	public Map map;
	public UI ui;

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
		Controller control = new Controller();		
		System.out.println("Game Started");
		int ticks = 0;

		ui.printPlayer(player.getPlayerSymbol());
		while(ticks < 10) {
			getMap();
			System.out.println("Player " + getPlayer() + " turn");
			System.out.println("--- Pick a number between 1-9");
			System.out.println("--- Press Q to quit");
			
			String input = control.getGameCommand(map);
			if(input == "Quit") {
				break;
			}
			int key = Integer.parseInt(input);

            map.updateMap(key, getPlayer());
            if (winner()) {
            	break;
            }
            player.swapPlayer();
            ticks++;
		}
		getMap();
		System.out.println("The winner is player: " + getPlayer());
		System.out.println("Congratulations!");
		ui.header();
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
