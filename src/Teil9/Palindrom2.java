package Teil9;

import java.util.Scanner;

public class Palindrom2 {

	public static void main (String[] args) {
		
		java.util.Scanner scanner = new Scanner (System.in);
		System.out.println("Bitte geben Sie ihr Palindrom ein: ");
		String text = scanner.next();
		scanner.close();
		
		System.out.println(isPalindrom(text));			
	}
	
	public static boolean isPalindrom(String sentence) {
		// Alles in Kleinbuchstaben
		sentence = sentence.toLowerCase();
		boolean ergebnis = true;
		// Wenn nur ein Zeichen dann true
		if (sentence.length() == 0 || sentence.length() == 1) {
			return ergebnis;
		} else {
			// Ab hier wird geprüft, ob das zu prüfende Zeichen ein Buchstabe oder ein Sonderzeichen
			// aus der Klasse isSonderzeichen ist
			int start = 0;
			int ende = sentence.length() - 1;
			
			// Mithilfe einer do-while-Schleife wird solange nach links oder nach rechts gegangen
			// bis das Zeichen wieder ein Buchstabe ist
			do {
				if (isSonderzeichen(sentence.charAt(start))) {
					start++;
					if(start == ende)
						return ergebnis;
				}

				if (isSonderzeichen(sentence.charAt(ende))) {
					ende--;
					
					if(ende == start)
						return ergebnis;
				}
			} while (isSonderzeichen(sentence.charAt(start)) | isSonderzeichen(sentence.charAt(ende)));
			
			// Nach der Schleife, (also wenn beide Zeichen ein Buchstabe ist) dann wird die Methode wieder
			// rekursiv aufgerufen
	
			if (sentence.charAt(start) == sentence.charAt(ende)) {
				ergebnis = isPalindrom(sentence.substring(start + 1, ende));
			}

		}
		return ergebnis;
	}

	public static boolean isSonderzeichen(char zeichen) {
		if (zeichen == '!' || zeichen == ',' || zeichen == '.' || zeichen == ';' || zeichen == ' ' || zeichen == '?'|| zeichen == ' ') {
			return true;
		}

		return false;
	}
}
	
	
	
	
	
	// regular expression
	












