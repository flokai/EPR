package Teil7;

public class Mürbteigplätzchen extends Recipe {

//	80 Gramm kalte Butter 
//	120 Gramm Mehl 
//	60 Gramm Zucker 
//	0,80 Eigelb 
//	0,80 Prisen Salz 
	
	public Mürbteigplätzchen() {
	
		Ingredient Butter = new Fat ();
		Butter.setName("Butter");
		Butter.setPrice(0.40);
		Butter.setWeight(80);
		addIngredient (Butter, 80);
		
		Ingredient Mehl = new Sugar ();
		Mehl.setName("Mehl");
		Mehl.setPrice(0.20);
		Mehl.setWeight(120);
		addIngredient (Mehl, 120);
		
		Ingredient Zucker = new Sugar ();
		Zucker.setName("Zucker");
		Zucker.setPrice(0.20);
		Zucker.setWeight(60);
		addIngredient (Zucker, 60);
		
		Ingredient Eigelb = new Fluid ();
		Eigelb.setName("Eigelb");
		Eigelb.setPrice(0.10);
		Eigelb.setWeight(8);
		addIngredient (Eigelb, 8);
		
		Ingredient Salz = new Spice();
		Salz.setName("Salz");
		Salz.setPrice(0.15);
		Salz.setWeight(10);
		addIngredient (Salz, 10);
		
	}

}
