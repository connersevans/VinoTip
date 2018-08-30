import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Reader {

	private Scanner scan;
	private ArrayList<String> datalines;
	private String filename;
	
	public Reader(String file) {
		
		datalines = new ArrayList<String>();
		filename = file;
	}
	
	public void readFile() {
		
		try {
			File csvfile = new File(filename);
			scan = new Scanner(csvfile);
			scan.nextLine();
			while (scan.hasNext()) {
				String line = scan.nextLine();
				
				datalines.add(line);
			}
			scan.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getDataLines() {
		return datalines;
	}
}
