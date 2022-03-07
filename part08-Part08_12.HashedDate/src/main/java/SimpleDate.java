
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    //hash code gives a class an int value to return to see if they are equal... when we use a class as a key for a HASHMAP
    //had to make them multiply so multiple days or years spread out would return the same value
    public int hashCode() {
        if (this.year >= 1900 && this.year < 2000) {
            return (this.day * this.month * this.year);

        }

        if (this.year >= 2000 && this.year <= 2100) {
            return this.day * this.month * this.year;

        }

        return  this.year;
    }

}
