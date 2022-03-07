
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                if (list.size() == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    int sum = 0;
                    for (int numbers : list) {
                        sum += numbers;
                    }
                    System.out.println(1.0 * sum / list.size());
                }
                break;
            } 
            
            if (number > 0) {
                list.add(number);
            }
        }
            
    }
}
