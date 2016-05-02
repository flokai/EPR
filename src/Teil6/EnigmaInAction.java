package Teil6;

public class EnigmaInAction {

	// die Walzen werden über die Tastatur eingelsen
	public static void main(String[] args) {
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		System.out.print("Geben Sie die erste Walzennummer ein: ");
		int walze1 = Scanner.nextInt();
		System.out.print("Geben Sie die zweite Walzennummer ein: ");
		int walze2 = Scanner.nextInt();
		System.out.print("Geben Sie die dritte Walzennummer ein: ");
		int walze3 = Scanner.nextInt();
		
		// der Schlüssel wird eingelesen
		System.out.print("Bitte geben Sie den Schlüssel ein: ");
		String schluessel = Scanner.next();
		
		// ein Objekt vom Typ Enigma wird deklariert und die drei Walzen sowie den Schlüssel wird übergeben
		Enigma myEnigma = new Enigma(walze1, walze2, walze3, schluessel);
	
		System.out.println("Möchten Sie den Text verschlüsseln (1) oder entschlüsseln (2) ?");
		int Auswahl = Scanner.nextInt();
		
		// der Text für die Entschlüsselung oder Verschlüsselung wird eingegeben
		System.out.print("Geben Sie den zu Text ein: ");
		String plaintext = Scanner.next();
		
		// die Entsprechende Methode aus Enigma wird aufgerufen
		if (Auswahl == 1) {
		System.out.println("Der Text lautet: " + myEnigma.encrypt(plaintext));
		} else {
			System.out.println("Der Text lautet: " + myEnigma.decrypt(plaintext));
		}
	
	}
	
}
