package SeleTest;

import java.io.File;
import java.io.FileWriter;



public class MainSele {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("");
		FileWriter outputfile = new FileWriter(file);
		CSVWriter writer = new CSVWriter(outputfile);
	}
	
}
