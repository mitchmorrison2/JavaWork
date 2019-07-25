//Mitchell Morrison Lab 6 N12 #47634734

import java.util.Random;
import java.util.Arrays;

public class Board {

//here you are creating instance of Case by calling the constructor
//instance is cases
	private Case[] cases = new Case[24];

	public Board() {
		//I changed cases to caseValues
		int[] caseValues = { 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 1000, 
			5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000 };
		for (int x = 0; x < 24; x++) { 
			cases[x] = new Case(x+1, caseValues[x]);
			}
		
		shuffleCases(); //call shuffle method
   } //end board

	public Case[] getCases() {
		return cases;
	}
	
	public void shuffleCases() {
		Random rand = new Random();
		for(int y = 0; y < 100; y++) {	
			for (int x = 0; x <= 23; x++) {
				int ran = rand.nextInt(24);
				int variable1 = cases[x].getAmount();
				//int variable1 = cases[x]; 
				int variable2 = cases[ran].getAmount();  
				//int variable2 = cases[ran];
				cases[x].setAmount(variable2);
				//cases[x] = variable2;
				cases[ran].setAmount(variable1);
				//cases[ran] = variable1;
			}
		}
	}

	public Case getCase(int num)
	{
		Case theCase = cases[num - 1];
 		return theCase;
	}

	public Case selectCase(int num)
	{
 		Case theCase = cases[num - 1];
 		theCase.select();
 		return theCase;
	}

	public Case eliminateCase(int num)
	{
 		Case theCase = cases[num - 1];
 		theCase.eliminate();
 		return theCase;
	} 
	
	public void showRemainingCases() {
	
	/*write an algorithm for this and use isEliminated, getAmount methods
	lets say I have a new array called remainingValues
	
	(your loop)
	you have to check if the case was selected/eliminated before
	and if it was then remainingValues[x] = -1

	to check the case was eliminated you have to use isEliminated method
	e.g. cases[x].isEliminated()

	if the case was not eliminated then store the value in remainingValues:
	remainingValues[x] = cases[x].getAmount()

	*/	
		//format the cases display to be a table that repeats and gets rid of the picked case every time

		System.out.println("\nAvailable Cases:");
		System.out.println("----------------\n");
				int z = 0;
				for (int y = 0; y < 24; y ++) {
					
					
					//isEliminated returns true/false, it doesn't change the value of cases[y]
					// here you can change your code as:
					// if (cases[y].isEliminated() || cases[y].isSelected())
					// 	System.out.printf("          ");
					// else
					// 	---your logic--
					
					if (cases[y].isEliminated() == true || cases[y].isSelected()) {
						System.out.printf("         ");
					}
					else if (cases[y].isEliminated() == false) {
						if (y < 9)
							System.out.printf("[Case  %d]", y+1);
						else
							System.out.printf("[Case %d]", y+1);
					}
					z++;
					if (z == 6)
						System.out.println("");
					else if (z == 12)
						System.out.println("");
					else if (z == 18)
						System.out.println("");
				}
					System.out.println("\n"); //clean up
				}

			
	
	public void showRemainingValues() {
		
		int[] showRemaining = new int [24];
	//I want to add in the value of selectedCase to the total later for an accurate average
		int y = 0;
	 //taking the case they initially picked to add into the showRemainingValues display
		 for (int x = 0; x < 24; x++) {
			 boolean elim2 = cases[x].isEliminated();
			 boolean elim3 = cases[x].isSelected();
			if (elim2 == false || elim3 == true) {
				
				showRemaining[x] = cases[x].getAmount();
			}
			else if (elim2 == true) {
				showRemaining[x] = -1;
			}
		 }
		 Arrays.sort(showRemaining);
		for (int z = 0; z < 24; z++) {
			if (showRemaining[z] > 0) {
			System.out.printf(" $%,9d  ", showRemaining[z]);
			y++;
			if (y == 5) {
				System.out.println();
			}
			else if (y == 10) {
				System.out.println();
			}
			else if (y == 15) {
				System.out.println();
			}
			else if (y == 20) {
				System.out.println();
			}
			else if (y == 25) {
				System.out.println();
			} }
		 } //end for loop	
		System.out.println();
	} //end method
} //end class


