package Teil2;

import java.util.Scanner;

public class Aufgabe19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deklarieren der Währung und des Betrages
		int currency;
		float  amount;
		
		// die Wiedergabe soll immer wieder augefordert werden, falls der Anwender
		// nicht die Zahl 1 oder 2 eingibt
		
		do{
		Scanner Scanner1 = new Scanner (System.in);
		System.out.println("Bitte geben Sie Ihre aktuelle Währung ein");
		System.out.println("1 = USD");
		System.out.println("2 = EUR");
		currency = Scanner1.nextInt();
		}while (currency > 2 | currency <= 0);
		// Do-while Schleife ist beendet
		// deklarieren des Umrechnungskurs
		
		Scanner Scanner2 = new Scanner (System.in);
		System.out.println("Bitte geben Sie Ihren gewünschten Umrechnungsbetrag ein");
		amount = Scanner2.nextInt();

		float euro;
		euro = 1.1009F;
		float dollar;
		dollar = 0.9083F;

		if (currency == 1) {
			System.out.println("Der Umrechnungsbetrag beträgt: " + amount * dollar + "EUR");
		} else {
			if(currency == 2) {
				System.out.println("Der Umrechnungsbetrag beträgt: " + amount * euro + "USD");
			}
		
		
	}

	}
}
