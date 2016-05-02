package Teil9;

import java.util.Scanner;

public class Palindrom3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte geben Sie Ihre Zahl ein: ");
		int zahl = scan.nextInt();
		
		System.out.println(zahl == spiegelZahl(zahl));
		scan.close();	
	}
	
	static int spiegelZahl (int number) {
		return spiegelZahl (number, 0);
	}
	
	static int spiegelZahl (int number, int tmpNumber) {
		if (number != 0) {
			tmpNumber = (tmpNumber * 10) + (number % 10);
			number = number/10;
			return spiegelZahl(number, tmpNumber);
		}
		return tmpNumber;
	}
	
	
}
