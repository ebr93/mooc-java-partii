public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    // Constructor with 3 instance variables
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // returns the price of an Item
    public int price() {
        return unitPrice * qty;
    }

    // increase quantity of item by 1
    public void increaseQuantity() {
        this.qty += 1;
    }

    // Strings Item
    public String toString() {
        return product + ": " + qty;
    }
}
