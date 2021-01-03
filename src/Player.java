public class Player {
	private Card[] OnHand = new Card[5];
	private int sum = 0;
	private int currentCard = 0;
	public Player(DeckOfCards myDeckOfCards) {
		for(int i = 0; i < 5; i++) {
			OnHand[i] = myDeckOfCards.dealCard();
			sum += myDeckOfCards.getIndexOfCardFace(OnHand[i]);
		}
	}
	
	public int getsum() {
		return sum;
	}
	
	public Card getOnHand(){
		return OnHand[currentCard++];
	}
}