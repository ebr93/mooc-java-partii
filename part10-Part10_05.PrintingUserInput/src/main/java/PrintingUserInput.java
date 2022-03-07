
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            String word = scanner.nextLine();

            if (word.equals("")) {
                break;
            }
            words.add(word);
        }

        // forEach allows each of the strings to be printed
        words.stream().forEach(s -> System.out.println(s));
    }
}
