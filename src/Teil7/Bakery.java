package Teil7;

public class Bakery {
	
	private Recipe PlätzchenListe [] = new Recipe [3];
	private Tarifrechner [] Versandkosten = new Tarifrechner [4];
	
	// Im Konstruktor werden drei Rezepte sowie 4 Paketdienstleister deklariert
	public Bakery () {
		
		Zimtsterne Zimtsterne = new Zimtsterne();
		Mürbteigplätzchen Mürbteigplätzchen = new Mürbteigplätzchen();
		Spekulatius Spekulatius = new Spekulatius();
		
		PlätzchenListe[0] = Zimtsterne;
		PlätzchenListe [1] = Mürbteigplätzchen;
		PlätzchenListe [2] = Spekulatius;
		
		Versandkosten[0] = new UPS();
		Versandkosten[1] = new DHL();
		Versandkosten[2] = new DPD();
		Versandkosten[3] = new Hermes();
	
	}

	// Diese Methode ermittelt den Gesamtpreis je Plätzchensorte
	public double getPrice (Sorten Auswahl) {
		double price = 0;
		switch (Auswahl) {
		case Zimtsterne:
			price = PlätzchenListe[0].getTotalPrice();
			break;
		case Mürbteigplätzchen:
			price = PlätzchenListe[1].getTotalPrice();
			break;
		case Spekulatius:
			price = PlätzchenListe[2].getTotalPrice();
			break;
		}
		return price;
	}
	
	// Diese Methode ermittelt das Gesmatgewicht je Plätzchensorte
	public double getWeight (Sorten Auswahl ) {
		double weight = 0;
		switch (Auswahl) {
		case Zimtsterne:
			weight = PlätzchenListe[0].getTotalWeight();
			break;
		case Mürbteigplätzchen:
			weight = PlätzchenListe[1].getTotalWeight();
			break;
		case Spekulatius:
			weight = PlätzchenListe[2].getTotalWeight();
			break;
		}
		return weight;
		
	}
	
	// Diese Methode ermittelt ob alle verwendeteten Zutaten vegan sind
	public boolean isVegan (Sorten Auswahl) {
		boolean vegan = true;
		switch (Auswahl) {
		case Zimtsterne:
			vegan = PlätzchenListe[0].isVegan();
			break;
		case Mürbteigplätzchen:
			vegan = PlätzchenListe[1].isVegan();
			break;
		case Spekulatius:
			vegan = PlätzchenListe[2].isVegan();
			break;
		}
		return vegan;
	}
	
	// Diese Methode ermittelt die günstigsten Versandkosten
	// Alle Versandhändler werden durchlaufen und der günstigste wird nach jedem Durchlauf zwischengespeichert
	public double versandkosten (Address address, double weight) {
		double paketKosten = Versandkosten[0].Versandkosten(address, weight);
		for(int i = 1; i < Versandkosten.length; i++) {
			double kostenTemp = Versandkosten[i].Versandkosten(address, weight);
			if(paketKosten > kostenTemp) {
				paketKosten = kostenTemp;
			}
		}
		return paketKosten;	
		
		
	}
	
}
