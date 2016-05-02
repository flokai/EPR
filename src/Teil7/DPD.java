package Teil7;

public class DPD extends Tarifrechner {

	public double Versandkosten (Address address, double weight) {
		double price = 0;
		if(address.getLand().equals("Deutschland")) {
			if (weight <= 5.0) {
				price = 4.20;
			}
		}
		
		if(address.getLand().equals("England")) {
			if (weight <= 5.0) {
				price = 18.80;
			}
		}
		
		return price;
		
	}
}
