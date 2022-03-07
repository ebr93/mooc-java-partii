import java.util.ArrayList;

import javax.naming.spi.InitialContextFactory;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maximumWeight;

    public Box(double maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void add(Packable item){
        if (!(item instanceof Packable)) {
            return;
        }

        if (weight()+ item.weight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
}
