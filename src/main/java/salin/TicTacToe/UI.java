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
		System.out.println("2 - Credit");
		System.out.println("3 - Exit");

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		System.out.println(x);
	}
}
