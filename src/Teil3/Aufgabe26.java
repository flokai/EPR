package Teil3;
import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe26 {

	public static void main(String[] args) {

		// ein Array names data wird angelegt
		int [] data;
		
		Scanner Scanner = new Scanner (System.in);
		System.out.print("Geben Sie die grösse des Feldes ein: ");
		int range = Scanner.nextInt();
		
		// die Grösse des Arrays beträgt "range" die Grösse wird durch den benutzer definiert
		data = new int[range];
		
		// Es werden die Zufallszahlen generiert
		for (int i = 0; i<range; i++){
			data [i] = (int)Math.round((Math.random() * 202)- 101);
			System.out.println(data[i]);
		}
		
//Aufgabe 27		
		long sum = 0;
		for (int i=0; i<range; i++) {
			sum += data[i];
		}
		double average = 0;
		double absolut = 0;
		// Der Durchschnitt wird errechnet in dem jede Zahl des Arrays addiert (der Betrag) wird und durch die Anzahl geteilt wird
		for (int i=0; i<range; i++) {
			absolut += Math.abs(data[i]);
			average = (absolut/(double)range);
		}
		
		System.out.println("Die Summe aller Zufallszahlen beträgt: " +sum);
		System.out.println("Der Durschnitt aller Zufallszahlen beträgt: "+ average);
		
//Aufgabe 28	
		
		// Das Array wird sortiert, so kann mit Index O und Index Range-1 der größte bzw. kleinste Komponent 
		// ausgegeben werden
		Arrays.sort(data); 
        for (int index = 0; index < data.length; index++) {
        }
        System.out.println("Die kleinste Komponente ist: "+ data[0]+ " und der Index ist: 0");	
    	System.out.println("Die grösste Komponente ist: "+ data[(range-1)]+ " und der Index ist: "+ (range-1));
    	
 //Aufgabe 28 Alternative 2
    	
    	double max = data[0];
    	int indexOfMax = 0;
    	for (int i = 1; i < data.length; i++) {
    		if (data[i] > max) { 
    			max = data[i]; indexOfMax = i;
    		}
    	}
    	
    	System.out.println("Die grösste Zahl ist: "+ max + " mit dem Index: " + indexOfMax);
	
    	double min = data[0];
    	int indexOfMin = 0;
    	for (int i = 1; i < data.length; i++) {
    		if (data[i] < min) { 
    			min = data[i]; indexOfMin = i;
    		}
    	}
    	
    	System.out.println("Die grösste Zahl ist: "+ min + " mit dem Index: " + indexOfMin);
	
	}
}

