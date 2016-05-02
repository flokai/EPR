package Burger;

public class BurgerMain {

	public static void main(String[] args) {
		
		
		Burger meinLieblingsBurger = new Whooper();
		
		meinLieblingsBurger.mengeFett();				//(1)
		// Warum mengeZucker? - vom Typ Burger und nicht Whooper
//		meinLieblingsBurger.mengeZucker();				//(2)		
//		meinLieblingsBurger.preis();					//(3)
		
		BigKing mittelprächtigerBurger = new BigKing();
		
		mittelprächtigerBurger.mengeFett();				//(4)
		// kartonverpackung geht nicht, weil die Methode falsch überschrieben wurde
//		mittelprächtigerBurger.kartonverpackung(); 			//(5)
		mittelprächtigerBurger.preis();					//(6)
		
		Burger istmiregalwasichesse = new Burger();
		
		istmiregalwasichesse.kartonverpackung();			//(7)
//		istmiregalwasichesse.preis();					//(8)
		istmiregalwasichesse.mengeFett();				//(9)
		
		
//		((Burger)meinLieblingsBurger).preis();				//(10)
		((Burger)mittelprächtigerBurger).mengeFett();			//(11)
		
	}

}
