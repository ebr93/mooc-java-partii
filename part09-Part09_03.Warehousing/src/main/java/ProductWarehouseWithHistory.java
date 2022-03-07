public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);           // implements constructor of superclass, ***(balance) from Warehouse is protected
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);         //  had to set the (initialBalance) to modify the (balance) in superclass (Warehouse)     
        //  *** Had to remove 1st instance of (this.history.add(initialBalance)) ***
    }

    // returns history in string form
    public String history() {
        return this.history.toString();
    }

    // adds ammount to balance and records new balance in history
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    // removes ammount from balance and records new balance in history
    @Override
    public double takeFromWarehouse(double amount) {
        double take = super.takeFromWarehouse(amount);
        this.history.add(getBalance());
        return take;
    }

    // prints all facts of product and history
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
