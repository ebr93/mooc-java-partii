import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cardsList;

    public Hand() {
        this.cardsList = new ArrayList<>();
    }

    public void add(Card card) {
        this.cardsList.add(card);
    }

    // prints each of the cards on the list
    public void print() {
        cardsList.forEach(card -> System.out.println(card));
    }
    
    // organizes the list from smallest to largest
    // CHANGES THE LIST
    // it is needed to use Collections in order make a change using stream
    public void sort() {
        Collections.sort(this.cardsList);
    }

    public List<Card> getHand() {
        return this.cardsList;
    }

    @Override
    public int compareTo(Hand o) {
        // TODO Auto-generated method stub
        int hand = 0;
        int otherHand = 0;

        // adds the values of
        hand = this.cardsList.stream().map(card -> card.getValue()).mapToInt(value -> value).sum();
        otherHand = o.getHand().stream().map(card  -> card.getValue()).mapToInt(value -> value).sum();
        return hand - otherHand;
    }

    public void sortBySuit() {
        BySuitInValueOrder inValueOrder = new BySuitInValueOrder();
        Collections.sort(this.cardsList, inValueOrder);     // Collections, sorts the list and comparator included
    }
}
