package Klausur;

public class Arbeitstag {
	
	private Zeitintervall[] buchungen;

	public Arbeitstag(Zeitintervall [] zeitintervall) {
		this.buchungen = zeitintervall;	
	}

	public int getArbeitszeit () {
		int arbeitszeit = 0;
		for (int i = 0; i < buchungen.length; i ++){
			arbeitszeit = arbeitszeit + buchungen[i].getDauer();
		}
		return arbeitszeit;
	}
	
	public int getPausenzeit () {
		int pausenzeit = 0;
		for (int i = 0; i < buchungen.length-1; i ++){
			pausenzeit = pausenzeit + (buchungen [i+1].getKommt()-buchungen[i].getGeht());
		}
		return pausenzeit;
	}
	
	public boolean pausenEingehalten () {
		boolean result = false;
		
		// Bedingung 1
		if(this.getArbeitszeit() <= 360){
			result = true;
		}
		
		// Bedingung 2
		if (this.getArbeitszeit() > 360){
			for(int i = 0; i < buchungen.length; i++){
				if (buchungen[i].getDauer() > 359) {
					result = false;
				}
			}
		}
		
		// Bedingung 3	
		if(this.getArbeitszeit() > 360 && this.getArbeitszeit() < 540 && this.getPausenzeit() >= 30)	 {
			int pausenzeit = 0;
			for(int i = 0; i < buchungen.length-1; i++){
				if ((buchungen[i+1].getKommt() - buchungen[i].getGeht()) > 14) {
					pausenzeit = pausenzeit + (buchungen[i+1].getKommt() - buchungen[i].getGeht());
				}
			}
			if(pausenzeit>30){
				result = true;
			}
		}
		
		// Bedingung 4
		if(this.getArbeitszeit() > 540 && this.pause15() >= 45) {
			result = true;
		}
		return result;
	}
	
	
	
	public int pause15 () {
		int pause = 0;
		for(int i = 0; i < buchungen.length-1; i++){
			if ((buchungen[i+1].getKommt() - buchungen[i].getGeht()) > 14) {
				pause = pause + (buchungen[i+1].getKommt() - buchungen[i].getGeht());
			}
		}
		return pause;	
	}
	
	
}
