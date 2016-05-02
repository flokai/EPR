package Teil2;
import java.util.Scanner;
public class Aufgabe22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner (System.in);
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int number = Scanner.nextInt();
		
		//boolean hat nur die Werte true oder false -> Wenn true, dann primzahl
		boolean result = true;
		
		if (number == 1) {
			result = false;
		}
		
		if (number == 2) {
			result = true;
		}
		
		//Die eingegeben Zahl wird durch alle Zahlen kleiner als die eingegeben Zahl geteilt
		//Wenn das ergebnis einmal den Restwert Null ergibt, dann ist die Zahl keine Primzahl
		
		for (int i = 2; number>i ; i++) {				
			if (number % i == 0) {
			result = !true;
			}
		}
		if (result) {
			System.out.println("Das ist eine Primzahl");
		} else {System.out.println("Das ist keine Primzahl");
		}
		
		int counter = 2;
		// Die Zahl wird durch den counter geteilt (beginnend bei 2) und wenn der restwert
		// bei Null ist, dann soll die Zahl durch den counter geteilt werden
		// Ist der Restwert nicht NUll, dann wird der counter hochgezählt
		// Zwischendurch soll die entsprechende Prim-Zahl ausgegeben werden
        while (counter <= (int) Math.sqrt(number) && number > 1) {
            if (number % counter == 0 ) {
                number = number / counter; // Die Nummer wird um den Quotienten reduziert 
                System.out.printf("%s %s", counter, number == 1 ? "" : "* "); // Wenn der wert eins ist, dann soll kein * Zeichen mehr ausgegeben werden
            }
            else {
                counter++;
            }
        }
        if (number != 1) {
            System.out.println(number); // Hier die Primzahl nochmals ausgegeben
        }
 
	}
}
