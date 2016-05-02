package Teil9;

import java.util.Scanner;

public class TowerOfHanoi {

	static void move (int n, String fromTower, String toTower, String usingTower) {
		
		if ( n > 1 ) {
			move (n-1, fromTower, usingTower, toTower );
			System.out.printf( "Bewege Scheibe %d von %s zu %s.%n", n, fromTower, toTower );
			move (n-1, usingTower, toTower, usingTower );
		}
		else
			System.out.printf( "Bewege Scheibe %d von %s zu %s.%n", n, fromTower, toTower );
		}

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new Scanner (System.in);
		System.out.println("Bitte geben Sie die Anzahl an Scheiben ein: ");
		int number = scanner.nextInt();
		scanner.close();
		move (number, "Tower1", "Tower2", "Tower3");
		
	}

}