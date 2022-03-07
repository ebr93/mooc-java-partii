
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(i -> System.out.println(i));
    }

    // filters the numbers that are divisible by 2, 3 , or 5 and returns them in a new ArrayList
    // could've done without divisibleByNumbers ArrayList
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleByNumbers = numbers.stream().filter(i -> i % 3 == 0 || i % 5 == 0 || i % 2 == 0).collect(Collectors.toCollection(ArrayList::new));

        return divisibleByNumbers;
    }
}
