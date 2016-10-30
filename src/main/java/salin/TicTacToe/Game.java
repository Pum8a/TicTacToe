package salin.TicTacToe;

public class Game {
	public static Player player;
	public static Map map;
	public static UI ui;

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
		int ticks = 0;

		while(notDraw(ticks)) {
			getMap();
			ui.printPlayer(player.getPlayerSymbol());
			
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
		if (winner()) {
			ui.printWinner(player.getPlayerSymbol());	
		}
		else {
			ui.printDraw();
		}
		ui.header();
	}

	public boolean notDraw(int ticks) {
		if(ticks >= 9) {
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
