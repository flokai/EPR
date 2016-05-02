package Teil2;

import java.util.Scanner;

public class Aufgabe21 {

	
	public static void main(String[] args) {


//		Scanner Scanner = new Scanner (System.in);
//		System.out.println("Bitte geben Sie hier Ihre Zahl ein (max bis 100): ");
//		int Number = Scanner.nextInt();
//	
//		// Römische Ziffern
//		// 1 = I
//		// 5 = V
//		// 10 = X
//		// 50 = L
//		// 100 = C
//		
//		int FirstDigit = Number % 10; // erste Zahl vor dem Komma
//		int SecondDigit = Number / 10; // zweite Zahl vor dem Komma
//
//		
//		if (Number>10 & Number<100) {
//			switch (SecondDigit) {
//			case 1: System.out.print("X");break;
//			case 2: System.out.print("XX");break;
//			case 3: System.out.print("XXX"); break;
//			case 4: System.out.print("XL"); break;
//			case 5: System.out.print("L"); break;
//			case 6: System.out.print("LX"); break;
//			case 7: System.out.print("LXX"); break;
//			case 8: System.out.print("LXXX"); break;
//			case 9: System.out.print("XC"); break;
//			default: System.out.print("ungltig");
//			}
//		}
//			if (Number < 100) {
//				switch (FirstDigit) {
//				case 0: System.out.print("");break;
//				case 1: System.out.print("I"); break;
//				case 2: System.out.print("II"); break;
//				case 3: System.out.print("III"); break;
//				case 4: System.out.print("IV"); break;
//				case 5: System.out.print("V"); break;
//				case 6: System.out.print("VI"); break;
//				case 7: System.out.print("VII"); break;
//				case 8: System.out.print("VII"); break;
//				case 9: System.out.print("IX"); break;
//				} 
//			}else {
//				switch (Number){
//				case 10: System.out.print("X");break; //funktioniert nicht 
//				case 100: System.out.print("C"); break;
//				}
//			}
			
			Scanner Scanner = new Scanner (System.in);
			System.out.println("Bitte geben Sie eine römische Zahl (3 Stellen) ein: ");
			String number = Scanner.next();

			int a=0;
			int b=0;
			int c=0;
			int d=0;

			switch (number.charAt(0)) {
			case 'M': a=1000;break;
			case 'C': a=100;break;
			case 'L': a=50;break;
			case 'X': a=10;break;
			case 'V': a=5;break;
			case 'I': a=1;break;
			case ' ': a=0; break;
			default:System.out.print("Ungültig");
			}
			switch (number.charAt(1)) {
			case 'M': b=1000;break;
			case 'C': b=100;break;
			case 'L': b=50;break;
			case 'X': b=10;break;
			case 'V': b=5;break;
			case 'I': b=1;break;
			case ' ': b=0; break;
			default:System.out.print("Ungültig");
			}
			switch (number.charAt(2)) {
			case 'M': c=1000;break;
			case 'C': c=100;break;
			case 'L': c=50;break;
			case 'X': c=10;break;
			case 'V': c=5;break;
			case 'I': c=1;break;
			case ' ': c=0; break;
			default:System.out.print("Ungültig");
			}

			if (a>=b && b>=c && c>=d) {
				System.out.print(a+b+c+d);
				}else {if (a<=b && b>=c && c>=d) {
				System.out.print(b-a+c+d);
					}else {if (a>=b && b<=c && c>=d)  {
					System.out.print(a+c-b+d);
					}
				}
			}

}
}
