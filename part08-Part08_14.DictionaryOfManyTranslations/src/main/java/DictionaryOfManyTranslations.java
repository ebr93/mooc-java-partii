import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        //creates a new ArrayList, if there is not one for that key
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        //adds the (translation) to the list of that (word)
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        //checks if the word is a key on the list already
        //if a word without a list is added then a list is created for it, which is blank
        if (!(this.dictionary.containsKey(word))) {
            this.dictionary.putIfAbsent(word, new ArrayList<>());
        }
        return this.dictionary.get(word);
        /*
        OR COULD'VE DONE
        return dictionary.getOrDefault(word, new ArrayList<>());
        */
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
