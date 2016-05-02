package Teil7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Address {

	public String name;
	public String vorname;
	public String street;
	public String city;
	public String postcode;
	public String Land;
	
// Konstruktor
	public Address(String name, String vorname, String street, String city, String postcode, String Land) {
		this.name = name;
		this.vorname = vorname;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
		this.Land = Land;
	}

	public String getCity() throws FileNotFoundException{
		return postcodeToCity();
	}

	public String getPostcode() throws FileNotFoundException{
		return cityToPostcode();
	}

	public String getLand() {
		return this.Land;	
	}
	
// Anhand des Landes wird geprüft aus welcher Datei der Abgleich stattfinden soll
	public String postcodeToCity() throws FileNotFoundException {
		String town = "";
		
		switch (this.Land) {
		case "Deutschland": 
			java.io.File postcodeFileDE = new java.io.File("Postcodes.txt");
			java.util.Scanner scannerDE = new java.util.Scanner(postcodeFileDE, "UTF-8");
			
			String aPostcode = "";
			String townDE = "";

			while (scannerDE.hasNextLine()) {
				aPostcode = scannerDE.next();
				townDE = scannerDE.nextLine();
				if (aPostcode.equals(this.postcode)) {
					town = townDE;
					return town;
				}
			}
			
		case "England":
			java.io.File postcodeFileUK = new java.io.File("Postcodes_UK.txt");
			java.util.Scanner scannerUK = new java.util.Scanner(postcodeFileUK, "UTF-8");

			String postcodeUK = "";
			String townUK = "";

			while (scannerUK.hasNextLine()) {
				String line = scannerUK.nextLine();
				String[] lineArray = line.split(",");
				postcodeUK = lineArray[0];
				townUK = lineArray[5];
				postcodeUK = postcodeUK.substring(1,postcodeUK.length() - 1).trim();
				if(postcodeUK.equals(this.postcode)) {
					scannerUK.close();
					return town = townUK.substring(1,townUK.length() - 1).trim();
				}
			}
		
		default: break;	
		}
		return town;
	}
	
	public String cityToPostcode() throws FileNotFoundException {
		String postcode2 = "";
		
		switch (this.Land) {
		case "Deutschland": 
			java.io.File postcodeFileDE = new java.io.File("Postcodes.txt");
			java.util.Scanner scannerDE = new java.util.Scanner(postcodeFileDE, "UTF-8");
			
			String postcodeDE = "";
			String townDE = "";

			while (scannerDE.hasNextLine()) {
				postcodeDE = scannerDE.next();
				townDE = scannerDE.nextLine();
				if (townDE.equals(this.city)) {
					postcode2 = postcodeDE;
					return postcode2;
				}
			}			
		case "England":
			java.io.File postcodeFileUK = new java.io.File("Postcodes_UK.txt");
			java.util.Scanner scannerUK = new java.util.Scanner(postcodeFileUK, "UTF-8");

			String postcodeUK = "";
			String townUK = "";

			while (scannerUK.hasNextLine()) {
				String line = scannerUK.nextLine();
				String[] lineArray = line.split(",");
				postcodeUK = lineArray[0];
				townUK = lineArray[5];
				townUK = townUK.substring(1, townUK.length() - 1).trim();
				if(townUK.equals(this.city)) {
					return postcode2 = postcodeUK.substring(1,postcodeUK.length() - 1);
				}
			}	
		default: break;	
		}
		return postcode2;
	}
	

	
	public String getAdressLabel () throws FileNotFoundException {

		String apostcode = cityToPostcode();
		String town = postcodeToCity();
		if(!apostcode.equals(this.postcode) && !apostcode.equals("")) {
			this.postcode = apostcode;
		}
		else if(!town.equals(this.city) && !town.equals("")) {
			this.city = town;
		}
		return (this.name + " " + this.vorname + "\n" + this.street + "\n" + this.city + " " + this.postcode + "\n" + this.Land);


	}

}
