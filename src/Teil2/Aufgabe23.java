package Teil2;

import java.util.Scanner;

public class Aufgabe23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Obergrenze ein: ");
		int input = Scanner.nextInt();
		int sum = 0;
		
		// 23.1 For Variante
//		for (int i=1; i<=input; i++) {
//			sum = sum+i;
//		}
		
		
		// 23.2 While Variante
//		int i=1;
//		while (i<=input) {
//			sum = sum +i;
//			i++;
//		}

		
		// 23.3 Do While Variante
//		int i = 1;
//		do {sum = sum+i;i++;
//				} while (i<=input);
		
		
		// 23.4 For Variante mit ungeraden Zahlen
//		for (int i=1; i<=input; i++) {
//			if (i % 2 != 0) { // Restwert ungleich 0
//				sum = sum+i;
//			}
//		}
		
		
		// 23.5 For Variante mit Zahlen die durch 7 geteilt werden und den Restwert 0 haben
//		for (int i=1; i<=input; i++) {
//			if (i % 7 == 0) { // Restwert gleich 0
//				sum = sum+i;
//			}
//		}
	
		// 23.6 For Variante mit Quadratzahlen
		for (int i=1; i<=input; i++) {
			sum = sum+i*i;
		}
		
		double average;
		average = sum*1.00 / input;
		System.out.println("Die Summe beträgt: "+ sum);
		System.out.println("Der Durchschnitt beträgt: "+ average);
		
	}
}