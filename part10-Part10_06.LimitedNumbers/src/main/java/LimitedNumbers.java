
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int positiveNumber = Integer.valueOf(scanner.nextLine());

            if (positiveNumber < 0) {
                break;
            }

            numbers.add(positiveNumber);
        }

        // filters numbers between 1 and 5, then prints each
        numbers.stream().filter(n -> n > 0 && n <= 5).forEach(n -> System.out.println(n));
    }
}
