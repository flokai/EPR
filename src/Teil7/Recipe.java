package Teil7;

public abstract class Recipe {
	
	private Ingredient[] ZutatenListe = new Ingredient [6];
	private int index = -1;
	
	public void addIngredient(Ingredient Zutaten, double amount) {
		index++;
		ZutatenListe[index] = Zutaten;
		Zutaten.setWeight(amount);
	}
	
	public void addIngredient(Ingredient Zutaten, int amount){
		index++;
		ZutatenListe[index] = Zutaten;
		Zutaten.setWeight(amount);
	}	
	
	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (int i = 0; i <= index; i++){
			totalPrice = totalPrice + ZutatenListe[i].getPrice();
		}
		return totalPrice;	
	}
	
	public double getTotalWeight() {
		double totalWeight = 0.0;
		for (int i = 0; i <= index; i++){
			totalWeight = totalWeight + ZutatenListe [i].getWeight();
		}
		return totalWeight;
	}

	public boolean isVegan () {
		boolean vegan = true;
		for (int i = 0; i < ZutatenListe.length; i++){
			if (!(ZutatenListe[i] instanceof Vegan)){
				vegan = false;
				break;
			}
		}
		return vegan;	
	}
	
}
