//Mitchell Morrison #47634734 N12 Lab 5
import java.util.Scanner;

public class DealGame1 {
	static int[] cases = {1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000 };
	static int selectedCaseValue;
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Deal or no Deal!");
		System.out.print("Please select your case (1-24): ");
		int caseHeld = input.nextInt();
		System.out.printf("\nYou have selected case %d and it's time to eliminate cases. \n", caseHeld);
		caseHeld = caseHeld - 1;
			selectedCaseValue = cases[caseHeld];
			selectedCaseValue = selectedCaseValue * -1;
		cases[caseHeld] = selectedCaseValue;
			for (int x = 0; x < 24; x++) {
				displayCases();
				System.out.println("Please select a case to eliminate:  ");
				int casePicked = input.nextInt();
				casePicked = casePicked - 1;
				System.out.printf("\nCase %d contained $%d\n", casePicked + 1, cases[casePicked]);
				cases[casePicked] = cases[casePicked] * -1;
			}
		//prints all final information
	}
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

} //end main
