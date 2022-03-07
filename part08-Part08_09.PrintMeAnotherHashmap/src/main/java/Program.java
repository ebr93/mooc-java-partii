
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "ide");
    }

    //which prints all the values in the hashmap given as a parameter using the toString method of the Book objects.
    public static void printValues(HashMap<String,Book> hashmap) {
        for(String book : hashmap.keySet()) {
            System.out.println(hashmap.get(book));
        }
    }

    //which prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName.
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        //book goes through the values of hashmap
        //if each of the books contains any of that text then it will print
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
