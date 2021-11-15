package cards;

public class PlayingCard {
    private int suit;
    private int faceValue;

    public PlayingCard(int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public int getSuit() {
        return this.suit;
    }
}
