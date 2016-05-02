package Klausur;

public class Zeitintervall implements IZeitintervall {

	private int kommt;
	private int geht;
	
	public Zeitintervall(int kommt, int geht){
		this.geht=geht;
		this.kommt=kommt;
	}
	
	public int getKommt(){
		return this.kommt;
	}
	
	public void setKommt(int kommt){
		this.kommt=kommt;
	}
	
	public int getGeht(){
		return this.geht;
	}
	
	public void setGeht(int geht){
		this.geht=geht;
	}
	public int getDauer(){
		return this.geht-this.kommt;
	}
	
	
}
