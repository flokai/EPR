package Teil5;

public class Car {
	
	private String colour;
	private int MaxSpeed;
	private String Manufacturer;

	public String getDescription () {
		return ("Dieses "+ (String) this.Manufacturer + "-Auto in " + this.colour + " fährt bis zu " + this.MaxSpeed + " km/h schnell");
	}
	
//Aufgabe 51
//Constructor für die Farbe, Max Geschwindigkeit und Hersteller
	
	public Car (){
		this.colour = "silber";
		this.MaxSpeed = 150;
		this.Manufacturer = "Volkswagen";		
	}	
	
	
}
