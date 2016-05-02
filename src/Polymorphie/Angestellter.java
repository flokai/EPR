package Polymorphie;

public class Angestellter {

//	public Angestellter(String name, String gehalt, String geburtsdatum) {
//		this.name = name;
//		this.gehalt = gehalt;
//		this.geburtsdatum = geburtsdatum;
//	}
	
	private String name = "Paul";
	// Name ist private; Deshalb wird dieser String mit Hilfe von Accessor Methoden aufgerufen
	// Getter und Setter
	
	public String gehalt = "2300";
	public String geburtsdatum = "23.10.2000";

	public String lieferePersonalien() {
		return this.name + " " + this.gehalt + " " +  this.geburtsdatum;
	}
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}

}
