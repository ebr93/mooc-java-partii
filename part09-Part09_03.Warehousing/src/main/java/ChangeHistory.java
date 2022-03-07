import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> log;

    public ChangeHistory() {
        this.log = new ArrayList<>();
    }

    // adds a variable to the list
    public void add(double status) {
        this.log.add(status);
    }

    // empties the array
    public void clear() {
        this.log.clear();
    }

    @Override
    public String toString() {
        return this.log.toString();
    }

    // returns biggest value in history
    public double maxValue() {
        if (this.log.isEmpty()) {
            return 0.0;
        }

        Double max = this.log.get(0);
        for (Double iteration : this.log) {
            if (iteration > max) {
                max = iteration;
            }
        }
        return max;
    }

    // returns smallest value in history
    public double minValue() {
        if (this.log.isEmpty()) {
            return 0.0;
        }

        double min = this.log.get(0);
        for (double iteration : this.log) {
            if (iteration < min) {
                min = iteration;
            }
        }
        return min;
    }

    public double average() {
        if (this.log.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double iteration : this.log) {
            sum += iteration;
        }
        return sum / this.log.size();
    }
}
