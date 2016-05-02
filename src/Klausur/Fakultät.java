package Klausur;

public class Fakultät {

	public Fakultät() {
		// TODO Auto-generated constructor stub
	}

	public static int fakultät (int anumber) {
		int result = 0;
		
		if(anumber == 1) {
			result = anumber;
		}
		
		if(anumber > 1) {
			result = anumber * fakultät(anumber-1);
		}
				
		return result;
	}
	
	public static boolean palindrom (String text) {
		boolean result = false;
		
		text = text.toLowerCase();
		
		if(text.length() <= 1) {
			result = true;
		}
		
		if(text.length() > 1) {
			if(text.charAt(0) == text.charAt(text.length()-1) ){
				return palindrom(text.substring(1, text.length()-1));
			}
		}
		return result;
	}
	
	
	
	public static void main (String[] args ){
		int x = 6;
		System.out.println("Die Fakultät von " + x + " ist " + fakultät(x));
		
		String text = "alla ,alla";
		System.out.println("Das Wort " + text + " ist ein Palindrom: " + palindrom(text));
		
		
		int number = 24;
		
		number %= 5;
		
		System.out.println(number);
		
//		public enum Autotypen { Mercedes, Volkswagen, BMW, Audi };
//		
//		Autotypen [] Autos = new Autotypen [15];
//		
//		for (Autotypen automodell : Autos) {
//			if(automodell == Autotypen.Mercedes) {
//				System.out.println(automodell);
//			}		
//		}
	
	}
	
	
}
