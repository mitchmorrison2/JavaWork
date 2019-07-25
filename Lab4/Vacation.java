//Mitchell Morrison Lab 4 section 12

import java.util.Scanner;

public class Vacation {
	
	static Scanner input = new Scanner(System.in);
	static String[] flights = {"Morning", "Afternoon", "Evening"};
	static double[] flightsPrices = {500.00, 600.00, 700.00};
	static String[] hotelStays = {"One night", "Two nights", "Three nights"};
	static double[] hotelStaysPrices = {100.00, 240.00, 390.00};
	static String[] bookings = new String[2];
	static double[] prices = new double[2];
	static int option;
	static int number;
	
public static void main(String[] args) {
		
	while (true)
	{
	option = displayMenu(option);

	if (option == 1) { 
		while (true) {
		System.out.printf("Option %d\n", option);
		displayArrays(flights, flightsPrices, "Flights");
		System.out.println("");
		if (number != -1) 
			break;
		} //this loop repeats until break statement
	}
	else if (option == 2) {
		while (true) {
		System.out.printf("Option %d\n", option);
		displayArrays(hotelStays, hotelStaysPrices, "Hotel Stays");
		System.out.println("");
			if (number != -1)
				break;	
		} //this loop repeats until break statement
	}
	else if (option == 3) {
		System.out.printf("Option %d\n", option);
		displayItineraryArrays(bookings, prices);
		System.out.println("");
	}
	else if (option == 4) {
		System.out.printf("Option %d\n", option);
		double endTotal = getTotal(prices);
		System.out.printf("%-13s %-10.2f \n", "Total + Tax", endTotal);
		System.out.println("Payment accepted...");
		System.out.println("");
	}
	else if (option == 5) {
		System.out.printf("Option %d\n", option);
		clearBookings(bookings);
		clearPrices(prices);
		System.out.println("Canceling bookings");
		System.out.println("");
	}
	else if (option == 9) {
		System.out.println("Bye bye");
		break;
	} //end if and else if
	else {
		System.out.println("Unacceptable option.");
		System.out.println("");
	} //end else
	} //end while
	} //end main
	
public static int displayMenu(int option) {
	
	System.out.println("Welcome to Mustang Tours");
	System.out.println("------------------------");
	System.out.println("Choose from the following menu options:");
	System.out.println("1) Browse Flights and add booking to itinerary");
	System.out.println("2) Browse Hotel Stays and add booking to itinerary");
	System.out.println("3) View Itinerary");
	System.out.println("4) Display total and pay");
	System.out.println("5) Cancel bookings");
	System.out.println("9) Exit window");
	System.out.print("Enter Option : ");
	option = input.nextInt();
	return option;
} //end displayMenu

public static void displayArrays(String [] descriptionArray, double[] pricesArray, String name) {
	System.out.printf("%-10s %-12s %15s\n", "Number", name, "Prices");
	System.out.println("---------------------------------------");
		for(int i=0; i <=2; i++) {
			System.out.printf("%-10s %-12s %9s%.2f\n", i+1, descriptionArray[i], "$", pricesArray[i]);
			} //end for, prints all display options by passing in different variables
	System.out.println("---------------------------------------");
	getNumber();
} //end method

public static int getNumber() {
	System.out.println("Enter a number from the list above or -1 if you want to redisplay the optiopns menu: \n");
	int number = input.nextInt();
	
	if (option == 1) {
	if (number == 1 ) {
		bookings[0] = flights[0];
		prices[0] = flightsPrices[0];
	}
	else if (number == 2 ) {
		bookings[0] = flights[1];
		prices[0] = flightsPrices[1];
	}
	else if (number == 3) {
		bookings[0] = flights[2];
		prices[0] = flightsPrices[2];
	}
	} //close option 1
	
	if (option == 2) {
	if (number == 1 ) {
		bookings[1] = hotelStays[1];
		prices[1] = hotelStaysPrices[1];
	}
	else if (number == 2 ) {
		bookings[1] = hotelStays[2];
		prices[1] = hotelStaysPrices[2];
	}
	else if (number == 3) {
		bookings[1] = hotelStays[2];
		prices[1] = hotelStaysPrices[2];
	} //end else if
	} //end if, option 2 choices
	return number;
} //end method

public static void displayItineraryArrays(String[] bookings, double[] prices) {
	
	
	if (bookings[0] == null && bookings[1] == null & prices[0] == 0 && prices[1] == 0){
		System.out.println("");
		System.out.println("Your intinerary is empty");
	} //end if	
	else {
		System.out.println("");
		System.out.printf("%-13s  %7s \n", "Bookings", "Prices");
		System.out.println("----------------------");
		System.out.printf("%-13s %2s%.2f \n", bookings[0], "$", prices[0]);
		System.out.printf("%-13s %2s%.2f \n", bookings[1], "$", prices[1]);
		System.out.println("----------------------");
		double endTotal = getTotal(prices);
		System.out.printf("%-13s %1s%.2f \n", "Total + Tax", "$", endTotal);
	} //end else
} //end method

public static double getTotal(double prices[]) {
	//math for total and taxes
	double total = prices[0] + prices[1];
	double tax = (total * .0825);
	double totalTotal = total + tax;
	return totalTotal;
//returns total price to where called
} //end method

public static void clearBookings(String bookings[]) {
	for (int b = 0; b <= 1; b++) {		
	bookings[b] = null;
	} //end for
//clearing values for bookings to null
} //end method

public static void clearPrices(double prices[]) {
	for (int p = 0; p <= 1; p++) {
		prices[p] = 0;
	} //end for
//clearing price values to 0
} //end method
} //end class
