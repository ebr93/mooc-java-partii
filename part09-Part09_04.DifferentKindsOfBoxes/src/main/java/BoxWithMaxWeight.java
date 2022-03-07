import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> list;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    } 

    // adds item only addition would not go over capacity
    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for (Item i : this.list) {
            totalWeight += i.getWeight();
        }
        if (totalWeight + item.getWeight() <= this.capacity) {
            this.list.add(item);
        }
    }

    // checks if item is in ArrayList
    @Override
    public boolean isInBox(Item item) {
        return this.list.contains(item);
    }

}
