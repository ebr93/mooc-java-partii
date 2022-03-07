import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> items;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.items = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    // adds Products name, price, and stock
    public void addProduct(String product, int price, int stock) {
        this.items.put(product, price);
        this.stocks.put(product, stock);
    }
    
    // returns the price of an item or default -99
    public int price(String product) {
        return this.items.getOrDefault(product, -99);
    }

    // returns the stock of an item or default 0
    public int stock(String product) {
        return this.stocks.getOrDefault(product, 0);
    }

    // takes away 1 from stock to return true, else it's false
    public boolean take(String product) {
        if (this.stocks.get(product) == null) {
            return false;
        }
        stock(product);
        if (this.stocks.get(product) == 0) {
            return false;
        }

        int take = this.stock(product) - 1;
        this.stocks.put(product, take);
        return true;
    }

    // gives all prodcuts in Warehouse
    public Set<String> products() {
        // IT TURNS OUT I DID NOT NEED THIS FIRST LINE
        // JUST: this.items.keySet();
        Set<String> productsList = this.items.keySet();
        return productsList;
    }
}