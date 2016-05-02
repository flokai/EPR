package Teil7;

public class Zimtsterne extends Recipe {
	
	// Die Klasse Zimsterne ist eine Unterklasse der Klasse Recipe und hat somit alle Methoden zur
	// Errechnung des Preises und Gewichts
	
	
//	1,20 Eiweiß 
//	100 Gramm Puderzucker 
//	0,40 Päckchen Vanillezucker 25g
//	0,40 TL Zimt (gemahlen) 5g
//	0,40 Messersp. Kaffeebohnen (gemahlen) 8g
//	150 Gramm Mandeln (ungeschält, gemahlen) 
//	Puderzucker (zum Ausstechen) 
	
	// Im Konstruktor werden die Zutaten hinzugefügt
	public Zimtsterne () {
		// Die Zutat wird deklariert und mit den entsprechenden Werten bestückt
		// Anschließend wird die Zutat dem Rezept hinzugefügt
		Fluid Eiweiß = new Fluid ();
		Eiweiß.setName("Eiweiß");
		Eiweiß.setPrice(0.10);
		Eiweiß.setWeight(10);
		addIngredient (Eiweiß, 1.2);
		
		Ingredient Puderzucker = new Sugar ();
		Puderzucker.setName("Puderzucker");
		Puderzucker.setPrice(0.15);
		Puderzucker.setWeight(100);
		addIngredient (Puderzucker, 100);
		
		Ingredient Vanillezucker = new Sugar ();
		Vanillezucker.setName("Vanillezucker");
		Vanillezucker.setPrice(0.30);
		Vanillezucker.setWeight(25);
		addIngredient (Vanillezucker, 25);
		
		Ingredient Zimt = new Spice ();
		Zimt.setName("Zimt");
		Zimt.setPrice(0.10);
		Zimt.setWeight(5);
		addIngredient (Zimt, 5);
		
		Ingredient Kaffeebohnen = new Miscellaneous();
		Kaffeebohnen.setName("Kaffeebohnen");
		Kaffeebohnen.setPrice(0.10);
		Kaffeebohnen.setWeight(8);
		addIngredient (Kaffeebohnen, 8);
		
		Ingredient Mandeln = new Miscellaneous();
		Mandeln.setName("Mandeln");
		Mandeln.setPrice(0.30);
		Mandeln.setWeight(150);
		addIngredient (Mandeln, 150);
		
	}

}




