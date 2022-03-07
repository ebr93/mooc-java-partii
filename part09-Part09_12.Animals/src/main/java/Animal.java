public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // prints Animal eats 
    public void eat() {
        System.out.println(this.name + " eats");
    }

    // prints Animal sleeps
    public void sleep() {
        System.out.println(this.name + " sleeps");
    }

    // returns string of name
    public String getName() {
        return this.name;
    }
}