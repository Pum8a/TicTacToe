package salin.TicTacToe;

import java.util.Scanner;

public class UI {
	private static Controller control;

	public UI() {
		control = new Controller();
	}

	public static void main(String args[]) {
		header();
		menu();
	}

	public static void header() {
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*         Tic Tac Toe         *");
		System.out.println("*                             *");
		System.out.println("*******************************");
	}

	private static void menu() {	
		boolean replay = true;	
		while(replay == true) {
			System.out.println("\t  ___________ ");
			System.out.println("\t | 1 - Play  |");
			System.out.println("\t  ----------- ");
			System.out.println("\t  ___________ ");
			System.out.println("\t | 2 - Info  |");
			System.out.println("\t  ----------- ");
			System.out.println("\t  ___________ ");			
			System.out.println("\t | 3 - Credit|");
			System.out.println("\t  ----------- ");
			System.out.println("");
			System.out.println("Every thing else quits");

			char x = control.getMenuCommand();

			switch (Character.getNumericValue(x)){
				case 1:
					System.out.println();
					System.out.println("PLAY");
					System.out.println("Game Started");
					play();
				    break;
				case 2: 
					System.out.println();
					System.out.println("INFO");
					info();
				    break;
				case 3:
					System.out.println();
					System.out.println("CREDIT");
					credit();
				    break;
				default :
					System.out.println();
					System.out.println("QUIT");
					replay = false;
					break;	
			}
		}
	}

	private static void play() {
		Game game = new Game();
		game.play();
	}

	private static void info() {
		System.out.println("*******************************");
		System.out.println("* Tic Tac Toe is for two      *");
		System.out.println("* players, X and O, who take  *");
		System.out.println("* turns marking the numbers   *");
		System.out.println("* in a 3 x 3 grid. The player *");
		System.out.println("* who succeeds in placing     *");
		System.out.println("* three of their marks in a   *");
		System.out.println("* horizontal, vertical or     *");
		System.out.println("* diagonal row wins the game! *");
		System.out.println("*                             *");
		System.out.println("*         1 | O | X           *");
		System.out.println("*        ---|---|---          *");
		System.out.println("*         X | O | O           *");
		System.out.println("*        ---|---|---          *");
		System.out.println("*         X | X | O           *");
		System.out.println("*******************************");
	}

	private static void credit() {
		System.out.println("*******************************");
		System.out.println("*             /\\              *");
		System.out.println("*            // \\             *");
		System.out.println("*           ///  \\            *");
		System.out.println("*          ////   \\           *");
		System.out.println("*         /////    \\          *");
		System.out.println("*        /\\    \\\\\\\\/\\         *");
		System.out.println("*       // \\   \\\\\\// \\        *");
		System.out.println("*      ///  \\  \\\\///  \\       *");
		System.out.println("*     ////   \\ \\////   \\      *");
		System.out.println("*    /////    \\/////    \\     *");
		System.out.println("*    	SalinHansE CO.        *");
		System.out.println("*                             *");
		System.out.println("*   Developed by :            *");
		System.out.println("*   Eythor Traustason         *");
		System.out.println("*   Jon Thor Gudjonsson       *");
		System.out.println("*   Olafur Unnar Torfason     *");
		System.out.println("*   Sigurdur Unnar Hauksson   *");
		System.out.println("*   Stefan Johannsson         *");
		System.out.println("*   Stefan Ragnar Viglundsson *");
		System.out.println("*******************************");
	}

	public static void printPlayer(String player) {
		System.out.println("Player " + player + " turn");
		System.out.println("--- Pick a number between 1-9");
		System.out.println("--- Press Q to quit");
	}

	public static void printWinner(String player) {
		System.out.println("The winner is player: " + player);
		System.out.println("Congratulations!");
	}

	public static void printWrongInput() {
		System.out.println("Oh no that's not what we are looking for.");
		System.out.println("Please try again.");
	}

	public static void printSpaceIsFull() {
		System.out.println("This space is occupied, please try again.");
	}

	public static void printThankYouMsg() {
		System.out.println("----------------------");
		System.out.println("Thank you, come again.");
		System.out.println("----------------------");
	}

	public static void printDraw() {
		System.out.println("There was a draw, try again?");
	}
}