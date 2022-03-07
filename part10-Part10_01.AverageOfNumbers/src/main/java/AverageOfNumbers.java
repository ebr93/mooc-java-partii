
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // Write your program here
        
        System.out.println("Input numbers, type end to stop.");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(input));
        }

        double average = numbers.stream().mapToInt(i -> i).average().getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
