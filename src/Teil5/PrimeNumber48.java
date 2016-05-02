package Teil5;

public class PrimeNumber48 {

	private int aValue;

//	Methode um die Primzahl zurück zu geben
	public boolean getPrimeNumber () {
		return isPrime(aValue);	
	}
// 	Konstruktor für die Übergabe des Wertes 	
	public PrimeNumber48 (int aValue){
		this.aValue = aValue;
	}
// 	Berechnung der Primzahl	
	private static boolean isPrime (int number) {
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
