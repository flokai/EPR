package Teil3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe33 {
	public static void main (String [] args) throws FileNotFoundException {

		java.io.File postcodeFile = new java.io.File("Bäckerei.csv");
//		System.out.println(postcodeFile.getAbsolutePath());
//		if (postcodeFile.exists() && postcodeFile.canRead()) {
//			System.out.println("File exists and can be read");}		
		java.util.Scanner scanner = new java.util.Scanner(postcodeFile, "UTF-8");		
		
		// Benutzereingabe
		System.out.print("Bitte geben Sie die gewünschte PLZ an: ");
		Scanner input = new Scanner (System.in);
		int Postcode;
		Postcode = input.nextInt();
			
		// Lesen und vergleichen aus Datei
		int lastPostcode = 0;
		String information = "";
		while (scanner.hasNextLine()) {
			
			lastPostcode = scanner.nextInt();
			information = scanner.nextLine();
			
			if (Postcode == lastPostcode) {
				System.out.println(lastPostcode + " " + information);
			}
		}
		scanner.close();
	}
}
