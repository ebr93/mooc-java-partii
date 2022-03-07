public class LiteracyData implements Comparable<LiteracyData> {
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double percentage;

    public LiteracyData(String theme, String ageGroup, String gender, String country, int year, double percentage) {
        this.theme = theme;
        this.ageGroup = ageGroup.trim();
        this.gender = gender.trim();
        this.country = country;
        this.year = year;
        this.percentage = percentage;
    }

    public String gender() {
        String[] part = this.gender.split(" ");
        return part[0];
    }

    public String getTheme() {
        return theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }


    public double getPercentage() {
        return percentage;
    }

    @Override
    public int compareTo(LiteracyData row) {
        if (this.percentage == row.getPercentage()) {
            return 0;
        } else if (this.percentage > row.getPercentage()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + gender() + ", " + percentage;
    }
}
