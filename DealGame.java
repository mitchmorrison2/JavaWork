//Mitchell Morrison Lab 6 N12 #47634734

import java.util.Scanner;

public class DealGame {

	private Banker theBanker;
	private Board theBoard;
	
	public DealGame() {
		theBanker = new Banker();
		theBoard = new Board();
	}
	
	public void Play() {
	 
		System.out.println("Welcome to Deal or no Deal!");
		System.out.print("Please select your case (1-24): ");
		Scanner input = new Scanner(System.in);
		int selectedCase = input.nextInt();
		Case ourCase = theBoard.getCase(selectedCase);
		int selectedCaseValue = ourCase.getAmount();
		ourCase.select();
		//Case tempSelectedCase = theBoard.selectCase(selectedCase);
		//boolean tempSelectedBoolean = tempSelectedCase.isSelected();
		
		System.out.printf("\nYou have selected case %d and it's time to eliminate cases. \n", selectedCase);
		
		for (int x = 0; x < 24; x++) {
		theBoard.showRemainingValues();
		theBoard.showRemainingCases();
		while (true) {
			System.out.println("Please select a case to eliminate:  ");
			int caseElim = input.nextInt();
				Case elimCase = theBoard.getCase(caseElim);
				boolean casePicked = elimCase.isEliminated();
				
			if (casePicked == true) {
				System.out.println("That case was already selected");
				//restart while loop
				} //end if
			else  {
				int t = elimCase.getAmount();
				System.out.printf("Case %d held $%,d\n\n", caseElim, t );
				theBoard.eliminateCase(caseElim);
				break;
				} //end else if
		}
		boolean decision = theBanker.makeOffer(theBoard.getCases());
		int offer = theBanker.getOffer();
		if (decision == true) {
			System.out.printf("Congrats on taking the $%,d offer!\n", offer); //how do I import the final offer from the banker to this method?
			if (offer < ourCase.getAmount()) {
				System.out.printf("Not a great deal. Your case had $%,d", selectedCaseValue);
				break;
			} //end if
			else {
				System.out.printf("Nice job! Your case had $%,d.\n", selectedCaseValue);
				break;
			}
			
			
		} //end if
				
		} //end while
		
		
		} //end for
	} //end play
//end class
