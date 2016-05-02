package Klausur;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args) {
	
		Zeitintervall [] buchungen = new Zeitintervall [4];
		buchungen [0] = new Zeitintervall (40, 85);
		buchungen [1] = new Zeitintervall (100, 260);
		buchungen [2] = new Zeitintervall (260, 360);
		buchungen [3] = new Zeitintervall (400, 780);
		
		Arbeitstag arbeitstag = new Arbeitstag (buchungen);
		
		System.out.println(arbeitstag.getArbeitszeit());
		System.out.println(arbeitstag.getPausenzeit());
		System.out.println(buchungen[1].getDauer());
		System.out.println(arbeitstag.pausenEingehalten());
		
	}

}
