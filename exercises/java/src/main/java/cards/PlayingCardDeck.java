package cards;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class PlayingCardDeck extends Deck {

//    private List<PlayingCard> playingCards;
//
//    PlayingCardDeck() {
//        playingCards = new ArrayList<>();
//        for (Suit suit : Suit.values()) {
//            playingCards.add(new PlayingCard(suit));
//        }
//    }

    private PlayingCard[] cards = new PlayingCard[52];

    public PlayingCardDeck() {
        for (Suit suit:Suit.values()) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards[suit.ordinal()*13 + faceValue] = new PlayingCard(suit, faceValue);
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(Arrays.asList(cards));
    }

    public String[] getCards() {
        String[] result = new String[cards.length];
        int cardNumber = 0;
        for (PlayingCard card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    @Override
    public Card deal() {
        Card cardToReturn = cards[0];
        cards = Arrays.copyOfRange(cards,1,cards.length);
        return cardToReturn;
    }

    public static void main(String[] args) {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        String[] deckInOrder = playingCardDeck.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }
}