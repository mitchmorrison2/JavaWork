//Mitchell Morrison Lab 7 N12 #47634734

//Mitchell Morrison Lab 8 N12 #47634734
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DealGame {

	protected static Banker theBanker;
	protected static Board theBoard;
	
	public DealGame() {
		theBoard = new Board();
		createBanker();
	}
	
	public void createBanker() {
		theBanker = new Banker();
	}
	
//	public void Play() {
//	 
//		System.out.println("Welcome to Deal or no Deal!");
//		System.out.print("Please select your case (1-24): ");
//		Scanner input = new Scanner(System.in);
//		int selectedCase = input.nextInt();
//		Case ourCase = theBoard.getCase(selectedCase);
//		ourCase.select();
//		
//		System.out.printf("\nYou have selected case %d and it's time to eliminate cases. \n", selectedCase);
//		
//		for (int x = 0; x < 24; x++) {
//		System.out.println(showRemainingValues());
//		System.out.println(showRemainingCases());
//		
//		boolean repeat = true;
//		while (repeat) {
//			System.out.println("Please select a case to eliminate:  ");
//			int caseElim = input.nextInt();
//			Case eliminatedCase = theBoard.getCase(caseElim);
//			//boolean casePicked = eliminatedCase.isEliminated();
//				
//			if (eliminatedCase.isEliminated() || eliminatedCase.isSelected()) {
//				System.out.println("That case was already selected");
//				//restart while loop
//				} //end if
//			else  {
//				repeat = false;
//				Case c = theBoard.eliminateCase(caseElim);
//				int s = c.getAmount(); 
//				System.out.printf("Case %d held $%,d\n\n", caseElim, s );
//			}
//	}
//
//		boolean decision = theBanker.makeOffer(theBoard.getCases());
//		int offer = theBanker.getOffer();
//		if (decision == true) {
//			System.out.printf("Congrats on taking the $%,d offer!\n", offer); //how do I import the final offer from the banker to this method?
//			if (offer < ourCase.getFinalAmount()) {
//			//	int finalAmt = ourCase.getFinalAmount();
//				System.out.printf("Not a great deal. Your case had $%,d", ourCase.getFinalAmount());
//				printCertificate(theBanker.getOffer());
//				break;
//			} //end if
//			else {
//				System.out.printf("Nice job! Your case had $%,d.\n", ourCase.getFinalAmount());
//				printCertificate(theBanker.getOffer());
//				break;
//			}
//			
//			
//			
//		} //end if
//				
//		} //end for
//		
//		
//		} //end play

	
	public void printCertificate(int offer) {
		offer = theBanker.getOffer();
		
		try {
			
		PrintWriter off = new PrintWriter("Voucher.txt");
		off.printf("**********************************\n");
		off.printf("%15s\n", "Voucher");
		off.printf("This voucher is good for %,d\n" , offer);
		off.printf("**********************************\n");
		off.close();
		}
		
		catch (Exception e) {
			System.out.println("Not being done properly");	
		}
	}
	
	//add the following methods to DealGame.java
		public Case selectCase(int caseNumber) {
			return theBoard.selectCase(caseNumber);
			}
		
		public String showRemainingValues() { //was return type string
			return theBoard.showRemainingValues();
			}
		
		public String showRemainingCases() { //was return type string
			return theBoard.showRemainingCases();
			}
		
		public Case getCase(int caseNumber) {
			return theBoard.getCase(caseNumber);
			}
		
		public Case eliminateCase(int caseNumber) {
			return theBoard.eliminateCase(caseNumber);
			}
		
		public String makeOffer(ArrayList<Case> cases) {
			return theBanker.makeOffer(cases);
			}
		
		public int offerValue(ArrayList<Case> cases) {
			return theBanker.offerValue(cases);
			}
	
		public ArrayList<Case> getCases() { 
			return theBoard.getCases(); 
			}
		
		public static String getWelcomeMessage() {
			return "\nWelcome to Deal or No Deal! Type your case choice in the location above.\n";
			}
	
	} //end class




