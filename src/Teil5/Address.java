package Teil5;

import java.io.FileNotFoundException;

public class Address {

	public String name;
	public String street;
	public String city;
	public int postcode;
	public String email;
	public String comment;

	/** Constructor */
	public Address() {
		this.name = "";
		this.street = "";
		this.city = "";
		this.postcode = 0;
		this.email = "";
		this.comment = "";
	}

	/** Instance method 
	 * @throws FileNotFoundException */
	// public void setAddress(String aStreet, int aPostcode, String aCity) {
	// this.street = aStreet;
	// this.postcode = aPostcode;
	// this.city = aCity;
	// }

	// Aufgabe 49
	public void setPostcode(int aPostcode) throws FileNotFoundException {
		this.postcode = aPostcode;
		this.city = postcodeToCity(postcode);
	}
	
	public String getCity(){
		return this.city;
	}
	
	public int getPostcode(){
		return this.postcode;
	}

	/** Instance method */
	public String fullAddress() {
		return name + ", " + street + ", " + ((Integer) postcode).toString()
				+ " " + city;
	}

	// Aufgabe 47
	// Mittels Scanner wird die Date eingelesen.
	// Wird anschliessend für aPostcode eine PLZ eingegeben, dann wird der Ort
	// ausgegeben
	public static String postcodeToCity(int aPostcode)
			throws FileNotFoundException {

		java.io.File postcodeFile = new java.io.File("Postcodes.txt");
		java.util.Scanner scanner = new java.util.Scanner(postcodeFile, "UTF-8");

		
		int Postcode = 0;
		String information = "";

		while (scanner.hasNextLine()) {

			Postcode = scanner.nextInt();
			information = scanner.nextLine();

			if (Postcode == aPostcode) {
				return (information);
			}
		}
		scanner.close();
		return information;

	}
}