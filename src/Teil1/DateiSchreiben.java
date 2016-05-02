package Teil1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class DateiSchreiben {
	
		public static void main (String [] args) throws IOException {

//		File myFile = new File("Testdatei.csv");
//	      if (! myFile.exists())  {
//	          myFile.createNewFile();
//	      }
	    
//			System.out.println(myFile.getAbsolutePath());
			
		FileWriter writer = new FileWriter ("Gedicht");
		
		writer.write ("Hier kommen die Adressen hin");
		writer.write ("Hier kommen die Adressen hin");
		writer.write ("Hier kommen die Adressen hin");
		
		writer.close();

		FileReader in = new FileReader ("Gedicht");
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		
		}
	}
