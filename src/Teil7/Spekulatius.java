package Teil7;

public class Spekulatius extends Recipe {

//	28,57 Gramm fein gehackte Haselnusskerne 
//	0,14 Zitronen (Bio) 
//	48,57 Gramm Butter (weich) 
//	62,86 Gramm Zucker 
//	20 Gramm Schlagsahne 
//	0,57 Eigelb (Bio) 
//	2,86 Gramm Spekulatiusgewürz 
//	0,29 Prisen Salz 
//	0,29 Messersp. Hirschhornsalz 
//	105,71 Gramm Mehl 
	
	public Spekulatius() {

		Ingredient Haselnusskerne = new Miscellaneous();
		Haselnusskerne.setName("Haselnusskerne");
		Haselnusskerne.setPrice(0.30);
		Haselnusskerne.setWeight(29);
		addIngredient (Haselnusskerne, 29);
		
		Ingredient Butter = new Fat ();
		Butter.setName("Butter");
		Butter.setPrice(0.40);
		Butter.setWeight(49);
		addIngredient (Butter, 49);
		
		Ingredient Zucker = new Sugar ();
		Zucker.setName("Zucker");
		Zucker.setPrice(0.21);
		Zucker.setWeight(63);
		addIngredient (Zucker, 63);
		
		Ingredient Schlagsahne = new Fluid ();
		Schlagsahne.setName("Schlagsahne");
		Schlagsahne.setPrice(0.10);
		Schlagsahne.setWeight(20);
		addIngredient (Schlagsahne, 20);
		
//		Ingredient Eigelb = new Fluid ();
//		Eigelb.setName("Eigelb");
//		Eigelb.setPrice(0.10);
//		Eigelb.setWeight(6);
//		addIngredient (Eigelb, 6);
		
		Ingredient Mehl = new Flour();
		Mehl.setName("Mehl");
		Mehl.setPrice(0.50);
		Mehl.setWeight(106);
		addIngredient (Mehl, 106);
	
	}

}
