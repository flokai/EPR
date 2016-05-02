package Teil9;

public class Teiler {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Bitte geben Sie die erste Zahl ein: ");
		int numberOne = scan.nextInt();
		
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		int numberTwo = scan.nextInt();
		scan.close();
		
		System.out.println();
		System.out.println("Der grösste gemeinsame Teiler von " + numberOne + " und " + numberTwo 
				+ " lautet: " + groesterGemeinsamerTeiler(numberOne, numberTwo));
	}

	static int groesterGemeinsamerTeiler(int zahl1, int zahl2) {

		if (zahl2 == 0) {
			return zahl1;
		}
		if (zahl1 == 0) {
			return zahl2;
		}
		if (zahl1 > zahl2) {
			return groesterGemeinsamerTeiler(zahl1 - zahl2, zahl2);
		} else {
			return groesterGemeinsamerTeiler(zahl1, zahl2 - zahl1);
		}

	}
}
