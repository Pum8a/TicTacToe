package salin.TicTacToe;

import java.util.Scanner;

public class UI {

	public static void main(String args[]) {
		header();
		menu();
	}

	private static void header() {
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*         Tic Tac Toe         *");
		System.out.println("*                             *");
		System.out.println("*******************************");
	}

	private static void menu() {	
		boolean replay = true;	
		while(replay == true) {
			System.out.println("1 - Play ");
			System.out.println("2 - Info");
			System.out.println("3 - Credit");
			System.out.println("Every thing else quits.");

			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();

			switch (x){
				case 1:
					System.out.println("PLAY");
					play();
				    break;
				case 2: 
					System.out.println("INFO");
					info();
				    break;
				case 3:
					System.out.println("CREDIT");
					credit();
				    break;
				default :
					System.out.println("QUIT");
					replay = false;
					break;	
			}
		}
	}

	private static void play() {
		Game game = new Game();
		game.newGame();
	}

	private static void info() {
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*                             *");
		System.out.println("*******************************");
	}

	private static void credit() {
		System.out.println("*******************************");
		System.out.println("*   Developed by :            *");
		System.out.println("*   Eythor Traustason         *");
		System.out.println("*   Jon Thor Gudjonsson       *");
		System.out.println("*   Olafur Unnar Torfason     *");
		System.out.println("*   Sigurdur Unnar Hauksson   *");
		System.out.println("*   Stefan Johannsson         *");
		System.out.println("*   Stefan Ragnar Viglundsson *");
		System.out.println("*******************************");
	}
}
