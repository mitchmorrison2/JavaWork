//Mitchell Morrison Lab 8 N12 #47634734

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;
import java.io.File;
import java.util.Scanner;

public class Board {

	protected ArrayList<Case> cases = new ArrayList <Case>();

	public Board() {
		ArrayList<Integer> values = fetchCaseValuesFromFile();
		
//		int[] caseValues = { 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 1000, 
//			5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000 };
//		for (int x = 0; x < 24; x++) { 
//			cases.add(x+1, caseValues[x]);
//			}
		for (int x = 0; x < values.size(); x++) {
		
			if (x%2 == 0) {
				cases.add(new Case(x, values.get(x)));
				}
				
			else { 
				cases.add(new CrazyCase(x, values.get(x)));
//				cases.add(new Case(x, values.get(x)));
				}
			}
		
		shuffleCases(); //call shuffle method
   } //end board

	public ArrayList<Case> getCases() {
		return cases;
	}
	
	public void shuffleCases() {
		Random rand = new Random();
		for(int y = 0; y < 100; y++) {	
			for (int x = 0; x <= 23; x++) {
				int ran = rand.nextInt(24);
				int variable1 = cases.get(x).getAmount();
				int variable2 = cases.get(ran).getAmount();  
				cases.get(x).setAmount(variable2);
				cases.get(ran).setAmount(variable1);
			}
		}
	}

	public Case getCase(int num)
	{
		Case theCase = cases.get(num - 1);
 		return theCase;
	}

	public Case selectCase(int num)
	{
 		Case theCase = cases.get(num - 1);
 		theCase.select();
 		return theCase;
	}

	public Case eliminateCase(int num)
	{
 		Case theCase = cases.get(num - 1);
 		theCase.eliminate();
 		return theCase;
	} 
	
//	public void showRemainingCases() {
//	
//	/*write an algorithm for this and use isEliminated, getAmount methods
//	lets say I have a new array called remainingValues
//	
//	(your loop)
//	you have to check if the case was selected/eliminated before
//	and if it was then remainingValues[x] = -1
//
//	to check the case was eliminated you have to use isEliminated method
//	e.g. cases[x].isEliminated()
//
//	if the case was not eliminated then store the value in remainingValues:
//	remainingValues[x] = cases[x].getAmount()
//
//	*/	
//		//format the cases display to be a table that repeats and gets rid of the picked case every time
//
//		System.out.println("\nAvailable Cases:");
//		System.out.println("----------------\n");
//				int z = 0;
//				for (int y = 0; y < 24; y ++) {
//					
//					
//					//isEliminated returns true/false, it doesn't change the value of cases[y]
//					// here you can change your code as:
//					// if (cases[y].isEliminated() || cases[y].isSelected())
//					// 	System.out.printf("          ");
//					// else
//					// 	---your logic--
//					
//
//					
//					if (cases.get(y).isEliminated() || cases.get(y).isSelected()) {
//						System.out.printf("         ");
//					}
//					else {
//						if (y < 9)
//							System.out.printf("[Case  %d]", y+1);
//						else
//							System.out.printf("[Case %d]", y+1);
//					}
//					z++;
//					if (z == 6)
//						System.out.println("");
//					else if (z == 12)
//						System.out.println("");
//					else if (z == 18)
//						System.out.println("");
//				}
//					System.out.println("\n"); //clean up
//				}
//
//			
	
//	public void showRemainingValues() {
//		
//		ArrayList <Integer> showRemaining = new ArrayList <Integer>();
//	//I want to add in the value of selectedCase to the total later for an accurate average
//		int y = 0;
//	 //taking the case they initially picked to add into the showRemainingValues display
//		 for (int x = 0; x < 24; x++) {
//			 boolean elim2 = cases.get(x).isEliminated();
//			 //boolean elim3 = cases.get(x).isSelected();
//			 //int show = cases.get(x).getFinalAmount();
//			if (elim2 == false) {
//				
//				showRemaining.add(cases.get(x).getAmount());
//			}
//			else if (elim2 == true) {
//				showRemaining.add(-1);
//			}
//		 }
//		 Collections.sort(showRemaining);
//		for (int z = 0; z < 24; z++) {
//			if (showRemaining.get(z) > 0) {
//			System.out.printf(" $%,9d  ", showRemaining.get(z));
//			y++;
//			if (y == 5) {
//				System.out.println();
//			}
//			else if (y == 10) {
//				System.out.println();
//			}
//			else if (y == 15) {
//				System.out.println();
//			}
//			else if (y == 20) {
//				System.out.println();
//			}
//			else if (y == 25) {
//				System.out.println();
//			} }
//		 } //end for loop	
//		System.out.println();
//	} //end method
	
	//have showRemainingCases() and showRemainingValues() return strings instead in Board.java
			public String showRemainingCases() {
				String returnMe = "";
				returnMe+= "AVAILABLE CASES:\n";
				returnMe+= "----------------\n";
				//String 
				int columnCount = 1;
				for(int i= 0; i< cases.size(); i++){ 
					if(cases.get(i).isEliminated() || cases.get(i).isSelected())
						returnMe+= "          ";
					else returnMe+= String.format("[CASE %2d] ",i+ 1);
					columnCount++;
					if(columnCount== 7) {
						returnMe+= "\n";
						columnCount= 1;
						}
					}//end if 
				return returnMe;
			}//end showRemainingCases
			

			public String showRemainingValues() {
				//create new array to contain remaining values
				//or -1 if already eliminated
				String returnMe= "";
				int[] remainingValues= new int[24];
				for(int i= 0; i< cases.size(); i++) {
					if(cases.get(i).isEliminated())
						remainingValues[i] = -1;
					else remainingValues[i] = cases.get(i).getAmount();
					}
				//end loop
				Arrays.sort(remainingValues);
				returnMe+= "\n";
				int counter = 1;
				for(int i= 0; i< remainingValues.length; i++) {
					int x = remainingValues[i];if(x != -1) {
						returnMe+= String.format("$%,10d ", x);
						counter++;
						}//print a CRLF every five values 
					if(counter == 5) {
						returnMe+= "\n";
						counter = 1;
						}
					}
				return returnMe;
				}//end showRemainingValues
			
	
	private String getCaseValuesFileName() {
		return "casevalues.txt";
		
		
				
	}
	
	private ArrayList<Integer> fetchCaseValuesFromFile() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		try {
		Scanner caseValues = new Scanner(new File(getCaseValuesFileName()));
		while (caseValues.hasNextLine()) {
			values.add(caseValues.nextInt());
			} //end while
		caseValues.close();
//		for (int y = 0; y < values.size(); y++) {
//			System.out.println(values.get(y));
//		}
		} //end try
		catch (Exception e) {
			System.out.println("Not working reading in");
			}
		return values ;
		}//end method
	
} //end class


