public class Organism implements Movable {
    private int x;
    private int y;

    // constructor that requires two ints
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // moves the organism on its x and y axis
    @Override
    public void move(int dx, int dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    // strings the organism location
    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }

}
