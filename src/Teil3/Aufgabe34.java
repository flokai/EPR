package Teil3;

import java.util.Scanner;

public class Aufgabe34 {

	public static void main (String [] args) {
			
		String [][] chessField = new String [8][8];	
		for (int line = 0; line < chessField.length; line++) {
			for (int column = 0; column < chessField.length; column++) {
				chessField[line][column] = "[   ]";						// Alle Felder werden erstmal so gefüllt
			}
		}
		
// Spieler S wird angelegt		
		chessField [0][0] = "[sT1]";
		chessField [0][1] = "[sP1]";
		chessField [0][2] = "[sL1]";
		chessField [0][3] = "[sK ]";
		chessField [0][4] = "[sD ]";
		chessField [0][5] = "[sL2]";
		chessField [0][6] = "[sP2]";
		chessField [0][7] = "[sT2]";
		
// Spieler W wird angelegt	
		chessField [7][0] = "[wT1]";
		chessField [7][1] = "[wP1]";
		chessField [7][2] = "[wL1]";
		chessField [7][3] = "[wK ]";
		chessField [7][4] = "[wD ]";
		chessField [7][5] = "[wL2]";
		chessField [7][6] = "[wP2]";
		chessField [7][7] = "[wT2]";

// Die Bauern werden angelegt		
		for (int i=0; i<chessField.length; i++ ) {
			chessField[1][i] = "[sB" + (i+1)+"]"; 
		}
		
		for (int i=0; i<chessField.length; i++ ) {
			chessField[6][i] = "[wB" + (i+1)+"]"; 
		}
// Es werden alle Felder ausgegeben		
		for (int line = 0; line < chessField.length; line ++){
			for (int column = 0; column<chessField.length; column ++){
				System.out.print(chessField [line][column]+ " ");
			}
		System.out.print("\n");
		
		}
	
// Aufgabe 35 Ausgabe der Position und der Figur
		
		Scanner Scanner = new Scanner (System.in);
		System.out.println();
		System.out.println("Bitte wählen Sie Ihre Sprache");
		System.out.println("Deutsch 1:");
		System.out.println("English 2:");
		int choice = Scanner.nextInt();
		
		String figuresGerman [] = {"Turm", "Pferd", "Läufer", "König", "Dame", "Bauer"};
		String figuresEnglish[] = {"Rook", "Knight", "Bishop", "King", "Queen", "Pawn"};
		String coloursGerman[] = {"Weiße/r", "Schwarze/r"};
		String coloursEnglish[] = {"white", "black"};
		String finalcolours[] = new String [1];
		String finalfigures[] = new String [1];
		String [] lettersNumber = {"1","2", "3", "4","5", "6", "7","8"," "};
		String [] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
// Hier wird die Sprache ausgewählt	
// Bei der Ausgabe kann dann auf die Strings finalcolours und finalfigures zugegriffen werden		
		switch (choice) {
			case 1: 
				finalfigures = figuresGerman;
				finalcolours = coloursGerman;
				break;
			case 2:
				finalfigures = figuresEnglish;
				finalcolours = coloursEnglish;
				break;
			default: System.out.println("Ihre Eingabe ist ungültig");
		}
	
		for (int line = 0; line < chessField.length; line++){
			for (int column = 0; column < chessField.length; column++){
				
				int digitColour = -1;
				int digitFigure = -1;
				int digitNumber = -1;
				
				String digit1 = chessField[line][column].substring(1,2); // schaut sich die 1. Stelle an
				String digit2 = chessField[line][column].substring(2,3); // schaut sich die 2. Stelle an
				String digit3 = chessField[line][column].substring(3,4); // schaut sich die 3. Stelle an
				
				switch (digit1) {
				case "s": digitColour = 1; break;
				case "w": digitColour = 0; break;
				}
				
				switch (digit2) {
				case "T": digitFigure = 0; break;
				case "P": digitFigure = 1; break;
				case "L": digitFigure = 2; break;
				case "K": digitFigure = 3; break;
				case "D": digitFigure = 4; break;
				case "B" :digitFigure = 5; break;
				}
				
				switch (digit3) {
				case "1": digitNumber = 0; break; 
				case "2": digitNumber = 1; break;
				case "3": digitNumber = 2; break;
				case "4": digitNumber = 3; break;
				case "5": digitNumber = 4; break;
				case "6": digitNumber = 5; break;
				case "7": digitNumber = 6; break;
				case "8": digitNumber = 7; break;
				case " ": digitNumber = 8; break;
				}
				
				if (digitColour != -1 && digitFigure != -1 && digitNumber!= -1) {
					System.out.println(finalcolours[digitColour] + " " + finalfigures[digitFigure] + " " + lettersNumber[digitNumber] +  " auf "+ letters[column] + lettersNumber[line]);
				}
				
			}
		}
	}	
}
