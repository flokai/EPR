package Teil5;

import java.util.Scanner;

public class Prime48 {
	
	public static void main (String [] args){

		System.out.println("Bitte geben Sie eine Zahl ein: ");
		Scanner Scanner = new Scanner (System.in);
		
		// Die eingegebene Zahl wird als aValue gespeichert
		int aValue = Scanner.nextInt();
		
		// es wird aNumber instanziiert
		PrimeNumber48 aNumber = new PrimeNumber48(aValue);
		Scanner.close();
	
		System.out.println(aNumber.getPrimeNumber());
	
	}

}
