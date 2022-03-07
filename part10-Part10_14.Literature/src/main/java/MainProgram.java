
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());

            Book newBook = new Book(name, ageRecommendation);
            bookList.add(newBook);
        }
        // Comparator will first compare the reccomended age and the compare by Name
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        // sorts the ArrayList based on comparator
        Collections.sort(bookList, comparator);
        print(bookList);
    }

    // prints the booklist in this specific manner
    public static void print(List<Book> books) {
        System.out.println(books.size() + " books in total.\n");
        System.out.println("Books: ");
        books.forEach(book -> System.out.println(book));
    }

}
