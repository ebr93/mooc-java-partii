import java.util.HashMap;

public class Abbreviations {
    //parameters for hashmap
    private HashMap<String, String> abbreviations;

    //creates new hashmap
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    //adds strings for hashmap
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    //checks if abbreviation is in hashmap
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    //returns the explanation, if not in hashmap, then returns a null value;
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }
}
