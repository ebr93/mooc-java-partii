import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        checker.isDayOfWeek(string);
        checker.allVowels(string);
        checker.timeOfDay(string);
    }
}
