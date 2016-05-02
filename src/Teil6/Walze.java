package Teil6;

public class Walze {

	// Die einzelnen Walzen werden als char Arrays initialisiert
	private final char[] Walze50 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	private final char[] Walze51 = {'A', 'D', 'C', 'B', 'E', 'H', 'F', 'G', 'I', 'L', 'J', 'K', 'M', 'P', 'N', 'O', 'Q', 'T', 'R', 'S', 'U', 'X', 'V', 'W', 'Z', 'Y'};
	private final char[] Walze60 = {'A', 'C', 'E', 'D', 'F', 'H', 'G', 'I', 'K', 'J', 'L', 'N', 'M', 'O', 'Q', 'P', 'R', 'T', 'S', 'U', 'W', 'V', 'X', 'Z', 'Y', 'B'};
	private final char[] Walze61 = {'A', 'Z', 'X', 'V', 'T', 'R', 'P', 'N', 'D', 'J', 'H', 'F', 'L', 'B', 'Y', 'W', 'U', 'S', 'Q', 'O', 'M', 'K', 'I', 'G', 'E', 'C'};
	private final char[] Walze70 = {'A', 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B'};
	private final char[] Walze71 = {'A', 'E', 'B', 'C', 'D', 'F', 'J', 'G', 'H', 'I', 'K', 'O', 'L', 'M', 'N', 'P', 'T', 'Q', 'R', 'S', 'U', 'Y', 'V', 'W', 'X', 'Z'};

	// aValue steht für die Walzennummer
	private int walzenNummer;
	
	// Konstruktor
	public Walze (int walzenNummer) {
		this.walzenNummer = walzenNummer;
	}

	// Differenz der beiden übergebenen Buchstaben berechnen lassen
	// zuerst muss die enpstrechende Walze gewählt werden und dem Array WalzeAuswahl zugewiesen werden
	public int countClockwiseRotations (char buchstabe1, char buchstabe2) {
		char [] WalzeAuswahl = new char [26];
		int indexOfLetterOne = 0;
		int indexOfLetterTwo = 0;
		int number = 0;
		
		switch (walzenNummer) {
		case 50: WalzeAuswahl = Walze50; 
		break;
		case 51: WalzeAuswahl = Walze51; 
		break;
		case 60: WalzeAuswahl = Walze60; 
		break;
		case 61: WalzeAuswahl = Walze61; 
		break;
		case 70: WalzeAuswahl = Walze70; 
		break;
		case 71: WalzeAuswahl = Walze71; 
		break;
		}
		
		for (int index = 0; index < WalzeAuswahl.length; index++){
			if (WalzeAuswahl[index] == buchstabe1) {
				indexOfLetterOne = index;
				break;
			}
		}
		for (int index = 0; index < WalzeAuswahl.length; index++){
			if (WalzeAuswahl[index] == buchstabe2) {
				indexOfLetterTwo = index;
				break;
			}
		}
		
		if (indexOfLetterOne <= indexOfLetterTwo) {
			number = (indexOfLetterTwo - indexOfLetterOne);
		} 
		if (indexOfLetterOne > indexOfLetterTwo) {
			number = (26 - (indexOfLetterOne - indexOfLetterTwo));
		}
		
		return number;
	}
	
	// Differenz der beiden übergebenen Buchstaben berechnen lassen (gegen den Uhrzeigersinn)
	// zuerst muss die enpstrechende Walze gewählt werden und dem Array WalzeAuswahl zugewiesen werden
	public int countCounterClockwiseRotations (char buchstabe1, char buchstabe2) {
		char [] WalzeAuswahl = new char [26];
		int indexOfLetterOne = -1;
		int indexOfLetterTwo = -1;
		int number = -1;

		switch (walzenNummer) {
		case 50: WalzeAuswahl = Walze50; 
		break;
		case 51: WalzeAuswahl = Walze51; 
		break;
		case 60: WalzeAuswahl = Walze60; 
		break;
		case 61: WalzeAuswahl = Walze61; 
		break;
		case 70: WalzeAuswahl = Walze70; 
		break;
		case 71: WalzeAuswahl = Walze71; 
		break;
		}
		for (int index = 0; index < WalzeAuswahl.length; index++){
			if (WalzeAuswahl[index] == buchstabe1) {
				indexOfLetterOne = index;
			}
		}
		for (int index = 0; index < WalzeAuswahl.length; index++){
			if (WalzeAuswahl[index] == buchstabe2) {
				indexOfLetterTwo = index;
			}
		}
		if (indexOfLetterOne < indexOfLetterTwo) {
			number = (26 - (indexOfLetterTwo - indexOfLetterOne));
		} 
		if (indexOfLetterOne >= indexOfLetterTwo) {
			number = (indexOfLetterOne - indexOfLetterTwo);
		}
		
		return number;
	}
	
	// Gibt den Buchstaben aus, der nach X Rotationen ausgehend vom Startbuchstaben errreicht sein wird
	public char rotateClockwise (char buchstabe, int numberOfRotations) {
		char [] WalzeAuswahl = new char [26];
		int indexOfLetterOne = 0;
		int indexOfLetterTwo = 0;
		
		switch (walzenNummer) {
		case 50: WalzeAuswahl = Walze50; 
		break;
		case 51: WalzeAuswahl = Walze51; 
		break;
		case 60: WalzeAuswahl = Walze60; 
		break;
		case 61: WalzeAuswahl = Walze61; 
		break;
		case 70: WalzeAuswahl = Walze70; 
		break;
		case 71: WalzeAuswahl = Walze71; 
		break;
		}
		// Index des aktuellen Buchstabens wird ausgerechnet und anschliessend die Rotationen hinzugezählt
		// Der errechnete Wert ergibt den Index des Ausgabe-Buchstabens
		for (int index = 0; index < WalzeAuswahl.length; index++){
			if (WalzeAuswahl[index] == buchstabe) {
				indexOfLetterOne = index;
			}
		}
		char Buchstabe2 = WalzeAuswahl[(indexOfLetterOne + numberOfRotations) % WalzeAuswahl.length];

		return Buchstabe2;

	}
	
	// Gibt den Buchstaben aus, der nach X Rotationen ausgehend vom Startbuchstaben errreicht sein wird
	public char rotateCounterClockwise (char buchstabe, int numberOfRotations) {
		char [] WalzeAuswahl = new char [26];
		int indexOfLetterOne = 0;
		int indexOfLetterTwo = 0;

		switch (walzenNummer) {
		case 50: WalzeAuswahl = Walze50; 
		break;
		case 51: WalzeAuswahl = Walze51; 
		break;
		case 60: WalzeAuswahl = Walze60; 
		break;
		case 61: WalzeAuswahl = Walze61; 
		break;
		case 70: WalzeAuswahl = Walze70; 
		break;
		case 71: WalzeAuswahl = Walze71; 
		break;
		}
		
		for (int index = 0; index < WalzeAuswahl.length; index++){
			if (WalzeAuswahl[index] == buchstabe) {
				indexOfLetterOne = index;
			}
		}
		char Buchstabe2;
		if(indexOfLetterOne >= numberOfRotations) {
			Buchstabe2 = WalzeAuswahl[indexOfLetterOne - numberOfRotations];
		}
		else Buchstabe2 = WalzeAuswahl[WalzeAuswahl.length - numberOfRotations + indexOfLetterOne];
		
		return Buchstabe2;

	}
	
}