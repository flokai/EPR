package Teil9;

import java.io.File;

public class Verzeichnis {

	public static void main(String[] args) { 
		
		int numberOfFiles = printFiles("/Users/floriankaiser/Documents/Master of Science/Einführung in die Programmierung"); 
		System.out.println();
		System.out.println(numberOfFiles + " Datei/en");
	}
	
	static int printFiles(String Verzeichnis) {
		
		File file = new File(Verzeichnis);
		File[] files = file.listFiles();
		int numberOfFiles = 0;
		// Wenn der File ein File ist, dann wird das Verzeichnis ausgegeben
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {
				System.out.println(files[i].getPath()); 
				numberOfFiles++;
			}
		}
		// Wenn der File ein weiterer Ordner mit Files ist, dann wird die Methode
		// rekursiv aufgerufen und die weiteren Files ausgegeben usw...
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				numberOfFiles = numberOfFiles + printFiles(files[i].getPath());
			}
		}
		return numberOfFiles;
	}
	
}
