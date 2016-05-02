package Teil6;

public class Enigma {

		// Array vom Typ Walze welches die drei zu wählenden Walzen beinhaltet
		private Walze [] walzen = new Walze [3];
		private String schluessel;

		
		// Contstructor für die Klasse Enigma
		public Enigma (int WalzenNummerEins, int WalzenNummerZwei, int WalzenNummerDrei, String schluessel){
			this.walzen[0] = new Walze (WalzenNummerEins);
			this.walzen[1] = new Walze (WalzenNummerZwei);	
			this.walzen[2] = new Walze (WalzenNummerDrei);
			this.schluessel = schluessel;
		}
		
		// Entschlüsseln der Nachricht
		// Der Text wird übergeben und mit Hilfe der Methoden aus der Klasse Walze entschlüsselt
		public String encrypt (String plaintext) {
			
			String encrypted = "";
			char[] Ausgabe = new char [plaintext.length()];
			
			for (int i = 0; i < plaintext.length(); i = i + 2) {
				int rotations = this.walzen[0].countClockwiseRotations(this.schluessel.charAt(0), plaintext.charAt(i));
				Ausgabe[i] = this.walzen[2].rotateClockwise(this.schluessel.charAt(2), rotations);
			}
			
			for (int i = 1; i < plaintext.length(); i = i + 2) {
				int rotations = this.walzen[1].countClockwiseRotations(this.schluessel.charAt(1), plaintext.charAt(i));
				Ausgabe[i] = this.walzen[2].rotateCounterClockwise(this.schluessel.charAt(2), rotations);
				}
			
			//Umformen des Arrays in einen String
			for(char Buchstabe : Ausgabe) {
				encrypted += Character.toString(Buchstabe);
			}
			return encrypted;	
		}
		
		// Verschlüsseln der Nachricht
		// Der Text wird übergeben und mit Hilfe der Methoden aus der Klasse Walze verschlüsselt
		public String decrypt (String plaintext) {
			
			String decrypted = "";
			char[] Ausgabe = new char [plaintext.length()];
			
			for (int i = 0; i < plaintext.length(); i = i + 2) {
				int rotations = this.walzen[2].countClockwiseRotations(this.schluessel.charAt(2), plaintext.charAt(i));
				Ausgabe[i] = this.walzen[0].rotateClockwise(this.schluessel.charAt(0), rotations);
			}		
			for (int i = 1; i < plaintext.length(); i = i + 2) {
				int rotations = this.walzen[2].countClockwiseRotations(this.schluessel.charAt(2), plaintext.charAt(i));
				Ausgabe[i] = this.walzen[1].rotateCounterClockwise(this.schluessel.charAt(1), rotations);
				}		
			//Umformen des Arrays in einen String
			for(char Buchstabe : Ausgabe) {
				decrypted += Character.toString(Buchstabe);
			}
			return decrypted;	
		}
		

}
