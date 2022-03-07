

public class Checker {

    public boolean isDayOfWeek(String string) {
        // only the strings between the lines are allowed as correct
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        } else  {
            System.out.println("The form is incorrect.");
            return false;
        }
    }

    public boolean allVowels(String string) {
        // only allows vowels to be typed in, if a consonant is typed then it is false
        // [a-e] makes it so that abcde are all allowed in
        if (string.matches("(a|e|i|o|u){1,}")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }

    // checks if it matches military time
    public boolean timeOfDay(String string) {
        // confirms military time between 20+ hours
        if (string.matches("[0-2][0-3]:[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("The form is correct.");
            return true;
        // confirms military time from 0 to 19 hours
        } else if (string.matches("[0-1][0-9]:[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("The form is correct.");
            return true;
        }else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
}
