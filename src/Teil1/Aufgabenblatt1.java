package Teil1;
import java.lang.management.*;

public class Aufgabenblatt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int	numberStudWINEPR;
	int	numberStudHTWG;
	int peopleGermany;
	double peopleEarth;
	short numberSemester;
	char firstLetterMyName;
	double averageGrade;
	boolean leapYear;
	
	numberStudWINEPR=40;
	numberStudHTWG=4500;
	peopleGermany=82000000;
	peopleEarth= 7300000000l;
	numberSemester=5;
	firstLetterMyName='F';
	averageGrade=2d;
	leapYear=false;
	
	System.out.println("Der Anteil der Deutschen an der Weltbevölkerung beträgt " + 100/peopleEarth*peopleGermany);	
	
// Aufgabe 7
	
	{
	System.out.println("Binär System");
	double basis = 2.0; // Basis
	int exponent = 0; // Exponent
	while (exponent <= 3) // Wert wird für die Exponenten von 0 bis 3 ausgerechnet
		{
		System.out.println(Math.pow(basis,exponent));
		exponent++;
		}
	}
	
	{
		System.out.println("Oktal System");
		double basis = 8.0; // Basis
		int exponent = 0; // Exponent
		while (exponent <= 3)
			{
			System.out.println(Math.pow(basis,exponent));
			exponent++;
			}
		}
	{
		System.out.println("Dezimal System");
		double basis = 10.0; // Basis
		int exponent = 0; // Exponent
		while (exponent <= 3)
			{
			System.out.println(Math.pow(basis,exponent));
			exponent++;
			}
		}
	{
		System.out.println("Hexadezimal System");
		double basis = 16.0; // Basis
		int exponent = 0; // Exponent
		while (exponent <= 3)
			{
			System.out.println(Math.pow(basis,exponent));
			exponent++;
			}
		}
	{
		System.out.println("Sexagesimal System");
		double basis = 60.0; // Basis
		int exponent = 0; // Exponent
		while (exponent <= 3)
			{
			System.out.println(Math.pow(basis,exponent));
			exponent++;
			}
		}
	
	}
}
