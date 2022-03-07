import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {  
    public int compare(Card c1, Card c2) {
        // performs same function as SortBySuit class
        int suitValueOrder = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        if (suitValueOrder == 0) {
            return c1.getValue() - c2.getValue();
        }
        return suitValueOrder;
    }
}
