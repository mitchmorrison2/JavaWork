//Mitchell Morrison Lab 6 N12 #47634734

import java.util.Scanner;
public class Banker {

	private int offer;
	
	public Banker() {
		offer = 0;
	
	}
	
	public int getOffer() {
		return offer;
	}
	
	public void setOffer(int returnAmount) {
		offer = returnAmount;
	}
	
	public boolean makeOffer(Case[] cases) {
		int s = 0;
		int total = 0;
		
		//int selectedCase = selectCase()
		for (int x = 0; x < 24; x++) {
			if (cases[x].isEliminated() == false || cases[x].isSelected() == true) {
				
				total += cases[x].getAmount();
				s++;
			} 
		}
		offer = total / s; 
		
		
		System.out.printf("The banker offers $%,d for your case - \n", offer); //should display returned offer amount to main
		System.out.println("(D)eal or (N)o deal?  ");
		Scanner input = new Scanner(System.in);
		String DorN = input.nextLine();
		
		boolean takeIt = false;
				if (DorN.equalsIgnoreCase("D")) {
						takeIt = true;
				} //end if
				else {
						takeIt = false;
				}
		
		return takeIt;
	}
	
}

