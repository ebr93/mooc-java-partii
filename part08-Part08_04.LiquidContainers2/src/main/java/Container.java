public class Container {
    private int containerOne;

    public Container() {
        this.containerOne = 0;

    }

    public int contains() {
        return this.containerOne;
    }

    public void add(int number) {
        if (number >= 1) {
            this.containerOne += number;
        }
        if (this.containerOne > 100) {
            this.containerOne = 100;
        }
    } 

    public void remove(int number) {
        if(number >= 1) {
            this.containerOne -= number;
        }
        if (this.containerOne < 0) {
            this.containerOne = 0;
        }
    }

    @Override
    public String toString() {
        return contains() + "/100";
    }
}
