package Teil5;

public class AchtDameProblem {

	
	public static void main (String [] args) {
		
		Dame Dame1 = new Dame ();
		Dame Dame2 = new Dame ();
		
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.println("Bitte geben Sie eine X-Koordinate ein: ");
		Dame1.setX(Scanner.nextInt());
		
		System.out.println("Bitte geben Sie eine Y-Koordinate ein: ");
		Dame1.setY(Scanner.nextInt());

		System.out.println("Bitte geben Sie eine X-Koordinate ein: ");
		Dame2.setX(Scanner.nextInt());
		
		System.out.println("Bitte geben Sie eine Y-Koordinate ein: ");
		Dame2.setY(Scanner.nextInt());
		
		Scanner.close();
		
//		System.out.println(Dame1.getX());
//		System.out.println(Dame1.getY());
//		System.out.println(Dame2.getX());
//		System.out.println(Dame2.getY());
		
		if (Dame2.canCapture(Dame1)) {
			System.out.println("Königin 1 schlägt Königin 2");	
		} else { System.out.println ("Königin 1 kann Königin 2 nicht schlagen");
		}

	}
	
}
