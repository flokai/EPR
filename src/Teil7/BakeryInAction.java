package Teil7;

import java.io.FileNotFoundException;

public class BakeryInAction {

	public static void main (String [] args) throws FileNotFoundException {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int entscheidung = 0;
		
		do {
		System.out.println("Bitte geben Sie Ihren Vornamen ein");
		String Vorname = scanner.next();
		System.out.println("Bitte geben Sie Ihren Namen ein");
		String Name = scanner.next();
		System.out.println("Bitte geben Sie Ihre Strasse ein");
		String Strasse = scanner.next();
		System.out.println("Bitte geben Sie Ihre PLZ ein");
		String postcode = scanner.next();
		System.out.println("Bitte geben Sie Ihren Ort ein");
		String town = scanner.next();
		System.out.println("Bitte geben Sie Ihr Land ein");
		String Land = scanner.next();
		
		Address bestellAdresse = new Address (Vorname, Name, Strasse, postcode, town, Land);
		Bakery BäckereiMaier = new Bakery();
		
		System.out.println("Bitte geben Sie die gewünschte Plätzchen-Sorte ein: ");
		System.out.println("1) 1 für Zimtsterne");
		System.out.println("2) 2 für Mürbteigplätzchen");
		System.out.println("3) 3 für Spekulatius");
		int Auswahl = scanner.nextInt();
		Sorten Wahlplätzchen = null;
		
		switch (Auswahl) {
		case 1: Wahlplätzchen = Sorten.Zimtsterne;
		break;
		case 2: Wahlplätzchen = Sorten.Mürbteigplätzchen;
		break;
		case 3: Wahlplätzchen = Sorten.Spekulatius;
		break;
		default: System.out.println("Ihre Auswahl ist leider nicht korrekt");
		}
				
		System.out.println("Bitte geben Sie die gewünschte Menge ein: ");
		System.out.println("1 VE = 20 Plätzchen");
		double bestellmenge = scanner.nextDouble();	
		double weight = BäckereiMaier.getPrice(Wahlplätzchen) * bestellmenge;
		
		System.out.println("Die Versandkosten betragen: " + BäckereiMaier.versandkosten(bestellAdresse, weight) + " Euro");
		System.out.println("Die Materialkosten betragen: " + BäckereiMaier.getPrice(Wahlplätzchen) * bestellmenge + " Euro");
		System.out.println();
		System.out.println("Die Ware wird an folgende Adresse versendet: ");
		System.out.println();
		System.out.println(bestellAdresse.getAdressLabel());
		
		System.out.println();
		System.out.println("Möchten Sie eine weitere Bestellung aufgeben?");
		System.out.println("1) 1 für Ja");
		System.out.println("2) 2 für Nein");
		entscheidung = scanner.nextInt();
		scanner.nextLine();
		
	} while (entscheidung == 1);

	scanner.close();
		
	System.out.println("Vielen Dank für Ihre Bestellung und frohe Weihnachten");
	
	}

}
