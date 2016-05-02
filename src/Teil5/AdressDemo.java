package Teil5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdressDemo {

	public static void main(String[] args) throws FileNotFoundException {

// Aufgabe 47
		
//		System.out.println("Bitte geben Sie eine PLZ ein: ");
//		Scanner Scanner = new Scanner(System.in);
//		int aValue = Scanner.nextInt();
//		Scanner.close();	
//
//		System.out.println("Die Stadt lautet: "
//				+ Address.postcodeToCity(aValue));
		
//// Aufgabe 49	
		
		System.out.println("Bitte geben Sie eine PLZ ein: ");	
		Scanner Scanner = new Scanner(System.in);
		int myPostcode = Scanner.nextInt();
		Scanner.close();
		
		Address myAdress = new Address ();
		
		myAdress.setPostcode(myPostcode);
		System.out.print(myAdress.getPostcode() + myAdress.getCity());
		

	}

}
