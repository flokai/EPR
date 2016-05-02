package Klausur;

public class Factorial {
	private static int factorial(int aNumber) {
		if (aNumber < 1) {
			return 1;
		} else {
			return aNumber * factorial(aNumber - 1);
		}
	}

	private static int factorialIterative(int aNumber) {
		if (aNumber < 1) {
			return 1;
		} else {
			int retValue = 1;
			for (int facIndex = 1; facIndex <= aNumber; facIndex++) {
				retValue = retValue * facIndex;
			}
			return retValue;
		}
	}

	public static void main(String[] args) {
		int myNumber = 5;
		System.out.format("%d! == %d\n", myNumber, factorial(myNumber));
		System.out
				.format("%d! == %d\n", myNumber, factorialIterative(myNumber));
	}

}
