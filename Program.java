import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program {

	public static void main(String[] args) {
		
		Reader reader = new Reader("full-wine-data.txt");
		reader.readFile();
		ArrayList<String> rawdata = reader.getDataLines();
		
		Parser parser = new Parser();
		ArrayList<Wine> wines = parser.parse(rawdata);
		
		Analysis analysis = new Analysis(wines);
		
		boolean check = true;
		
		while (check) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter 'Country' to get wine recommendations for a specific country");
			System.out.println("Enter 'Varietal' to get wine recommendations for a certain varietal (e.g. Sauvignon Blanc)");
			System.out.println("Enter 'All' to get wine recommendations for all wines");
			System.out.println("Enter 'QUIT' to exit");
			
			String choice = input.nextLine();
			choice = choice.toLowerCase();
			
			// COUNTRY WINES
			if (choice.equals("country")){
				System.out.println("Enter a country");
				String country = input.nextLine();
				country = country.toLowerCase();
				
				System.out.println("Do you have a maximum price? (Enter 'Yes' or 'No')");
				choice = input.nextLine();
				choice = choice.toLowerCase();
				
				if (choice.equals("yes")) {
					
					System.out.println("Enter your maximum price");
					
					while (!input.hasNextInt()) {
						System.out.println("That input was not a number\n");
						System.out.println("Enter your maximum price");
						input.next();
					}
						int price = input.nextInt();
					
					System.out.println("Here are your recommended wines...\n");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (Exception e) {
						System.out.println("Something went wrong");
						e.printStackTrace();
					}
					
					ArrayList<Wine> finallist = analysis.getTopCountryAndPrice(country, price);
					for (int i = 0; i < finallist.size(); i++) {
						Wine awine = finallist.get(i);
						System.out.println("Title: " + awine.getTitle());
						System.out.println("Price: $" + awine.getPrice());
						System.out.println("Points: " + awine.getPoints());
						System.out.println("Varietal: " + awine.getVarietal());
						System.out.println("Winery: " + awine.getWinery());
						System.out.println("\n");
					}
				}
				
				else {
					
					System.out.println("Here are your recommended wines...\n");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (Exception e) {
						System.out.println("Something went wrong");
						e.printStackTrace();
					}
					
					ArrayList<Wine> finallist = analysis.getTopCountry(country);
					for (int i = 0; i < finallist.size(); i++) {
						Wine awine = finallist.get(i);
						System.out.println("Title: " + awine.getTitle());
						System.out.println("Price: $" + awine.getPrice());
						System.out.println("Points: " + awine.getPoints());
						System.out.println("Varietal: " + awine.getVarietal());
						System.out.println("Winery: " + awine.getWinery());
						System.out.println("\n");
					}
				}
				


			}
			
			
			// VARIETAL WINES
			else if (choice.equals("varietal")) {
				System.out.println("Enter a varietal");
				String varietal = input.nextLine();
				varietal = varietal.toLowerCase();
				
				System.out.println("Do you have a maximum price? (Enter 'Yes' or 'No')");
				choice = input.nextLine();
				choice = choice.toLowerCase();
				
				if (choice.equals("yes")) {
					
					System.out.println("Enter your maximum price");
					
					while (!input.hasNextInt()) {
						System.out.println("That input was not a number\n");
						System.out.println("Enter your maximum price");
						input.next();
					}
						int price = input.nextInt();
					
					System.out.println("Here are your recommended wines...\n");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (Exception e) {
						System.out.println("Something went wrong");
						e.printStackTrace();
					}
					
					ArrayList<Wine> finallist = analysis.getTopPriceAndVarietal(price, varietal);
					for (int i = 0; i < finallist.size(); i++) {
						Wine awine = finallist.get(i);
						System.out.println("Title: " + awine.getTitle());
						System.out.println("Price: $" + awine.getPrice());
						System.out.println("Points: " + awine.getPoints());
						System.out.println("Varietal: " + awine.getVarietal());
						System.out.println("Winery: " + awine.getWinery());
						System.out.println("\n");
					}
				}
				
				else {
					
					System.out.println("Here are your recommended wines...\n");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (Exception e) {
						System.out.println("Something went wrong");
						e.printStackTrace();
					}
					
					ArrayList<Wine> finallist = analysis.getTopVarietal(varietal);
					for (int i = 0; i < finallist.size(); i++) {
						Wine awine = finallist.get(i);
						System.out.println("Title: " + awine.getTitle());
						System.out.println("Price: $" + awine.getPrice());
						System.out.println("Points: " + awine.getPoints());
						System.out.println("Varietal: " + awine.getVarietal());
						System.out.println("Winery: " + awine.getWinery());
						System.out.println("\n");
					}
				}
			}
			
			// ALL WINES
			else if (choice.equals("all")) {
				
				System.out.println("Do you have a maximum price? (Enter 'Yes' or 'No')");
				choice = input.nextLine();
				choice = choice.toLowerCase();
				
				if (choice.equals("yes")) {
					
					System.out.println("Enter your maximum price");
					
					while (!input.hasNextInt()) {
						System.out.println("That input was not a number\n");
						System.out.println("Enter your maximum price");
						input.next();
					}
						int price = input.nextInt();
					
					System.out.println("Here are your recommended wines...\n");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (Exception e) {
						System.out.println("Something went wrong");
						e.printStackTrace();
					}
					
					System.out.println(price);
					ArrayList<Wine> finallist = analysis.getTopPrice(price);
					for (int i = 0; i < finallist.size(); i++) {
						Wine awine = finallist.get(i);
						System.out.println("Title: " + awine.getTitle());
						System.out.println("Price: $" + awine.getPrice());
						System.out.println("Points: " + awine.getPoints());
						System.out.println("Varietal: " + awine.getVarietal());
						System.out.println("Winery: " + awine.getWinery());
						System.out.println("\n");
					}
					
				}
				else {
					
					System.out.println("Here are your recommended wines...\n");
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (Exception e) {
						System.out.println("Something went wrong");
						e.printStackTrace();
					}
					
					ArrayList<Wine> finallist = analysis.getTopWines();
					for (int i = 0; i < finallist.size(); i++) {
						Wine awine = finallist.get(i);
						System.out.println("Title: " + awine.getTitle());
						System.out.println("Price: $" + awine.getPrice());
						System.out.println("Points: " + awine.getPoints());
						System.out.println("Varietal: " + awine.getVarietal());
						System.out.println("Winery: " + awine.getWinery());
						System.out.println("\n");
					}
				}
			}
			
			// EXIT
			else if (choice.equals("quit")) {
				System.exit(0);
			}
			
			// IMPROPER INPUT
			else {
				System.out.println("That was not a valid input\n");
			}
			
		}
		

	}

}
