package Polymorphie;

public class Mitarbeiter {

	public static void main(String[] args) {

		Angestellter MA1 = new Angestellter ();
		System.out.println("Mitarbeiter 1: ");
		System.out.println(MA1.lieferePersonalien());
		System.out.println(MA1.getName());
		System.out.println(MA1.geburtsdatum);
		System.out.println();
		
		System.out.println("Mitarbeiter 2: ");
		Abteilungsleiter MA2 = new Abteilungsleiter("Druckerei");
		System.out.println(MA2.lieferePersonalien());
		System.out.println();
		
		System.out.println("Mitarbeiter 3: ");
		Angestellter MA3 = new Angestellter();
		System.out.println(MA3.lieferePersonalien());
		
		MA3 = new Abteilungsleiter ("Lackiererei");
		System.out.println(MA3.lieferePersonalien());
		
		

	}

}
