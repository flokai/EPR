package Teil1;

import java.io.InputStream;
import java.util.Arrays; 
import java.util.Scanner;

public class ArrayScanner { 

    public static void main(String[] args) { 

    	String [] Eingaben = new String [4]; // Ein Array mit 4 Komponenten wird angelegt
    	Scanner Test = new Scanner (System.in); // scanner für die Tastureingabe

    	for (int i=0; i<Eingaben.length; i++){ // Hier soll der Benutzer aufgeforder werden i=4 Zeilen einzugeben
    		Eingaben [i] = Test.nextLine();
    	}
    	
    	Test.close();
    	
    	for (int i= 0; i<Eingaben.length; i++){ // Hier werden die Zeilen wieder ausgegeben
    		System.out.println(Eingaben[i]);
    	}
    	
//Buch Liang s.578

    		
	}
}