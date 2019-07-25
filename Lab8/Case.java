//Mitchell Morrison Lab 8 N12 #47634734

public class Case {
	
	protected int caseNumber;
	protected int amount;
	protected boolean isEliminated;
	protected boolean isSelected;
	
	//this is the constructor of Case
	public Case(int caseNum, int amt) //passing parameters here
	{ 
		caseNumber = caseNum;
		amount = amt;
		isEliminated = false;
		isSelected = false;
	}

	public int getCaseNumber() {
		return caseNumber;
	}
	
	public void setCaseNumber(int x) //changing name of variable here to avoid confusion
	{
		caseNumber = x;
	}
	
	public int getAmount() {
		
		return amount;
	}
	
	public void setAmount(int y) //changing name of variable here to avoid confusion
	{
		amount = y;
	}
	
	public void eliminate() {
		isEliminated = true; //isEliminated was initial false, we are changing it to true here
	}
	
	public boolean isEliminated()
	{
		return isEliminated;
	}
	
	//same changes as above
	public void select() {
		isSelected = true;
	}
	
	public boolean isSelected() {
		return isSelected;
	}
	
	public String toString() {
		String s = String.format("Case Number %-2d: $%,d",(caseNumber + 1), amount);
   		return s;
	}
	
	public int getFinalAmount() {
		return amount;
	}
}

