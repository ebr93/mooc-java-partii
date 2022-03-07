
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    // returns a list of only positive numbers
    // first we filter numbers that are greater than 1, second we add them to a a List
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
    }
}
