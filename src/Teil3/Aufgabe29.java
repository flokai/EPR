package Teil3;
import java.util.Scanner;
public class Aufgabe29 {
	
	public static void main (String[] args) {
		
		//Arrays anlegen
		int [] ahundrednumbers = new int [101];
		int [] PrimArray = new int [26];
		int [] NotPrimArray = new int [76];
		
		// Die ersten Wert festlegen
		PrimArray [0] = 2;
		NotPrimArray [0] = 1;
		
		// Index für die beiden Arrays
		int a = 1;
		int b = 1;
		
		// Array befüllen und für jeden Index = Zahl prüfen ob es sich um eine Primzahl handelt
		for (int index = 3; index < ahundrednumbers.length; index++) {
			
			boolean result = true;
			ahundrednumbers[index] = index;
			// Jede weitere Zahl wird mittels Teilung (aufsteigend zu Zahl i) und Restwert == 0 geprüft
			for (int i=2; i < ahundrednumbers[index]; i++){
				if (ahundrednumbers[index] % i == 0) {
					result=!true;
				}
			}
			// Wenn es eine Primzahl ist, dann im Array PrimArray speichern
			if (result) {
				PrimArray [a] = index;
				a++;	
			} 	
			// Wenn es keine Primzahl ist, dann im Array NotPrimArray speichern
			if (!result) {
				NotPrimArray [b]= index;
				b++;
			} 
		}
		// Das Array mit den Primzahlen wird ausgegeben
		System.out.println("Das sind die Primzahlen:");
		for(a = 0; a < PrimArray.length-1; a++){
		System.out.print(PrimArray[a] + " - ");
		}
		// Das Array ohne Primzahlen wird ausgegeben
		System.out.println();
		System.out.println("Das sind keine Primzahlen:");
		
		int [] PrimFaktor1 = new int [6];
		
		// Berechnung der Primfaktoren Punkt 1
		for(b = 1; b < NotPrimArray.length-1; b++){
			System.out.println();
			System.out.println("Die Zahl " + NotPrimArray[b] + " ist keine Primzahl. Die Primfaktoren sind: ");
	
			int e = 0;
			int copyOfPrimNumber = NotPrimArray[b];
			
			// Berechnung der PrimFaktoren Punkt 2
			for (int f = 0; f < PrimArray.length-1; f++) {
				if(NotPrimArray[b] % PrimArray[f] == 0) {
					while (copyOfPrimNumber % PrimArray[f] == 0){
						PrimFaktor1[e] = PrimArray[f];
						copyOfPrimNumber = copyOfPrimNumber/ PrimArray[f];
						e++;
						}
					}
				}
			//Ausgabe der PrimFaktoren
			for(e = 0; e < PrimFaktor1.length-1; e++){
				System.out.print(PrimFaktor1[e] + " ");
				}
		}	
		System.out.println();
		System.out.println();
			
		
// Aufgabe 30
		
		Scanner Primtest = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine Zahl zwischen 1 und 100 ein: ");
		int primnumber = Primtest.nextInt();
		
		// Gleicht die eingegeben Zahl mit den Arrays der Primzahlen und Nicht-Primzahlen ab
		for (int c = 0; c < PrimArray.length; c++){
			if(primnumber == PrimArray[c]){
				System.out.println(primnumber + " ist eine Primzahl");
			}
		}
		for (int c = 0; c < NotPrimArray.length; c++){
			if(primnumber == NotPrimArray[c]){
				System.out.println(primnumber + " ist keine Primzahl");
			}
		}
		
		// Array mit PrimFaktoren initalisieren
		int [] PrimFaktor = new int [8];
		int e = 0;
		int copyOfPrimNumber = primnumber;
		
		// Die Primfaktoren werden errechnet in dem die Zahl durch das Primzahlen Array geteilt wird und die 
		// Faktoren im PrimFaktoren Array gespeichert werden
		
		for (int f = 0; f < PrimArray.length-1; f++) {
			if(primnumber % PrimArray[f] == 0) {
				while (copyOfPrimNumber % PrimArray[f] == 0){
				PrimFaktor[e] = PrimArray[f];
				copyOfPrimNumber = copyOfPrimNumber/ PrimArray[f];
				e++;
				}
			}
		}
		// Gibt das Array mit den PrimFaktoren aus

		System.out.print("Der kleinste Primfaktor ist " + PrimFaktor[0] + " und der grösste Primfaktor ist " + PrimFaktor[e-1]);
		
	}
}

