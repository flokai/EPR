package Teil9;

import java.util.Scanner;

public class Palindrom {

	// Das Wort wird in Kleinbuchstaben umgewandelt und anschliessend wir der erste und der letzte
	// Buchstabe verglichen und danach vom wort "abgeschnitten"
	
	public static boolean isPalindrom(String text) {
		
		text = text.toLowerCase();
		boolean result = false;
				
		if (text.length() == 1 || text.length() == 0) {
			return true;
		}
		
		if (text.charAt(0) == text.charAt(text.length() - 1)) {
			return isPalindrom(text.substring(1, text.length() - 1));
		}
		return false;
	}
	
	
	public static int Fakultät (int anumber) {
		int result = 0;
		if(anumber == 1) {
			result = anumber;		
		}
		if(anumber >= 2) {
			result = anumber * Fakultät(anumber-1);
		}
		return result;
	}
	
	
	public static void test (int number) {
		
		switch (number) {
			case 1: System.out.println("OK 1");break;
			case 2: System.out.println("OK 2");break;
			case 3: System.out.println("OK 3");break;
			default: System.out.println("falsch");
		
		}
		
	}

	public static void main (String[] args) {
		
		java.util.Scanner input = new Scanner (System.in);
		System.out.println("Bitte geben Sie ihr Palindrom ein: ");
		String text = input.next();
		input.close();
		
		System.out.println(isPalindrom(text));	
		
		System.out.println(Fakultät(0));
		
		test(5);
		
		int [] buchungen = new int[3];
		String [] buchung;
		
	}
	
	
}
