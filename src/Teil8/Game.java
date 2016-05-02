package Teil8;

public class Game {

	public static void main (String[] args) {
		
	int [] box = {1,2,3,4,5,6,7,8,9};
	
	GamePlan PlayerOne = new GamePlan (box);
	GamePlan PlayerTwo = new GamePlan (box);
	
	PlayerOne.Gamification();
	
	System.out.println();
	System.out.println("Nun ist Spieler 2 an der Reihe");
	System.out.println();
	
	PlayerTwo.Gamification();

	}
}