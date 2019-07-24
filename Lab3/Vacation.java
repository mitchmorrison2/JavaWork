import java.util.Scanner;

public class Vacation {
	
	static Scanner input = new Scanner(System.in);
	static String[] flights = {"Morning", "Afternoon", "Evening"};
	static double[] flightsPrices = {500.00, 600.00, 700.00};
	static String[] hotelStays = {"One night", "Two nights", "Three nights"};
	static double[] hotelStaysPrices = {100.00, 240.00, 390.00};
	static String[] bookings = new String[2];
	static double[] prices = new double[2];
	
public static void main(String[] args) {
		
	
	while (true)
	{

	int option = displayMenu();

	if (option == 1) { 
		displayArrays(flights, flightsPrices, "Flights");
		break;
	}
	else if (option == 2) {
		displayArrays(hotelStays, hotelStaysPrices, "Hotel Stays");
		break;
	}
	
	else if (option == 3) {
		displayItineraryArrays();
		break;
	}
	else if (option == 4) {
		getTotal();
		break;
	}
	else if (option == 5) {
		clearBookings();
		clearprices();
		break;
	}
	else if (option == 9) {
		System.out.println("Bye bye sucker");
		break;
	} //end if and else ifs
	else {
		System.out.println("Unacceptable option.");
	} //end else
	} //end while

	
	} //end main
	
public static int displayMenu() {
	
	System.out.println("Welcome to Mustang Tours");
	System.out.println("------------------------");
	System.out.println("Choose from the following menu options:");
	System.out.println("1) Browse Flights and add booking to itinerary");
	System.out.println("2) Browse Hotel Stays and add booking to itinerary");
	System.out.println("3) View Itinerary");
	System.out.println("4) Display total and pay");
	System.out.println("5) Cancel bookings");
	System.out.print("Enter Option : ");
	int option = input.nextInt();
	return option;
	
} //end displayMenu


public static void displayArrays(String [] descriptionArray, double[] pricesArray, String name) {
	
	while (true) {
		
	System.out.printf("%10s %15s %15s\n", "Number", name, "Prices");
	
	//System.out.printf("%10s %15s $%15s", 1, "Morning", 500.00);
	//System.out.printf("%10s %15s $%15s", 2, "Afternoon", 600.00);
	//System.out.printf("%10s %15s $%15s", 3, "Evening", 700.00);
	
	
		for(int i=0; i <=2; i++) {
			System.out.printf("%10s %15s %15s\n", i+1, descriptionArray[i], pricesArray[i]);
			} //end for
	
	int number = getNumber();
	
	if (number != -1) 
		break;
	
	} //end while
	

	
	

}

public static int getNumber() {
	System.out.println("Enter a number from the list above or -1 if you want to redisplay the menu: \n");
	int number = input.nextInt();
	return number;
	
}

}
