package Teil5;

import java.util.Scanner;

public class Prime52 {

	public static void main (String [] args){

		System.out.println("Bitte geben Sie eine Zahl ein: ");
		Scanner Scanner = new Scanner (System.in);
		
		// Die eingegebene Zahl wird als aValue gespeichert
		int aValue = Scanner.nextInt();
	
		PrimeNumber52 object = new PrimeNumber52(aValue);
	
		System.out.println(object.getPrimeNumber());
	
	}

}