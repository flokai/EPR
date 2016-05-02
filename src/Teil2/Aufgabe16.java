package Teil2;

import java.lang.*;
import java.util.Scanner;


public class Aufgabe16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner Scanner1 = new Scanner(System.in);
		System.out.println("Please choose your Country: Germany 1 USA 2: ");
		int choice = Scanner1.nextInt();
		
		// Wenn der Anwender die Zahl 1 für Germany eingibt beginnt die Woche anschliessend
		// mit dem Wochentag Montag
		if (choice == 1) {
			
		// deklarieren einer Variablen day vom Typ int
		int day; 
		
		// Anschliessend kommt die do-while Schleife. Diese stellt sicher, dass die Eingabe
		// wiederholt wird bis die Eingabe einen Wert von 1 bis 7 hat
		do {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine Zahl zwischen 1 und 7 ein: ");
		day = Scanner.nextInt();
		} while ( day > 7);
		
		// Ab hier beginnt die Switch Anweisung. Jeder Zahl von 1 bis 7 ist ein Tag zugeordnet
		String dayString;
		switch (day) {
		case 1: dayString = "Montag";
		break;
		case 2: dayString = "Dienstag";
		break;
		case 3: dayString = "Mittwoch";
		break;
		case 4: dayString = "Donnerstag";
		break;
		case 5: dayString = "Freitag";
		break;
		case 6: dayString = "Samstag";
		break;
		case 7: dayString = "Sonntag";
		break;
		default: dayString = "Bitte geben Sie eine Zahl von 1 bis 7 ein";
		break;
		}
		
		System.out.println(dayString);

		
		}	else {
			
			// deklarieren einer Variablen "day" vom Typ int
			int day; 
			
			do {
			Scanner Scanner = new Scanner(System.in);
			System.out.print("Please insert a number between 1 and 7: ");
			day = Scanner.nextInt();
			} while (day > 7);
			
			String dayString;
			switch (day) {
			
			case 1: dayString = "Sunday";
			break;
			case 2: dayString = "Monday";
			break;
			case 3: dayString = "Tuesday";
			break;
			case 4: dayString = "Wednesday";
			break;
			case 5: dayString = "Thursday";
			break;
			case 6: dayString = "Friday";
			break;
			case 7: dayString = "Saturday";
			break;
			default: dayString = "Please insert a number between 1 and 7";
			break;
			}
			System.out.println(dayString);

			}				
		}
	

}
