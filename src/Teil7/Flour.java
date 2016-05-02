package Teil7;

public class Flour implements Ingredient, Vegan {

	String Name;
	double Price;
	double Weight;
	
	
	@Override
	public String getName() {
		return this.Name;
	}

	@Override
	public void setName(String Name) {
		this.Name = Name;		
	}

	public double getPrice() {
		return Price;
	}

	@Override
	public void setPrice(double Price) {
		this.Price = Price;
	}

	@Override
	public double getWeight() {
		return Weight;
	}

	@Override
	public void setWeight(double Weight) {
		this.Weight = Weight;
	}

}
