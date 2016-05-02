package Klausur;

public class Konto {

	public static int kontoCounter = 2000345688;

	private int kontoStand;

	private String kontoPasswort;

	public int kontoNummer;

	public Konto(String kontoPasswort, int kontoStand) {
		this.kontoStand = kontoStand;

		this.kontoPasswort = kontoPasswort;

		kontoNummer = kontoCounter;

		kontoCounter++;
	}

	public String getKontoStand(String eingabePasswort) {

		if (kontoPasswort.equals(eingabePasswort)) {
			return "" + kontoStand;
		} else {
			return "falsches Passwort";
		}
	}

	public boolean geldAbheben(String eingabePasswort, int amount) {
		if (kontoPasswort.equals(eingabePasswort)) {
			if (amount > 0) {
				kontoStand -= amount;
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		Konto konto1 = new Konto("1234", 1000);
		Konto konto2 = new Konto("5678", 40000);

		System.out.println("Kontonummer Konto1: " + konto1.kontoNummer);

		System.out
				.println("Kontostand Konto2: " + konto2.getKontoStand("5678"));

		if (konto2.geldAbheben("5678", 200)) {
			System.out.println("Sei haben erfolgreich 200 DM abgehoben");
		} else {
			System.out
					.println("Sie konnten kein Geld abheben: Falsches Passwort oder interner Fehler");
		}

		System.out.println("Kontostand Konto2 nach Abheben: "
				+ konto2.getKontoStand("5678"));

		System.out.println("Momentaner Kontozaehler: " + Konto.kontoCounter);
	}
}
