package Teil8;

public class GamePlan {

	int [] box = {1,2,3,4,5,6,7,8,9};
	
	public GamePlan(int [] box) {
		this.box = box;
	}
	
	
	public void Gamification () {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);	
		int [] box = {1,2,3,4,5,6,7,8,9};
		
		// ein Game anlegen	
		shutTheBox Game = new shutTheBox (box);
		int numberOne = 0;
		int numberTwo = 0;
		int numberThree = 0;
		
		// Der erste Spielzug wird ausserhalb der Schleife durchgeführt
		System.out.println("Hier sehen Sie Ihren Start-Spielstand");
		System.out.println (Game.Ausgabe());
		System.out.println();
		System.out.println (Game.numberOfDice());
		System.out.println();
		System.out.println ("Bitte geben Sie Ihre erste Kombination ein");
		
		// Drei Zahlen werden eingelesen
		numberOne = scanner.nextInt(); 
		numberTwo = scanner.nextInt(); 
		numberThree = scanner.nextInt();

		// Die folgenden Spielzüge werden über die While-Schleife abgefragt
		while (Game.proof(numberOne) == true && Game.proof(numberTwo) == true && Game.proof(numberThree) == true) {
		
			Game.delete(numberOne);
			Game.delete(numberTwo);
			Game.delete(numberThree);

			System.out.println("Hier sehen Sie Ihren aktuellen Spielstand");
			System.out.println (Game.Ausgabe());
			System.out.println();
			System.out.println (Game.numberOfDice());
		
			System.out.println ("Bitte geben Sie Ihre Kombination ein");
		
			numberOne = scanner.nextInt(); 
			numberTwo = scanner.nextInt(); 
			numberThree = scanner.nextInt();	
		};
		
		// Wenn kein Spielzug mehr durchgeführt werden kann
		System.out.println("Der Spielzug ist zu Ende");
		System.out.println("Sie haben folgende Strafpunkte erspielt: " + Game.penalty());
	
	}

}
