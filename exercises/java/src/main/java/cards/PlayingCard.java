package cards;

public class PlayingCard {
    private Suit suit;
    private int faceValue;


    public PlayingCard(int suit, int faceValue) {
        if (suit == 0) {
            this.suit = new Suit("clubs");
        } else if (suit == 1) {
            this.suit = new Suit("diamonds");
        } else if (suit == 2) {
            this.suit = new Suit("hearts");
        } else {
            this.suit = new Suit("spades");
        }

        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public Suit getSuit() {
        return this.suit;
    }

}
