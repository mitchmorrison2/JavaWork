//Mitchell Morrison Lab 8 N12 #47634734
public class GreedyDealGame extends DealGame {

	
	
	public GreedyDealGame() {
		super();
		createBanker();
	}
	
	public void createBanker() {
		theBanker = new GreedyBanker();
	}
}
