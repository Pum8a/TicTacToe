package salin.TicTacToe;


import java.util.Scanner;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;
import javafx.application.Platform;
import javax.swing.SwingUtilities;


public class UI {

	private static MediaPlayer mediaPlayer;
	private static Controller control;

	public static void main(String args[]) {
		header();
		musicSetup();
		menu();
		System.exit(0);
	}

	public static void header() {
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*         Tic Tac Toe         *");
		System.out.println("*                             *");
		System.out.println("*******************************");
	}

	private static void menu() {	
		control = new Controller();
		boolean replay = true;	
		while(replay == true) {
			System.out.println("1 - Play ");
			System.out.println("2 - Info");
			System.out.println("3 - Credit");
			System.out.println("Every thing else quits.");

			char x = control.getMenuCommand();

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
					mediaPlayer.stop();
					break;	
			}
		}
	}

	private static void play() {
		mediaPlayer.stop();
		Game game = new Game();
		game.play();
	}

	private static void info() {
		mediaPlayer.stop();
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
	    mediaPlayer.play();

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

	private static void musicSetup() {

		JFrame frame = new JFrame("Swing and JavaFX");
		final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
	    String soundFilename = "clubbedtodeath.mp3";
	    Media hit = new Media(new File(soundFilename).toURI().toString());
		mediaPlayer = new MediaPlayer(hit);
	}
}