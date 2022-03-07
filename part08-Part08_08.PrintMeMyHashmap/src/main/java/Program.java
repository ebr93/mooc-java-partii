
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        printKeysWhere(hm, "a");
    }

    //prints out each key
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    //prints out keys, based on the input of string for key
    //we go through each of the keys in a (for each loop)
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            //contains checks if a string has a value within it that is being compared to
            if (key.contains(text)) {
                System.out.println(key);
                //break;
                //it would not go through because it would break before going through the whole list of keys
            }
        }
    }

    //prints out the values, based on the input of string for key
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}
