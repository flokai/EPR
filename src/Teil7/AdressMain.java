package Teil7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdressMain {

	public static void main(String[] args) throws FileNotFoundException {
	
		Address myAdress = new Address ("Florian", "Kaiser", "Industriestrasse 11", "Berlin", "79771", "Deutschland");
		
		System.out.println(myAdress.postcodeToCity());
		System.out.println(myAdress.getCity());
		
		
		System.out.println(myAdress.cityToPostcode());
		System.out.println(myAdress.getPostcode());
		
		System.out.println(myAdress.getAdressLabel());
		
	}
	
	
}
