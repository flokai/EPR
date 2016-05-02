package Teil2;

import java.util.Scanner;

public class Aufgabe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner (System.in);
		System.out.println("Bitte geben Sie hier Ihre Zahl ein (max bis 100): ");
		int Number = Scanner.nextInt();
		
		int FirstDigit = Number % 10;
		int SecondDigit = Number / 10;
		// Hier wird die erste der beiden Ziffern geprüft (über 20)
		if (Number > 20 & Number < 100) {
			switch (FirstDigit) {
			case 0: System.out.print("");break;
			case 1: System.out.print("Einund"); break;
			case 2: System.out.print("Zweiund"); break;
			case 3: System.out.print("Dreiund"); break;
			case 4: System.out.print("Vierund"); break;
			case 5: System.out.print("Fünfund"); break;
			case 6: System.out.print("Sechsund"); break;
			case 7: System.out.print("Siebenund"); break;
			case 8: System.out.print("Achtund"); break;
			case 9: System.out.print("Neunund"); break;
			}
		}// Hier wird die zweite Ziffer analysiert
			if (Number > 20 & Number < 100) {
				switch (SecondDigit) {
				case 2: System.out.print("zwanzig");break;
				case 3: System.out.print("dreißig"); break;
				case 4: System.out.print("vierzig"); break;
				case 5: System.out.print("fünzig"); break;
				case 6: System.out.print("sechsig"); break;
				case 7: System.out.print("siebzig"); break;
				case 8: System.out.print("achtzig"); break;
				case 9: System.out.print("neunzig"); break;
				} 
			}else {
				// hier werden die Nummer 1 bis 20 und 100 analysiert
				switch (Number){
				case 0: System.out.println("Null");break;
				case 1: System.out.print("Eins"); break;
				case 2: System.out.print("Zwei"); break;
				case 3: System.out.print("Drei"); break;
				case 4: System.out.print("Vier"); break;
				case 5: System.out.print("Fünf"); break;
				case 6: System.out.print("Sechs"); break;
				case 7: System.out.print("Sieben"); break;
				case 8: System.out.print("Acht"); break;
				case 9: System.out.print("Neun"); break;
				case 10: System.out.print("Zehn"); break;
				case 11: System.out.print("Elf"); break;
				case 12: System.out.print("Zwölf"); break;
				case 13: System.out.print("Dreizehn"); break;
				case 14: System.out.print("Vierzehn"); break;
				case 15: System.out.print("Fünfzehn"); break;
				case 16: System.out.print("Sechszehn"); break;
				case 17: System.out.print("Siebzehn"); break;
				case 18: System.out.print("Achtzehn"); break;
				case 19: System.out.print("Neunzehn"); break;
				case 20: System.out.print("Zwanzig"); break;
				case 100: System.out.print("Einhundert"); break;
				default: System.out.println("Ungültig");
				}
			}
	}

}
