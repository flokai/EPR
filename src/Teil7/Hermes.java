package Teil7;

public class Hermes extends Tarifrechner {

	public double Versandkosten (Address address, double weight) {
		double price = 0;
		if(address.getLand().equals("Deutschland")) {
			if (weight <= 5.0) {
				price = 4.69;
			}
		}
		
		if(address.getLand().equals("England")) {
			if (weight <= 5.0) {
				price = 13.79;
			}
		}
		
		return price;
		
	}

}
