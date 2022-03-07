public class Containers {
    private int containerOne;
    private int containerTwo;

    public Containers() {
        this.containerOne = 0;
        this.containerTwo = 0;
    }

    public void add(int number) {
        if (number >= 1) {
            this.containerOne += number;
        }
        if (this.containerOne > 100) {
            this.containerOne = 100;
        }
    } 

    public void move(int number) {
        if (number >= 1) {
            if (number > this.containerOne) {
                this.containerTwo += this.containerOne;
                this.containerOne = 0;
            } else {
                this.containerTwo += number;
                this.containerOne -= number;
            }
        }

        if (containerTwo > 100) {
            containerTwo = 100;
        }
    }

    public void remove(int number) {
        if(number >= 1) {
            this.containerTwo -= number;
        }
        if(this.containerTwo < 0) {
            this.containerTwo = 0;
        }
    }

    public String toString() {
        String one = "First: " + this.containerOne + "/100";
        String two = "Second: " + this.containerTwo + "/100";

        return one + "\n" + two;
    }
}
