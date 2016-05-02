package Polymorphie;

public class Abteilungsleiter extends Angestellter {

	public String abteilung;
	
	public Abteilungsleiter(String abteilung) {
		this.abteilung = abteilung;
		// TODO Auto-generated constructor stub
	}

	public String lieferePersonalien() {
		return getName() + " " + this.gehalt + " " +  this.geburtsdatum +  " " + this.abteilung;
	}

	public void befördern(Angestellter a) {
       
    }

}


