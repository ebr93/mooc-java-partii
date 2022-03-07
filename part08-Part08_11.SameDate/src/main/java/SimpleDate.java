
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

    @Override
    public boolean equals(Object object) {
        // if the variables are located in the same place, they're the same
        if (this == object) {
            return true;
        }

        //if object is not a SimpleDate variable then it will return false
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        //converting the Object object into a SimpleDate object
        SimpleDate comparedDate = (SimpleDate) object;

        //checks if the variables are equal by checking SimpleDate objects, if so returns true
        if (this.day == comparedDate.day &&
        this.month == comparedDate.month &&
        this.year == comparedDate.year) {
            return true;
        }

        //otherwise they aren't the same and return false
        return false;
    }

    /*
        @Override
    public boolean equals(Object obj) {
        
        if (obj == null) {                              Object is null
            return false;
        }
        if (getClass() != obj.getClass()) {             Objects are not the same class
            return false;
        }
        final SimpleDate other = (SimpleDate) obj;      turns obj into Simple date, then starts comparing the objects
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return true;                                    return true
    }
    */

}
