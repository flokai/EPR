package Teil2;

import java.util.Scanner;


public class Aufgabe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
//	Scanner Scan = new Scanner(System.in);
//	System.out.println("Erste Zahl: ");
//	int One = Scan.nextInt();
//	System.out.println("Zweite Zahl: ");
//	int Two = Scan.nextInt();
//	System.out.println("Das Ergebnis lautet: "+ (float)One / Two);
		}
		
		{
	Scanner Scan = new Scanner(System.in);
	System.out.println("Erste Zahl: ");
	float oneNumber;
	oneNumber = Scan.nextFloat();
	System.out.println("Zweite Zahl: ");
	float twoNumber;
	twoNumber = Scan.nextFloat();
	
	System.out.println("Das Ergebnis lautet: "+ (int)(oneNumber * twoNumber));
	System.out.println("Restwert: "+ ((float)(oneNumber * twoNumber) - (int)(oneNumber * twoNumber)));
			
		}
	}

}
