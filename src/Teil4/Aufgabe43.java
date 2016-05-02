package Teil4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Aufgabe43 {

	public static void main (String []args) throws FileNotFoundException{
		// Textfile eins einlesen
		java.io.File TextFile = new java.io.File("ECTS_File.txt");
		Scanner Scanner = new Scanner(TextFile, "ISO-8859-1");	
		// Textfile zwei einlesen
		java.io.File TextFile2 = new java.io.File("Noten_File.txt");
		Scanner Scanner2 = new Scanner(TextFile2, "ISO-8859-1");	
		// initialisieren der Rechengrössen
		float sum = 0; 			float Result = 0;		float Gesamtnote = 0;
		
		while(Scanner.hasNext() && Scanner2.hasNext()) {
			String aWord = Scanner.next(); 		int ECTS = Scanner.nextInt();	String aLetter = Scanner.next();
			String aWord2 = Scanner2.next(); 	float Note = Scanner2.nextFloat();	String aLetter2 = Scanner2.next();
			
			if(Note > 0 && aWord.equals(aWord2)){
				Result = (Result + (ECTS * Note));
				sum = sum + ECTS;
			}
		}
		Gesamtnote = (float) (Math.round((Result/sum)*10)/10.0);
		System.out.println("Die aktuelle Gesamtnote ist: " + Gesamtnote);

	}
}
