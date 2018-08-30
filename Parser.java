import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Parser {

	private ArrayList<Wine> wines;
	
	
	public Parser() {
		
		wines = new ArrayList<Wine>();
	}
	
	public ArrayList<Wine> parse(ArrayList<String> datalines) {
		
		for (String line : datalines) {
			String[] aline = line.split(",");
			
			if (aline.length != 13) {
				
			}
			
			else {
				
			//System.out.println("Length: " + aline.length);
			
			Wine wineobject = new Wine();
			
			boolean check = true;
			
			String country = aline[1];
			country = country.toLowerCase();
			wineobject.setCountry(country);
			
			String description = aline[2];
			wineobject.setDescription(description);
			
			try {
			int points = Integer.parseInt(aline[3]);
			wineobject.setPoints(points);
			}
			catch (Exception e) {
				check = false;
			}
			
			try {
			int price = Integer.parseInt(aline[4]);
			wineobject.setPrice(price);
			}
			catch (Exception e) {
				check = false;
			}
			
			String province = aline[5];
			wineobject.setProvince(province);
			
			String region = aline[6];
			wineobject.setRegion(region);
			
			String title = aline[10];
			wineobject.setTitle(title);
			
			String varietal = aline[11];
			varietal = varietal.toLowerCase();
			wineobject.setVarietal(varietal);
			
			String winery = aline[12];
			wineobject.setWinery(winery);
			
			if (check) {
				wines.add(wineobject);
			}
			
			}
			
		}
		
		Collections.sort(wines, new Comparator<Wine>() {
			@Override
			public int compare (Wine w1, Wine w2) {
				Integer points1 = w1.getPoints();
				Integer points2 = w2.getPoints();
				return points2.compareTo(points1);
			}
		});
		
		return wines;
		
	}
	
	public ArrayList<Wine> getWineArray() {
		return wines;
	}
	
}
