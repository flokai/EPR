package Teil3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe38 {

	public static void main (String []args) throws FileNotFoundException{
	
		java.io.File TextFile = new java.io.File("Gedicht.txt");
		System.out.println(TextFile.getAbsolutePath());
		if (TextFile.exists() && TextFile.canRead()) {
			System.out.println("File exists and can be read");}
		Scanner Scanner = new Scanner(TextFile, "ISO-8859-1");		
		
		Scanner Eingabe = new Scanner (System.in);
		System.out.println("Bitte geben Sie einen Buchstaben Ihrer Wahl an: ");
		String letterstring = Eingabe.next();
		// Der eingelesene Buschtabe wird als String gespeichert und dann in ein Char geändert
		char letter = letterstring.charAt(0);
		int LetterFrequency = 0;
		
		while(Scanner.hasNextLine()) {
			String aLine = Scanner.nextLine();						// Die Linien werden "gescannt"
			for(int i = 0; i < aLine.length(); i++) {				// Anzahl des Buchstabens kleiner als die Gesamtmenge
				char letterInText = aLine.toLowerCase().charAt(i); 	// Sucht den Buchstaben
				if(letterInText == letter) {						// Als Kleinbuchstaben oder als Grossbuchstaben
					LetterFrequency++;								// mittels: toLowerCase().
				}
			}
		}
		System.out.println("Der Buchstabe " + letter + " kommt " + LetterFrequency + " mal in der Datei " + TextFile + " vor.");	
	}
}
