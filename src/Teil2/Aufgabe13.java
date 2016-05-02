package Teil2;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Teil 1
		
		Scanner Scanner = new Scanner (System.in);
		System.out.print("Bitte tragen Sie hier Ihr Alter ein: ");
		int Age = Scanner.nextInt();
		int Ticketprice;
		
	
		int Result = (Age >= 16) ? (Ticketprice = 20) : (Ticketprice = 10);
		
		
		System.out.print("Der Preis f�r Ihr Ticket: " + Result);

		
		
//Teil 2
		
	 	Scanner Scan = new Scanner (System.in);
		System.out.print("Erste Ganzzahl: ");
		int FirstNumber = Scan.nextInt();
		System.out.print("Zweite Ganzzahl: ");
		int SecondNumber = Scan.nextInt();
		System.out.print("Dritte Ganzzahl: ");
		int ThirdNumber = Scan.nextInt();

		if ( (FirstNumber < SecondNumber) && (SecondNumber < ThirdNumber)) {
			System.out.print("Die Zahlen wurden in aufsteigender Reihenfolge eingegeben");
		} else {System.out.print("Die Zahlen wurden nicht in austeigender Reihenfolge eingegeben");
		}
	
		
		System.out.print((FirstNumber < SecondNumber) && (SecondNumber < ThirdNumber) ? "Eingabe korrekt"  : "Eingabe nicht korrekt");
		

	
	}
	

}
