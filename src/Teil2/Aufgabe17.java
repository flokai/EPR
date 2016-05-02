package Teil2;

import java.util.Scanner;


public class Aufgabe17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float weight;
		float size;
		
		// Grösse eingeben
		Scanner Scanner1 = new Scanner (System.in);
		System.out.println("Bitte geben Sie Ihr Gewicht ein: ");
		weight = Scanner1.nextFloat();
		
		// Gewicht eingeben
		Scanner Scanner2 = new Scanner (System.in);
		System.out.println("Bitte geben Sie Ihre Korpergrösse ein: ");
		size = Scanner2.nextFloat();

		// Berechnung des BMI
		float BMI = (weight/(size*size));
		
		System.out.println("Ihr Body Mass Index beträgt: " + BMI);
		
		if (BMI < 18.5) {
			System.out.print("Sie haben Untergewicht");
		} else {
			if (BMI>18.5 && BMI<25) {
				System.out.print("Sie haben Normalgewicht");
			}else {
					if (BMI>=25 && BMI<=30) {
						System.out.print("Sie haben Übergewicht");
					}else {
							if (BMI>30 && BMI<=40.0) {
								System.out.print("Sie haben starkes Übergewicht (Adipositas)");
							}else {
								if (BMI>40) {
									System.out.print("Sie haben Extreme Adipositas");
								}
							}
					}
			}
			
		}
		
	}
	
		
		/*
		Für Erwachsene gilt folgende Einordnung:
		Untergewicht: Body-Mass-Index weniger als 18,5
		Normalgewicht: Body-Mass-Index 18,5 bis 24,9
		Übergewicht: Body-Mass-Index ab 25
		Starkes Übergewicht (Adipositas): Body-Mass-Index über 30
		Extreme Adipositas: Body-Mass-Index über 40
		*/


}
