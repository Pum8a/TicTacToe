package salin.TicTacToe;

public class Player {
	private String playerSymbol = "X";

	public String getPlayerSymbol() {
		return playerSymbol;
	}

	public void swapPlayer() {
		if (playerSymbol == "X") {
			playerSymbol = "O";
		}
		else {
			playerSymbol = "X";
		}
	}
}