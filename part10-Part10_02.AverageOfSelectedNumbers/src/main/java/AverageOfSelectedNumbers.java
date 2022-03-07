
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("p")) {
            System.out.println("Average of the positive numbers: " + numbers.stream().filter(i -> i > 0).mapToDouble(i -> i).average().getAsDouble());
        }

        if (input.equals("n")) {
            System.out.println("Average of the negative numbers: " + numbers.stream().filter(i -> i < 0).mapToDouble(i -> i).average().getAsDouble());
        }

    }
}
