//Mitchell Morrison Lab 8 N12 #47634734

import java.util.ArrayList;
import java.util.Scanner;
public class Banker {

	protected int offer;
	
	public Banker() {
		offer = 0;
	
	}
	
	public int getOffer() {
		return offer;
	}
	
	public void setOffer(int returnAmount) {
		offer = returnAmount;
	}
	
	public String makeOffer(ArrayList<Case> cases) {
		
		
				int total = 0;
				int caseCount = 0;		
		for (int x = 0; x < 24; x++) {
			//if (cases.get(x).isEliminated() == false || cases.get(x).isSelected() == true) {
				if(!cases.get(x).isEliminated()) {
					total = total + cases.get(x).getAmount();
					caseCount = caseCount + 1;
					} 
				}
		//System.out.println("total: " + total + "case: " + caseCount);
		offer = calculateOffer(total, caseCount);
		
		
		String offering = String.format("The banker offers $%,d for your case - \n. Do you accept?", offer); //should display returned offer amount to main

		return offering;
	}
	
	public int offerValue(ArrayList<Case> cases) {
		
		
			int total = 0;
			int caseCount = 0;		
		for (int x = 0; x < 24; x++) {
			//if (cases.get(x).isEliminated() == false || cases.get(x).isSelected() == true) {
			if(!cases.get(x).isEliminated()) {
				total = total + cases.get(x).getAmount();
				caseCount = caseCount + 1;
				} 
			}
			//System.out.println("total: " + total + "case: " + caseCount);
			offer = calculateOffer(total, caseCount);


return offer;
}
	
	public int calculateOffer(int total, int caseCount) {
		
		int endTotal = total;
		int s = caseCount;
		
		
		
		return endTotal / s; 
	}
	
}

