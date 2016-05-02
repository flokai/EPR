package Teil2;
import java.util.Scanner;
import java.util.Arrays;
public class Aufgabe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
// 	Scanner Scan = new Scanner (System.in);
//	System.out.print("Erste Ganzzahl: ");
//	int FirstNumber = Scan.nextInt();
//	System.out.print("Zweite Ganzzahl: ");
//	int SecondNumber = Scan.nextInt();
//	System.out.print("Dritte Ganzzahl: ");
//	int ThirdNumber = Scan.nextInt();
//
//	// die drei eingelesen Zahlen wird dem Array "Numbers" zugeordnet	
//	int [] numbers = {FirstNumber, SecondNumber, ThirdNumber};
//	// das Array wird sortiert
//	Arrays.sort (numbers);
//	// die Zahlen werden sortiert ausgegeben - Wichtig ist Arrays.toString!
//	System.out.println(Arrays.toString(numbers));
	

	
	Scanner Scan = new Scanner (System.in);
	System.out.print("Erste Ganzzahl: ");
	int FirstNumber = Scan.nextInt();
	System.out.print("Zweite Ganzzahl: ");
	int SecondNumber = Scan.nextInt();
	
	int a = 42;
	if (FirstNumber != a && SecondNumber != a) {
		System.out.print("Keine Lösung");
	} else {System.out.print("Das ist die Antwort");
	}
	
	}

}
