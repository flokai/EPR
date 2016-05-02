package Teil5;

public class PrimeNumber46 {

//	Deklaration der Methode isPrime zur Errechnung der Primzahl	
	
	public static boolean isPrime (int number) {

		boolean result = true;
		
		if (number == 1) {
			result = false;
			}
		if (number == 2) {
			result = true;
			}
		for (int i = 2; number>i ; i++) {				
			if (number % i == 0) {
			result = !true;
			}
		}
		return result;
	}

	
}
