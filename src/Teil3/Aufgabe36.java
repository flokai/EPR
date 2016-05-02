package Teil3;

public class Aufgabe36 {
	public static void main (String [] args) {
		
		double[][] Numbers = new double [8][8]; 						// Array mit 8 mal 8 Zahlen
		String [] Letters = {"A", "B", "C", "D", "E", "F", "G", "H"}; 	// Array mit Buchstaben
		double r=1;
	
		// Array  befüllen
		for (int a = 0; a<Numbers.length;a++ ) {
			for (int b = 0; b<Numbers[a].length; b++) {		// b<Numbers[a].length beschreibt das innere Array des Numbers Array
				Numbers [a][b] = r; 						// r ist 1 Reiskorn zu Beginn des Befüllens
				r = r*2; 									// r soll jedes mal verdoppelt werden
			}	
		}

		// Ausgabe des Feldes
		for (int a = 0; a<Numbers.length; a++) {						
			for (int b = 0; b<Numbers[a].length; b++) {				 																
				System.out.println("Auf dem Feld " + Letters[b] + (a+1) + " befinden sich " + Numbers[a][b] +" Reiskörner "); 
			}
		}	
	}
}
	