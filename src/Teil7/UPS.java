package Teil7;

import Teil7.Address;

public class UPS extends Tarifrechner {

	@Override
	public double Versandkosten (Address address, double weight) {
		double price = 0;
		if(address.getLand().equals("Deutschland")) {
			if (weight < 2.0) {
				price = 9.70;
			} else {
				if (weight >= 2.0 && weight <= 5.0) {
					price = 11.40;
				}
			}
		}
		
		if(address.getLand().equals("England")) {
			if (weight < 2.0) {
				price = 23.55;
			} else {
				if (weight >= 4.0 && weight <= 5.0) {
					price = 25.10;
				}
			}	
		}
		
		return price;
		
	}
	
	
	
}