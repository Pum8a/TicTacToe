package salin.TicTacToe;

import java.util.Scanner;

public class UI {

	public static void main(String args[]) {
		Map map = new Map();
		Player player = new Player();
		header();
		menu();

	}

	private static void header() {
		System.out.println("**************************************");
		System.out.println("*                                    *");
		System.out.println("*             Tic Tac Toe            *");
		System.out.println("*                                    *");
		System.out.println("**************************************");
	}
	public static void menu() {
		
		
		System.out.println("1 - Play ");
		System.out.println("2 - Info");
		System.out.println("3 - Credit");
		System.out.println("Every thing else quits.")

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		switch (x){
			case 1:
				   //Fall sem spilar leikinn úr game klasanum
			       break;
			case 2: 
				   //Info um leikinn. Hvernig hann er spilaður og þess háttar
			       break;
			case 3:
				   //Credit 
			       break;
			default :
					break;
					
		}


		System.out.println(x);
	}
}
