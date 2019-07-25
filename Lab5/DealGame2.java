//Mitchell Morrison #47634734 N12 Lab 5
//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DealGame2 {
	static int[] cases = { 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000 };
	static int selectedCaseValue; 
	static boolean[] selections = new boolean[24]; //defaults to false
	
	public static void main(String[] args) {
		shuffleCases();
	Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Deal or no Deal!");
		System.out.print("Please select your case (1-24): ");
		int caseHeld = input.nextInt();
		System.out.printf("\nYou have selected case %d and it's time to eliminate cases. \n", caseHeld);
		caseHeld = caseHeld - 1; //caseHeld is specific to the first case
			selectedCaseValue = cases[caseHeld];
			selectedCaseValue = selectedCaseValue * -1;	
		selections[caseHeld] = true;
		cases[caseHeld] = selectedCaseValue;
			for (int x = 0; x < 24; x++) {
				displayCases();
				System.out.println("Please select a case to eliminate:  ");
				int casePicked = input.nextInt();
					casePicked = casePicked - 1; //casePicked is specific to the other cases picked
				System.out.printf("\nCase %d contained $%d\n", casePicked + 1, cases[casePicked]);
				cases[casePicked] = cases[casePicked] * -1;
					selections[casePicked] = true;
				int theOffer = getOffer(); //catches the value returned by method
				System.out.printf("The banker offers $%,d for your case - ", theOffer); //should display returned offer amount to main
				System.out.println("(D)eal or (N)o deal?  ");
				input.nextLine();
						if (input.nextLine().equals("D")) {
							System.out.printf("Congrats on taking the $%,d offer!\n", theOffer);
								if ((selectedCaseValue * -1) > theOffer) {
									System.out.printf("Not a great deal. Your case had $%,d\n", selectedCaseValue * -1);
									break;
								} //end if
								else {
									System.out.printf("Great job. Your case had $%,d", selectedCaseValue * -1);
									break;
								} //end else
						} //end if
			} //end for
	} //end method
	
	public static void displayCases() {
		//format the cases display to be a table that repeats and gets rid of the picked case every time
		System.out.println("Available Cases:");
		System.out.println("----------------\n");
	int y = 0; //counter variable for line feed
	for (int x = 0; x < 24; x++) {
		//4 rows of cases 6 columns
		if (cases[x] < 0) {
			System.out.printf("          ");
		}
		else if (cases[x] > 0) {
		if (x < 9) {
			System.out.printf("[Case  %d] ", x+1); }
		else
			System.out.printf("[Case %d] ", x+1);
		}
		
		y++; //new line counter
		if (y == 6)
			System.out.println("");
		else if (y == 12)
			System.out.println("");
		else if (y == 18)
			System.out.println("");
	}
	System.out.println("\n"); //clean up
}
	
	public static void shuffleCases() {
		Random rand = new Random();
	for(int y = 0; y < 100; y++) {	
		for (int x = 0; x <= 23; x++) {
			int ran = rand.nextInt(24);
			int variable1 = cases[x];   
			int variable2 = cases[ran];
			cases[x] = variable2;
			cases[ran] = variable1;
		
		} //end for
	} //end for
	} //end method
	
	public static int getOffer() {
		int z = 0;
		int offerAmount = 0;
		for (int x = 0; x <= 23; x++) {
			if (selections[x] == false) {
				offerAmount = offerAmount + cases[x];
				z++; //counts number of times selections[x] = false
			} //end if
		} //end for
		offerAmount = offerAmount - selectedCaseValue; //actually adds because it's negative
		offerAmount = offerAmount / (z + 1); //divide by counter plus 1 for selectedCaseValue
		return offerAmount;
	} //end method
	
} //end class
