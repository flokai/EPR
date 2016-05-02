package Teil3;
import java.util.Scanner;

public class Aufgabe31 {

	public static void main (String [] args) {
	
//		Scanner Scanner = new Scanner (System.in);
//		System.out.print("Bitte geben Sie eine Nummer ein: ");
//		int day = Scanner.nextInt();
		
// Kalender mit IF und SWITCH
		
//		int a = day % 7;
//		
//		switch (a) {
//		case 1: System.out.print("Ein Donnerstag, "); break;
//		case 2: System.out.print("Ein Freitag, "); break;
//		case 3: System.out.print("Ein Samstag, "); break;
//		case 4: System.out.print("Ein Sonntag, "); break;
//		case 5: System.out.print("Ein Montag, "); break;
//		case 6: System.out.print("Ein Dienstag, "); break;
//		case 0: System.out.print("Ein Mittwoch, "); break;
//		default: System.out.print("Ungültige eingabe");
//		}
//		
//		if (day<=31){
//			System.out.print("im Monat Januar 2015");
//		} else {
//			if(day>31 && day<=59) {
//				System.out.print("im Monat Februar 2015");
//			} else {
//				if(day>59 && day<=90) {
//					System.out.print("im Monat März 2015");
//				} else {
//					if(day>90 && day<=120) {
//						System.out.print("im Monat April 2015");
//					} else {
//						if(day>120 && day<=151) {
//							System.out.print("im Monat Mai 2015");
//						} else {
//							if(day>151 && day<=181) {
//								System.out.print("im Monat Juni 2015");
//							} else {
//								if(day>181 && day<=212) {
//									System.out.print("im Monat Juli 2015");
//								} else {
//									if(day>212 && day<=243) {
//										System.out.print("im Monat August 2015");
//									} else {
//										if(day>243 && day<=273) {
//											System.out.print("im Monat September 2015");
//										} else {
//											if(day>273 && day<=304) {
//												System.out.print("im Monat Oktober 2015");
//											} else {
//												if(day>304 && day<=334) {
//													System.out.print("im Monat November 2015");
//												} else {
//													if(day>334 && day<=365) {
//														System.out.print("im Monat Dezember 2015");
//													} else {
//														if(day>365) {
//															System.out.print("Bitte nur Zahlen bis 365 (Ein Jahr)");
//														}
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}			


//Kalender mit Arrays

		Scanner Scanner = new Scanner (System.in);
		System.out.print("Bitte geben Sie eine Nummer ein: ");
		int day = Scanner.nextInt();
		
		int a= 0;
		a= day % 7;
		
		String [] WeekDays = {"Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag", "Montag", "Dienstag"};
		String Months [] = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		int Monthdays [] = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
		
		for (int i = 0; i < WeekDays.length; i++){
			if(a == i) { 
				System.out.print("Der Tag "+ day + " ist ein " + WeekDays[i]);
			}
		}
		int i = 0;
		while (day > Monthdays[i]) {
				i++;
		}		
		System.out.println(" und ist der " + (day-Monthdays[i-1]) + "." + Months[i] + " 2015");

	}
}
