package Teil8;

public class Game2 {

	public static void main (String [] args) {
		
		int position1 = 1;
		int position2 = 1;
		
		// Spieler 1 wird angelegt
		System.out.println("Hallo Spieler 1");
		System.out.println("Bitte geben Sie Ihren Spielnnamen ein:");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String namePlayerOne = scanner.next();
		
		SnakeAndLadders PlayerOne = new SnakeAndLadders ("namePlayerOne");
		System.out.println ();
		
		// Spieler 2 wird angelegt
		System.out.println("Hallo Spieler 2");
		System.out.println("Bitte geben Sie Ihren Spielnnamen ein:");
		java.util.Scanner scanner2 = new java.util.Scanner(System.in);
		String namePlayerTwo = scanner2.next();
		
		SnakeAndLadders PlayerTwo = new SnakeAndLadders ("namePlayerTwo");

		
		do {
			// Zug Spieler 1
			int aktuellePositionPlayerOne = 0;
			System.out.println();
			System.out.println (namePlayerOne + " ,deine Position ist im Feld " + position1);
			System.out.println("Bitte würfeln - Press 1");
			java.util.Scanner dice = new java.util.Scanner(System.in);
			int würfeln = scanner2.nextInt();
			
			int würfel = PlayerOne.würfeln();
			System.out.println ("Du hast eine " + würfel + " gewürfelt");
			
			if ((position1 + würfel) <= 36) {
				aktuellePositionPlayerOne = PlayerOne.positionCheck((position1 + würfel));
			} else { 
				aktuellePositionPlayerOne = position1;
			}

			System.out.println ("Deine aktuelle Position liegt nach dem Spielzug auf dem Feld " + aktuellePositionPlayerOne);
			position1 = aktuellePositionPlayerOne;
			
			PlayerOne.Ausgabe(position1, position2);
			System.out.println();
			
			// Zug Spieler 2
			int aktuellePositionPlayerTwo = 0;
			System.out.println();
			System.out.println (namePlayerTwo + " ,deine Position ist im Feld " + position2);
			System.out.println("Bitte würfeln - Press 1");
			java.util.Scanner dice2 = new java.util.Scanner(System.in);
			int würfeln2 = scanner2.nextInt();
			
			int würfel2 = PlayerOne.würfeln();
			System.out.println ("Du hast eine " + würfel2 + " gewürfelt");
			
			if ((position2 + würfel2) <= 36) {
				aktuellePositionPlayerTwo = PlayerOne.positionCheck((position2 + würfel2));
			} else { 
				aktuellePositionPlayerTwo = position2;
			}

			System.out.println ("Deine aktuelle Position liegt nach dem Spielzug auf dem Feld " + aktuellePositionPlayerTwo);
			position2 = aktuellePositionPlayerTwo;

			PlayerTwo.Ausgabe(position1, position2);
			System.out.println();
			
			if(position1 == 36) {
				System.out.println ("Glückwunsch " + namePlayerOne + "!! Du hast gewonnen :)");
			} else {
				if(position2 == 36) {
					System.out.println ("Glückwunsch " + namePlayerTwo + "!! Du hast gewonnen :)");
				}
			}
			
		} while (position1 < 36 && position2 < 36);

	}
		

}
