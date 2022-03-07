import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // test your code here

        /*
        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));
        
        BySuitInValueOrder valueOrder = new BySuitInValueOrder();
        Collections.sort(cards, valueOrder);
        
        cards.stream().forEach(c -> System.out.println(c));
        */

        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));
        
        hand.sortBySuit();
        
        hand.print();
        
    }
}
