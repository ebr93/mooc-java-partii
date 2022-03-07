
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    // compares the wages of humans
    // allows for sorting of humans from largest to smallest wage
    
    @Override
    public int compareTo(Human human) {
        // return human.getWage() - this.wage;
        if (this.wage == human.getWage()) {
            return 0;
        } else if (this.wage > human.getWage()) {
            return -1;
        } else {
            return 1;
        }
    }
}
