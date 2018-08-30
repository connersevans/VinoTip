import java.util.ArrayList;

public class Analysis {

	ArrayList<Wine> wines;
	
	public Analysis(ArrayList<Wine> wines) {
		this.wines = wines;
	}
	
	// CAN ADD COUNTRY, PRICE, AND VARIETAL
	
	public ArrayList<Wine> getTopWines() {
		int count = 0;
		ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		while (count < 10) {
			Wine awine = wines.get(count);
			winelist.add(awine);
			count++;
		}
		
		return winelist;
	}
	
	public ArrayList<Wine> getTopCountry(String country) {
		int count = 0;
		int i = 0;
		ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		while (count < 10 && i < wines.size()) {
			Wine awine = wines.get(i);
			i++;
			if (awine.getCountry().equals(country)) {
				winelist.add(awine);
				count++;
			}
		}
		
		if (count > 0) {
			return winelist;
		}
		else {
			System.out.println("There are no wines to recommend for that country\n");
			return winelist;
		}
	}
	
	public ArrayList<Wine> getTopPrice(int price) {
		int count = 0;
		int i = 0;
		ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		while (count < 10 && i < wines.size()) {
			Wine awine = wines.get(i);
			i++;
			if (awine.getPrice() <= price) {
				winelist.add(awine);
				count++;
			}
		}
		
		if (count > 0) {
			return winelist;
		}
		else {
			System.out.println("There are no wines to recommend for that maximum price\n");
			return winelist;
		}
 	}
	
	public ArrayList<Wine> getTopVarietal(String varietal) {
		int count = 0;
		int i = 0;
		ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		while (count < 10 && i < wines.size()) {
			Wine awine = wines.get(i);
			i++;
			if (awine.getVarietal().equals(varietal)) {
				winelist.add(awine);
				count++;
			}
		}
		
		if (count > 0) {
			return winelist;
		}
		else {
			System.out.println("There are no wines to recommend for that varietal\n");
			return winelist;
		}
	}
	
	public ArrayList<Wine> getTopCountryAndPrice(String country, int price) {
		int count = 0;
		int i = 0;
		ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		while (count < 10 && i < wines.size()) {
			Wine awine = wines.get(i);
			i++;
			if (awine.getCountry().equals(country) && awine.getPrice() <= price) {
				winelist.add(awine);
				count++;
			}
		}
		
		if (count > 0) {
			return winelist;
		}
		else {
			System.out.println("There are no wines to recommend for that country and maximum price\n");
			return winelist;
		}
	}
	
//	public ArrayList<Wine> getTopCountryAndVarietal(String country, String varietal) {
//		int count = 0;
//		int i = 0;
//		ArrayList<Wine> winelist = new ArrayList<Wine>();
//		
//		while (count < 10 && i < wines.size()) {
//			Wine awine = wines.get(i);
//			i++;
//			if (awine.getCountry().equals(country) && awine.getVarietal().equals(varietal)) {
//				winelist.add(awine);
//				count++;
//			}
//		}
//		
//		if (count > 0) {
//			return winelist;
//		}
//		else {
//			System.out.println("There are no wines to recommend");
//			return null;
//		}
//	}
	
	public ArrayList<Wine> getTopPriceAndVarietal(int price, String varietal) {
		int count = 0;
		int i = 0;
		ArrayList<Wine> winelist = new ArrayList<Wine>();
		
		while (count < 10 && i < wines.size()) {
			Wine awine = wines.get(i);
			i++;
			if (awine.getPrice() <= price && awine.getVarietal().equals(varietal)) {
				winelist.add(awine);
				count++;
			}
		}
		
		if (count > 0) {
			return winelist;
		}
		else {
			System.out.println("There are no wines to recommend for that varietal and maximum price\n");
			return winelist;
		}
	}
	
//	public ArrayList<Wine> getTopCountryPriceAndVarietal(String country, int price, String varietal) {
//		int count = 0;
//		int i = 0;
//		ArrayList<Wine> winelist = new ArrayList<Wine>();
//		
//		while (count < 10 && i < wines.size()) {
//			Wine awine = wines.get(i);
//			i++;
//			if (awine.getCountry().equals(country) && awine.getPrice() <= price && awine.getVarietal().equals(varietal)) {
//				winelist.add(awine);
//				count++;
//			}
//		}
//		
//		if (count > 0) {
//			return winelist;
//		}
//		else {
//			System.out.println("There are no wines to recommend");
//			return null;
//		}
//	}
	
}
