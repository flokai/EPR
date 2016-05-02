package Teil7;

public class DHL extends Tarifrechner {

	public double Versandkosten (Address address, double weight) {
		double price = 0;
		if(address.getLand().equals("Deutschland")) {
			if (weight < 2.0) {
				price = 4.99;
			} else {
				if (weight >= 2.0 && weight <= 5.0) {
					price = 6.99;
				}
			}
		}
		
		if(address.getLand().equals("England")) {
			if (weight < 2.0) {
				price = 8.79;
			} else {
				if (weight >= 4.0 && weight <= 5.0) {
					price = 15.99;
				}
			}	
		}
		
		return price;
		
	}

}
