import Yahtzee.*;
import java.util.Scanner;

public class Play {
	public static void main(String[] args){
		Yahtzee player1 = new Yahtzee();
		Yahtzee player2 = new Yahtzee();
		Scanner iDevice = new Scanner(System.in);
		char cont = 'y';
		
		while(cont != 'q'){
			System.out.println("=============================");
			System.out.println("    A) Roll for player 1");
			System.out.println("    B) Roll for player 1");
			System.out.println("    C) Cheat");
			System.out.println("    D) Quit game");
			System.out.println("=============================");
			System.out.print(" Choose an option: ");
			cont = iDevice.next().charAt(0);
			iDevice.nextLine();
			System.out.println("");
			
			try {
				switch(cont){
					case 'A'|'a':
						System.out.println("Player 1 rolls: " + player1.toss() );
						break;
					case 'B'|'b':
						System.out.println("Player 2 rolls: " + player2.toss() );
						break;
					case 'C'|'c':
						System.out.println("Player 1 rolls: " + player1.tossCheat() );
						break;
					case 'D'|'d':
						System.out.println("Goodbye!!");
						cont='q';
						break;
					default:
						System.out.println("Not a valid option... try again");
						break;
				}
			} catch(CheatException ex){
				System.out.println("SHAME ON PLAYER 1!");
				// cont='q';
			}
				
			System.out.println("");
			
		}
	}
}