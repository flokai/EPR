package Teil2;

import java.util.Scanner;

public class Aufgabe18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float weight;
		
		// Gewicht eingeben
		Scanner Scanner1 = new Scanner (System.in);
		System.out.println("Bitte geben Sie das Gewicht ein: ");
		weight = Scanner1.nextFloat();
		
		// Berechnung des Paketpreises
		// bis 2 kg    4,99 Euro
		// bis 5 kg    5,99 Euro
		// bis 10kg    7,49 Euro
		// bis 31.5kg 13,99 Euro
		
		String a = "4,99 Euro";
		String b = "5,99 Euro";
		String c = "7,49 Euro";
		String d = "13,99 Euro";
		
		if (weight<2) {
			System.out.print("Der Preis für Ihr Paket beträgt: " + a);
		}else {
			if (weight>2 && weight < 5) {
				System.out.print("Der Preis für Ihr Paket beträgt: " + b);
			}else {
				if (weight>=5 && weight < 10) {
					System.out.print("Der Preis für Ihr Paket beträgt: " + c);
				}else {
						if (weight>=10 && weight < 31.5) {
							System.out.print("Der Preis für Ihr Paket beträgt: " + d);
					}
}
}	
}
}
}