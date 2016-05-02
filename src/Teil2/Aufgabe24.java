package Teil2;
import java.math.*;
public class Aufgabe24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//π = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 – 1/11 + 1/13 – 1/15 + ...).
		double summe = 0;
		
		for (int i = 0; i<75; i++) {
			summe += Math.pow (1,i) / (2*i+1);	
		
		}
		double calculate;
		System.out.println("Pi ist ungefähr: " + summe);
		System.out.println("Genauigkeit: "+ 100 / (calculate = Math.PI) * summe + "%");
		
	}

}
