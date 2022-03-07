
import java.io.DataInput;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<LiteracyData> dataList = new ArrayList<>();

        // reads file
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(",")) // splits each row into parts
                    .map(parts ->  new LiteracyData(parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5]))) // parts are added as LiteracyData class
                    .sorted() // they are sorted with the method within (LiteracyData) class, method is called (comparedTo) 
                    .forEach(row -> System.out.println(row)); // prints each LiteracyData row in the format method (toString())
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        /*
        data.stream().map(row -> row.split(",")).sorted(parts[5] -> parts[5]).forEach(parts -> System.out.println(parts));

        /*
        ArrayList<String> organizedData = new ArrayList<>();
        
        for (String row : data) {
            String[] pieces = row.split(",");
            String rowToAdd = pieces[0] + pieces[1].trim() + pieces[2].trim() + pieces[3] + pieces[4] + pieces[5];
            System.out.println(rowToAdd);
            organizedData.add(rowToAdd);
        }
        */
    }


}
