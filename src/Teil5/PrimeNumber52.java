package Teil5;

public class PrimeNumber52 {

	private int aValue;
	private boolean isPrime;

//	Methode um die Primzahl zurück zu geben
	public boolean getPrimeNumber () {
		return isPrime(aValue);	
	}
// 	Konstruktor für die Übergabe des Wertes 	
	public PrimeNumber52 (int aValue){
		this.aValue = aValue;
		this.isPrime = isPrime (aValue);
		
	}
// 	Berechnung der Primzahl	
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