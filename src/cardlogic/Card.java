package cardlogic;

public class Card {
	
	enum SUITS{
		SPADES,
		CLOVERS,
		HEARTS,
		DIAMONDS
	}
	
	private SUITS suit;
	private int value;
	
	/*
	 * J = 11
	 * Q = 12
	 * K = 13
	 */
	
	public Card(int suit, int value) {
		if(suit == 0) {
			this.setSuit(SUITS.SPADES);
		} else if (suit ==1){
			this.setSuit(SUITS.CLOVERS);
		} else if (suit == 2) {
			this.setSuit(SUITS.HEARTS);
		} else if (suit == 3) {
			this.setSuit(SUITS.DIAMONDS);
		}
		
		this.setValue(value);
	}

	public SUITS getSuit() {
		return suit;
	}

	public void setSuit(SUITS suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getGinRummyValue() {
		if (this.value>10) {
			return 10;
		} else {
			return this.value;
		}
	}
	
	
}
