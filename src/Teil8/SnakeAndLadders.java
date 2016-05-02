package Teil8;

public class SnakeAndLadders {

	String name = "";
	int position = 0;
	
	// Konstruktor
	public SnakeAndLadders(String name) {
		this.name = name;
	}
	
	// würfeln 
	public int würfeln () {
		return (int) (Math.random()*6)+1;
	}
	
	// prüft aktuelle Position und korrigiert diese gegebenenfalls
	public int positionCheck (int aktuellePosition) {
		int neuePosition = -1;
		switch (aktuellePosition) {
		case 2: neuePosition = 15; break;
		case 5: neuePosition = 7; break;
		case 9: neuePosition = 27; break;
		case 18: neuePosition = 29; break;
		case 25: neuePosition = 35; break;
		case 17: neuePosition = 4; break;
		case 20: neuePosition = 6; break;
		case 24: neuePosition = 16; break;
		case 32: neuePosition = 30; break;
		case 34: neuePosition = 12; break;
		default: neuePosition = aktuellePosition;
		}
		return neuePosition;	
	}
	
	public static void Ausgabe (int position1, int position2) {
		String [] Spielfeld = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36"};
		
		Spielfeld[position1-1] = "++";
		Spielfeld[position2-1] = "--";
		
		for (int i = 0; i < 6; i++) {
			System.out.print("["+Spielfeld[i]+"]");
		}
		System.out.println();
		for (int i = 6; i < 12; i++) {
			System.out.print("["+Spielfeld[i]+"]");
		}
		System.out.println();
		for (int i = 12; i < 18; i++) {
			System.out.print("["+Spielfeld[i]+"]");
		}
		System.out.println();
		for (int i = 18; i < 24; i++) {
			System.out.print("["+Spielfeld[i]+"]");
		}
		System.out.println();
		for (int i = 24; i < 30; i++) {
			System.out.print("["+Spielfeld[i]+"]");
		}
		System.out.println();
		for (int i = 30; i < 36; i++) {
			System.out.print("["+Spielfeld[i]+"]");
		}
		
	}
	
}
