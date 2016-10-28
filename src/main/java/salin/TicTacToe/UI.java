package salin.TicTacToe;

import java.util.Scanner;
import java.net.URL;
import javax.sound.sampled.*;

public class UI {

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
			System.out.println("1 - Play ");
			System.out.println("2 - Info");
			System.out.println("3 - Credit");
			System.out.println("Every thing else quits.");

			Scanner reader = new Scanner(System.in);
			char x = reader.next().charAt(0);
			System.out.println();

			switch (Character.getNumericValue(x)){
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
}
