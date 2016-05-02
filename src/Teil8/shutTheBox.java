package Teil8;

public class shutTheBox {

	int [] box = {1,2,3,4,5,6,7,8,9};
	
	
	public shutTheBox(int [] box) {
		this.box = box;
	}

	// erstes Mal würfeln
	public int dice () {
		int a =  (int) (Math.random()*6)+1;
		return a;
	}
	
	// zweites Mal würfeln
	public int dice2 () {
		int a =  (int) (Math.random()*6)+1;
		return a;
	}
	
	// prüfen ob Summe grösser 6 und würfeln
	public String numberOfDice () {
		int sum = 0;
		
		for (int i = 0; i < this.box.length; i++){
			int counter = this.box [i];
			sum = sum + counter;
		}
		
		if (sum > 6){
			return ("Die gewürfelten Zahlen lauten: " + this.dice() + " und " + this.dice2());
		} else {
			return ("Die gewürfelte Zahl lautet: " + this.dice());
		}
	}
	
	// löscht die Zahlen aus dem Array
	public void delete (int aNumber) {
		for (int i = 0; i < this.box.length; i++){
			if (aNumber == this.box[i]) {
				this.box[i] = 0;
			}
		}
	}
	
	// prüft ob diese Zahl überhaupt noch existiert
	public boolean proof (int aNumber) {
		boolean test = false;
		
		if(aNumber == 0){
			test = true;
		} 
		else {
		for (int i = 0; i < this.box.length; i++){
			if (aNumber == this.box[i]) {
				test = true;
			}
		}
		}
		return test;
	}

	// Zählen der restlichen offenen Punkte
	public int penalty () {
		int sum = 0;
		for (int i = 0; i < this.box.length; i++){
			int counter = this.box [i];
			sum = sum + counter;
		}
		return sum;
	}
	
	
	// Gibt den akutellen Spielstand aus
	public String Ausgabe () {
		String text = "";
		for (int i = 0; i < this.box.length; i++){
			if (this.box[i] == 0){
				text = text + ("[_] ");
			}else {
				text = text + ("[" + this.box[i] + "] ");
			}
		}
		return text;
	}
		
	
	// java.util.Arrays.toString (anArray)
	
}
