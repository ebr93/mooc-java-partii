import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    // adds an Item to the shopping cart
    public void add(String product, int price) {
        // if product already exists then we increase quantity
        if (this.shoppingCart.keySet().contains(product)) {
            increaseQuantity(product);
            return;
        }
        Item cartItem = new Item(product, 1, price);
        this.shoppingCart.put(product, cartItem);
    }

    // returns price of all Items in shopping cart
    public int price() {
        int sum = 0;
        for (Item items : this.shoppingCart.values()) {
            sum += items.price();
        }
        return sum;
    }

    // prints all Items in cart and their quantity
    public void print() {
        for (Item items : this.shoppingCart.values()) {
            System.out.println(items.toString());
        } 
    }

    // increases quantity of Item by one
    public void increaseQuantity(String product) {
        Item item = this.shoppingCart.get(product);
        item.increaseQuantity();
    }
}
