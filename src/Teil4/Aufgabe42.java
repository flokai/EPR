package Teil4;

public class Aufgabe42 {

	public static void main (String[] args) {
		
		Double Noten [] = {2.7, 5.0, 0.0, 2.0, 0.0, 0.0, 0.0, 3.7, 0.0, 2.3, 0.0, 5.0, 0.0, 1.3, 0.0, 0.0, 2.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,};
		int ECTS [] = {8, 9, 6, 8, 3, 3, 3, 3, 3, 5, 9, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 27, 3};
		String Module [] = {"EPR", "ALDA", "SOTE","DBIS","GEPM","THEO1","THEO1","THEO2","THEO2","SEMI","INTP","IMGG","DTAN","ERPG","ERPS",	"ITR","SIM","ITL","IS",	"WPMA","WPMB","MAAR","MÜMA"};
		// im String befinden sich 23 Fächer
		
		double Gesamtnote = 0;
		double Gesamtpunkte = 0;
		double summe = 0;
		
		for (int i = 0; i < Noten.length; i++) {
			if (Noten [i] > 0.0){
			Gesamtpunkte = Gesamtpunkte + (Noten [i] * ECTS [i]);
			summe = summe + ECTS [i];
			}
		}
		Gesamtnote = (double) (Math.round((Gesamtpunkte/summe)*10)/10.0);
		System.out.println("Die akutelle Gesamtnote ist: " + Gesamtnote);
			
	}
}
