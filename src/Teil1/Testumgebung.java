package Teil1;

public class Testumgebung {

//	public static boolean startsWithUpperCase(String text) {
//		String groﬂBuchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		if (text.length() > 0) {
//			for (int i = 0; i < 26; i++) {
//
//				if (text.charAt(text.length()-1) == groﬂBuchstaben.charAt(i)) {
//					return true;
//				}
//
//			}
//			return false;
//		}
//		return false;
//
//	}
	
	public static boolean startsWithUpperCase(String text) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean result = false;
		
		if (text.length() == 0) {
			result = false;
		} else {
			for (int i = 0; i < alphabet.length(); i++) {
				if(text.charAt(0) == alphabet.charAt(i)) {
					result = true;
				}
			}
		}
		return result;
	}
	
	
	public static boolean endsWithLowerCase(String text) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		boolean result = false;
		
		if (text.length() == 0) {
			result = false;
		}
		
		if (text.length() == 1) {
			for (int i = 0; i < alphabet.length(); i++) {
				if(text.charAt(0) == alphabet.charAt(i)) {
					result = true;
				}
			}
		}
		
		if(text.length() > 1) {
			for (int i = 0; i < alphabet.length(); i++) {
				if(text.charAt(text.length()-1) == alphabet.charAt(i)) {
					result = true;
				}
			}
		}
		return result;
	}
	
	
	
	
	
	public static void main(String[] args){
	
		System.out.println(startsWithUpperCase("D"));
		System.out.println(startsWithUpperCase("hallo"));
		System.out.println(endsWithLowerCase("ALLEmeineEntschenchensflasdfklasdfD"));
//		System.out.println(startsWithUpperCase("KKKKKallo"));
//		System.out.println(startsWithUpperCase("Zcccallo"));
//		System.out.println(startsWithUpperCase(""));
		
		
		int [] sequence = new int [3];
		sequence[0] = 4;
		sequence[1] = 6;
		sequence[2] = 8;
		
		solve(sequence);
		
		
		
//
//		String text="Konzil 1414-1418";
//		int i = 0;
//		while(i < text.length()){
//			if(i%2==0){
//				System.out.print(text.charAt(i));
//			} else{
//				System.out.print((""+text.charAt(i)).toUpperCase());
//			}
//			i++;
//		}
		
	}


	public static void solve (int [] anArray) {
		boolean result = false;
		if(anArray.length <= 2) {
			System.out.println("Was soll das denn");
		} else {

		int differenz = anArray[1] - anArray[0];
		
		for (int i = 0; i < anArray.length-2; i++) {
			
			if(anArray [1+(i+1)] - anArray[1+i] == differenz){
				result = true;
			} else result = false;
		}
		
		if (result = true) {
			System.out.println("Die nächste Ziffer ist: " + (anArray[anArray.length-1]+differenz));
		} else 
			System.out.println("Keine Ahnung");	
		}
	}

}
