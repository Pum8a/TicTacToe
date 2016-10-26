package salin.TicTacToe;

public class Game {
	private Player player;
	private Map map;

	public Game() {
		player = new Player();
		map = new Map();    	
	}

	public Player getPlayer() {
		return player;
	}

	public Map getMap() {
		return map;
	}


}
